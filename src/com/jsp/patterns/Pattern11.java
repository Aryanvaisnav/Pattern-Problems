package com.jsp.patterns;

public class Pattern11 {

	public static void main(String[] args) {
		
		int n = 5;
		int inner_space = -1;
		int outer_space = n/2;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= outer_space; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			
			for(int j = 1; j <= inner_space; j++) {
				System.out.print("\t");
			}
			
			if(i > 1 && i < n) {
				System.out.print("*\t");
			}
			
			
			if(i <= n/2) {
				outer_space--;
				inner_space = inner_space + 2;
			}
			else {
				outer_space++;
				inner_space = inner_space - 2;
			}
			System.out.println();
		}

	}

}



// Pattern - 11

//						*	
//					*		*	
//				*				*	
//					*		*	
//						*	




