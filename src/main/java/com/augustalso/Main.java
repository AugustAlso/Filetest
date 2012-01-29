package com.augustalso;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(new FileReader("nobelWinners.csv"));
	    List<String[]> myEntries = reader.readAll();
	    NobelWinnerListConverter converter = new NobelWinnerListConverter();
		List<NobelWinner> winners = converter.convert(myEntries);
		
	    for (NobelWinner winner : winners){
	    	System.out.println(winner);
	    }
	    
	}

}
