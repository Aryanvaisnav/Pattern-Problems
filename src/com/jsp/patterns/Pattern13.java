package com.jsp.patterns;

public class Pattern13 {

	public static void main(String[] args) {
		
		int n = 4;
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(a + "\t");
				c = b;
				b = a + b;
				a = c;
			}
			System.out.println();
		}

	}

}

// Pattern - 13

//				0	
//				1	1	
//				2	3	5	
//				8	13	21	34	

