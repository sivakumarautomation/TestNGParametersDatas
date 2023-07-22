package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//package//

public class LoginPage { //class//
	
	public WebDriver odriver;
	@Parameters({"url"})
	@Test (priority=0)
	
	void url(String url1) {
		
		odriver = new ChromeDriver();
		odriver.get(url1);
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		}
	
	 @Parameters({"email","password"})
     @Test(priority=1)
     
     void  loginCredentials(String email1,String password2) {
			// username//
			By user = By.id("username");
			WebElement un = odriver.findElement(user);
			un.sendKeys(email1);

			By pass = By.id("password");
			WebElement pd = odriver.findElement(pass);
			pd.sendKeys(password2);

     }
     
	 @Test(priority=2)
	 void close() throws InterruptedException {
		 Thread.sleep(5000);
	     odriver.quit();
	 }
     
     
      
}