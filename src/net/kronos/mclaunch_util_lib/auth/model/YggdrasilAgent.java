package net.kronos.mclaunch_util_lib.auth.model;

import lombok.Setter;

public class YggdrasilAgent
{
	@Setter
	private String name;
	
	@Setter
	private int version;
	
	public static YggdrasilAgent getMinecraftAgent()
	{
		YggdrasilAgent agent = new YggdrasilAgent();
		agent.setName("Minecraft");
		agent.setVersion(1);
		
		return agent;
	}
}
