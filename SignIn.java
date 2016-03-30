package businessM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SignIn {
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
  }
  @Test
  public void TC_SignIn() throws InterruptedException {
	
	  driver.get("http://business.toancauxanh.vn:7664/");
	  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	
	  driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
	  driver.findElement(By.name("email")).sendKeys("kaylor3@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("123123");
	  driver.findElement(By.id("check4")).click();
	  driver.findElement(By.cssSelector(".login-button")).click();
	  Thread.sleep(3000);
	  String userName = driver.findElement(By.cssSelector(".name.ng-binding.ng-scope")).getText();
	  Assert.assertEquals("Kaylor Nguyen", userName);
  }
  @AfterClass
  public void afterClass() { 
	  driver.quit();
  }
}
