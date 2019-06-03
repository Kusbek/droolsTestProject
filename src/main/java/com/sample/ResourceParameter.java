package com.sample;

import java.util.UUID;

public class ResourceParameter implements java.io.Serializable {

	private static final long serialVersionUID = 3187075445831766600L;

	private String id;
	private String code;
	private String name;
	private String value;
	private String resource;

	public ResourceParameter() {
		super();
		this.id = UUID.randomUUID().toString();
	}

	public ResourceParameter(String code, String value, String resource) {
		this();
		this.code = code;
		this.value = value;
		this.resource = resource;
	}

	public ResourceParameter(String code, String value, Resource resource) {
		this();
		this.code = code;
		this.value = value;
		this.resource = resource != null ? resource.getId() : null;
	}

	public ResourceParameter(String code, String name, String value, String resource) {
		this();
		this.code = code;
		this.name = name;
		this.value = value;
		this.resource = resource;
	}

	public ResourceParameter(String code, String name, String value, Resource resource) {
		this();
		this.code = code;
		this.name = name;
		this.value = value;
		this.resource = resource != null ? resource.getId() : null;
	}

	public ResourceParameter(String id, String code, String name, String value, String resource) {
		this();
		this.id = id;
		this.code = code;
		this.name = name;
		this.value = value;
		this.resource = resource;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}
}