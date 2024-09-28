public class App 
{
	public static int factorial(int num)
	{
		if(num==1)
			return 1;
		return num*factorial(num-1);
	}
	public static void main(String[] args) 
	{
		int x=4;
		int res=factorial(x);
		System.out.println(res);
	}
}
