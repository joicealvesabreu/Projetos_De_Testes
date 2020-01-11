import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkendTests {
	
	
	@Test
	public void linkdintest() {
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.linkedin.com");
		
		
	 WebElement clicar=  driver.findElement(By.id("ember42"));
	 clicar.click();

	driver.quit();
		
		
		
	}

}
