package Week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Search_IE 
{
	public static void main(String [] args)
	{
		String ie = "D:\\Driver\\IEDriverServer_Win32_2.50.0\\IEDriverServer32.exe";
		System.setProperty("webdriver.ie.driver", ie);
		InternetExplorerDriver  driver = new InternetExplorerDriver();
		
		driver.get("http://www.bing.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Da Nang");
		driver.findElement(By.name("go")).click();
		
		//if(driver.findElement(By.xpath(".//*[@id='b_results']/li[1]/ul/li/div/h2/a/strong")).getText().equals("Da Nang"))
		if(driver.findElement(By.cssSelector(".sb_add.sb_adTA>h2>a>strong")).getText().equals("Da Nang"))
		{
			System.out.println("Search successfull");
		}
		else
			System.out.println("Search fail");
		
	}
}
