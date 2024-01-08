package com.jsp.patterns;

public class Pattern9 {
	
	public static void method1(int n) {
		
		int space = n-1;
		int star = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			
			space--;
			System.out.println();
		}
		
	}
	
	public static void method2(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i + j == n + 1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		
		method2(5);
		
	}
	
	
}
	
	
// Pattern9	

//						*	
//					*	
//				*	
//			*	
//		*


