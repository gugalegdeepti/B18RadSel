package basicCopy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FacebookLogin {
	@Test
	public void test(){
		System.setProperty("webdriver.gecko.driver", "E:\\RadicaTechnoogies\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		//click Projects
		driver.findElement(By.xpath("//li[@id='menu_projects']")).click();
		driver.findElement(By.xpath("//li[@id='menu_projects']")).click();
		driver.findElement(By.xpath("//li[@id='menu_documentation']")).click();
		driver.findElement(By.xpath("//li[@id='menu_support']")).click();
		driver.findElement(By.xpath("//li[@id='menu_about']")).click();
		
		int i=0, n=0; 
		
		Set<String> windows = new HashSet<String>();
		windows = driver.getWindowHandles();
		for(String win : windows){
			driver.switchTo().window(win);
			//int n = driver.findElements(arg0)
			i++;
			List<WebElement> ele = driver.findElements(By.xpath("//div[@id='side']/ul/li/a[text()='About Selenium']"));
			n = ele.size();
			if(n>0){
				break;
			}
			
		}
		System.out.println("n = " + n);
	}
}
