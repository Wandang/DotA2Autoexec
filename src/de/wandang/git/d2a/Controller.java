package de.wandang.git.d2a;

import java.io.IOException;

public class Controller {
	public static void main(String[] args) throws IOException {
		Writer start = new Writer();
		start.writeToFile();
//		start.merge2Texts("filename1", "filename2");
	}
}
