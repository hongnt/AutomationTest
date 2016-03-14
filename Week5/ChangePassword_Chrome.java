package Week5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePassword_Chrome
{
	public static void main (String[] args) throws Exception
	{
		String chrome = "D:\\Driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://business.toancauxanh.vn:7664");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("victoria@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
				
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ui-sref='account.privacy']")).click();
		driver.findElement(By.cssSelector("[class='sidebar-nav'] [ui-sref='account.recovery']")).click();
		
		driver.findElement(By.cssSelector("#inputCurrentPassword")).clear();
		driver.findElement(By.cssSelector("#inputCurrentPassword")).sendKeys("123456");
		driver.findElement(By.cssSelector("#inputNewPassword")).sendKeys("123123");
		driver.findElement(By.cssSelector("#inputConfirm")).sendKeys("123123");
		
		driver.findElement(By.cssSelector("[ladda='account.passwordLoading']")).click();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("victoria@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		if(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText().equals("victoria"))
		{
			System.out.println("Change password successfull");
		}
		else
			System.out.println("Change password fail");		
	}
}
