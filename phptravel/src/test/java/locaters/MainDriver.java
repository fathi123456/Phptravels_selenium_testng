package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainDriver {
	WebDriver driver;
	String url="https://www.sugarcrm.com/uk/request-demo/";
	@BeforeTest
	public void setup() {

		// location where
		WebDriverManager.chromedriver().setup();
		// which browser
		driver = new ChromeDriver();
		// which target URL
		driver.get(url);
		driver.manage().window().maximize();
		
	}

		
		
		
	
	
	@AfterTest
	public void tearDown() {
		
	}

}
