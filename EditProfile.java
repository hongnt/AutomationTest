package businessM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class EditProfile {
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
  }
 
  @Test
  public void TC03_SignIn() throws InterruptedException {
	
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
  @Test
  public void TC04_EditProfile() throws InterruptedException {
	  
	  driver.findElement(By.cssSelector(".icons-circle-down")).click();
	  driver.findElement(By.cssSelector("[ui-sref='edit-profile.profile']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("inputFirstName")).clear();
	  driver.findElement(By.id("inputFirstName")).sendKeys("Kaylor");
	  driver.findElement(By.id("inputLastName")).clear();
	  driver.findElement(By.id("inputLastName")).sendKeys("Nguyen");
	  driver.findElement(By.id("inputPosition")).clear();
	  driver.findElement(By.id("inputPosition")).sendKeys("Member");
	  driver.findElement(By.id("inputTelephoneNumber")).clear();
	  driver.findElement(By.id("inputTelephoneNumber")).sendKeys("01688357");
	  driver.findElement(By.cssSelector("[ladda='editManagementProfile.loading']")).click();
	  
	  String alert = driver.findElement(By.cssSelector(".toast.ng-scope.toast-success")).getText();
	  Assert.assertEquals("Successful.", alert);  
	  
  }
  @AfterClass
  public void afterClass() { 
	  driver.quit();
  }
}
