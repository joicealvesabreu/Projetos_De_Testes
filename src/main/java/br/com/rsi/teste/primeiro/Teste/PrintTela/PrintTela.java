package br.com.rsi.teste.primeiro.Teste.PrintTela;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;


public class PrintTela {
	
public String destDir;
public Wait<WebDriver>wait;
public DateFormat dateFormat;

	public void takeScreenShot() {
		
		// Escolhe o nome da pasta.
		String destDir = "screenshotsFace";
		// Tira o print.
		TakesScreenshot driver = null;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Digita a data.
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// Cria a pasta screenshot.
		new File(destDir).mkdirs();
		// Digita o nome do arquivo.
		String destFile = "printfacebbok_" + dateFormat.format(new  Date()) + ".png";
		
		try {
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
			} catch (IOException e) {
			e.printStackTrace();

		
	}
	
}
}
