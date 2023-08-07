package arrayprogram;

import java.util.ArrayList;
import java.util.List;

public class ArrayProgram_1 {

	public static void main(String[] args) {
		m1();
		m2();

		/*
		 * String s = "I love my India"; char c[] = s.toCharArray(); for (int i =
		 * c.length - 1; i >= 0; i--) { System.out.println(c[i]); }
		 */
		
	String[] a= new String[]{"I"," Love"," My"," India"};
		a[0]="I";
		a[1]="Love";
		a[2]="My";
		a[3]="India";
		
	for (int i =a.length-1 ; i >=0; i--) {
		
		System.out.print(a[i]+" ");
	}
		
 //			if(i%2!=0) {
//				int b=a[i].length();
//				String c=" ";
//				for(int j=b-1; j>=0; j--) {
//					char ch=a[i].charAt(j);
//					c=c+ch;
//					
//				}
//				System.out.print(c+" ");
//				
				
				
			}
	public static void m1() {
		List<Integer> a= new ArrayList<Integer>(11);
		//int [] a=new int[11];
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=5;
//		a[4]=6;
//		a[5]=7;
//		a[6]=1;
//		a[7]=2;
//		a[8]=3;
//		a[9]=4;
//		a[10]=5;
//		
		
		
		
		
		
		
		
		
		
		
		System.out.println(a);
		
		
	}
			
			
		public static void m2() {
			
			char[]a=new char[97];
			a[0]=65;
			System.out.println(a[0]);
			
			byte b=45;
			int[]c=new int[101];
			
			
						
			
		}

		
		
		
		
		
		
		
	}
	
	
	


 