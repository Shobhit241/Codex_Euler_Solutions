/*Sum of primes below 2M*/
public class Prog_10 
{
	public static void main(String[] args) 
	{
		long n=3,s=2;
		while(n!=2000000)
		{
			if(n%2!=0 && isPrime(n))
			{
				s+=n;
				n++;
			}
			else
				n++;
		}
		System.out.println("The summation is "+s);
	}
	
	public static boolean isPrime(long n)
	{
		int c=0;
		for(int i=1;i<=(int)Math.sqrt(n);i+=2)
			if(n%i==0)
				c++;
		if(c>1)
			return false;
		else
			return true;
	}
}
