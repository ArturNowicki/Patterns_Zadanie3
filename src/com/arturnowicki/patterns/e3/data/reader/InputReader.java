package com.arturnowicki.patterns.e3.data.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import resources.Resources;

public class InputReader {
	
	private static final InputReader instance = new InputReader();
	
	private InputObjectsCreator parser;
	
	public static InputReader getInstance() {
		return instance;
	}
	
	public void readFile() {
		try (BufferedReader br = new BufferedReader(new FileReader(Resources.INPUT_FILE_PATH))) {
			parser = new InputObjectsCreator();
			parser.parseLines(br);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
