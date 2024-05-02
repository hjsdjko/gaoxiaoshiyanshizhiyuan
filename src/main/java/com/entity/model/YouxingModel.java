package com.entity.model;

import com.entity.YouxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 有形资产
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YouxingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物品编号
     */
    private String youxingBianhao;


    /**
     * 物品名称
     */
    private String youxingName;


    /**
     * 物品类型
     */
    private Integer youxingTypes;


    /**
     * 物品状态
     */
    private Integer zhuangtaiTypes;


    /**
     * 物品价格
     */
    private Double youxingMoney;


    /**
     * 详情信息
     */
    private String youxingContent;


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
	 * 获取：物品编号
	 */
    public String getYouxingBianhao() {
        return youxingBianhao;
    }


    /**
	 * 设置：物品编号
	 */
    public void setYouxingBianhao(String youxingBianhao) {
        this.youxingBianhao = youxingBianhao;
    }
    /**
	 * 获取：物品名称
	 */
    public String getYouxingName() {
        return youxingName;
    }


    /**
	 * 设置：物品名称
	 */
    public void setYouxingName(String youxingName) {
        this.youxingName = youxingName;
    }
    /**
	 * 获取：物品类型
	 */
    public Integer getYouxingTypes() {
        return youxingTypes;
    }


    /**
	 * 设置：物品类型
	 */
    public void setYouxingTypes(Integer youxingTypes) {
        this.youxingTypes = youxingTypes;
    }
    /**
	 * 获取：物品状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 设置：物品状态
	 */
    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 获取：物品价格
	 */
    public Double getYouxingMoney() {
        return youxingMoney;
    }


    /**
	 * 设置：物品价格
	 */
    public void setYouxingMoney(Double youxingMoney) {
        this.youxingMoney = youxingMoney;
    }
    /**
	 * 获取：详情信息
	 */
    public String getYouxingContent() {
        return youxingContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setYouxingContent(String youxingContent) {
        this.youxingContent = youxingContent;
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
