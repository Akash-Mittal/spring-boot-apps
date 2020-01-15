
package com.am.innovations.badger.configurations.yml;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("badges")
public class BadgesConfiguration implements Serializable {

	private Github github;
	private Sonar sonar;
	private Lgtm lgtm;
	private Travis travis;
	private Config config;
	private final static long serialVersionUID = -6937767277921436424L;

	public Github getGithub() {
		return github;
	}

	public void setGithub(Github github) {
		this.github = github;
	}

	public Sonar getSonar() {
		return sonar;
	}

	public void setSonar(Sonar sonar) {
		this.sonar = sonar;
	}

	public Lgtm getLgtm() {
		return lgtm;
	}

	public void setLgtm(Lgtm lgtm) {
		this.lgtm = lgtm;
	}

	public Travis getTravis() {
		return travis;
	}

	public void setTravis(Travis travis) {
		this.travis = travis;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

}
