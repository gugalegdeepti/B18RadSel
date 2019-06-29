package basic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyScreenShot {
	@Test
	public void test1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		String myTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		TakesScreenshot a = (TakesScreenshot)driver;
		File srcFile = a.getScreenshotAs(OutputType.FILE);
		
		String title= driver.getTitle();
		File srcFile = a.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("E:\\RadicaTechnoogies\\TestScreenshots18\\myTimeStamp_"+title+".png"));		
		Thread.sleep(3000);
		
	}
}
