package beans;


public enum Command {
	
	SEND_RIGHT_DIRECTION_COMMAND("SendGyroGuideRightCommand", 0, new String[] {"power (0-255)"}),
	SEND_LEFT_DIRECTION_COMMAND("SendGyroGuideLeftCommand", 1, new String[] {"power 0-255"}),
	SEND_POWER_COMMAND("sendPowerCommand", 2, new String[] {"relative snelheid (0,255)"}),
	SEND_STARTUP_COMMAND("sendStartupCommand", 3, new String[] {"relatieve snelheid na starten (0-255)"}),
	SEND_SHUTDOWN_COMMAND("sendShutdownCommand", 4),
	SEND_WIGGLE_COMMAND("sendWiggleComamnd", 5, new String[]{"aantal x wiebelen", "intensiteit 0-255"}),
	SEND_RED_LIGHT("sendRedLightCommandKITT", 6, new String[] {"aantal x uitvoeren 0-255"}),
	SEND_GREEN_LIGHT_COMMAND("sendGreenLightCommandKITT", 7, new String[] {"aantal x uitvoerne 0-255"}),
	SEND_RED_LIGHT_PULSE_COMMAND("sendRedLightPulseCommand", 8, new String[] {"aantal x uitvoerne 0-255"}),
	SEND_GREEN_LIGHT_PULSE_COMMAND("sendGreenLightPulseCommand", 9, new String[] {"aantal x uitvoerne 0-255"}),
	SEND_RED_LIGHT_DIRECTION_COMMAND("sendRedLightDirectionCommand", 10, new String[] {"richting 0-255"}),
	SEND_GREEN_LIGHT_DIRECTION_COMMAND("sendGreenLightDirectionCommand", 11, new String[] {"richting 0-255"}),
	SEND_RED_LIGHT_VOORTGANGS_COMMAND("sendRedLightVoortgangCommand", 12, new String[] {"Hoeveelheid 0-255"}),
	SEND_GREEN_LIGHT_VOORTGANGS_COMMAND("sendGreenLightVoortgangsCommand", 13, new String[] {"hoeveelehied 0-255"}),
	SEND_BUBBEL_RECHTS_COMMAND("sendBubbelRechsCommand", 14, new String[] {"duur 0-255", "intensitieti 0-255", "hoogtepunt 0-255"}),
	SEND_BUBBEL_Links_COMMAND("sendBubbelLinksCommand", 15, new String[] {"duur 0-255", "intensitieti 0-255", "hoogtepunt 0-255"});
	
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCommand() {
		return command;
	}
	public void setCommand(int command) {
		this.command = command;
	}
	public String[] getParams() {
		return params;
	}
	public void setParams(String[] params) {
		this.params = params;
	}

	private int command;
	private String[] params;
	
	Command(String name, int command, String[] params) {
		this.name = name;
		this.command = command;
		this.params = params;
	}
	Command(String name, int command) {
		this.name = name;
		this.command = command;
		this.params = new String[]{};
	}
	
	@Override
	public String toString() {
		return name;
	}
}