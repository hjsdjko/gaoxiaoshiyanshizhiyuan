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
 * 有形资产
 *
 * @author 
 * @email
 */
@TableName("youxing")
public class YouxingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YouxingEntity() {

	}

	public YouxingEntity(T t) {
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
     * 物品编号
     */
    @TableField(value = "youxing_bianhao")

    private String youxingBianhao;


    /**
     * 物品名称
     */
    @TableField(value = "youxing_name")

    private String youxingName;


    /**
     * 物品类型
     */
    @TableField(value = "youxing_types")

    private Integer youxingTypes;


    /**
     * 物品状态
     */
    @TableField(value = "zhuangtai_types")

    private Integer zhuangtaiTypes;


    /**
     * 物品价格
     */
    @TableField(value = "youxing_money")

    private Double youxingMoney;


    /**
     * 详情信息
     */
    @TableField(value = "youxing_content")

    private String youxingContent;


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
	 * 设置：物品编号
	 */
    public String getYouxingBianhao() {
        return youxingBianhao;
    }


    /**
	 * 获取：物品编号
	 */

    public void setYouxingBianhao(String youxingBianhao) {
        this.youxingBianhao = youxingBianhao;
    }
    /**
	 * 设置：物品名称
	 */
    public String getYouxingName() {
        return youxingName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setYouxingName(String youxingName) {
        this.youxingName = youxingName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getYouxingTypes() {
        return youxingTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setYouxingTypes(Integer youxingTypes) {
        this.youxingTypes = youxingTypes;
    }
    /**
	 * 设置：物品状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 获取：物品状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 设置：物品价格
	 */
    public Double getYouxingMoney() {
        return youxingMoney;
    }


    /**
	 * 获取：物品价格
	 */

    public void setYouxingMoney(Double youxingMoney) {
        this.youxingMoney = youxingMoney;
    }
    /**
	 * 设置：详情信息
	 */
    public String getYouxingContent() {
        return youxingContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setYouxingContent(String youxingContent) {
        this.youxingContent = youxingContent;
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
        return "Youxing{" +
            "id=" + id +
            ", youxingBianhao=" + youxingBianhao +
            ", youxingName=" + youxingName +
            ", youxingTypes=" + youxingTypes +
            ", zhuangtaiTypes=" + zhuangtaiTypes +
            ", youxingMoney=" + youxingMoney +
            ", youxingContent=" + youxingContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
