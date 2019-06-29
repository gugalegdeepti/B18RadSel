package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyFormAutomationScriptChrome {
	@Test
	public void FormAutomation() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://demo.automationtesting.in/Register.html");
		
		chromedriver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys("Radical");
		chromedriver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys("Technologies");
		chromedriver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys("Address");
		chromedriver.findElement(By.xpath("//div/label/input[@value='FeMale']")).click();
		
		chromedriver.findElement(By.xpath("//div/input[@value='Cricket']")).click();
		chromedriver.findElement(By.xpath("//div/input[@value='Movies']")).click();
		Thread.sleep(2000);
		
		//Case 1 : Selecting Dropdown by using 2 clicks
//		chromedriver.findElement(By.xpath("//div/select[@id='Skills']")).click();
//		Thread.sleep(2000);
//		chromedriver.findElement(By.xpath("//div/select[@id='Skills']/option[@value='Android']")).click();
		
		//Case 2
		Thread.sleep(2000);
		
		//Case 3
		WebElement ele = chromedriver.findElement(By.xpath("//div/select[@id='Skills']"));
		Select sel = new Select(ele);
		//sel.selectByVisibleText("Android");
		sel.selectByValue("Android");
		
		
		
	}
}
