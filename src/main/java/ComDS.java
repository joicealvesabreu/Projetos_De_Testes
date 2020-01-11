
	import java.util.concurrent.TimeUnit;

import org.junit.Test;
	import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
	
public class ComDS {


@Test
		 public  void testes () throws ElementNotInteractableException {
			 // Create a new instance of the FireFox driver
			 WebDriver driver = new ChromeDriver();
			 
			 // Launch the Online Store WebSite
			 driver.get("http://toolsqa.com/Automation-practice-form/");
			 
			 // Click on "Partial Link Text" link
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 
			 WebElement cliclar = driver.findElement(By.partialLinkText("Partial"));
		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
		
			cliclar.click();
		
			 // Convert element in to a string 
			 String sClass = driver.findElements(By.tagName("button")).toString();
			 System.out.println(sClass);
			 
			 // Click on "Link Text" link
			 driver.findElement(By.linkText("Link Test")).click();
			 System.out.println("Link Test Pass");
		 }
			 }


	
	
	
	

