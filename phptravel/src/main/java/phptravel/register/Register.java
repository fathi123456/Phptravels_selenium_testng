package phptravel.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	WebDriver driver;
	String url ="https://phptravels.org/register.php";
	String expectedTitle="Register";
	String actualTitle="";
	
	public void setup() {
		
		//location where
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// which browser
		driver= new ChromeDriver();
		//which target URL
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void checkTitle() {
		
		actualTitle= driver.getTitle();
		
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Test pass");
			
		}else {
			System.out.println("Test faild");
		}
		
	}
	public void personalInformation() {
		driver.findElement(By.id("inputFirstName")).sendKeys("Fathi");
		driver.findElement(By.id("inputLastName")).sendKeys("Fathi");
		driver.findElement(By.id("inputEmail")).sendKeys("Fathi971975@gmail.com");
		driver.findElement(By.id("inputPhone")).sendKeys("26584756");

		
		
	}
	public void terDown() {
		driver.close();
	}
	
	public static void main(String[] args) {
		
		Register regist=new Register();
		
		regist.setup();
		regist.checkTitle();
		regist.personalInformation();
		regist.terDown();
	}

}
