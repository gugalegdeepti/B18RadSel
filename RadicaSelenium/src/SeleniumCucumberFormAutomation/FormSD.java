package SeleniumCucumberFormAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class FormSD {

	WebDriver chromedriver;
	
	@Given("launch url")
	public void launch_url(){
		System.setProperty("webdriver.chrome.driver", "E:\\RadicaTechnoogies\\Drivers\\chromedriver_win32_B45\\chromedriver.exe");
		chromedriver = new ChromeDriver();
		chromedriver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@When("enter all details")
	public void enter_all_details() throws InterruptedException{
		chromedriver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys("Radical");
		chromedriver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys("Technologies");
		chromedriver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys("Address");
		chromedriver.findElement(By.xpath("//div/label/input[@value='FeMale']")).click();
		
		chromedriver.findElement(By.xpath("//div/input[@value='Cricket']")).click();
		chromedriver.findElement(By.xpath("//div/input[@value='Movies']")).click();
		Thread.sleep(2000);
		WebElement ele = chromedriver.findElement(By.xpath("//div/select[@id='Skills']"));
		Select sel = new Select(ele);
		//sel.selectByVisibleText("Android");
		sel.selectByValue("Android");
	}
	
	@Then("User checks successfully logged in")
	public void User_checks_successfully_logged_in(){
		
	}
}
