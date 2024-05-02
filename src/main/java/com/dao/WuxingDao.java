package com.dao;

import com.entity.WuxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WuxingView;

/**
 * 无形资产 Dao 接口
 *
 * @author 
 */
public interface WuxingDao extends BaseMapper<WuxingEntity> {

   List<WuxingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
