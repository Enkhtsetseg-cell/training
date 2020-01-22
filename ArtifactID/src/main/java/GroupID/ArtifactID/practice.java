package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.expedia.com");
	
	Thread.sleep(1000);
    driver.findElement(By.id("package-departing-hp-package")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@data-day='10']")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.id("package-returning-hp-package")).click();
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//button[@data-day='14']")).click();
    
    
    
	Thread.sleep(1000);
	
	
	
	
	
	}

}
