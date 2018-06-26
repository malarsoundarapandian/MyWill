package demo.adminwilltoken.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {

	public WebDriver driver;
	
	public AdminLoginPage(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(d, this); // initialize all the FindBy methods of the class
	}
	
	@FindBy(id="email")
	private WebElement emailaddr;
	
	@FindBy(id="password")
	private WebElement password;
	
			
	public void login()
	{
		emailaddr.sendKeys("admin@demo.com");
		password.sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();
	}
}
