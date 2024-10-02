package com.example.programs.sampleprograms;

import java.util.HashSet;
import java.util.Set;

public class Unionandintersection {
	
	public static void main(String[] args) { 
	int[] arr1 = { 1, 3, 4, 5, 7,8 };
	int[] arr2 = { 2, 3,7, 6 ,9};

	Set<Integer> unionSet = new HashSet<>();
	for (int num : arr1) {
		unionSet.add(num); 
	}
	for (int num : arr2) {
		unionSet.add(num); 
	}
	
	Set<Integer> intersectionSet = new HashSet<>();
	for (int num : arr1) {
		for (int num2 : arr2) {
			if (num == num2) {
				intersectionSet.add(num);
			}
		}
	}
	System.out.println("Union: " + (unionSet)); 
	System.out.println("Intersection: " +(intersectionSet)); 
}

}
