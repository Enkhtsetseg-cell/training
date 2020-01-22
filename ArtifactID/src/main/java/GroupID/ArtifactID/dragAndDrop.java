package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");	
		
		Actions hover=new Actions(driver); 
		
		driver.switchTo().frame(0); 
		
		Thread.sleep(1000);
		
		WebElement drag=driver.findElement(By.id("draggable")); 
		
		WebElement drop=driver.findElement(By.id("droppable"));
		
		hover.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(2000);
		
		
		
		
	
	}

}
