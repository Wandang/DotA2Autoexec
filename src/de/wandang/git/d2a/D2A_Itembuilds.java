package de.wandang.git.d2a;

import java.util.HashMap;

public class D2A_Itembuilds {
	private StringBuilder d2a_Itembuilds=new StringBuilder();
	final String headerLines = "////////////////";
	final String headerName = "////Itembuilds////";
	private HashMap<String, Integer> itembuildObjects = new HashMap<String, Integer>();

	
	//Building Header
		public D2A_Itembuilds() {
			this.d2a_Itembuilds.append(headerLines + "\n" + headerName + "\n"
					+ headerLines + "\n" + "\n");
		}
		
		// Appending all Settings chosen via GUI
		public void addchangedItembuilds(String changedItembuilds) {
			d2a_Itembuilds.append("\n");
			d2a_Itembuilds.append(itembuildObjects.get(changedItembuilds));
		}

}
