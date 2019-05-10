package com.coreJava.GenericExamples;

import java.util.LinkedList;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		//demonstrating Comparable<T> interface and compareTo() in Generics
		//lines 11 to 13
		Data<Integer> data=new Data<Integer>(1); //part1
		System.out.println("Value of data "+data);
		System.out.println("compareTo() : "+data.compareTo(1)); //part1.part2
		
		//Demo on Key value pairs
		DataPara<String,String> dp= new DataPara<String,String>("57","Kavi");
		System.out.println("The obj dp : "+dp);
		System.out.println(dp.getKey());
		System.out.println(dp.getValue());
		
		//Demo on Bounded type parameter 
		dp.display('@', 27);
		//Boundary example in another class
		DataBoundary db= new DataBoundary();
		db.display("Data Boundary", 500.05);
			
		
		List<Data<String>> elements=new LinkedList<>();
		elements.add(new Data<String>( "Hi"));
		elements.add(new Data<String>( "Hello"));
		elements.add(new Data<String>( "Namaste"));
		
		List<Data<Integer>> numbers=new LinkedList<>();
		numbers.add(new Data<Integer>( 123));
		numbers.add(new Data<Integer>(456));
		numbers.add(new Data<Integer>( 789));
		
		
		GenericDemo gd = new GenericDemo();
		
        gd.printList1(elements);
        System.out.println("**************"+"\n***********");
        gd.printList2(numbers);
        
		
	}
	public void printList1(List<Data<String>> e){
	
		for(Data<String> temp : e) {
		System.out.println(temp.getMyVariable());	
		}
	}

	public void printList2(List<Data<Integer>> e){
		
		for(Data<Integer> temp : e) {
		System.out.println(temp.getMyVariable());	
		}
	}

}
