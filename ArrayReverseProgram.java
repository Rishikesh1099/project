package arrayprogram;

public class ArrayReverseProgram {

	public static void main(String[] args) {
		
		String[] a=new String[4];
		a[0]="I";
		a[1]="Love";
		a[2]="My";
		a[3]="India";
		
		for (int i = 0; i <=a.length-1 ; i++) {
			if(i%2==0) {
				System.out.print(a[i]+" ");
			}
			if(i%2!=0) {
				int b=a[i].length();
				String c=" ";
				for(int j=b-1; j>=0; j--) {
					char ch=a[i].charAt(j);
					c=c+ch;
					
				}
				System.out.print(c+" ");
		
		
	}

}}}
