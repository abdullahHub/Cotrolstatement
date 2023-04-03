package com.Control_Statements;

public class Address {
	public static void main(String[]args) {
		String address="Azamgarh,meerut,Delhi,India";
		if(address.endsWith("India")) {
			if(address.contains("Azamgarh")) {
				System.out.println("Your city is Lucknow");
			}
			else if(address.contains("Noida")) {
				System.out.println("Your city is Noida");
			}
			else{
				System.out.println(address.split(",")[1]);
			}
		}else {
				System.out.println("Your not living in india");
			}
		}
	}
