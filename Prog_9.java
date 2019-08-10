/*Pythagorean triplet*/
public class Prog_9 
{
	public static void main(String[] args) 
	{
		int a=0,b=0,c=0;
		for(a=1;a<1000;a++)
			{
				for(b=a+1;b<1000;b++)
					{
						c=1000-a-b;
						if(((a*a)+(b*b))==(c*c))
						{
							System.out.print(a+" "+b+" "+c+" ");
							System.out.print(a*b*c);
							break;
						}
					}
			}
	}
}