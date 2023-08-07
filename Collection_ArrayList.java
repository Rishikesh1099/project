package arrayprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collection_ArrayList {

	public static void main(String[] args) {
		
	String Y_N="";
		do {
		Scanner sc=new Scanner(System.in);
    List<String> lst=new ArrayList<String>(7);	
    lst.add("Aranav");	
    lst.add("Bablu");	
    lst.add("Chetu");
    lst.add("Deepa");
    lst.add("Rahul");
    lst.add("Nitin");
    lst.add("Vikash");
    List<String> ls=new ArrayList<String>();
    ls.add("Aranav");
    ls.add("Chetu");
//    //ls.removeAll(ls);
     //lst.retainAll(ls); 
   lst.addAll(ls);
    System.out.println(lst.size());
    //ls.add("ghgj");
    for (int i = 0; i < 3; i++) {
		lst.add(sc.next());
	}
    System.out.println("Do you want to Enter any name?(Y_N)"); 
    Y_N=sc.next();
  
		} while(Y_N.equalsIgnoreCase("yes"));
   
   // System.out.println(lst.addAll(ls));
    //System.out.println(lst.size());
	//System.out.println(lst.get(2));	 
	
	/*
	 * for (int i = 0; i < lst.size(); i++) { System.out.println(lst.get(i)); }
	 * System.out.println(lst.get(6 ));
	 */
	
	
	List<String> lst=new ArrayList<String>();
	Iterator itr=lst.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	
	
	}

		}
}
