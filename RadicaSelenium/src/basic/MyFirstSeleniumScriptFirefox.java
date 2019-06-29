package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScriptFirefox {

	@Test
	public void myFirstScript() throws InterruptedException{
		System.out.println("running script");
		
		System.setProperty("webdriver.gecko.driver","E:\\RadicaTechnoogies\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		
//		System.setProperty("webdriver.ie.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
//		WebDriver iedriver = new InternetExplorerDriver();
//		iedriver.get("https://www.seleniumhq.org/");
		
		String msg = " ";
		boolean result = true;
		
//		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
//		WebDriver chromedriver = new ChromeDriver();
//		chromedriver.get("https://www.seleniumhq.org/");
		
		driver.findElement(By.xpath("//div/ul/li[@id='menu_download']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[@id='menu_documentation']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/ul/li[@id='menu_support']"));
		Thread.sleep(2000);
		
		try{
			driver.findElement(By.xpath("//div/ul/li[@id='menu_documentation1']"));
		}catch(Exception e)
		{
			msg = msg + "Documentation1 tab is missing, ";
			System.out.println("documentation1 tab is missing");
			result = false;
		}
		try{
			driver.findElement(By.xpath("//div/ul/li[@id='menu_support1']"));
		}catch(Exception e)
		{
			msg = msg + "Support1 tab is missing";
			System.out.println("Support1 tab missing");
			result = false;
		}
		
		driver.findElement(By.id("q")).sendKeys("Selenium");
		Assert.assertTrue(result, msg);
		
	}
	
}
