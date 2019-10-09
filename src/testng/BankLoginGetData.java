package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BankLoginGetData {
	
	//Passing the URL from the XML file
	@Parameters({"URL"})
	@BeforeTest   //Execute before test
	public void webLogin(String URL)
	{
		System.out.println("Open the site in the web browser");
		System.out.println(URL);
	}
	
	//Selecting the Nickname option to enter the user data in next step
	@Test
	public void selectNickName()
	{
		System.out.println("Select the Nickname option");
		//avoid space
	}
	
	//Passing the array object values from dataObject function. 
	@Test(dataProvider="dataObject")
	public void enterNickName(String nickName, String pass)
	{
		System.out.println("Enter the user Nickname");
		System.out.println(nickName);
		System.out.println("Enter the user Password");
		System.out.println(pass);
	}
	
	//Click on the Login button
	@Test(dependsOnMethods={"enterNickName"})
	public void clickLogin()
	{
		System.out.println("Click on the Login Button");
	}
	
	//Passing the OTP from the XML file
	@Parameters({"OTP"})
	@Test(dependsOnMethods={"clickLogin"})
	public void enterOTP(int num)
	{
		System.out.println("Enter the OTP recevied");
		System.out.println(num);
	}
	
	//Click on the Secure Login button
	@Test(dependsOnMethods={"enterOTP"})
	public void clickSecureLogin()
	{
		System.out.println("Click on the Secure Login Button");
	}

	//Logout from the application
	@Test(dependsOnMethods={"clickSecureLogin"})
	public void webLogout()
	{
		System.out.println("Logout the application by click on the Logout button");
	}
	
	//Created the array object to pass the data
	@DataProvider
	public Object[][] dataObject() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="aman";
		data[0][1]="Pass1";
		
		data[1][0]="basnabi";
		data[1][1]="Pass2";
		
		data[2][0]="Jagdeep";
		data[2][1]="Pass3";
		
		return data;
	}
}
