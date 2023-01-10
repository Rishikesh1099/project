package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex {

	public static void m() throws FileNotFoundException  {
		System.out.println("hallo");
		
		FileInputStream h= new  FileInputStream("C:\\Users\\Rishikesh Dubey\\Desktop\\Rishikesh dubey\\JavaProject\\hjh");
		System.out.println("***");
	}
	public static void main(String[] args) throws FileNotFoundException {
<<<<<<< HEAD
		//		 m();
		//		 System.out.println("hii");

=======
		System.out.println("for git practice");

//		 m();
//		 System.out.println("hii");
		
>>>>>>> gama
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
