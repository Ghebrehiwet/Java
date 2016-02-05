package com.gg.Assignment5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	private String path;
	private PrintWriter writer;

	public WriteFile(String path) {

		try {

			this.path = path;
			createFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void createFile() throws IOException {

		FileWriter outerFile = new FileWriter(path, true);
		writer = new PrintWriter(outerFile);

	}

	public void addText(String content) {
		writer.println(content);

	}

	public void closefile() {
		writer.close();
	}
}
