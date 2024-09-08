package com.entity.vo;

import com.entity.XuanjianghuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宣讲会
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-13 09:56:56
 */
public class XuanjianghuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 参加人数
	 */
	
	private Integer canjiarenshu;
		
	/**
	 * 讲会详情
	 */
	
	private String jianghuixiangqing;
		
	/**
	 * 举办时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jubanshijian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：参加人数
	 */
	 
	public void setCanjiarenshu(Integer canjiarenshu) {
		this.canjiarenshu = canjiarenshu;
	}
	
	/**
	 * 获取：参加人数
	 */
	public Integer getCanjiarenshu() {
		return canjiarenshu;
	}
				
	
	/**
	 * 设置：讲会详情
	 */
	 
	public void setJianghuixiangqing(String jianghuixiangqing) {
		this.jianghuixiangqing = jianghuixiangqing;
	}
	
	/**
	 * 获取：讲会详情
	 */
	public String getJianghuixiangqing() {
		return jianghuixiangqing;
	}
				
	
	/**
	 * 设置：举办时间
	 */
	 
	public void setJubanshijian(Date jubanshijian) {
		this.jubanshijian = jubanshijian;
	}
	
	/**
	 * 获取：举办时间
	 */
	public Date getJubanshijian() {
		return jubanshijian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
