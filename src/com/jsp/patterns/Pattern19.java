package com.jsp.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i <= n/2 &&  j > n/2 + 1 && j < n) {
					System.out.print("\t");
				}
				else 
					if(i > 1 && i < n/2 + 1 && j >= 1 && j < n/2 + 1) {
						System.out.print("\t");
					}
					else 
						if(i > n/2 + 1 && j > 1 && j < n/2 + 1) {
							System.out.print("\t");
						}
						else
							if(i > n/2 + 1 && i < n && j > n/2 + 1) {
								System.out.print("\t");
							}
							else {
								System.out.print("*\t");
							}
			}
			
			System.out.println();
		}
		

	}

}


// Pattern - 19



//					*	*	*		*	
//							*	
//					*	*	*	*	*	
//					*		*			
//					*		*	*	*
