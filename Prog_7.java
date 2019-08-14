/*10001st prime*/
public class Prog_7 
{
	public static void main(String[] args) 
	{
		int j,count=2,result=0,c;
		for(j=3;count<=10001;j+=2)
			{
				c=0;
				for(int i=3;i<=(int)Math.sqrt(j);i+=2)
					if(j%i==0 && j!=i)
						c++;
				if(c==0)
				{
					result=j;
					count++;
				}
			}
		System.out.println("The 10001st prime is "+result);
	}
}