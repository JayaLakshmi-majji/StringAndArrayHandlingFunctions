import java.util.Scanner;

public class Reverse_A_Number {
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter number");
       int num=sc.nextInt();
       Reverse(num);
    }
	public static void Reverse(int n) {
		int res=0;
		while(n>0) {
			int rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		System.out.println(res);
	}
	
}
