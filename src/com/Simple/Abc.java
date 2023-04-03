package com.Simple;

public class Abc {
int a=10;
static int b=20;
public static void main(String[]args) {
	Abc obj=new Abc();
	System.out.println(obj.a);
	System.out.println(obj.b);
	obj.a=1000;
	obj.b=2000;
	System.out.println(obj.a);
	System.out.println(obj.b);
}
}