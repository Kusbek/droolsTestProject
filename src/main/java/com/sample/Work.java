package com.sample;

import java.util.UUID;

public class Work implements java.io.Serializable {

	private static final long serialVersionUID = 419431864349413030L;

	private java.lang.String id;
	private java.lang.String code;
	private java.lang.String name;
	private java.lang.String amount;
	private java.lang.String unit;

	public Work() {
		super();
		this.id = UUID.randomUUID().toString();
	}

	public Work(String code) {
		this();
		this.id = code;
		this.amount = "1";
	}

	public Work(String code, String unit) {
		this();
		this.code = code;
		this.unit = unit;
		this.amount = "1";
	}

	public Work(String code, String name, String amount, String unit) {
		this();
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.unit = unit;
	}

	public Work(String id, String code, String name, String amount, String unit) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.unit = unit;
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getAmount() {
		return amount;
	}

	public void setAmount(java.lang.String amount) {
		this.amount = amount;
	}

	public java.lang.String getUnit() {
		return unit;
	}

	public void setUnit(java.lang.String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Work [id=" + id + ", code=" + code + ", name=" + name + ", amount=" + amount + ", unit=" + unit + "]";
	}
}