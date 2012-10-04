package de.wandang.git.d2a;

public class Pattern {
	private String alias;
	private String text;
	Pattern pattern = new Pattern(alias, text);

	public Pattern(String alias, String text) {
		setAlias(alias);
		setText(text);
	}

	public void setAlias(String alias) {

		this.alias = alias;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void setPattern(String alias, String text) {
		;
		this.text = text;
	}

	public Pattern getPattern() {
		return this.pattern;
	}
}
