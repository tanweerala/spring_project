public class Calculator 
{
	public int add(int num1,int num2)throws NumberException
	{
		if(num1<=0 || num2<=0)
		{
			NumberException exception=new NumberException("Numbers must be positive");
			throw exception;
		}
		return num1+num2;
	}
}
