package program;
import java.util.Scanner;
public class Program20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 distinct values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a<c)
			System.out.println(a);
		else if(b>a&&b<c)
			System.out.println(b);
		else
			System.out.println(c);
		

	}

}
