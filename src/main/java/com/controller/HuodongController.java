package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.HuodongEntity;

import com.service.HuodongService;
import com.entity.view.HuodongView;
import com.service.JiaoshiService;
import com.entity.JiaoshiEntity;
import com.service.YonghuService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 实验室活动
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/huodong")
public class HuodongController {
    private static final Logger logger = LoggerFactory.getLogger(HuodongController.class);

    @Autowired
    private HuodongService huodongService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private JiaoshiService jiaoshiService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        else if("教师".equals(role)){
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = huodongService.queryPage(params);

        //字典表数据转换
        List<HuodongView> list =(List<HuodongView>)page.getList();
        for(HuodongView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        HuodongEntity huodong = huodongService.selectById(id);
        if(huodong !=null){
            //entity转view
            HuodongView view = new HuodongView();
            BeanUtils.copyProperties( huodong , view );//把实体数据重构到view中

            //级联表
            JiaoshiEntity jiaoshi = jiaoshiService.selectById(huodong.getJiaoshiId());
            if(jiaoshi != null){
                BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setJiaoshiId(jiaoshi.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongEntity huodong, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,huodong:{}",this.getClass().getName(),huodong.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("教师".equals(role)){
            huodong.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        }
        Wrapper<HuodongEntity> queryWrapper = new EntityWrapper<HuodongEntity>()
            .eq("huodong_name", huodong.getHuodongName())
            .eq("jiaoshi_id", huodong.getJiaoshiId())
            .eq("huodong_types", huodong.getHuodongTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        HuodongEntity huodongEntity = huodongService.selectOne(queryWrapper);
        if(huodongEntity==null){
            huodong.setInsertTime(new Date());
            huodong.setCreateTime(new Date());
            huodongService.insert(huodong);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody HuodongEntity huodong, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,huodong:{}",this.getClass().getName(),huodong.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("教师".equals(role)){
            huodong.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        }
        //根据字段查询是否有相同数据
        Wrapper<HuodongEntity> queryWrapper = new EntityWrapper<HuodongEntity>()
            .notIn("id",huodong.getId())
            .andNew()
            .eq("huodong_name", huodong.getHuodongName())
            .eq("jiaoshi_id", huodong.getJiaoshiId())
            .eq("huodong_types", huodong.getHuodongTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        HuodongEntity huodongEntity = huodongService.selectOne(queryWrapper);
        if(huodongEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      huodong.set
            //  }
            huodongService.updateById(huodong);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        huodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        else if("教师".equals(role)){
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = huodongService.queryPage(params);

        //字典表数据转换
        List<HuodongView> list =(List<HuodongView>)page.getList();
        for(HuodongView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        HuodongEntity huodong = huodongService.selectById(id);
            if(huodong !=null){
                //entity转view
                HuodongView view = new HuodongView();
                BeanUtils.copyProperties( huodong , view );//把实体数据重构到view中

                //级联表
                    JiaoshiEntity jiaoshi = jiaoshiService.selectById(huodong.getJiaoshiId());
                if(jiaoshi != null){
                    BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJiaoshiId(jiaoshi.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongEntity huodong, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,huodong:{}",this.getClass().getName(),huodong.toString());
        Wrapper<HuodongEntity> queryWrapper = new EntityWrapper<HuodongEntity>()
            .eq("huodong_name", huodong.getHuodongName())
            .eq("jiaoshi_id", huodong.getJiaoshiId())
            .eq("huodong_types", huodong.getHuodongTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        HuodongEntity huodongEntity = huodongService.selectOne(queryWrapper);
        if(huodongEntity==null){
            huodong.setInsertTime(new Date());
            huodong.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      huodong.set
        //  }
        huodongService.insert(huodong);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}

