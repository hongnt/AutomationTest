package Week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
	private static WebDriver driver = null;
	public static void main (String [] args) throws Exception
	{
		driver = new FirefoxDriver();
		driver.get("http://business.toancauxanh.vn:7664/");
	}
}