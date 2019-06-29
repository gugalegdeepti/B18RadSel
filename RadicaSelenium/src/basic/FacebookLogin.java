package basic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
		driver.findElement(By.xpath("//div/a/span[text()='Login with Facebook']")).click();

		// String s = driver.getWindowHandle();
		// System.out.println("Window = " + s);
		Set<String> wins = new HashSet<String>();
		wins = driver.getWindowHandles();
		boolean b = false;
		for (String win : wins) {
			driver.switchTo().window(win);
			List<WebElement> list = driver.findElements(By.xpath("//*[@id='email']"));
			int n = list.size();
			if (n > 0) {
				b = true;
				break;
			}

			System.out.println("before email id");

			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("deeps5993@gmail.com");
			System.out.println("After email id");
		}
	}
}
