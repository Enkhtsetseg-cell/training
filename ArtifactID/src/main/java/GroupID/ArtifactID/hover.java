package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	    Actions hover= new Actions(driver);
	    
	    hover.moveToElement(driver.findElement(By.id("glow-ingress-line2"))).build().perform();
	    
	    hover.moveToElement(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"))).click().build().perform();
	    
	    Thread.sleep(1000);
	    
	    hover.moveToElement(driver.findElement(By.id(id)))
	    
	
	}

}
