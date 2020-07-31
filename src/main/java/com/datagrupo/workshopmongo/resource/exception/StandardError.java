package com.datagrupo.workshopmongo.resource.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long timeshamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Long timeshamp, Integer status, String error, String message, String path) {
		super();
		this.timeshamp = timeshamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Long getTimeshamp() {
		return timeshamp;
	}

	public void setTimeshamp(Long timeshamp) {
		this.timeshamp = timeshamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
