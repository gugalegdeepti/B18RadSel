package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlesFacebookLogin {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
		driver.findElement(By.xpath("//div/a/span[text()='Login with Facebook']")).click();

		String parentWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		String childWin = null;
		for (String win : allWin) {
			if (!parentWin.equals(win)) {
				childWin = win;
			}
		}
		driver.switchTo().window(childWin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("deeps5993@gmail.com");
		driver.close();
		driver.switchTo().window(parentWin);
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("title = " + title);
		driver.close();
	}
}
