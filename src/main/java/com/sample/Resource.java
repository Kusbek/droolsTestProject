package com.sample;

import java.util.UUID;

public class Resource implements java.io.Serializable {

	private static final long serialVersionUID = 4336763038232353156L;

	private String id;
	private String code;
	private String name;
	private String type;
	private String amount;
	private String unit;
	private String quantity;
	private String dependency;
	private String work;

	public Resource() {
		super();
		this.id = UUID.randomUUID().toString();
	}

	public Resource(String code, String type, String work) {
		this(code, null, type, work);
	}

	public Resource(String code, String type, Work work) {
		this(code, null, type, work);
	}

	public Resource(String code, String name, String type, String work) {
		this(code, name, type, null, null, null, null, work);
	}

	public Resource(String code, String name, String type, Work work) {
		this(code, name, type, null, null, null, null, work);
	}

	public Resource(String code, String name, String type, String amount, String unit, String work) {
		this(code, name, type, amount, unit, null, null, work);
	}

	public Resource(String code, String name, String type, String amount, String unit, Work work) {
		this(code, name, type, amount, unit, null, null, work);
	}

	public Resource(String code, String name, String type, String amount, String unit, String quantity,
			String dependency, String work) {
		this();
		this.code = code;
		this.name = name;
		this.type = type;
		this.amount = amount;
		this.unit = unit;
		this.quantity = quantity;
		this.dependency = dependency;
		this.work = work;
	}

	public Resource(String code, String name, String type, String amount, String unit, String quantity,
			String dependency, Work work) {
		this(code, name, type, amount, unit, quantity, dependency, work != null ? work.getId() : null);
	}

	public Resource(String id, String code, String name, String type, String amount, String unit, String quantity,
			String dependency, String work) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.type = type;
		this.amount = amount;
		this.unit = unit;
		this.quantity = quantity;
		this.dependency = dependency;
		this.work = work;
	}

	public Resource(String id, String code, String name, String type, String amount, String unit, String quantity,
			String dependency, Work work) {
		this(id, code, name, type, amount, unit, quantity, dependency, work != null ? work.getId() : null);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDependency() {
		return dependency;
	}

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
}