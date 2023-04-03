package com.Control_Statements;

public class City {

	public static void main(String[] args) {
		String city="Lucknow";
		if(city == "Lucknow") {
		   System.out.println("city is Lucknow");
		}
		else if(city == "Noida") {
			System.out.println("city is Noida");
		}
		else if(city == "") {
		    System.out.println("city is Delhi");
		}
		else if(city == "Agra") {
			System.out.println("city is Agra");
		}
		else {
			System.out.println(city);
		}

	}

}
