package phptravel.newFileRegister;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewRegister {
	WebDriver driver;
	String url = "https://phptravels.org/register.php";
	String expectedTitle = "Register";
	String actualTitle = "";

	@BeforeTest
	public void setup() {

		// location where
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// which browser
		driver = new ChromeDriver();
		// which target URL
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void checkTitle() {

		actualTitle = driver.getTitle();

		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Test pass");

		} else {
			System.out.println("Test faild");
		}

	}

	@Test
	public void personalInformation() {
		driver.findElement(By.id("inputFirstName")).sendKeys("Fathi");
		driver.findElement(By.id("inputLastName")).sendKeys("Fathi");
		driver.findElement(By.id("inputEmail")).sendKeys("Fathi971975@gmail.com");
		driver.findElement(By.id("inputPhone")).sendKeys("26584756");

	}

	@AfterTest

	public void terDown() {
		driver.close();
	}

}
