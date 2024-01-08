package com.jsp.patterns;

public class Pattern7 {
	
	
	// Hollow Diamond

	public static void main(String[] args) {
		
		int n = 5;
		int space = 1;
		int star = (n/2)+1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print("*\t");	
			}
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("*\t");	
			}
			
			if(i <= n/2) {
				star--;
				space = space + 2;
			}
			else {
				star++;
				space = space - 2;
			}
			
			System.out.println();
			
		}

	}
	
}
	
// Pattern7 - Hollow Diamond
	
//	*	*	*		*	*	*	
//	*	*				*	*	
//	*						*	
//	*	*				*	*	
//	*	*	*		*	*	*	


