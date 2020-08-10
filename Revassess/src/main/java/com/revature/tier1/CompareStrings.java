package com.revature.tier1;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2){
    	if(s1 == s2 || s1.equals(s2)) {
        	return true;
    	}
    	else {
    		return false;
    	}   	
    }
    
    public static void main(String[] args) {
		System.out.println(compareStrings("s1", new String ("s1")));
	}
}