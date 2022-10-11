package interview;

import java.util.Scanner;

public class VowelConsonantCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		VowelConsCount(s);

	}
	public static void VowelConsCount(String z)
	{
		int vC=0,cC=0;
		for (int i = 0; i < z.length(); i++) {
			char c=z.charAt(i);
			if(c>='A'&&c<='Z')
			{
				if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				{
					vC++;
				}
				else
					cC++;
			}
			else if(c>='a'&&c<='z')
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				{
					vC++;
				}
				else
					cC++;
			}
		}
		System.out.println("vowel count "+vC);
		System.out.println("conso count "+cC);
	}

}
