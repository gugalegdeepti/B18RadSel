package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyIframe {
	
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(4000);
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//div/div/a/span[@class='lines']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("IF2");
		driver.findElement(By.xpath("//ul/li/a[text()='Sortable']")).click();
	}

}
