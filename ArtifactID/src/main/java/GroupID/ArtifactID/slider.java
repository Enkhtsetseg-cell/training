package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");	
		
		Actions hover=new Actions(driver); 
		
		driver.switchTo().frame(0); 
		
		Thread.sleep(1000);
		
	hover.dragAndDropBy(driver.findElement(By.xpath("//span[@tabindex='0']")), 200, 0).build().perform();
	
	Thread.sleep(1000);
		
	
	}

}
