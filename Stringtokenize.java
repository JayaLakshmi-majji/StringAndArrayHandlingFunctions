import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenize {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer s1=new StringTokenizer(s);
		while(s1.hasMoreTokens()) {
			System.out.println(s1.nextToken());
		}
	}
}
