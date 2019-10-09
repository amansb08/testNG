package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KotakBankLoginParameter {
	@Parameters({"URL"})
	@BeforeTest
	public void webLogin(String URL)
	{
		System.out.println("Open the site in the web browser");
		System.out.println(URL);
	}
	
	@Test
	public void selectNickName()
	{
		System.out.println("Select the Nickname option");
		
	}
	
	@Parameters({"NickName","password"})
	@Test(dependsOnMethods={"selectNickName"})
	public void enterNickName(String nickName, String pass)
	{
		System.out.println("Enter the user Nickname");
		System.out.println(nickName);
		System.out.println("Enter the user Password");
		System.out.println(pass);
	}
	
	@Test(dependsOnMethods={"enterNickName"})
	public void clickLogin()
	{
		System.out.println("Click on the Login Button");
	}
	
	@Parameters({"OTP"})
	@Test(dependsOnMethods={"clickLogin"})
	public void enterOTP(int num)
	{
		System.out.println("Enter the OTP recevied");
		System.out.println(num);
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
