public class Car 
{
	private FourWheelerEngine engine;
	public Car()
	{
		engine=new PetrolEngine();//tight coupling
	}
	public void turnEngineOn()
	{
		engine.startEngine();
	}
	public void turnEngineOff()
	{
		engine.stopEngine();
	}
}
