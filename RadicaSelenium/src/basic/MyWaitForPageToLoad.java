package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyWaitForPageToLoad {
	@Test
	public void testingFirefocScript(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Put pageload before get()
		//change value of time out 1 & 10
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
		
	}
}
