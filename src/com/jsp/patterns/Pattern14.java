package com.jsp.patterns;

public class Pattern14 {

	public static void main(String[] args) {
		
		int n = 6;
		
		for(int i = 0; i < n; i++) {
			int icj = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(icj + "\t");
				int icjp1 = icj * (i - j) / (j + 1);
				icj = icjp1;
			}
			System.out.println();
		}

	}

}


// Pattern - 14

//					1	
//					1	1	
//					1	2	1	
//					1	3	3	1	
//					1	4	6	4	1	
//					1	5	10	10	5	1	

