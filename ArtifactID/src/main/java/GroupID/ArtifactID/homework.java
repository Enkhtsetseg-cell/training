package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
	
	WebDriver driver= new ChromeDriver(); 
	
	driver.get("https://www.homedepot.com/");
	Thread.sleep(8000);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("headerMyAccount")).click();
	
	Thread.sleep(4000);
	
	//driver.findElement(By.id("thdStoreId")).click();
	
	driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span")).click(); 
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("email")).sendKeys("enkhmaa011@yahoo.com");
	
Thread.sleep(3000);
		
	driver.findElement(By.id("password-input-field")).sendKeys("HELLOdear89");
	
Thread.sleep(3000);	
	driver.findElement(By.id("zipCode")).sendKeys("22209");
	
Thread.sleep(3000);	
	driver.findElement(By.id("phone")).sendKeys("5715518858");
	
	
Thread.sleep(3000);	
	driver.findElement(By.xpath("//*[@id='single-signin__body']")).click();
	
	driver.findElement(By.className("bttn__content")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
