public class App 
{
	public static void main(String[] args) 
	{
		Car car1=new Car(new DieselEngine());
		Car car2=new Car(new PetrolEngine());
		Car car3=new Car(new CngEngine());
		car1.turnEngineOn();
		car2.turnEngineOn();
		car3.turnEngineOn();
		car1.setEngine(new CngEngine());
		car1.turnEngineOn();
	}
}
