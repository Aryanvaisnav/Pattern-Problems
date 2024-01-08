package com.jsp.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int s = 1; s < i; s++) {
				System.out.print("  ");
			}
			for(int k = n-i; k >= 0; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}


/*
 
  Pattern5-			* * * * * 
					  * * * * 
					    * * * 
					      * * 
					        * 
  
  
 */
