package metapercept;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TechPubConnect {
	
	WebDriver driver;
	
	@BeforeTest
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		String url = "https://techpub-connect-demo.netlify.app/html/contactus.html";
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	
	@Test
	public void testTechPubConnectMenuOptions() {
		List<String> menuOptions
		List<WebElement> menuOptions = 
				driver.findElements(By.xpath("////a[contains(@class,'nav-link' )]"));
		for(int i=0;i<menuOptions.size();i++) {
			menuOptions.get(i).getText();
			
			
		}
		
		
		
		
		
	}

}
