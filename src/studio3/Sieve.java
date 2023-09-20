package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What number would you like to see the primes up to?");
		int n = in.nextInt();
		
		int[] list = new int[n+1];
		for(int i=0; i<=n; i++)
		{
			list[i] = i;
		}
		int lowestValue = 2;
		while (lowestValue <= n/2)
		{
			for(int i = lowestValue*2; i <= n; i=i+lowestValue)
			{
				list[i] = 0;
			}
			int lowestCheck = 0;
			int check = lowestValue + 1;
			while(lowestCheck == 0)
			{
				lowestCheck = list[check];
				check++;
			}
			lowestValue = lowestCheck;
		}
		for(int i=0; i<=n; i++)
		{
			if(list[i] != 0 && list[i] != 1)
			{
				System.out.println(list[i]);
			}
		}
	}

}
