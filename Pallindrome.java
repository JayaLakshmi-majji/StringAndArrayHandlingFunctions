import java.util.Scanner;

public class Pallindrome {
	public static void main(String arg[])	
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter string");
	   String str=sc.next();
	   StringBuffer res=new StringBuffer();
	   int j=0;
	   for(int i=str.length()-1;i>=0;i--) {
  			res.insert(j, str.charAt(i));
  			j++; 
  		}
	   //System.out.println(res);
	   String temp1=res.toString();
	   if(temp1.equals(str)) {
  			System.out.println("pallindrome");
  		}
  		else {
  			System.out.println("no");
  		}
	}
}
