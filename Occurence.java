import java.util.Scanner;

public class Occurence {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		char c= sc.next().charAt(0);
		System.out.print(s.indexOf(c));
	}
}
