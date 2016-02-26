package Week1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE 
{
	public static void main(String [] args)
	{
		String ie = "D:\\Driver\\IEDriverServer_Win32_2.50.0\\IEDriverServer32.exe";
		System.setProperty("webdriver.ie.driver", ie);
		InternetExplorerDriver  driver = new InternetExplorerDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
	}
}