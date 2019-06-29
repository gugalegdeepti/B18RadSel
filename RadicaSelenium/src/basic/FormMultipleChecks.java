package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormMultipleChecks {
	@Test
	public void FormAutomation() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://demo.automationtesting.in/Register.html");
		
//		chromedriver.findElement(By.xpath("//div/input[@value='Cricket']")).click();
//		chromedriver.findElement(By.xpath("//div/input[@value='Movies']")).click();
		//Thread.sleep(2000);
		
		boolean actionOnChkbx = true;
		selectCheckbox("Movies", actionOnChkbx, chromedriver);
		
	}
	
	public void selectCheckbox(String chkValue, boolean actionOnChkbx, WebDriver chromedriver){
		boolean currentState = chromedriver.findElement(By.xpath("//div/input[@value='Movies']")).isSelected();
		
		if(actionOnChkbx){
			if(currentState){
				System.out.println("Already checked");
			}
			else{
				chromedriver.findElement(By.xpath("//div/input[@value]='"+chkValue+"'"));
			}
		}
		else{
			if(currentState){
				chromedriver.findElement(By.xpath("//div/input[@value]='"+chkValue+"'"));
			}
			else{
				System.out.println("Already unchecked");
			}
		}
	}
}
