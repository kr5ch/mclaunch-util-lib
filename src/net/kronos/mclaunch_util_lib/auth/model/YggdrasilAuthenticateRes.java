package net.kronos.mclaunch_util_lib.auth.model;

import java.util.List;

import lombok.Getter;

public class YggdrasilAuthenticateRes
{
	@Getter
	private String accessToken;
	
	@Getter
	private String clientToken;
	
	@Getter
	private YggdrasilProfile selectedProfile;
	
	@Getter
	private List<YggdrasilProfile> availableProfiles;
}