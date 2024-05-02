package com.entity.view;

import com.entity.YouxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 有形资产
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("youxing")
public class YouxingView extends YouxingEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 物品类型的值
		*/
		private String youxingValue;
		/**
		* 物品状态的值
		*/
		private String zhuangtaiValue;



	public YouxingView() {

	}

	public YouxingView(YouxingEntity youxingEntity) {
		try {
			BeanUtils.copyProperties(this, youxingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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





}
