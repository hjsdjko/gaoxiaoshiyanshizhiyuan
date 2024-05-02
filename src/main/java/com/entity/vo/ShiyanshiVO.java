package com.entity.vo;

import com.entity.ShiyanshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验室信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyanshi")
public class ShiyanshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
