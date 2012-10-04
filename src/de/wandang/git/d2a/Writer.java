package de.wandang.git.d2a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	StringBuilder alles = new StringBuilder();
	final String lines = "////////////////////";

	// Copies file1.txt to the steamfolder and renames it to autoexec.cfg
	public void writeToFile() throws IOException {

	}// writeToFile()

	/**
	 * Merge 2 files together into the first. All files are in the
	 * programfolder. Steps for 3 Tabs would be :
	 * merge2Texts(file1,file2);merge2Text(file1,file3); -> everything in file 1
	 * 
	 * @param filename1
	 * @param filename2
	 * @throws IOException
	 */
	// Gets all the textfiles together into one file1.txt
	public void merge2Texts(String filename1, String filename2)
			throws IOException {
		try {
			// create writer for file to append to (dynamic:
			// System.getProperty("user.dir);)
			// BufferedWriter out = new BufferedWriter(new FileWriter(
			// "C:/JBuilder4/lib/output6.txt", true));
			BufferedWriter out = new BufferedWriter(new FileWriter(""
					+ System.getProperty("user.dir") + filename1));
			// create reader for file to append from
			// BufferedReader in = new BufferedReader(new FileReader(
			// "C:/JBuilder4/lib/output4.txt"));
			BufferedReader in = new BufferedReader(new FileReader(""
					+ System.getProperty("user.dir") + filename2));
			String str;
			while ((str = in.readLine()) != null) {
				out.write(str);
			}
			in.close();
			out.close();

		} catch (IOException e) {
		}
	}

	// public String makeTab()
	// interface mit 3 adaptern. jeder erzeugt unterschiedliche blšcke:
	// ////////////////
	// ///Tab1/////////
	// ////////////////

}// Writer