package VideoToolqa;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AprendendoComandos {
	
	public static WebDriver driver;
	
    @BeforeClass
    public static void setUpTest(){
        driver = new ChromeDriver();
        driver.get("http://Yahoo.com");
    }

    @AfterClass
    public static void tearDownTest(){
        driver.quit();
    }
    
    @Test
    public void testaTituloDaPagina(){ 			//  ********************************************************************************************
    											//  Essa Parte Do codigoEla copia o titudo da pagina 
    String BrowserTitle = driver.getTitle();	//  Ela copia o titudo da pagina.                 
    											// Isso que ele imprimi:  Yahoo Brasil: Email, notícias, finanças, esportes, entretenimento                                                  *
    System.out.println(BrowserTitle);			//**********************************************************************************************
                                                //*********************************
    String currenUrl = driver.getCurrentUrl();	// Aqui Ele copiar o Url da pagina
    	                                        //  Isso que ele imprimi:    https://br.yahoo.com/?p=us
    System.out.println(currenUrl);				//*********************************
    	
    
    String PageSource = driver.getPageSource();	//  Essa ele pega todo o codigo da pagina
    											//  e imprimi.
    System.out.println(PageSource);  			//  
    
   driver.navigate().back(); // ele volta p/pagina anterior
   
   driver.navigate().refresh(); // ele ataualiza a pagina
    
    
    
    }
    
    
}
