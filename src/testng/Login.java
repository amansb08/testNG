package testng;

import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void mobileLoginiOS()
	{
		System.out.println("Login the application using the iOS Mobile app");
	}
	
	@Test
	public void mobileLoginAndroid()
	{
		System.out.println("Login the application using the Android Mobile app");
	}
	
	@Test
	public void webLogin()
	{
		System.out.println("Login the application using the website");
	}
	
	@Test
	public void riaLogin()
	{
		System.out.println("Login the application using the RIA application");
	}
}
