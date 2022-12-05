package com.design_shinbi.exercise.leapyear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        String stringT = reader.readLine();
        int t = Integer.parseInt(stringT);
        
        for(int i = 0; i < t; i++) {
            String stringN = reader.readLine();
            int n = Integer.parseInt(stringN);
            
            checkLeapYear(n);
        }

        reader.close();
    }
    
    public static void checkLeapYear(int n) {
    	int leap = 0;
    		
    	if(n%400 == 0) {leap=1;}
    	else if(n%100 == 0) {leap=0;}
    	else if(n%4==0) {leap=1;}       
 
        if(leap==1){
        	System.out.println(n + " is a leap year");
        }else {
        	System.out.println(n + " is not a leap year");
        }
    }
}
