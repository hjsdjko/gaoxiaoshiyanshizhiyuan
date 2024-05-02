package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 实验室信息
 *
 * @author 
 * @email
 */
@TableName("shiyanshi")
public class ShiyanshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshiEntity() {

	}

	public ShiyanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 实验室名称
     */
    @TableField(value = "shiyanshi_name")

    private String shiyanshiName;


    /**
     * 实验室地址
     */
    @TableField(value = "shiyanshi_dizhi")

    private String shiyanshiDizhi;


    /**
     * 主要负责人
     */
    @TableField(value = "shiyanshi_fuzeren")

    private String shiyanshiFuzeren;


    /**
     * 主要成员
     */
    @TableField(value = "chengyuan_content")

    private String chengyuanContent;


    /**
     * 基础物品
     */
    @TableField(value = "wupin_content")

    private String wupinContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：实验室名称
	 */
    public String getShiyanshiName() {
        return shiyanshiName;
    }


    /**
	 * 获取：实验室名称
	 */

    public void setShiyanshiName(String shiyanshiName) {
        this.shiyanshiName = shiyanshiName;
    }
    /**
	 * 设置：实验室地址
	 */
    public String getShiyanshiDizhi() {
        return shiyanshiDizhi;
    }


    /**
	 * 获取：实验室地址
	 */

    public void setShiyanshiDizhi(String shiyanshiDizhi) {
        this.shiyanshiDizhi = shiyanshiDizhi;
    }
    /**
	 * 设置：主要负责人
	 */
    public String getShiyanshiFuzeren() {
        return shiyanshiFuzeren;
    }


    /**
	 * 获取：主要负责人
	 */

    public void setShiyanshiFuzeren(String shiyanshiFuzeren) {
        this.shiyanshiFuzeren = shiyanshiFuzeren;
    }
    /**
	 * 设置：主要成员
	 */
    public String getChengyuanContent() {
        return chengyuanContent;
    }


    /**
	 * 获取：主要成员
	 */

    public void setChengyuanContent(String chengyuanContent) {
        this.chengyuanContent = chengyuanContent;
    }
    /**
	 * 设置：基础物品
	 */
    public String getWupinContent() {
        return wupinContent;
    }


    /**
	 * 获取：基础物品
	 */

    public void setWupinContent(String wupinContent) {
        this.wupinContent = wupinContent;
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

    @Override
    public String toString() {
        return "Shiyanshi{" +
            "id=" + id +
            ", shiyanshiName=" + shiyanshiName +
            ", shiyanshiDizhi=" + shiyanshiDizhi +
            ", shiyanshiFuzeren=" + shiyanshiFuzeren +
            ", chengyuanContent=" + chengyuanContent +
            ", wupinContent=" + wupinContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
