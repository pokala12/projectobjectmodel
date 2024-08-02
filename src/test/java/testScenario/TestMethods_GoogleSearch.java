package testScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import object.FaceBookPage;
import object.GoogleSearchPage;

public class TestMethods_GoogleSearch 
{
	WebDriver driver;
	GoogleSearchPage objectrepo;
	//FaceBookPage  objectrepo2;
	
	@BeforeTest
	public void beforeTest()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		//driver.navigate().refresh();
		//driver.navigate().to("https://www.facebook.com/");
	}
	
	@Test(priority=0)
	public void searchOperation()
	{
		GoogleSearchPage page=new GoogleSearchPage(driver);
		page.searchGoogle("facebook");
	}
	
	@Test(priority=1)
	public void verifyAndAcessFacebook() throws InterruptedException
	{
		objectrepo=new GoogleSearchPage(driver);
		objectrepo.clickFacebook();
	}
	
	@Test(priority=2)
	public void verifyLogins() throws InterruptedException
	{
		FaceBookPage p1=new FaceBookPage(driver);
		p1.EnterUserName("umamahesh02041997@gmail.com");
		p1.EnterPassword("Uma@1997");
		p1.verifyLogin();
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}

}
