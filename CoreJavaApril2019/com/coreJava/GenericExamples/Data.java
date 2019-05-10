package com.coreJava.GenericExamples;

class DataBoundary{
	public <E ,N extends Number>  void display(E ele, N num){
		System.out.println("In DataBoundary  class **** E is "+ele +" N is : "+num );
		
	}
}

class DataPara<K,V>{
	private K key;
	private V value;
	public DataPara(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "DataPara [key=" + key + ", value=" + value + "]";
	}
	
	public <E extends Character,N extends Number>  void display(E ele, N num){
		System.out.println("E is "+ele +" N is : "+num );
		
	}
}

public class Data<T extends Comparable<T>> implements Comparable<T> {
	
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public int compareTo(T o) {
		
		return getMyVariable().compareTo(o);
	}

	
	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}


}
