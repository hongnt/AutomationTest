package Week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search_Firefox {
	
	private static WebDriver driver = null;
	public static void main (String [] args) throws Exception
	{
		driver = new FirefoxDriver();
		driver.get("http://www.bing.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Da Nang");
		driver.findElement(By.name("go")).click();
		
		if(driver.findElement(By.cssSelector(".sb_add.sb_adTA>h2>a>strong")).getText().equals("Da Nang"))
		{
			System.out.println("Search successfull");
		}
		else
			System.out.println("Search fail");
		
	}
}
