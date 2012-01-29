package com.augustalso;

import java.io.FileNotFoundException;
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
		// TODO Auto-generated method stub
		CSVReader reader = new CSVReader(new FileReader("nobelWinners.csv"));
	    List<String[]> myEntries = reader.readAll();
	    
	    for (String[] columns : myEntries){
	    	for (String column : columns){
	    		System.out.println("Column: " + column);
	    	}
	    }
	}

}
