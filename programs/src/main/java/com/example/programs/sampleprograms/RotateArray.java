package com.example.programs.sampleprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class RotateArray {
	
	public static void main(String[] args) {

        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < 3; i++) {
            // Move the first element to the end
            data.add(data.get(0));
            data.remove(0);
        }

        // Print the final rotated list after the loop
        System.out.println("Rotated List: " + data);
    }
}
//	public static void main (String[] args) {
//
//	      List<Integer> data = new ArrayList();
//	      
//	      data= Arrays.asList(1,2,3,4,5);
//	    
//	      for (int i=0;i<3 ;i++ ) {
//	        data.add(data.get(0));
//	        data.remove(0);
//	         System.out.println(data);
//
//	      }
//	}
//}


//	    public static void main(String[] args) {
//	        int[] arr = {80, 22, 30, 45, 50, 12};
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.print("Enter the number of rotations: ");
//	        int rotations = scanner.nextInt(); 
//	        scanner.close();
//	        List<int[]> result = rotateArray(arr, rotations);
//	        for (int[] rotatedArr : result) {
//	            System.out.println(Arrays.toString(rotatedArr));
//	        }
//	    }
//
//	    public static List<int[]> rotateArray(int[] arr, int rotations) {
//	        List<int[]> rotatedArrs = new ArrayList<>();
//	        int n = arr.length;
//
//	        for (int i = 0; i < rotations; i++) {
//	            int[] rotatedArr = new int[n];
//	            for (int j = 1; j < n; j++) {
//	                rotatedArr[j - 1] = arr[j];
//	            }
//	            rotatedArr[n - 1] = arr[0];
//	            arr = rotatedArr;
//	            rotatedArrs.add(rotatedArr);  
//	        }
//
//	        return rotatedArrs;
//	    }
	
