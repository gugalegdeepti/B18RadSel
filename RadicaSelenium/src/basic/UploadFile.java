package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	@Test
	public void test() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.freefileconvert.com/");
		// if type of file to be uploaded is "file"
		// driver.findElement(By.xpath("//input[@id='first_file']")).sendKeys("E:\\RadicaTechnoogies\\Exceptions.txt");
		// if file type is not "file" use robot class -- key events provided by java
		
		driver.findElement(By.xpath("//input[@id='first_file']")).click();
		Thread.sleep(5000);
		
		StringSelection ss = new StringSelection("E:\\RadicaTechnoogies\\Versions_All.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
		
//		driver.manage().window().maximize();
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
	}
}
