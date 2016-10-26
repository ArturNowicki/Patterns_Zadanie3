package com.arturnowicki.patterns.e3.data.reader;

import org.junit.Test;

import com.arturnowicki.patterns.e3.data.ObjectTypes;

public class TestInputReader {

	@Test
	public void test() {
		InputReader instance = InputReader.getInstance();
		instance.readFile();
	}

}
