package Selecionador;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataEHora {
	
	
	@Test
	public void testes() throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Navigation navigator = driver.navigate();
		
		navigator.to("http://www.expedia.co.in");
		
		WebElement viagem = driver.findElement(By.xpath("//*[@id=\"tab-flight-tab-hp\"]/span[2]"));
		viagem.click();
		
		viagem.findElement(By.xpath("/html/body")).click();
		
//		viagem.findElement(By.id("flight-type-one-way-label-hp-flight")).click();
		
		
	//	viagem.findElement(By.id("flight-origin-hp-flight")).click();
	//	viagem.sendKeys(" New york");
		viagem.findElement(By.id(" flight-destination-hp-flight] ")).click();
		viagem.sendKeys("Paris");

	    
	   
	    
		
		
		
		
		
		
		//*[contains(@id="purchase-box")]
	}

}
