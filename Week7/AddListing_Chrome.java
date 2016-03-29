package Week7;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddListing_Chrome
{
	public static void main(String[] args) throws Exception
	{
		String chrome = "D:\\Driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.name("email")).sendKeys("hongnt1@greenglobal.vn");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.cssSelector(".login-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".icons-circle-down")).click();
		driver.findElement(By.cssSelector(".txt-lk.ng-scope")).click();
		driver.findElement(By.cssSelector(".bt-default-bl")).click();
		Thread.sleep(5000);
		
		//----Brief Description---
		driver.findElement(By.id("inputName")).sendKeys("ABC Company");
		driver.findElement(By.id("inputCity")).sendKeys("Da Nang");
		//State	
		driver.findElement(By.cssSelector("[class='col-sm-12'] .btn.dropdown-toggle.selectpicker.btn-default")).click();
		driver.findElement(By.cssSelector(".btn-group.bootstrap-select.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required.open [rel='1']")).click();
		
		driver.findElement(By.id("inputPostcode")).sendKeys("ABC123");
		driver.findElement(By.id("inputCountry")).sendKeys("Viet Nam");
		
		//Phase
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[6]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[6]/div/div/div/div/div/ul/li[2]/a/span")).click();
		
		//Industry
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[7]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[7]/div/div/div/div/div/ul/li[7]/a/span")).click();
		
		driver.findElement(By.name("inputFoundingYear")).sendKeys("2000");			
		driver.findElement(By.name("inputAppointmentYear")).sendKeys("2010");
		
		//Legal Structure
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[10]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[10]/div/div/div/div/div/ul/li[2]/a/span")).click();
		
		//Annual Revenues (AUD)
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[11]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[11]/div/div/div/div/div/ul/li[3]/a/span")).click();
		
		//Client Diversity
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[12]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[12]/div/div/div/div/div/ul/li[3]/a/span")).click();
		
		//Number of Employees
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[13]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div/main/div/div[2]/div/div/form/div[2]/fieldset/div/div[13]/div/div/div/div/div/ul/li[4]/a/span")).click();
		
		driver.findElement(By.cssSelector("[ng-keydown='createListing.countCharacter(createListing.vmListing.summary)']")).sendKeys("This is the summary that appears in the search results, so describe your company, business, product or idea in 50 words or less.");
		
		driver.findElement(By.cssSelector("[ladda='createListing.continue_loading']")).click();
		Thread.sleep(3000);
		//---Detailed Description---
		driver.findElement(By.name("inputAbout")).sendKeys("Describe your company, business, product or idea in more detail.");
		driver.findElement(By.name("inputIndustryBackground")).sendKeys("Describe the industry and competitive context.");
		driver.findElement(By.name("inputStrategy")).sendKeys("Describe your strategy, which differentiates you in the marketplace.");
		
		driver.findElement(By.cssSelector("[ladda='createListing.continue_loading']")).click();
		Thread.sleep(3000);
		//---Photos and Videos---
		//driver.findElement(By.cssSelector(".upload-input.ng-pristine.ng-valid.ng-scope[ng-model='createListing.viewModel.logo']")).sendKeys("D:\\large1.jpg");
		//driver.findElement(By.cssSelector(".list-photo-upload [ng-model='createListing.viewModel.photoSelected']")).sendKeys("D:\\large2.jpg");
		driver.findElement(By.cssSelector("[ng-click='createListing.showPopupUploadVideo()']")).click();
		driver.findElement(By.name("youtube_id")).sendKeys("https://www.youtube.com/watch?v=DKs2qhRRZMw");
		driver.findElement(By.cssSelector("[ng-click='createListing.addYoutubeVideo(youtubeId)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[ladda='createListing.continue_loading']")).click();
		Thread.sleep(4000);
		//---Seeking Expertise In---
		/*
		driver.findElement(By.id("inputNameSkill_value")).sendKeys("Good English");
		driver.findElement(By.className(".btn.btn-default.btn-add-more")).click();
		driver.findElement(By.id("inputNameSkill_value")).sendKeys("Good Communication");
		driver.findElement(By.className(".btn.btn-default.btn-add-more")).click();
		*/
		driver.findElement(By.cssSelector("[ng-model='createListing.vmListing.seeking_expertise']")).sendKeys("Elaborate on the expertise selected above.");
		driver.findElement(By.cssSelector("[ladda='createListing.continue_loading']")).click();
		Thread.sleep(3000);
		//---Management---
		driver.findElement(By.cssSelector(".upload-input.ng-pristine.ng-untouched.ng-valid")).sendKeys("D:\\large1.jpg");
		driver.findElement(By.id("inputFirstName")).sendKeys("Nguyen");
		driver.findElement(By.id("inputLastName")).sendKeys("Hong");
		driver.findElement(By.id("inputPosition")).sendKeys("Position ABC");
		driver.findElement(By.name("inputAbout")).sendKeys("ABCD");
		driver.findElement(By.id("inputLinkedin")).sendKeys("https://www.linkedin.com/in/h%E1%BB%93ng-nguy%E1%BB%85n-596987a3?trk=nav_responsive_tab_profile");
		driver.findElement(By.cssSelector(".nav.nav-tabs :nth-child(2)")).click();
		driver.findElement(By.id("inputFacebooks")).sendKeys("https://www.facebook.com/profile.php?id=100007234894866");
		driver.findElement(By.cssSelector(".nav.nav-tabs :nth-child(3)")).click();
		driver.findElement(By.id("inputGoogle")).sendKeys("https://plus.google.com/u/1/");
		driver.findElement(By.cssSelector(".nav.nav-tabs :nth-child(4)")).click();
		driver.findElement(By.id("inputTwitter")).sendKeys("https://twitter.com/hongnguyen2417");
		driver.findElement(By.cssSelector("[ladda='createListing.continue_loading']")).click();
		Thread.sleep(3000);
		//---Web Presence---
		driver.findElement(By.id("inputLinkedin")).sendKeys("https://www.linkedin.com/in/h%E1%BB%93ng-nguy%E1%BB%85n-596987a3?trk=nav_responsive_tab_profile");
		driver.findElement(By.id("inputFacebooks")).sendKeys("https://www.facebook.com/profile.php?id=100007234894866");
		driver.findElement(By.id("inputTwitter")).sendKeys("https://twitter.com/hongnguyen2417");
		driver.findElement(By.id("inputWebsiteAddress")).sendKeys("http://toancauxanh.vn/");
		driver.findElement(By.cssSelector("[ladda='createListing.continue_loading']")).click();
		Thread.sleep(3000);
		//---Access---
		driver.findElement(By.cssSelector("[ladda='createListing.continue_loading']")).click();		
		Thread.sleep(3000);
		/*
		driver.findElement(By.className(".header-mess.ng-scope")).isDisplayed();
		if (driver.findElement(By.className(".header-mess.ng-scope")).isDisplayed())
		{
		System.out.println("Displaying message: PLEASE REVIEW YOUR LISTING");
		}
		else 
		{
		System.out.println("Fail");
		}
		*/
	}
}
