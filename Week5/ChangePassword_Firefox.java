package Week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangePassword_Firefox 
{
	public static void main (String[] args) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://business.toancauxanh.vn:7664");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("amelia@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
				
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ui-sref='account.privacy']")).click();
		driver.findElement(By.cssSelector("[class='sidebar-nav'] [ui-sref='account.recovery']")).click();
		
		driver.findElement(By.cssSelector("#inputCurrentPassword")).clear();
		driver.findElement(By.cssSelector("#inputCurrentPassword")).sendKeys("123123");
		driver.findElement(By.cssSelector("#inputNewPassword")).sendKeys("123456");
		driver.findElement(By.cssSelector("#inputConfirm")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("[ladda='account.passwordLoading']")).click();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("amelia@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		if(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText().equals("amelia"))
		{
			System.out.println("Change password successfull");
		}
		else
			System.out.println("Change password fail");
		
		
		
	}
}
