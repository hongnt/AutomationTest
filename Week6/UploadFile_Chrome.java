package Week6;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UploadFile_Chrome
{
	public static void main (String [] args) throws Exception
	{
		String chrome = "D:\\Driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://capsidian.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("hongnt@greenglobal.vn");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ui-sref='edit-profile.profile']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".btn.btn-default.bt-default-bl.ladda-button[ng-disabled='editManagementProfile.loading']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[ng-model='editPhoto.viewModel.photoSelected']")).sendKeys("D:\\large1.jpg");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[ng-model='editPhoto.viewModel.logoSelected']")).sendKeys("D:\\large2.jpg");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[ng-model='editPhoto.viewModel.coverSelected']")).sendKeys("D:\\large3.jpg");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".btn.btn-default.bt-default-bl")).click();
				
	}
}
