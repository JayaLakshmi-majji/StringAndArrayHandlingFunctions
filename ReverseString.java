import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a Strng");
		String c=sc.nextLine();
		for(int i=c.length()-1;i>=0;i--) {
			System.out.print(c.charAt(i));
		}
	}
}
