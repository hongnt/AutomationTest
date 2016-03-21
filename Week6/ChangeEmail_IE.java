package Week6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChangeEmail_IE 
{
	public static void main (String [] args) throws Exception
	{
		String ie = "D:\\Driver\\IEDriverServer_Win32_2.50.0\\IEDriverServer32.exe";
		System.setProperty("webdriver.ie.driver", ie);
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("phuong@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ui-sref='account.privacy']")).click();
		driver.findElement(By.cssSelector("[class='sidebar-nav'] [ui-sref='account.recovery']")).click();
		
		driver.findElement(By.cssSelector("#inputCurrentEmail")).sendKeys("phuong@gmail.com");
		driver.findElement(By.cssSelector("#inputNewEmail")).sendKeys("phuongthao@gmail.com");
		
		driver.findElement(By.cssSelector("[ladda='account.emailLoading']")).click();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("phuongthao@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		if(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText().equals("phuongthao"))
		{
			System.out.println("Change email successfull");
		}
		else
			System.out.println("Change email fail");
	}
}
