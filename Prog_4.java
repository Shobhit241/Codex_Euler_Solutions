/* largest palindrome made from the product of two 3-digit numbers */
public class Prog_4
{
	public static void main(String[] args) 
	{
		int i,j,n,temp=0;
		for(i=100;i<1000;i++)
			for(j=100;j<1000;j++)
			{
				n=i*j;
				if(Pallin(n)==0) 
					{
					if(n>temp)
						temp=n;
					}
			}
		System.out.println("The largest prime is "+temp);
	}
	
	public static int Pallin(int num)
	{
		int temp=num,b=0,r;
		while(temp!=0)
		{
			r=temp%10;
			b=b*10+r;
			temp=temp/10;
		}
		if(b==num)
			return 0;
		else 
			return 1;
	}
}
