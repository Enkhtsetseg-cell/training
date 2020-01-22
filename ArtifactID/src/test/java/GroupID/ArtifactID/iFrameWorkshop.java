package GroupID.ArtifactID;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class iFrameWorkshop {
  WebDriver driver; 
  
  @Test
  public void f() throws WebDriverException, IOException, InterruptedException { 
	  
	     driver.findElement(By.linkText("Droppable")).click();
	     
	     driver.switchTo().frame(0);
	          
	     Actions software=new Actions(driver); 
	     
	     software.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")));
	      	     Thread.sleep(5000);
  }
  
@BeforeClass
  public void beforeClass() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");

	driver = new ChromeDriver();

	driver.get("https://www.jqueryui.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
