public class App 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(new Calculator().add(-9000,4000));
		}
		catch(NumberException ex)
		{
			System.out.println(ex);
		}
	}
}
