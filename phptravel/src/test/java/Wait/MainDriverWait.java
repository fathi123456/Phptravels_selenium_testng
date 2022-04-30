package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainDriverWait {
	WebDriver driver;
	String url = "https://app.testproject.io/logout/";

	@BeforeTest
	public void setup() {

		// location where
		WebDriverManager.chromedriver().setup();
		// which browser
		driver = new ChromeDriver();
		// implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	
	
	
	
	
	

	@AfterTest
	public void tearDown() {
		// driver.close();
	}
}


