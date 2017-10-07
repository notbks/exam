package com.bks.logic;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(;x<400;x++) {
			if(x%2==1 && x%3==1 && x%4==1 && x%5==1 && x%7==0) {
				System.out.println(x);
			}
		}
	}

}
