package Week5;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EditProfile_IE
{
	public static void main (String [] args) throws Exception
	{
		String ie = "D:\\Driver\\IEDriverServer_Win32_2.50.0\\IEDriverServer32.exe";
		System.setProperty("webdriver.ie.driver", ie);
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("rose@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ng-click='header.openMenu()'][href='/edit-profile/profile']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("inputFirstName")).clear();
		driver.findElement(By.id("inputLastName")).clear();
		driver.findElement(By.id("inputPosition")).clear();
		driver.findElement(By.id("inputTelephoneNumber")).clear();
		
		driver.findElement(By.id("inputFirstName")).sendKeys("Hong");
		driver.findElement(By.id("inputLastName")).sendKeys("Nguyen");
		driver.findElement(By.id("inputPosition")).sendKeys("Tester");
		driver.findElement(By.id("inputTelephoneNumber")).sendKeys("12345698");
		
		driver.findElement(By.cssSelector("[ng-disabled='editManagementProfile.continue_loading']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".logo")).click();
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ng-click='header.openMenu()'][href='/edit-profile/profile']")).click();
		Thread.sleep(5000);
		
		System.out.println("First Name: " + driver.findElement(By.cssSelector("#inputFirstName")).getAttribute("value"));
		System.out.println("Last Name: " + driver.findElement(By.cssSelector("#inputLastName")).getAttribute("value"));
		System.out.println("Position: " + driver.findElement(By.cssSelector("#inputPosition")).getAttribute("value"));
		System.out.println("Email Address: " + driver.findElement(By.cssSelector("#inputEmail1")).getAttribute("value"));
		System.out.println("Telephone Number: " + driver.findElement(By.cssSelector("#inputTelephoneNumber")).getAttribute("value"));
		
		if ((driver.findElement(By.cssSelector("#inputFirstName")).getAttribute("value").equals("Hong")) && 
			((driver.findElement(By.cssSelector("#inputLastName")).getAttribute("value").equals("Nguyen"))) && 
			(driver.findElement(By.cssSelector("#inputPosition")).getAttribute("value").equals("Tester")) && 
			(driver.findElement(By.cssSelector("#inputEmail1")).getAttribute("value").equals("rose@gmail.com")) && 
			(driver.findElement(By.cssSelector("#inputTelephoneNumber")).getAttribute("value").equals("12345698")))
		{
			System.out.println("Edit profile successfull");
		}
		else
			System.out.println("Edit profile fail");
	}
}
