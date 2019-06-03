package com.sample;

import java.util.UUID;

public class WorkParameter implements java.io.Serializable {

	private static final long serialVersionUID = -8047227399011543834L;

	private String id;
	private String code;
	private java.lang.String name;
	private java.lang.String value;
	private String work;

	public WorkParameter() {
		super();
		this.id = UUID.randomUUID().toString();
	}

	public WorkParameter(String code, String value, String work) {
		this(code, null, value, work);
	}

	public WorkParameter(String code, String value, Work work) {
		this(code, value, work != null ? work.getId() : null);
	}

	public WorkParameter(String code, String name, String value, String work) {
		this();
		this.code = code;
		this.name = name;
		this.value = value;
		this.work = work;
	}

	public WorkParameter(String code, String name, String value, Work work) {
		this(code, name, value, work != null ? work.getId() : null);
	}

	public WorkParameter(String id, String code, String name, String value, String work) {
		this();
		this.id = id;
		this.code = code;
		this.name = name;
		this.value = value;
		this.work = work;
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

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getValue() {
		return value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
}