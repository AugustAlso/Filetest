package com.augustalso;

import java.io.IOException;
import java.util.List;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		NobelWinnerCSVReader reader = new NobelWinnerCSVReader();
		List<String[]> myEntries = reader.read();
	    NobelWinnerListConverter converter = new NobelWinnerListConverter();
		List<NobelWinner> winners = converter.convert(myEntries);
		
	    for (NobelWinner winner : winners){
	    	System.out.println(winner);
	    }
	    
	}

}
