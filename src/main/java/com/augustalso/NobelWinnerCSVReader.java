package com.augustalso;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class NobelWinnerCSVReader {
	
	public List<String[]> read() throws IOException{
		CSVReader reader = new CSVReader(new FileReader("nobelWinners.csv"));
	    return reader.readAll();
	}
	

}
