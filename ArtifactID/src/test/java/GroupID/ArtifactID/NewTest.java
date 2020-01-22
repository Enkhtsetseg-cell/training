package GroupID.ArtifactID;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	public WebDriver driver;

	@Test
	public void f() {
		System.out.println("this is test class");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");

		driver.findElement(By.className("nav-input")).click();

	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@AfterClass

	public void afterclass() throws WebDriverException, IOException {

		TakesScreenshot Screenshot = (TakesScreenshot) driver; 
		
		TakesScreenshot source = (TakesScreenshot) driver; 
	
		FileHandler.copy(source.getScreenshotAs(OutputType.FILE), new File("/Users/enkhtsetseg/selenium/ArtifactID/src/test/java/Screenshot.png"));
	
			
				
				driver.close();
		

	}
}
