package com.example.programs.sampleprograms;


public class TestStr {
	public static void main (String[] args) {
		
//		String s1 = "Harika";
//		String Hari = "harikavanum5@gmail.com";
		String s2 = new String("Harika");
//		
//		
//		String java = "java is super";
//		
//		System.out.println(java.split(" ").length);
//		String ja = "Hello World";
//		
		String d = "<space><space><space>hello<space>world<space><space>";
		
		 String result = d.replaceAll("(?i)^<space>+|<space>+$", "") // Remove leading/trailing <space>
                 .replaceAll("<space>+", "<space>"); // Replace multiple <space> with a single <space>

System.out.println(result);
		
//		StringBuilder s = new StringBuilder();
//		s.append(s2);
//		
//		
//		System.out.println(s.reverse());
		
		//System.out.println(java.charAt("i").length);

		
//		char[] a = s1.toCharArray();
//		
//		System.out.println(a);

//		System.out.println(s1.toCharArray());
//
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(Hari));
//
//
//		System.out.println(s1.length());
//		System.out.println(Hari);
//
//		System.out.println(s1 +  Hari);
//		System.out.println(s2.length());
		
	}

}
