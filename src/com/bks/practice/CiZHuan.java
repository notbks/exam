package com.bks.practice;

import java.util.Scanner;

public class CiZHuan {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            System.out.println(replaceBrick(str));
        }
        sc.close();
    }
 
    private static int replaceBrick(String str) {
        int len = str.length();
        int count = 0;
        char[] cStr = str.toCharArray();
        for (int i = 1; i < len; i++) {
            if(cStr[i]==cStr[i-1]){
                count++;
                i++;
            }
        }
        return count;
    }

}
