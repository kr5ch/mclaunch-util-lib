package net.kronos.mclaunch_util_lib.auth.model;

import lombok.Setter;

public class YggdrasilAuthenticateReq
{
	@Setter
	private YggdrasilAgent agent;
	
	@Setter
	private String username;
	
	@Setter
	private String password;
	
	@Setter
	private String clientToken;
}
