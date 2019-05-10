package com.coreJava.Examples;

public class ConstructorExample {
	
	private String h ;
	private String w;
	
	
	public ConstructorExample(String h ,String w) {
		this.h=h;
		this.w=w;
	}
	
	public String myHome() {
		if(h.equals("hello") && w.equals("welcome")) {
			return "Welcome Home My Friend!";
		}
		else return "Who are you?";
	}

}
