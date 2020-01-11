package br.com.rsi.teste.toolqa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestToolqa {
	
	
	@Test
	public void Testar(){
	
	WebDriver driver = new ChromeDriver();
	
	 driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows/");
	 driver.findElement(By.xpath (".//*[contains(@")). click (); 

	// driver.navigate (). back (); //comando voltar
	 
	// driver.navigate().forward();
	;
//driver.navigate().to("http://www.DemoQA.com");
	// driver.navigate().refresh();
	 
	 driver.close();
	 
}	}
