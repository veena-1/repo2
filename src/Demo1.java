import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void m1() throws MalformedURLException{
		URL ra = new URL("http://192.168.1.26:4444/wd/hub");
		DesiredCapabilities c = new DesiredCapabilities();
		c.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(ra,c);
		driver.get("https://www.google.com");
		driver.close();
	}

}
