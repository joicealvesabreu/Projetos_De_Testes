package Navigate;

import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	
	
	@Test
	public void testes() {
		
	WebDriver	driver = new ChromeDriver();
	//	URL url = new URL("http://yahoo.com");
	
		Navigation navigator = driver.navigate();
		
		navigator.to("http://yahoo.com");
		navigator.to("http://gmail.com");
		navigator.back();
		navigator.forward();
		navigator.refresh();
		
		
	}
	

	
	
	
}
