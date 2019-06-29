package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableGrid {
	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds/liquid");
//		int i;
//		int headercount = driver.findElements(By.xpath("//form[@name='mututalfund']/table/thead/tr/th")).size();
//		for(i=1; i<headercount; i++){
//			driver.findElement(By.xpath("//form[@name='mututalfund']/table/thead/tr/th["+ i+"]")).getText();
//			if(.equals("Company")){
//				break;
//			}
//		}
		
		//List<WebElement> cols = driver.findElements(By.c)
		
	}
}
