package Week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{
	
	public static void main(String [] args)
	{
		String chrome = "D:\\Driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		WebDriver driver = new ChromeDriver();
		driver.get("http://business.toancauxanh.vn:7664/");
	}
}