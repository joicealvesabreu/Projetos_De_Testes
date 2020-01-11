package ClasseRobo;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class ClassesRobot {
	
	
	@Test
	public void ClasseRobo () throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	
		 String URL = "https://demoqa.com/keyboard-events/";
		 
		 //Start Browser
		 driver.get(URL);
		 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 
		 WebElement webElement = driver.findElement(By.id("browseFile")); 
		 //click  Browse button 
		 webElement.sendKeys(Keys.ENTER);
		 
		 Robot robot = new Robot();
		 //Code to Enter D1.txt 
		 //Press Shify key 
		 robot.keyPress(KeyEvent.VK_SHIFT);
		 //Press d , it gets typed as upper case D as Shift key is pressed
		 robot.keyPress(KeyEvent.VK_D);
		 //Release SHIFT key to release upper case effect
		 robot.keyRelease(KeyEvent.VK_SHIFT);
		 robot.keyPress(KeyEvent.VK_1);
		 robot.keyPress(KeyEvent.VK_PERIOD);
		 robot.keyPress(KeyEvent.VK_T);
		 robot.keyPress(KeyEvent.VK_X);
		 robot.keyPress(KeyEvent.VK_T);
		 
		 //Press ENTER to close the popup
		        robot.keyPress(KeyEvent.VK_ENTER);  
		 
		        //Wait for 1 sec
		        Thread.sleep(1000);
		 
		 //This is just a verification part, accept alert
		 webElement = driver.findElement(By.id("uploadButton"));
		 
		 webElement.click(); 
		 WebDriverWait wait = new WebDriverWait(driver, 10); 
		 Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());        
		 //Accept the Alert 
		 myAlert.accept();
		 
		 //Close the main window 
		 driver.close();
		
		
		
		
	}

	
	

}
