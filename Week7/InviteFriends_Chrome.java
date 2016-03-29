package Week7;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InviteFriends_Chrome
{
	public static void main(String[] args) throws Exception
	{
		String chrome = "D:\\Driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("rose@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".btn.btn-default.btn-add-more-blue")).click();
		driver.findElement(By.cssSelector("#inputEmail")).sendKeys("hongnt@greenglobal.vn");
		driver.findElement(By.cssSelector(".btn.btn-default.btn-add-more.pull-right")).click();
		
		driver.findElement(By.cssSelector("#inputEmail")).sendKeys("hongnt@gmail.com");
		driver.findElement(By.cssSelector(".btn.btn-default.btn-add-more.pull-right")).click();
		
		driver.findElement(By.cssSelector("#inputEmail")).sendKeys("amelia@gmail.com");
		driver.findElement(By.cssSelector(".btn.btn-default.btn-add-more.pull-right")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".bt-default-blup")).click();	
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='toast-container']/div/div[2]/div")).isDisplayed();
		if (driver.findElement(By.xpath(".//*[@id='toast-container']/div/div[2]/div")).isDisplayed())
		{
		System.out.println("Có thông báo: Successful");
		}
		else 
		{
		System.out.println("Không hiển thị thông báo: Successful");
		}
	}
}
