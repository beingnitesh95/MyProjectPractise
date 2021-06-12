package webDriver.day4;
import java.awt.List;
import java.util.ArrayList;

public class ReturnVlaues{
	
   public String[] arrayValues() {
	   
	   String[] a= new String[3];
	   
	   a[0]="selenium1";
	   a[1]="selenium2";
	   a[2]="selenium3";
	   
	  return a;
	    
   }
	/*public List listValues() {
		List l =new List();
		l.add("jay1");
		l.add("jay2");
		l.add("jay3");
		return l;
	}
   */
   
   
   
	public static void main(String[] args) {
		ReturnVlaues r= new ReturnVlaues();
		/*
		List ll=r.listValues();
		for (int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		*/
		
		String temp[]=r.arrayValues();
		for(int i=0;i<temp.length;i++)
		{
		System.out.println(temp[i]);
	}   

	}
}
