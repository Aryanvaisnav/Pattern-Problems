package com.jsp.patterns;

public class Pattern15 {

	public static void main(String[] args) {
		
		int n = 5;
		int space = n/2;
		int star = 1;
		int val = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			
			int val2 = val;
			for(int j = 1; j <= star; j++) {

				if(i <= n/2) {
					System.out.print(val2 + "\t");
				}
				else {
					System.out.print(val2 + "\t");
				}
				
				if(j <= star/2) {
					val2++;
				}
				else {
					val2--;
				}
				
			}
			
			if(i <= n/2) {
				space--;
				star = star + 2;
				val++;
			}
			else {
				space++;
				star = star - 2;
				val--;
			}
			
			
			
			System.out.println();
		}

	}

}


// Pattern - 15

//					1	
//				2	3	2	
//			3	4	5	4	3	
//				2	3	2	
//					1	

