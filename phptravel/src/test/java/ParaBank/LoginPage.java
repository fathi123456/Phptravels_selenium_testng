package ParaBank;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	String url =" https://parabank.parasoft.com/parabank/index.htm";
	
	By username_xpath= By.xpath("//input[@name='username']");
	By password_xpath=By.xpath("//input[@name='password']");
	By login_xpath = By.xpath("//input[@class=\"button\"]");
	By errorMessage_xpath= By.xpath("//p[@class='error']");
	By successefulMessage_xpath = By.xpath("//p[@class='smallText']");
	
	
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
	@Test(priority=1)
	public void empty_Data() {
		driver.findElement(login_xpath).click();
	}
	@Test(priority=2)
	public void verify_ErrorMessage() {
		WebElement message = driver.findElement(errorMessage_xpath);
		assertEquals(message.getText(), "Please enter a username and password.");
	}
		
	
	@Test(priority=3)
	public void valid_Data() {
		driver.findElement(username_xpath).sendKeys("codeTest");
		driver.findElement(password_xpath).sendKeys("codeTest");
		driver.findElement(login_xpath).click();
		
	}
	@Test(priority=4)
	public void verify_successfulMessage() {
		WebElement message = driver.findElement(successefulMessage_xpath);
		assertEquals(message.getText(), "Welcome first last");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	

}
