package TestDeBuscaDeElementos;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementoscomLinkpartial {
	
	@Test
	public void testes(){
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		
		System.out.println("abriu onavegardor");
		
		driver.findElement(By.linkText("JAVASCRIPT")).click();	
		
		System.out.println("acho e clicou");
		
		driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[3]")).click();
		
		System.out.println("acho e clicou");
		
		driver.quit();	
		
		
		
		
	}

}
