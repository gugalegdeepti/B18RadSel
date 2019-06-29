package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAertAndConfirmation {
	@Test
	public void ChecAlert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(4000);
		//Alert
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Thread.sleep(4000);
		Alert alertObj = driver.switchTo().alert();
		String alertMsg = alertObj.getText();
		System.out.println("message ="+ alertMsg);
		Assert.assertEquals(alertMsg, "I am an alert box!");
		alertObj.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//div/button[contains(text(),'click the button to display a confirm box')]")).click();
		Alert confirmationObj = driver.switchTo().alert();
		String confMsg = alertObj.getText();
		System.out.println("message ="+ confMsg);
		Assert.assertEquals(confMsg, "Press a Button !");
		confirmationObj.dismiss();
		
	}

}
