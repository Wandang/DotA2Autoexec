package de.wandang.git.d2a;

import java.util.HashMap;

public class Patterns {
	// int i = 0;
	// ArrayList<String> patterns = new ArrayList<String>();
	HashMap<String, String> patterns = new HashMap<String, String>();

	public void addPattern(String alias, StringBuilder textpattern) {
		// patterns.add(textpattern.toString());
		patterns.put(alias, textpattern.toString());
	}

	public void removePattern(String alias) {
		patterns.remove(alias);
	}

}
