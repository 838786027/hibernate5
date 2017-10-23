package com.cpphot.action;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="car_belong")
public class CarBelong {
	@Id
	@GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	@Column(name = "id")
	private Integer id;
	
	@Column(name="car_num_prefix")
	private String carNumPrefix;
	
	@Column(name="province")
	private String province;
	
	@Column(name="city")
	private String city;
	
	@Column(name="is_local_city")
	private Integer isLocalCity;
	
	@Column(name="is_local_province")
	private Integer isLocalProvince;
	
	@Column(name="is_outer_province")
	private Integer isOuterProvince;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarNumPrefix() {
		return carNumPrefix;
	}

	public void setCarNumPrefix(String carNumPrefix) {
		this.carNumPrefix = carNumPrefix;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getIsLocalCity() {
		return isLocalCity;
	}

	public void setIsLocalCity(Integer isLocalCity) {
		this.isLocalCity = isLocalCity;
	}

	public Integer getIsLocalProvince() {
		return isLocalProvince;
	}

	public void setIsLocalProvince(Integer isLocalProvince) {
		this.isLocalProvince = isLocalProvince;
	}

	public Integer getIsOuterProvince() {
		return isOuterProvince;
	}

	public void setIsOuterProvince(Integer isOuterProvince) {
		this.isOuterProvince = isOuterProvince;
	}

	@Override
	public String toString() {
		return "CarBelong [id=" + id + ", carNumPrefix=" + carNumPrefix + ", province=" + province + ", city=" + city
				+ ", isLocalCity=" + isLocalCity + ", isLocalProvince=" + isLocalProvince + ", isOuterProvince="
				+ isOuterProvince + "]";
	}
}
