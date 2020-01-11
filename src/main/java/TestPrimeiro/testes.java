package TestPrimeiro;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.Window;
public class testes {
	
	WebElement Botao;
	
	@Test // aqui voce diz qual esta realizando um teste
	public void TestFazerLogin() {

		// para abrir o driver do navegador
		WebDriver driver = new ChromeDriver();

		driver.get("https://pt-br.facebook.com"); //

		
		// Id "email". Nesse Comando ele vai procurar essa janelinha para digitar esse
		// comando
		driver.findElement(By.id("email")).sendKeys("11941707376");
		driver.findElement(By.id("pass")).sendKeys("11013376");

		WebElement botaoentrar = driver.findElement(By.id("loginbutton"));
		botaoentrar.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
													
		
		WebElement publicar = driver.findElement(By.name("xhpc_message"));
		publicar.sendKeys("Oi estou fazendo minha primeira automação");
		
	
	    WebElement botao = driver.findElement (By.xpath(".//*[contains(@data-testid,'react-composer-post-button')]"));
	    botao.isSelected();
	    System.out.println("Achou UFFA");
	    
	    
	    driver.quit();

	}
		}

