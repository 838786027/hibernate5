package com.cpphot.action;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "car_data" )
public class CarData {
	@Id
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
