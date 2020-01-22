package GroupID.ArtifactID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
	
	WebDriver driver= new ChromeDriver(); 
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("u_0_q")).sendKeys("Test");
	
	Thread.sleep(4000);
	
	driver.findElement(By.id("u_0_s")).sendKeys("Test");
	
	Thread.sleep(4000);
	
	driver.findElement(By.id("u_0_v")).sendKeys("111111111");
	
	Thread.sleep(4000);
	
	driver.findElement(By.id("u_0_10")).sendKeys("HELLOdear89");
	
Thread.sleep(4000);

    driver.findElement(By.id("month")).sendKeys("Nov");
    
Thread.sleep(4000);

    driver.findElement(By.id("day")).sendKeys("7");
    
Thread.sleep(4000);

    driver.findElement(By.id("year")).sendKeys("1989");
    
Thread.sleep(4000);
    
    driver.findElement(By.id("u_0_9")).click();
    

    
    
     
	
	
	
	
	
	
	
	
	}

}
