package com.entity.model;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验室信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室名称
     */
    private String shiyanshiName;


    /**
     * 实验室地址
     */
    private String shiyanshiDizhi;


    /**
     * 主要负责人
     */
    private String shiyanshiFuzeren;


    /**
     * 主要成员
     */
    private String chengyuanContent;


    /**
     * 基础物品
     */
    private String wupinContent;


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
	 * 获取：实验室名称
	 */
    public String getShiyanshiName() {
        return shiyanshiName;
    }


    /**
	 * 设置：实验室名称
	 */
    public void setShiyanshiName(String shiyanshiName) {
        this.shiyanshiName = shiyanshiName;
    }
    /**
	 * 获取：实验室地址
	 */
    public String getShiyanshiDizhi() {
        return shiyanshiDizhi;
    }


    /**
	 * 设置：实验室地址
	 */
    public void setShiyanshiDizhi(String shiyanshiDizhi) {
        this.shiyanshiDizhi = shiyanshiDizhi;
    }
    /**
	 * 获取：主要负责人
	 */
    public String getShiyanshiFuzeren() {
        return shiyanshiFuzeren;
    }


    /**
	 * 设置：主要负责人
	 */
    public void setShiyanshiFuzeren(String shiyanshiFuzeren) {
        this.shiyanshiFuzeren = shiyanshiFuzeren;
    }
    /**
	 * 获取：主要成员
	 */
    public String getChengyuanContent() {
        return chengyuanContent;
    }


    /**
	 * 设置：主要成员
	 */
    public void setChengyuanContent(String chengyuanContent) {
        this.chengyuanContent = chengyuanContent;
    }
    /**
	 * 获取：基础物品
	 */
    public String getWupinContent() {
        return wupinContent;
    }


    /**
	 * 设置：基础物品
	 */
    public void setWupinContent(String wupinContent) {
        this.wupinContent = wupinContent;
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
