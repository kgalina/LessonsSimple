package com.simple.lessons;

import java.util.ArrayList;


public class ForEarchSimple 
{
    public static void main( String[] args )
    {
        ArrayList<String> namesArrayList = new ArrayList<String>();
        
        namesArrayList.add("Даша");
        namesArrayList.add("Петя");
        namesArrayList.add("Вася");
        namesArrayList.add("Маша");
        namesArrayList.add("Таня");
        namesArrayList.add("Вова");
   
        
        
        for(int i=0; i<6; i++){
        	String s = namesArrayList.get(i);
        	System.out.print(s+" ");
        	 }
    
        System.out.println();
      
        // We will have the same result
        
        for(String s : namesArrayList){
        	System.out.print(s+" ");
        	
        }
    }
}

