
package com.am.innovations.badger.configurations.yml;

import java.io.Serializable;

public class Travis implements Serializable {

	private String status;
	private final static long serialVersionUID = 8930122196678162696L;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
