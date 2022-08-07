package pkg1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login
{
	ChromeDriver driver;
	public Login(ChromeDriver driver) 
	{
		this.driver=driver;
	}
	@FindBy(className="classV")
	WebElement login;
	
 
	@FindBy(id="idvalue")
	WebElement username;
	
	@FindBy(className="classV")
	WebElement password;
	
	public void sign(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}
}
