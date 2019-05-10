package com.coreJava.Examples;
interface Lambda{
	public void demo();
}
public class PrimeNumberExample {

	public static void main(String[] args) {
		
		int num=32;
		boolean flag=false;
	
		
		for(int i=2; i<=num/2;++i) {
									
			if(num%i == 0) {
				flag=true;
				break;		
								
			}
			
		}
		//if(flag==false) is same as if(!flag) 
		System.out.println("The flag is set to "+flag );
		if(flag==false)
			System.out.println("The num "+num+" is a prime number");
					
				
		else
			System.out.println("The num  "+num+" is not a prime number");
			
			
	}
	
	

	}

