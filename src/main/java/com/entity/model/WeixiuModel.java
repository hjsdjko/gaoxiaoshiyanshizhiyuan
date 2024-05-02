package com.entity.model;

import com.entity.WeixiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 维修记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WeixiuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 维修物品
     */
    private Integer youxingId;


    /**
     * 维修时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieyongTime;


    /**
     * 维修金额
     */
    private Double youxingMoney;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：维修物品
	 */
    public Integer getYouxingId() {
        return youxingId;
    }


    /**
	 * 设置：维修物品
	 */
    public void setYouxingId(Integer youxingId) {
        this.youxingId = youxingId;
    }
    /**
	 * 获取：维修时间
	 */
    public Date getJieyongTime() {
        return jieyongTime;
    }


    /**
	 * 设置：维修时间
	 */
    public void setJieyongTime(Date jieyongTime) {
        this.jieyongTime = jieyongTime;
    }
    /**
	 * 获取：维修金额
	 */
    public Double getYouxingMoney() {
        return youxingMoney;
    }


    /**
	 * 设置：维修金额
	 */
    public void setYouxingMoney(Double youxingMoney) {
        this.youxingMoney = youxingMoney;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：上传时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
