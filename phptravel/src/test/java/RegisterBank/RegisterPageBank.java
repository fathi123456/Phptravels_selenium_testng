package RegisterBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageBank extends MainDriverBank {

	// enter empty data
	// verify error message Display successful
	By Email = By.name("username");
	By Password = By.xpath("password");
	By Login = By.xpath("//input[@type='submit']");
	By ErrorMessage = By.xpath("//p[@class='error']");

	@Test(priority = 1)
	public void sofAssertion() {
		driver.findElement(Login).click();
		WebElement Message = driver.findElement(ErrorMessage);
		SoftAssert sofassertion = new SoftAssert();
		sofassertion.assertEquals(Message.getText(), "Please enter a username and password");

	}

	// Login with invalid email and empty password
	// verify error message Display successful
	@Test(priority = 2)
	public void hardAssertion() {
		driver.findElement(Email).sendKeys("123");
		driver.findElement(Login).click();
		WebElement Message = driver.findElement(ErrorMessage);
		Assert.assertEquals(Message.getText(), "Please enter a username and password.");
	}
}
