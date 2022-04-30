package registerFrom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maindriver {
	WebDriver driver;
	String url = "https://demo.guru99.com/test/newtours/";

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
		// driver.close();
	}
}
