package demo.adminwilltoken.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import demo.adminwilltoken.pages.AdminLoginPage;

public class AdminLogintest {
	
	
	@Test
	public void AdminLogin()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\My Macbook\\Desktop\\selenium tutorial\\softwares\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.willtoken.io/coinadmin/login");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
						
		AdminLoginPage AL = new AdminLoginPage(driver);
		AL.driver=driver;
		AL.login();
				
			
	}

}
