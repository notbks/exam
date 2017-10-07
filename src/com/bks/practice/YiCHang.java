package com.bks.practice;

public class YiCHang {

	public static void main(String[] args) {
		System.out.println(test());
	}
	
	@SuppressWarnings("finally")
	public static String test() {
		try {
			return "try";
		}catch(Exception ex){
			return "catch";
		}finally {
			return "finally";
		}
	}

}
