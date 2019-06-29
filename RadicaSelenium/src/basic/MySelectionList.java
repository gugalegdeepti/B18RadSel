package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MySelectionList {
	@Test
	public void MoveCountry(){
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
//		driver.findElement(By.xpath("//div[@class='rlbGroup']/ul/li[text()='Brazil']")).click();
//		driver.findElement(By.xpath("//li/button/*[@class='rlbButtonIcon rlbIconTransferRight']")).click();
//		driver.findElement(By.xpath("//div[@class='rlbGroup']/ul/li[text()='China']")).click();
//		driver.findElement(By.xpath("//li/button/*[@class='rlbButtonIcon rlbIconTransferRight']")).click();
		
		String countryList[] = {"Brazil", "China"};
		
		for(int i=0; i< countryList.length; i++){
			String counxpath = getCountryXpath(countryList[i]);
			driver.findElement(By.xpath(counxpath)).click();
			driver.findElement(By.xpath("//li/button/*[@class='rlbButtonIcon rlbIconTransferRight']")).click();
		}
		
		
		String msg = " ";
		boolean result = true;
		try{
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxDestination1']/div/ul/li[text()='Brazil']"));
		}catch(Exception e)
		{
			result=false;
			msg = msg + "Brazil not found";
		}
		try{
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxDestination1']/div/ul/li[text()='China']"));
		}catch(Exception e)
		{
			result=false;
			msg = msg + "China not found";
		}
		Assert.assertTrue(result,msg);
	}
	private String getCountryXpath(String myCountryName){
		return "//div/ul/li[text()='" + myCountryName + "']" ;
	} 
	
}
