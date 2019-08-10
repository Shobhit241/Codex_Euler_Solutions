/* the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum */
public class Prog_6 
{
	public static void main(String[] args) 
	{
		int n=100,s1=0,s2=0;
		s1=(n*(n+1))/2;
		s2=(n*(n+1)*(2*n+1))/6;
		System.out.println("The square of sum is "+(s1*s1)+"\nThe sum of squares is "+s2+"\nThe difference is "+((s1*s1)-s2));
	}
}