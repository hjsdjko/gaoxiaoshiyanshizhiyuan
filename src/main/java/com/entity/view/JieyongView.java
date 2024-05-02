package com.entity.view;

import com.entity.JieyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 借用记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jieyong")
public class JieyongView extends JieyongEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 youxing
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
				* 物品类型的值
				*/
				private String youxingValue;
			/**
			* 物品状态
			*/
			private Integer zhuangtaiTypes;
				/**
				* 物品状态的值
				*/
				private String zhuangtaiValue;
			/**
			* 物品价格
			*/
			private Double youxingMoney;
			/**
			* 详情信息
			*/
			private String youxingContent;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 上传时间
			*/
			private Date insertTime;

	public JieyongView() {

	}

	public JieyongView(JieyongEntity jieyongEntity) {
		try {
			BeanUtils.copyProperties(this, jieyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}











				//级联表的get和set youxing
					/**
					* 获取： 物品编号
					*/
					public String getYouxingBianhao() {
						return youxingBianhao;
					}
					/**
					* 设置： 物品编号
					*/
					public void setYouxingBianhao(String youxingBianhao) {
						this.youxingBianhao = youxingBianhao;
					}
					/**
					* 获取： 物品名称
					*/
					public String getYouxingName() {
						return youxingName;
					}
					/**
					* 设置： 物品名称
					*/
					public void setYouxingName(String youxingName) {
						this.youxingName = youxingName;
					}
					/**
					* 获取： 物品类型
					*/
					public Integer getYouxingTypes() {
						return youxingTypes;
					}
					/**
					* 设置： 物品类型
					*/
					public void setYouxingTypes(Integer youxingTypes) {
						this.youxingTypes = youxingTypes;
					}


						/**
						* 获取： 物品类型的值
						*/
						public String getYouxingValue() {
							return youxingValue;
						}
						/**
						* 设置： 物品类型的值
						*/
						public void setYouxingValue(String youxingValue) {
							this.youxingValue = youxingValue;
						}
					/**
					* 获取： 物品状态
					*/
					public Integer getZhuangtaiTypes() {
						return zhuangtaiTypes;
					}
					/**
					* 设置： 物品状态
					*/
					public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
						this.zhuangtaiTypes = zhuangtaiTypes;
					}


						/**
						* 获取： 物品状态的值
						*/
						public String getZhuangtaiValue() {
							return zhuangtaiValue;
						}
						/**
						* 设置： 物品状态的值
						*/
						public void setZhuangtaiValue(String zhuangtaiValue) {
							this.zhuangtaiValue = zhuangtaiValue;
						}
					/**
					* 获取： 物品价格
					*/
					public Double getYouxingMoney() {
						return youxingMoney;
					}
					/**
					* 设置： 物品价格
					*/
					public void setYouxingMoney(Double youxingMoney) {
						this.youxingMoney = youxingMoney;
					}
					/**
					* 获取： 详情信息
					*/
					public String getYouxingContent() {
						return youxingContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setYouxingContent(String youxingContent) {
						this.youxingContent = youxingContent;
					}
					/**
					* 获取： 上传时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 上传时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}


}
