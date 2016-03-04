package Week4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SignUp_IE 
{
	public static void main(String [] args)
	{
		String ie = "D:\\Driver\\IEDriverServer_Win32_2.50.0\\IEDriverServer32.exe";
		System.setProperty("webdriver.ie.driver", ie);
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSelectAccount()']")).click();
		driver.findElement(By.cssSelector(".bt-default-bl")).click();
		driver.findElement(By.name("signup_email")).sendKeys("amelia1@gmail.com");
		driver.findElement(By.name("signup_password")).sendKeys("123456");
		driver.findElement(By.name("signup_repassword")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText());	
		if(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText().equals("amelia1"))
		{
			System.out.println("Sign up successfull");
		}
		else
			System.out.println("Sign up fail");
	}

}
