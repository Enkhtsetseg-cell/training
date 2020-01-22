package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popUp {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/"); 
		
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button")).click();
		
		Thread.sleep(1000);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("ConfirmOption")).click(); 
		
		
	
				
		driver.switchTo().alert().accept();*/
		
		driver.get("https://www.amazon.com/");
		Actions hover= new Actions(driver); 
		
		hover.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		
		
		
		
		
		
		
		
	}

}
