package com.augustalso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		List<NobelWinner> winners = new ArrayList<NobelWinner>();
		
		CSVReader reader = new CSVReader(new FileReader("nobelWinners.csv"));
	    List<String[]> myEntries = reader.readAll();
	    
	    for (String[] columns : myEntries){
	    	NobelWinner winner = new NobelWinner();
	    	winner.setName(columns[0]);
	    	winner.setYear(columns[1]);
	    	winners.add(winner);
	    }
	    
	    for (NobelWinner winner : winners){
	    	System.out.println(winner);
	    }
	    
	}

}
