/* the largest prime factor of the number 600851475143 */
public class Prog_3
{
	public static void main(String[] args) 
	{
		int i=3;
		long s=0,n=600851475143L;
		while(i<n/2) 
		{
			
			i+=2;
			if(n%i==0 && isPrime(i))
			{
				n=n/i;
				s=n;
			}
		}
		System.out.println("The largest prime factor is "+s);
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
