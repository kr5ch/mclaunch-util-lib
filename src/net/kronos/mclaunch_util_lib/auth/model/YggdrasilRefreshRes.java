package net.kronos.mclaunch_util_lib.auth.model;

import lombok.Getter;

public class YggdrasilRefreshRes
{
	@Getter
	private String accessToken;
	
	@Getter
	private String clientToken;
	
	@Getter
	private YggdrasilProfile selectedProfile;
}
