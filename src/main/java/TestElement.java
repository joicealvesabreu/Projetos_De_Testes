import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElement {
	
	@Test
	public void testes() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("Joice");
		
		driver.findElement(By.id("lastname")).sendKeys("natalice");
		
		driver.findElement(By.id("submit")).submit();
		
		driver.findElement(By.id("sex-1")).isSelected();
		
		driver.findElement(By.id("exp-2")).isSelected();
		
		driver.findElement(By.id("profession-1")).isSelected();
		
		driver.findElement(By.id("tool-1")).isSelected();
		
		driver.quit();
	}

}
