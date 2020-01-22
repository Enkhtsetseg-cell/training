package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver",  "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
	
	
	WebDriver driver= new ChromeDriver(); 
	
	
	
	driver.get("https://www.facebook.com"); 
	
	
	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("enkhmaa011@yahoo.com");
	Thread.sleep(2000);
	

	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("HELLOdear89");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
	Thread.sleep(3000);
	
	
	
			

	
	driver.close();
	
			
	}

}
