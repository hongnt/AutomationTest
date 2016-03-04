package Week4;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn_Chrome 
{
	public static void main(String[] args)
	{
		String chrome = "D:\\Driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("hongnt@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.cssSelector("#check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText());
		if(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText().equals("Hong Nguyen"))
		{
			System.out.println("Sign in successfull");
		}
		else
			System.out.println("Sign in fail");
	}
}
