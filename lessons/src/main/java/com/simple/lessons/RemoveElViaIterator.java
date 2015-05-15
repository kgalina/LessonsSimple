package com.simple.lessons;


import java.util.HashSet;


public class RemoveElViaIterator {
	 public static void main( String[] args )
	    {
		 HashSet<String> namesHashSet = new HashSet<String>();
	        
	        namesHashSet.add("Коля");
	        namesHashSet.add("Петя");
	        namesHashSet.add("Вася");
	        namesHashSet.add("Маша");
	        namesHashSet.add("Ира");
	        namesHashSet.add("Вова");
	   
	       	        
	      for(String s : namesHashSet){
	        	System.out.print(s+" ");
	        	
	        }
	        
	        System.out.println();
	        // Remove all elements starting with 'В'
	        java.util.Iterator<String> iter = namesHashSet.iterator();
	        while(iter.hasNext()){
	        	String s = (String) iter.next();
	        	if(s.charAt(0)== 'В'){
	        		iter.remove();
	        	System.out.print(s + " ");
	        	}
	        }
	        
	        System.out.println();
	        
	        for(String s : namesHashSet){
	        	
	        	System.out.print(s+" ");}
	        
	    }
}
