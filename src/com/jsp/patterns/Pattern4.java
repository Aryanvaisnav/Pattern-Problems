package com.jsp.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1; i <= n ; i++) {
			for(int s = n - i; s > 0; s--) {
				System.out.print("  ");
			}
			for(int k = n; k > n - i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}

/*		             * 
 				   * * 
 				 * * * 
 			   * * * * 
             * * * * * 
            
*/