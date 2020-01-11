package br.com.rsi.teste.toolqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	
	public static void main(String[] args) throws InterruptedException {
		 
		 // Create a new instance of the Firefox driver
		 WebDriver driver = new ChromeDriver();
		 
		        //Launch the Online Store Website
		 driver.get("http://www.shop.demoqa.com");
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
		 //Wait for 5 Sec
		
			Thread.sleep (5000);
		
		        // Close the driver
		        driver.quit();
		    }
}
