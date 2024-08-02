package object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FaceBookPage 
{
	WebDriver driver;
	
	public FaceBookPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='pass']");
	By log=By.xpath("//button[@name='login']");
	

	
	public void EnterPassword(String pass)
	{
		
		driver.findElement(password).sendKeys(pass);
	}
	
	public void verifyLogin()
	{
		driver.findElement(log).click();
	}

	public void EnterUserName(String user) 
	{
		driver.findElement(username).sendKeys(user);
		
	}
	

}
