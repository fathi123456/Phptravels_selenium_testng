package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPageWait extends MainDriverWait {
	
	//email:rogiyek721@wii999.com
	//Password: !Aa12345
	By loginButton = By.id("tp-signup-action");
	By email =By.id("username");
	By password = By.id("password");
	By loginForm = By.id("tp-sign-in");
	
	//click login button
	@Test(priority=1)
	  public void clickLoginButton() {
		driver.findElement(loginButton).click();
		  
	  }
	  //insert valid data
	@Test(priority=2)
	   public void enterValidMailandPassword() throws InterruptedException {
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(email));
		driver.findElement(email).sendKeys("rogiyek721@wii999.com");
		driver.findElement(password).sendKeys(" !Aa12345");
		driver.findElement(loginForm).click();
		   
		   //thread wait
		   
		/*Thread.sleep(5000);*/

		   
		   //explicit wait
		/*WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocated*/
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	   }

}
