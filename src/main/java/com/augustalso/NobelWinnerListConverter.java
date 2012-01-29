package com.augustalso;

import java.util.ArrayList;
import java.util.List;

public class NobelWinnerListConverter {
	public List<NobelWinner> convert(List<String[]> toConvert) {
		List<NobelWinner> winners = new ArrayList<NobelWinner>();
		
		for (String[] columns : toConvert){
	    	NobelWinner winner = new NobelWinner();
	    	winner.setName(columns[0]);
	    	winner.setYear(columns[1]);
	    	winners.add(winner);
	    }
		
		return winners;
		
	} 

}
