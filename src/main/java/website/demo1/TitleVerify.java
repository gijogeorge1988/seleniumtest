package website.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleVerify {
	
	public WebDriver driver;
	@BeforeTest
	public void load()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
	    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	    
		
	}
	
	@Test
	public void check()
	{
		driver.get("http://3.111.53.55/");
		String str=driver.getTitle();
		Assert.assertEquals(str,"Jenksins");
		System.out.println(str);
		
	}
	   
}
