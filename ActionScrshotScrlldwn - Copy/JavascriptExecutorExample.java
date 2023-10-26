package ActionScrshotScrlldwn;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	//ctrl+shift+O ----- add or remove unused imports

	//Generated by Selenium IDE

	public class JavascriptExecutorExample {
	    private WebDriver driver;

	    @Test
	    public void recaptest() throws Exception {
	        
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        
	        driver.get("https://www.myntra.com/");
	        
	        
	        
	        
	        WebElement lbl_returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'within 14day')]"));
	        
	        
	        
//	      JavascriptExecutor JS = (JavascriptExecutor)driver;
//	      
//	      JS.executeScript("arguments[0].scrollIntoView()", lbl_returnPolicy);
	        
	        
	        scrollToElement(lbl_returnPolicy);
	        
	    }
	    
	    
	    
	    
	    
	    public void scrollToElement(WebElement ele) {
	        
	    
	        JavascriptExecutor JS = (JavascriptExecutor)driver;
	        
	        JS.executeScript("arguments[0].scrollIntoView()", ele);
	        
	    }
	    
	    
	    
	}

