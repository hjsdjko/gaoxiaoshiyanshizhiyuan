package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuxingEntity;
import java.util.Map;

/**
 * 无形资产 服务类
 */
public interface WuxingService extends IService<WuxingEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}