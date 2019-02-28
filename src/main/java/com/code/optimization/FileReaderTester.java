package com.code.optimization;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;

public class FileReaderTester extends TestCase{
	
	FileReader _input;
	
	protected void setUp() {
		try {
			_input = new FileReader("data.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	protected void tearDown() {
		try {
			_input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public FileReaderTester(String name) {
		super(name);
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(Suite());
	}

	private static Class<? extends TestCase> Suite() {
		return null;
	}
}
