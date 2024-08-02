package object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage 
{

	WebDriver driver;
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By searchbox =By.xpath("//textarea[@name='q']");
	By search_btn=By.xpath("(//input[@name='btnK'])[1]");
	By facebook_link=By.xpath("//h3[text()='Facebook - log in or sign up']");
	
	public void searchGoogle(String searchinput)
	{
		
		try 
		{
			driver.findElement(searchbox).sendKeys(searchinput);
			Thread.sleep(3000);
			driver.findElement(search_btn).click();
			Thread.sleep(3000);
		} 
		catch (InterruptedException e)
		{
			System.out.println("Exception caught"+e.getMessage());
		}
	}
	
	public void clickFacebook() throws InterruptedException
	{
		driver.findElement(facebook_link).click();
		Thread.sleep(2000);
	}
}
