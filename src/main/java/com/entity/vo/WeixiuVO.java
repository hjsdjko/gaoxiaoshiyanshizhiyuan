package com.entity.vo;

import com.entity.WeixiuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 维修记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("weixiu")
public class WeixiuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 维修物品
     */

    @TableField(value = "youxing_id")
    private Integer youxingId;


    /**
     * 维修时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jieyong_time")
    private Date jieyongTime;


    /**
     * 维修金额
     */

    @TableField(value = "youxing_money")
    private Double youxingMoney;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：维修物品
	 */
    public Integer getYouxingId() {
        return youxingId;
    }


    /**
	 * 获取：维修物品
	 */

    public void setYouxingId(Integer youxingId) {
        this.youxingId = youxingId;
    }
    /**
	 * 设置：维修时间
	 */
    public Date getJieyongTime() {
        return jieyongTime;
    }


    /**
	 * 获取：维修时间
	 */

    public void setJieyongTime(Date jieyongTime) {
        this.jieyongTime = jieyongTime;
    }
    /**
	 * 设置：维修金额
	 */
    public Double getYouxingMoney() {
        return youxingMoney;
    }


    /**
	 * 获取：维修金额
	 */

    public void setYouxingMoney(Double youxingMoney) {
        this.youxingMoney = youxingMoney;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
