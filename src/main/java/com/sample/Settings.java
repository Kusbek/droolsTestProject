package com.sample;

public class Settings implements java.io.Serializable {

	private static final long serialVersionUID = -5926165890040110989L;

	private String session;

	public Settings() {

	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

}