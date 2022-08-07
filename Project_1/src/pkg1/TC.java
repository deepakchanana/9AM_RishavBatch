package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TC {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		Login login=PageFactory.initElements(driver,Login.class);
	   login.sign("dddepak", "pas");
	}

}
