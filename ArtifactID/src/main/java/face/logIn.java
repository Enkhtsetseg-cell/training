package face;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logIn {
	
	
	@FindBy (id="email")
	 WebElement email; 
	
	@FindBy (id="pass")
	 WebElement password;
	
	@FindBy ( id="u_0_2")
	 WebElement LoginButton;

	public logIn(WebDriver driver) {
    PageFactory.initElements(driver, this);
	}
	
	public void loginField (String emailsd)
	{email.sendKeys(emailsd); }
	
	public void password (String passwords)
	{   password.sendKeys(passwords);	}
	
	public void LoginButton ()
	
	{LoginButton.click(); }
	
	
	

}
