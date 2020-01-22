package Facebook_logIn;

import org.testng.annotations.Test;

import face.logIn;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class xml {
	
	WebDriver driver;
	
 /* @Test (priority = 1)
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
     Thread.sleep(1000);*/
     
     


  @Parameters({"envir", "browser"})
  
	

@BeforeClass
  public void beforeClass(String environment, String browser)
		  
		  throws InterruptedException {
	if (browser.equalsIgnoreCase("chrome"))
		
	{
	    System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");
        driver = new ChromeDriver();
        driver.get("environment");
        Thread.sleep(3000); 
	}
	else if (browser.equalsIgnoreCase("firefox")) 
	{    
	    System.setProperty("webdriver.gecko.driver", "/Users/enkhtsetseg/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.get("environment");
        Thread.sleep(3000);
	}
     else 
    { System.out.println("Fix the error!");
    
    }}
  

  @AfterClass
  public void afterClass() {
	     driver.close();

	  
  }

}
