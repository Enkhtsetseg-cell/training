package GroupID.ArtifactID;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/enkhtsetseg/selenium/SeleniumAutomation/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();}
public void afterClass() throws WebDriverException, IOException {
	System.out.println("This is after class annotation");
}

		public void afterclass() throws WebDriverException, IOException {
			
		Date date= new Date(0); 
		
		long time = date.getTime();
		
				
		System.out.println("Time is in Misc"+time);
		//Timestamp tsdehk= new Timestamp(time);
		

		
		TakesScreenshot driver = null;
		TakesScreenshot picture = (TakesScreenshot) driver; 
		
		TakesScreenshot source = (TakesScreenshot) driver; 

		FileHandler.copy(source.getScreenshotAs(OutputType.FILE), new File("/Users/enkhtsetseg/selenium/ArtifactID/src/test/java/Screenshot.png"));

		int u=60; }

}
