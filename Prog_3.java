/* the largest prime factor of the number 600851475143 */
public class Prog_3 
{
	public static void main(String[] args) 
	{
		int i;
		long Max=0,a=600851475143L;
		for(i=3	;i<=(int)Math.sqrt(a);i+=2)
		{
			while(a%i==0)
			{
				Max=i;
				a/=i;
			}
		}
		if(a>2)
			Max=a;
		System.out.println("The largest prime factor is "+Max);
	}
}