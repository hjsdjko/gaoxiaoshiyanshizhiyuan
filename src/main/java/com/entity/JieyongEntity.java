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
 * 借用记录
 *
 * @author 
 * @email
 */
@TableName("jieyong")
public class JieyongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JieyongEntity() {

	}

	public JieyongEntity(T t) {
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
     * 借用物品
     */
    @TableField(value = "youxing_id")

    private Integer youxingId;


    /**
     * 借用时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jieyong_time",fill = FieldFill.UPDATE)

    private Date jieyongTime;


    /**
     * 借用人
     */
    @TableField(value = "jieyongren")

    private String jieyongren;


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
	 * 设置：借用物品
	 */
    public Integer getYouxingId() {
        return youxingId;
    }


    /**
	 * 获取：借用物品
	 */

    public void setYouxingId(Integer youxingId) {
        this.youxingId = youxingId;
    }
    /**
	 * 设置：借用时间
	 */
    public Date getJieyongTime() {
        return jieyongTime;
    }


    /**
	 * 获取：借用时间
	 */

    public void setJieyongTime(Date jieyongTime) {
        this.jieyongTime = jieyongTime;
    }
    /**
	 * 设置：借用人
	 */
    public String getJieyongren() {
        return jieyongren;
    }


    /**
	 * 获取：借用人
	 */

    public void setJieyongren(String jieyongren) {
        this.jieyongren = jieyongren;
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
        return "Jieyong{" +
            "id=" + id +
            ", youxingId=" + youxingId +
            ", jieyongTime=" + jieyongTime +
            ", jieyongren=" + jieyongren +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
