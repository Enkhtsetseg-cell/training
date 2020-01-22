package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
	
	//WebDriver driver= new ChromeDriver(); 
	WebDriver driver=(WebDriver) new ChromeDriver();
	
	driver.get("https://www.amazon.com"); 
	
	/*driver.navigate().refresh();
	
	Thread.sleep(6000);
	
	driver.navigate().back();
	
	Thread.sleep(6000);
	
	driver.navigate().forward();
	
// maximize browser
	
	driver.manage().window().maximize();
	
	String URL= driver.getCurrentUrl(); 
	
	System.out.println(URL);*/
	
	//driver.findElement(By.id ("twotabsearchtextbox")).sendKeys("mirror");
 Thread.sleep(6000);
	
	
	driver.findElement(By.linkText("Last-Minute Deals")).click();
	
	Thread.sleep(6000);
	
	driver.findElement(By.linkText("Best Sellers")).click();
	
Thread.sleep(6000);
	driver.findElement(By.linkText("New Releases")).click();
	
Thread.sleep(6000);
	driver.close();
	
	driver.quit();
	
	}

}
