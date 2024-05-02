package com.dao;

import com.entity.YouxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxingView;

/**
 * 有形资产 Dao 接口
 *
 * @author 
 */
public interface YouxingDao extends BaseMapper<YouxingEntity> {

   List<YouxingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
