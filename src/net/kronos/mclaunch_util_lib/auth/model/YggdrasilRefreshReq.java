package net.kronos.mclaunch_util_lib.auth.model;

import lombok.Setter;

public class YggdrasilRefreshReq
{
	@Setter
	private String accessToken;
	
	@Setter
	private String clientToken;
}
