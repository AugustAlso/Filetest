package com.augustalso;

public class NobelWinner {
	private String name;
	private String year;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "NobelWinner [name=" + name + ", year=" + year + "]";
	}
}
