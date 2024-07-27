import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTestcases {
	
	WebDriver driver = new ChromeDriver();
	String theURL = "https://www.google.com"; 
	String ExpectedTitle = "Google";
	
	
	@Test(description ="wall jaeen n3mal test", invocationCount=10 )
	public void VerifyTheTitleIsGoogle() {
		
		driver.get(theURL);
	String TheActualTitle=	driver.getTitle();
	
	Assert.assertEquals(TheActualTitle,ExpectedTitle);
	}

}
