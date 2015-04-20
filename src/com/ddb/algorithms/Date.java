package com.ddb.algorithms;

public class Date implements Comparable<java.util.Date> {
	private final int day;
	private final int month;
	private final int year;
	
	public Date(int d,int m,int y){
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	@Override
	public int compareTo(java.util.Date that) {
		
		return 0;
	}
	
}
