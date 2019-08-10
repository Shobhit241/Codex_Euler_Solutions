 /* The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 */
public class Prog_5 
{
	public static void main(String[] args) 
	{
		int i,flag=0,s=20;
		while(flag==0)
		{
			s++;
			for(i=1;i<=20;i++)
			{
				if(s%i!=0)
					break;
			}
			if(i==21)
				flag=1;
			else
				flag=0;
		}
		System.out.println(s);
	}
}