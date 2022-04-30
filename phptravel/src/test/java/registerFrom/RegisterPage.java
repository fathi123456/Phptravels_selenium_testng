package registerFrom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterPage extends Maindriver{
	
	
	/*
	 * Register from
	 * 
	 * 
	 * click on register
	 * 
	 * 
	 * select country
	 * 
	 * 
	 */
	By List_Xpath =By.xpath("//td[@class='mouseOut']");
    By Country_Name= By.name("country");
	@Test(priority=1)
	public void listOfElements() {
		
		//list Group of elements
		List<WebElement> element = driver.findElements(List_Xpath);
		
		//how much?
		System.out.println("number of elemnts = " + element.size());
		
		//print All text
		for (int i = 0; i <element.size(); i++) {
			System.out.println("Name of elements = " +element.get(i).getText());
		}
		
		//click on register
		element.get(1).click();
	}
	@Test(priority=2)
	public void selectFromDropDown() {
		Select country = new Select(driver.findElement(Country_Name));
		country.selectByValue("TUNISIA");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
