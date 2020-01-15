package com.am.innovations.badger.configurations.yml;

import java.io.Serializable;

public class Config implements Serializable {

	private String placeholder;
	private String githubreposapiurl;

	private final static long serialVersionUID = 2280113332062323909L;

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public String getGithubreposapiurl() {
		return githubreposapiurl;
	}

	public void setGithubreposapiurl(String githubreposapiurl) {
		this.githubreposapiurl = githubreposapiurl;
	}
}
