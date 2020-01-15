
package com.am.innovations.badger.configurations.yml;

import java.io.Serializable;

public class Sonar implements Serializable {

	private String measure;
	private final static long serialVersionUID = 4464600071772226413L;

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

}
