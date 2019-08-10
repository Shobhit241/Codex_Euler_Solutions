/*10001st prime*/
public class Prog_7 
{
	public static void main(String[] args) 
	{
		int j,k=1,result=0;
		for(j=2;k<10001;j++)
			if(isPrime(j) && j%2!=0)
			{
				result=j;
				k++;
			}
		System.out.println("The 10001st prime is "+result);
	}
	
	public static boolean isPrime(int n)
	{
		int c=0;
		for(int i=1;i<=(int)Math.sqrt(n);i++)
			if(n%i==0)
				c++;
		if(c>1)
			return false;
		else
			return true;
	}
}