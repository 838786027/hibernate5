package com.cpphot.action;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 如果没有@Entity，save时，会卡住不动，而又不报错
 * 如果id是自增长的，而没有@GeneratedValue和@GenericGenerator，save时，会卡住不动，而又不报错
 * @author caixiaopeng
 *
 */
@Entity
@Table( name = "car_data" )
public class CarData {
	
	@Id
	@GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	@Column(name = "car_num")
	private String carNum;
	
	@Column(name = "car_numcolor")
	private String carNumColor;
	@Column(name = "carType")
	private String carType;
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getCarNumColor() {
		return carNumColor;
	}
	public void setCarNumColor(String carNumColor) {
		this.carNumColor = carNumColor;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public String toString() {
		return "CarData [carNum=" + carNum + ", carNumColor=" + carNumColor
				+ ", carType=" + carType + "]";
	}
}
