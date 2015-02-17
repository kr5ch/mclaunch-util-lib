package net.kronos.mclaunch_util_lib.auth.model;

import com.google.gson.annotations.Expose;

import lombok.Getter;

public class YggdrasilError extends Throwable
{
	private static final long serialVersionUID = -8933158830705701800L;

	@Getter
	@Expose
	private String error;
	
	@Getter
	@Expose
	private String errorMessage;
		
	@Override
	public String getMessage() {
		return this.error + ": " + this.errorMessage;
	}
}