package Week6;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeEmail_Firefox 
{
	public static void main (String [] args) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("maiha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ui-sref='account.privacy']")).click();
		driver.findElement(By.cssSelector("[class='sidebar-nav'] [ui-sref='account.recovery']")).click();
		
		driver.findElement(By.cssSelector("#inputCurrentEmail")).sendKeys("maiha@gmail.com");
		driver.findElement(By.cssSelector("#inputNewEmail")).sendKeys("mai@gmail.com");
		
		driver.findElement(By.cssSelector("[ladda='account.emailLoading']")).click();
		//Sign in by new email
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("mai@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		if(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText().equals("mai"))
		{
			System.out.println("Change email successfull");
		}
		else
			System.out.println("Change email fail");	
	}
}
