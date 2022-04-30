package locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoRequest_ extends MainDriver {
	
	
	By firstName_xpath=By.xpath("//input[@name='firstname']");
	By lastName_xpath=By.xpath("//input[@placeholder='Last Name*']");
	By checkBox_xpath=By.xpath("//input[@id='interest_market_c0']");
    By radiobutton_xpath=By.xpath("//input[@id='doi1']");
   
	
	
	@Test(priority=1)
	public void EnterFirstNameLastName() {
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("fathi971975@gmail.com");
		driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
		WebElement firstname = driver.findElement(firstName_xpath);
		firstname.sendKeys("Fathi",Keys.CONTROL,"a","c");
		
		WebElement lastname = driver.findElement(lastName_xpath);
		lastname.sendKeys(Keys.CONTROL,"v");
		
	}
	
	@Test(priority=2)
	public void choos_checkbox() {
		WebElement option1 =driver.findElement(checkBox_xpath);
		option1.click();
		
		
	}
	@Test(priority=3)
	public void choose_Radiobutton() {
		WebElement radio =driver.findElement(radiobutton_xpath);
		radio.click();
		
	}

}
