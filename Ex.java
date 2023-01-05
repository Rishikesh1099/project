package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex {

	public static void m() throws FileNotFoundException  {

		 FileInputStream h= new  FileInputStream("C:\\Users\\Rishikesh Dubey\\Desktop\\Rishikesh dubey\\JavaProject\\hjh");
	System.out.println("***");
	}
	public static void main(String[] args) throws FileNotFoundException {
//		 m();
//		 System.out.println("hii");
		
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(1/0);
		}
		finally {
			System.out.println("hallo");
		}
	}
}
