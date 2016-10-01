package com.java.practice;

public class Calculation {
public static void main(String [] args){
	Calculation t=new Calculation();
	System.out.println(t.add(10, 15));
	System.out.println(t.sub(30,12));

}

public int add(int x, int y){
	
	return x+y;
	
}
public int sub(int x, int y){
	return x-y;
}
}
