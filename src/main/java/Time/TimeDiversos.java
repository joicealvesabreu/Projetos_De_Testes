package Time;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;


public class TimeDiversos {
	private static final TimeUnit SECONDS = null;
	
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void testes() {
		
		 WebDriver driver = new ChromeDriver();
		
		
        driver.get("http://www.google.com.br");
        
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
        
        driver.get("http://www.google.com.br");
        
        WebElement element = driver.findElement(By.name("q"));
        
        FluentWait<WebElement> wait = new FluentWait<WebElement>(element);
        wait.withTimeout(600, TimeUnit.SECONDS);
        wait.pollingEvery(500, TimeUnit.MILLISECONDS);
        wait.ignoring(NoSuchFieldException.class);
        
        Function <WebElement, Boolean> f = new Function < WebElement, Boolean>() 
        		{

					public Boolean apply(WebElement element) {
						
						if(!element.getText().equals("20"))
						{
							
							String value = element.getText();
							System.out.println("Valeuguiueio +" +value);
							
							return false;
				        }
						System.out.println("hurray found buzz buzz");
						
						return true;
							
						}
        	  
    }; wait.until(f);
    

}
}
