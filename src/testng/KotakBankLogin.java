package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KotakBankLogin {
	
	@BeforeTest
	public void webLogin()
	{
		System.out.println("Open the site in the web browser");
	}
	
	@Test
	public void selectNickName()
	{
		System.out.println("Select the Nickname option");
	}
	
	@Test(dependsOnMethods={"selectNickName"})
	public void enterNickName()
	{
		System.out.println("Enter the user Nickname");
	}
	
	@Test(dependsOnMethods={"enterNickName"})
	public void enterPassword()
	{
		System.out.println("Enter the user Password");
	}
	
	@Test(dependsOnMethods={"enterPassword"})
	public void clickLogin()
	{
		System.out.println("Click on the Login Button");
	}
	
	@Test(dependsOnMethods={"clickLogin"})
	public void enterOTP()
	{
		System.out.println("Enter the OTP recevied");
	}
	
	@Test(dependsOnMethods={"enterOTP"})
	public void clickSecureLogin()
	{
		System.out.println("Click on the Secure Login Button");
	}

	@Test(enabled=false,timeOut=2000)
	public void accountSummary()
	{
		System.out.println("View Account Summary");
	}
	
	@Test(timeOut=5000,dependsOnMethods={"clickSecureLogin"})
	public void accountStatement()
	{
		System.out.println("View Account Statement");
	}
		
	@Test(dependsOnMethods={"clickSecureLogin"})
	public void webLogout()
	{
		System.out.println("Logout the application by click on the Logout button");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Close the application");
	}

}
