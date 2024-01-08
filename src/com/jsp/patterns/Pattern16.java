package com.jsp.patterns;

public class Pattern16 {

	public static void main(String[] args) {
		
		int n = 4;
		int space = (2*n - 3);
		int star = 1;
		
		
		
		for(int i = 1; i <= n; i++) {
			
			int val = 1;
			
			for(int j = 1; j <= star; j++) {
				System.out.print(val + "\t");
				val++;
			}
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			
			if(i == n) {
				star--;
				val--;
			}
			
			for(int j = 1; j <= star; j++) {
				val--;
				System.out.print(val + "\t");
			}
				
			space = space - 2;
			star++;

			System.out.println();
		}

	}

}


// Pattern - 16


//					1						1	
//					1	2				2	1	
//					1	2	3		3	2	1	
//					1	2	3	4	3	2	1	

