package basic;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShiftplusLetters {
	@Test
	public void test() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver",
				"E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Thread.sleep(2000);
		WebElement emailTxtBox = driver.findElement(By.xpath("//*[@id='email']"));
		Actions action = new Actions(driver);
		Actions obj = action.moveToElement(emailTxtBox).click().keyDown(Keys.SHIFT).sendKeys("selenium");
		obj.build().perform();
		
	}
}
