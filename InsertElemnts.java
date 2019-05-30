import java.util.Scanner;

public class InsertElemnts {
	public static void main(String arg[])	
	{
            int n;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter size");
	   n=sc.nextInt();
	   int a[]=new int[n];
	   for(int i=0;i<n;i++) {
		   a[i]=sc.nextInt();
		   }
	   for(int i=a.length-1;i>=0;i--) {
		   System.out.print(" "+a[i]);
		   }
	}
}
