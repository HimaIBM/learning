package ActionScrshotScrlldwn;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class MouseHover {

		



		


		//import org.junit.Assert;

		//import org.junit.Test;



	WebDriver driver;
		
		@BeforeTest
		public void launchApp() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		
		@AfterTest
		public void closeApp() {
			
			driver.quit();
		}

		@Test

		public void doubleclickTest() throws Exception {

				

		

			}



		}





