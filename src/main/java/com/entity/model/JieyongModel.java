package com.entity.model;

import com.entity.JieyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 借用记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JieyongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 借用物品
     */
    private Integer youxingId;


    /**
     * 借用时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieyongTime;


    /**
     * 借用人
     */
    private String jieyongren;


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
	 * 获取：借用物品
	 */
    public Integer getYouxingId() {
        return youxingId;
    }


    /**
	 * 设置：借用物品
	 */
    public void setYouxingId(Integer youxingId) {
        this.youxingId = youxingId;
    }
    /**
	 * 获取：借用时间
	 */
    public Date getJieyongTime() {
        return jieyongTime;
    }


    /**
	 * 设置：借用时间
	 */
    public void setJieyongTime(Date jieyongTime) {
        this.jieyongTime = jieyongTime;
    }
    /**
	 * 获取：借用人
	 */
    public String getJieyongren() {
        return jieyongren;
    }


    /**
	 * 设置：借用人
	 */
    public void setJieyongren(String jieyongren) {
        this.jieyongren = jieyongren;
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
