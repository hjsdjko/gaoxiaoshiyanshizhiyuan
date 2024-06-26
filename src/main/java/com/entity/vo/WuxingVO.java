package com.entity.vo;

import com.entity.WuxingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 无形资产
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wuxing")
public class WuxingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 资产名称
     */

    @TableField(value = "wuxing_name")
    private String wuxingName;


    /**
     * 资产下载
     */

    @TableField(value = "wuxing_file")
    private String wuxingFile;


    /**
     * 上传用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 审核状态
     */

    @TableField(value = "shenhe_types")
    private Integer shenheTypes;


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
	 * 设置：资产名称
	 */
    public String getWuxingName() {
        return wuxingName;
    }


    /**
	 * 获取：资产名称
	 */

    public void setWuxingName(String wuxingName) {
        this.wuxingName = wuxingName;
    }
    /**
	 * 设置：资产下载
	 */
    public String getWuxingFile() {
        return wuxingFile;
    }


    /**
	 * 获取：资产下载
	 */

    public void setWuxingFile(String wuxingFile) {
        this.wuxingFile = wuxingFile;
    }
    /**
	 * 设置：上传用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：上传用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getShenheTypes() {
        return shenheTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setShenheTypes(Integer shenheTypes) {
        this.shenheTypes = shenheTypes;
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
