package testng;

import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test
	public void apply()
	{
		System.out.println("Apply new home loan");
	}
	
	@Test
	public void onhold()
	{
		System.out.println("Home loan application are on hold");
	}
	
	@Test(groups= {"smokeProcess"})
	public void process()
	{
		System.out.println("Application in process for new home loan");
	}
	
	@Test
	public void complete()
	{
		System.out.println("Home loan approved");
	}
	
	@Test
	public void rejected()
	{
		System.out.println("Home loan rejected");
	}

	
}
