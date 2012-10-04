package de.wandang.git.d2a;

public class MakeItembuildsHeader implements MakeHeader {
	final String lines = "//////////////////";
	final String itembuilds = "////Itembuilds////";

	@Override
	public StringBuilder makeHeader(StringBuilder text) {
		StringBuilder newSB = text;
		newSB.append(lines + "\n");
		newSB.append(itembuilds + "\n");
		newSB.append(lines + "\n" + "\n");
		newSB.append(text);
		System.out.println("ItembuildsTab mit Header" + newSB.toString());
		return newSB;
	}
}
