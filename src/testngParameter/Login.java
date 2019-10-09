package testngParameter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	@BeforeTest
	public void Login() throws IOException
	{
		Properties pro= new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\testng\\src\\testngParameter\\dataFile.properties");
		
		//Properties file will load the file
		pro.load(file);
		
		System.out.println(pro.getProperty("URL"));
		System.out.println(pro.getProperty("nickname"));
		System.out.println(pro.getProperty("password"));
	}
	
	@Test(enabled=true)
	public void mobileLoginAndroid()
	{
		System.out.println("Login the application using the Android Mobile app");
	}
	
	@Test(enabled=false)
	public void webLogin()
	{
		System.out.println("Login the application using the website");
	}
	
	@Test(enabled=false)
	public void riaLogin()
	{
		System.out.println("Login the application using the RIA application");
	}
}
