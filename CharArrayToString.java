import java.util.Scanner;

public class CharArrayToString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		char c[]=new char[n];
		StringBuffer str=new StringBuffer();
		System.out.println("enter characters");
		for(int i=0;i<n;i++) {
			c[i]=sc.next().charAt(0);
		}
	
		for(int i=0;i<c.length;i++) {
	  			str.insert(i, c[i]);
	  			 
	   }
		System.out.println(str);
	}
}
