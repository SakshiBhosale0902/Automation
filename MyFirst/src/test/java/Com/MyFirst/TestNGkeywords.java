package Com.MyFirst;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGkeywords {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void goToOranegHRMPage() {
		driver.get("https://www.orangehrm.com/");
        
	}
	@Test(priority = 1)
	public void goToGooglePage() {
		driver.get("https://www.google.com/");
        
	}
	@Test(priority = 2)
	public void goToFaceBookPage() {
		driver.get("https://www.facebook.com/");
        
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
