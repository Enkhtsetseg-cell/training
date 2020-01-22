package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FridayPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
	
    WebDriver driver= new ChromeDriver(); 

    driver.get("https://www.walmart.com");
    
    driver.findElement(By.id("global-search-input")).sendKeys("Laptop"); 
    
   
    Thread.sleep(2000);
    
   // driver.findElement(By.xpath("(//span[@class='f_b'][33])/span")).click();
    
    
    driver.findElement(By.id("global-search-submit")).click();
    
    
    Thread.sleep(2000);
    
    driver.manage().window().maximize();
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//img[@data-pnodetype='item-pimg']")).click();
    
    Thread.sleep(2000);
    
    driver.navigate().back();
    
    Thread.sleep(1000);
    
    driver.navigate().forward();
    Thread.sleep(1000);
    
    driver.navigate().refresh();
    
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//div[@data-label='Rose Gold']")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//select[@placeholder='Qty: ']")).sendKeys("2");
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//span[@class='spin-button-children']")).click();
    Thread.sleep(2000);
    
    String enkhmaa= driver.getCurrentUrl(); 
    
    System.out.println(enkhmaa);
    
    driver.close();
    
    
    
    
    
    
    
    
    
    
    
    
    

	
	
	
	}

}
