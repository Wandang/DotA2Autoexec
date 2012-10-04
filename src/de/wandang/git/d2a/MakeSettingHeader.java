package de.wandang.git.d2a;

//For Example Tab1 = Settings
public class MakeSettingHeader implements MakeHeader {
	final String lines = "////////////////";
	final String settings = "////Settings////";

	@Override
	public StringBuilder makeHeader(StringBuilder text) {
		StringBuilder newSB = text;
		newSB.append(lines + "\n");
		newSB.append(settings + "\n");
		newSB.append(lines + "\n" + "\n");
		newSB.append(text);
		System.out.println("SettingsTab mit Header" + newSB.toString());
		return newSB;
	}

}
