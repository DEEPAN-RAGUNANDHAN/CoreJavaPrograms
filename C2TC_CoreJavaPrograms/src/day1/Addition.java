package day1;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("a");
		a=sc.nextInt();
		System.out.println("b");
		b=sc.nextInt();
		c=a+b;
	System.out.println("Addition of a="+a+"and b="+b+"is"+c);
	}

}
