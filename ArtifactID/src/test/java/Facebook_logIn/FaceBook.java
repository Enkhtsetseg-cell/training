package Facebook_logIn;

import org.testng.annotations.Test;

import face.logIn;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FaceBook {
	
	WebDriver driver;
	
  @Test (priority = 1)
  public void f() throws InterruptedException {
	  logIn enkhtsetseg=new logIn(driver);
	  enkhtsetseg.loginField("enkhmaa011@yahoo.com");
	  Thread.sleep(4000);
	 
	  enkhtsetseg.password("HELLOdear89");
	  Thread.sleep(3000);
	  
	  enkhtsetseg.LoginButton();
	  Thread.sleep(2000);}
	  
  @Test (priority=0)
  public void e() throws InterruptedException    
{    logIn enkhmaa= new logIn (driver); 
     enkhmaa.loginField("enkhmaa011@yahoo.com");
     Thread.sleep(1000);
     
     


  
  
	
}
@BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  
	    System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	  }
  

  @AfterClass
  public void afterClass() {
	     driver.close();

	  
  }

}
