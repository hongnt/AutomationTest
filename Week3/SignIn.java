package Week3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SignIn
{
	private static WebDriver driver = null;
	public static void main(String [] args)
	{
		driver = new FirefoxDriver();
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector(".txt-lk[ng-click='header.showSignIn()']")));
		actions.click().build().perform();
         
		driver.findElement(By.name("email")).sendKeys("hongnt@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		
		Robot robot = null;
		try 
		{
			robot = new Robot(); 
		} 
		catch (AWTException e) 
		{ 
			e.printStackTrace(); 
		}		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText());
		if(driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText().equals("Hong Nguyen"))
		{
			System.out.println("Sign in successfull");
		}
		else
			System.out.println("Sign in fail");
	}
}
