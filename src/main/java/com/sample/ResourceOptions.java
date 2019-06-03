package com.sample;

import java.util.ArrayList;
import java.util.List;


public class ResourceOptions implements java.io.Serializable {

	private static final long serialVersionUID = 1053909888204093088L;

	private String id;
	private String name;
	private String work;
	private String resource;
	private List<Resource> resources;

	public ResourceOptions() {
		this.resources = new ArrayList<Resource>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}	public List<Resource> getResources() {
		return new ArrayList<Resource>(resources);
	}

	public void addResource(Resource item) {
		this.resources.add(0, item);
	}

	public Resource get(Integer item) {
		return this.resources.get(item);
	}
}