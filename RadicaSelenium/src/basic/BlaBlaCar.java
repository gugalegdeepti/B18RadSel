package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BlaBlaCar {
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.blablacar.in/");
		driver.manage().window().maximize();
		//Login
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Use my email')]")).click();
		
		WebElement email = driver.findElement(By.xpath("//input[@title = 'Enter your email address']"));
		WebElement password = driver.findElement(By.xpath("//input[@title = 'Enter your password']"));
		WebElement loginButton = driver.findElement(By.xpath("//div/button[contains(text(),'Log in')]"));
		WebElement rememberMe = driver.findElement(By.xpath("//div/input[@name='rememberMe']"));
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		email.sendKeys("gugaledeepti@gmail.com");
		Thread.sleep(2000);
		password.sendKeys("tejodeep123");
		
//		if(rememberMe.isSelected() && rememberMe.isEnabled()){
//			rememberMe.click();
//		}
		
		loginButton.click();
	}
}
