package ActionScrshotScrlldwn;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class DoubleClick {

		


		//import org.junit.Assert;

		//import org.junit.Test;



	WebDriver driver;
		
		@BeforeTest
		public void launchApp() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
		}
		
		
		@AfterTest
		public void closeApp() {
			
			driver.quit();
		}

		@Test

		public void mousehover() throws Exception {

				

		

			}



		}





