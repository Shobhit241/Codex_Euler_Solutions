/* sum of the even-valued in the Fibonacci sequence whose values do not exceed four million */
public class Prog_2 
{
	public static void main(String[] args) 
	{
		int a=1,b=2,c=0,s=2;
		while(c<=4000000)
		{
			if(c%2==0)
				s+=c;
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("The sum is "+s);
	}

}
