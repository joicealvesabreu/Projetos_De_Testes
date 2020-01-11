package popup;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Promt {
	

	  /**
     * @param args
     * @throws Exception
     */
	@Test
    public static void main(String[] args) throws Exception{
    
    
        WebDriver driver = new ChromeDriver();
        String url = "http://toolsqa.com/automation-practice-switch-windows/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("scrollBy(0,550)", "");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("ACCEPT")).click();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement botao = driver.findElement(By.id("timingAlert"));
        botao.click();
        System.out.println("Clicou no botao");
        
         WebDriverWait wait = new WebDriverWait(driver, 10);
         Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
         myAlert.accept();
         System.out.println("Clicou no alerta");
        
          driver.close();
    }
}
