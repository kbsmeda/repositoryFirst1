package com.coreJava.Examples;

 
public class AbcStatic {
	int i=11;
	
	static int j=25;
	
	public static void main(String args[]) {
	    System.out.println(" i is "+ new AbcStatic().i + "\n **************** ");
	    new AbcStatic().abc();
	    def();
	}
	
	public void abc() {
		System.out.println(" i is "+ i +j);
		def();
		System.out.println(" x is "+ Def.x);
	}
	
	 public static void def() {
		System.out.println("\n i in def is**** "+ new AbcStatic().i);
		System.out.println(" x is "+ Def.x);
	}

}
