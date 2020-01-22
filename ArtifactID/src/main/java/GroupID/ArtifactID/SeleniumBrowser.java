package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver",  "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
	
	
	WebDriver driver= new ChromeDriver(); 
	
	
	
	driver.get("https://www.amazon.com"); 
	
	
	driver.navigate().back();
	
	Thread.sleep(6000); 
	
	driver.navigate().forward();
	
	Thread.sleep(6000);
	
	driver.navigate().refresh();
	
	driver.manage().window().maximize();
	
	
	Thread.sleep(6000);
	
	String Enkhmaa= driver.getCurrentUrl(); 
	
	System.out.println(Enkhmaa);
	
	
	
	
	driver.findElement(By.linkText("Customer Service")).click();
	
	Thread.sleep(6000);
	
	
	
	
	
	
	
	
	
	
	
	}

}
