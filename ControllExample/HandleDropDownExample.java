package ControllExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownExample extends BaseTest {
	
	// WebDriver driver;

	
	@Test
    public void listExample() throws Exception {
        
        WebElement countryList = driver.findElement(By.xpath("//select[@name='FromLB']"));
        
        
        
        //create an object
        
        Select li = new Select(countryList);
        
        System.out.println("is dropdown accept multiple selection or not: " + li.isMultiple());             //true
        
        
        
        //indexing start from 0
        li.selectByIndex(0);                //USA
        li.selectByIndex(5);                //India
        
        Thread.sleep(2000);
        
        li.selectByValue("Germany");        //Germany
        
        Thread.sleep(2000);
        
        li.selectByVisibleText("Greece");   //Greece
        
        
        Thread.sleep(5000);
        
        //deselection
        li.deselectByIndex(10);
        li.deselectByValue("Germany");
        li.deselectByVisibleText("USA");
        
        driver.findElement(By.xpath("//input[@value='->']")).click();
        
        Thread.sleep(5000);
        
      
        
        WebElement result=driver.findElement(By.xpath("//select[@name='ToLB']"));
        
        Select sls =new Select(result);
        System.out.println(sls.isMultiple());
        Thread.sleep(5000);
        sls.selectByIndex(1);
        
        
    } }
    
   
    
 /*   @Test
    public void listExample2() throws Exception {
        
        WebElement carlist = driver.findElement(By.xpath("//select[@id='Carlist']"));
        
        
        
        //create an object
        
        Select li = new Select(carlist);
        
        System.out.println("is dropdown accept multiple selection or not: " + li.isMultiple());             //false
        
        
        
        //indexing start from 0
        li.selectByIndex(1);                //BMW
        
        
        Thread.sleep(2000);
        
        li.selectByValue("Audi Car");       //Audi
        
        Thread.sleep(2000);
        
        li.selectByVisibleText("Toyota");   //Toyota
        
        
        Thread.sleep(5000);
        
        
    }

} */
	
