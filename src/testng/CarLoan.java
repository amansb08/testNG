package testng;

import org.testng.annotations.Test;

public class CarLoan {

	@Test
	public void apply()
	{
		System.out.println("Apply new car loan");
	}
	
	@Test(groups= {"smokeProcess"})
	public void process()
	{
		System.out.println("Application in process for new car loan");
	}
	
	@Test
	public void complete()
	{
		System.out.println("Car loan approved");
	}
	
	@Test
	public void rejected()
	{
		System.out.println("Car loan rejected");
	}
}
