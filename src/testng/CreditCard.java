package testng;

import org.testng.annotations.Test;

public class CreditCard {
	
	@Test
	public void apply()
	{
		System.out.println("Apply new credit card");
	}
	
	@Test(groups= {"smokeProcess"})
	public void process()
	{
		System.out.println("Application in process for new credit card");
	}
	
	@Test
	public void complete()
	{
		System.out.println("Credit card approved");
	}
	
	@Test
	public void rejected()
	{
		System.out.println("Credit card rejected");
	}

}
