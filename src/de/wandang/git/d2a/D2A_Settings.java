package de.wandang.git.d2a;

import java.util.HashMap;

public class D2A_Settings {
	private StringBuilder d2a_Settings= new StringBuilder();
	private final String headerLines = "////////////////";
	private final String headerName = "////Settings////";
	
	//Stores all commands as alias. for example: key= "AutoAtk", value= "dota_player_units_auto_attack"
	private HashMap<String, String> settingAlias =new HashMap<String, String>();
	
	//Stores all values to the alias of the command. for example: key= "AutoAtk", value= "1"
	private HashMap<String, Integer> settingValues = new HashMap<String, Integer>();
	
	//testeintrag:
	public void setSettingAlias(HashMap<String, String> settingAlias) {
		this.settingAlias = settingAlias;
	}
	public HashMap<String, String> getSettingAlias() {
		return settingAlias;
	}

	public StringBuilder getD2a_Settings() {
		return d2a_Settings;
	}
	// Building Header
	public D2A_Settings() {
		this.d2a_Settings.append(headerLines + "\n" + headerName + "\n"
				+ headerLines + "\n" + "\n");
	}

	public StringBuilder getD2A_Settings() {
		return d2a_Settings;
	}

	public void setD2a_Settings(StringBuilder d2a_Settings) {
		this.d2a_Settings = d2a_Settings;
	}

	public HashMap<String, Integer> getSettingValues() {
		return settingValues;
	}

	public void setSettingValues(HashMap<String, Integer> settingValues) {
		this.settingValues = settingValues;
	}

	// Appending all Settings chosen via GUI
	public void addchangedSetting(String changedSetting) {
		d2a_Settings.append("\n");
		d2a_Settings.append(settingAlias.get(changedSetting)+" ");
		d2a_Settings.append("\""+settingValues.get(changedSetting)+"\"");
	}

	public void removeSetting() {

	}

	public StringBuilder toStringBuilder() {
		return d2a_Settings;
	}
}
