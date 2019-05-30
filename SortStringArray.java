import java.util.Scanner;

public class SortStringArray {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		char c[] = s.toCharArray();
		for(int j=0;j<c.length;j++) {
			for(int i=0;i<c.length-1;i++) {
				if(c[i]<c[i+1]) {
					char temp=c[i+1];	
					c[i+1]=c[i];
					c[i]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(" "+c[i]);
		}
	}
}
