package com.pannik.tracker.entities;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fid;

	private String name;
	
	private Integer calories;
	
	private Integer totalcarbs;
	
	private Integer totalfat;
	 
	private Integer totalprotein;

	
	
	public Food() {
		super();
	}

	public Food(Integer fid, String name, Integer calories, Integer totalcarbs, Integer totalfat,
			Integer totalprotein) {
		super();
		this.fid = fid;
		this.name = name;
		this.calories = calories;
		this.totalcarbs = totalcarbs;
		this.totalfat = totalfat;
		this.totalprotein = totalprotein;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getTotalcarbs() {
		return totalcarbs;
	}

	public void setTotalcarbs(Integer totalcarbs) {
		this.totalcarbs = totalcarbs;
	}

	public Integer getTotalfat() {
		return totalfat;
	}

	public void setTotalfat(Integer totalfat) {
		this.totalfat = totalfat;
	}

	public Integer getTotalprotein() {
		return totalprotein;
	}

	public void setTotalprotein(Integer totalprotein) {
		this.totalprotein = totalprotein;
	}



}
