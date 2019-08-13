/* The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 */
public class Prog_5 
{
	public static void main(String[] args) 
	{
		long a=2520,i; /*Because this number is already given in question*/
		for(i=11;i<=20;i++)
			a=lcm(i,a);
		System.out.print(a);
	}
	public static long lcm(long x, long y)
	{
		long gcd,num1=x,num2=y;
		while(x!=y)
		{
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		gcd=x;
		return ((num1*num2)/gcd);
	}
}