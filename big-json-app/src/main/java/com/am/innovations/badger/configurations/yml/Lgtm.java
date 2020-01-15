package com.am.innovations.badger.configurations.yml;

import java.io.Serializable;

public class Lgtm implements Serializable {

	private String alerts;
	private String grade;
	private final static long serialVersionUID = 8530766049397250557L;

	public String getAlerts() {
		return alerts;
	}

	public void setAlerts(String alerts) {
		this.alerts = alerts;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
