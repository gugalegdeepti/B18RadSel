package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyImpicitWait {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebDriverWait obj = new WebDriverWait(driver, 25);

		WebElement myElement = obj
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title='Searchxxx']")));
		myElement.sendKeys("radical");
	}
}
