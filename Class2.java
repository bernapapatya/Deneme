package testing;


import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	    static WebDriver driver; 
	    @BeforeClass public static void BrowserOpen() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe ");
		driver= new ChromeDriver() ;  }
	    
	    @Test public void Register_User() {

		driver.get("http://thedemosite.co.uk/login.php");
		driver.findElement(By.name("username")).sendKeys("berna21");
		driver.findElement(By.name("password")).sendKeys("papatya");
		driver.findElement(By.name("FormsButton2")).click();
		Assert.assertEquals("Login example page to test the PHP MySQL online system", driver.getTitle());
		//Assert.assertTrue(driver.findElement(By.name("username")).getText().equals(""));
		System.out.println("Kullanýcý Giriþi Baþarýlý ...");
		driver.findElement(By.linkText("Help")).click();
		//accept () // Uyarýnýn 'Tamam' düðmesine týklayýn.
		driver.switchTo().alert().accept();
		driver.close();
		

}
	
}
