package com.example.programs.sampleprograms;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntresectionString {
	
	public static void main(String[] args) { 
	String[] arr1 = { "Ramesh", "harika", "sunil"};
	String[] arr2 = {"Sandhya","Sarvari","harika","sunil"};

	Set<String> unionSet = new HashSet<>();
	for (String num : arr1) {
		unionSet.add(num); 
	}
	for (String num : arr2) {
		unionSet.add(num); 
	}
	
	Set<String> intersectionSet = new HashSet<>();
	for (String num : arr1) {
		for (String num2 : arr2) {
			if (num == num2) {
				intersectionSet.add(num);
			}
		}
	}
	System.out.println("Union: " + (unionSet)); 
	System.out.println("Intersection: " +(intersectionSet)); 
}

}












