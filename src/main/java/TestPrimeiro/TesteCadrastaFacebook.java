package TestPrimeiro;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.Utility;
import br.com.rsi.teste.primeiro.Teste.PrintTela.PrintTela;

public class TesteCadrastaFacebook 

{


	@Test
	
	public void Cadastranofacebook() throws Exception  {
		
		WebDriver driver =  new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://pt-br.facebook.com");
		Utility.captureScreenshot(driver, "facebook");
		driver.findElement(By.id("u_0_m")).sendKeys("JOICE");
		driver.findElement(By.id("u_0_o")).sendKeys("Natalice");
		Utility.captureScreenshot(driver, "inserirnome");
		
		driver.findElement(By.id("u_0_r")).sendKeys("joice@gmail.com");
		driver.findElement(By.id("u_0_u")).sendKeys("joice@gmail.com");
		Utility.captureScreenshot(driver, "inseriremail");
		
		driver.findElement(By.id("u_0_w")).sendKeys("natalice");
		Utility.captureScreenshot(driver, "inserirsenha");
		
		WebElement botaonascimento = driver.findElement(By.id("day"));
		botaonascimento.sendKeys("24");
		WebElement botaonascimento1 = driver.findElement(By.id("month"));
		botaonascimento1.sendKeys("11");
		WebElement botaonascimento2 = driver.findElement(By.id("year"));
		botaonascimento2.sendKeys("1990");
		Utility.captureScreenshot(driver, "inserirdata");
	
		WebElement sexofer= driver.findElement(By.id("u_0_9"));
		sexofer.isSelected();
		Utility.captureScreenshot(driver, "inserirosexo");
		
		driver.findElement(By.id("u_0_13")).click();
		Utility.captureScreenshot(driver, "inserirok");
		
		driver.quit();
	}	
}

