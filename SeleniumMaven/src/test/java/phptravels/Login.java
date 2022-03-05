package phptravels;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import poi.Readingdata;

public class Login {
	String Browsername = "Firefox";
	WebDriver browser;
@BeforeTest
public void precondition() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");
    if(Browsername.equalsIgnoreCase("CHROME")) {
    	browser = new ChromeDriver();
    }else if (Browsername.equalsIgnoreCase("FIREFOX")) {
    	browser = new FirefoxDriver();
    }else if (Browsername.equalsIgnoreCase("EDGE")) {
    	browser = new EdgeDriver();
    }else {
    	System.out.println("The code currently supports only"
    			+ "Firefox,Chrome and Edge"
    			+ "please select valid option");
    }
}
@Test(priority = 1)
public void openurl() {
	String ExpectedResult = "Login - PHPTRAVELS";
	browser.manage().window().maximize();
	browser.get("https://www.phptravels.net/login");
	Assert.assertEquals(browser.getTitle(), ExpectedResult);
}
@AfterTest
public void closebrowser() {
	browser.close();
}
@Test(priority = 2,dependsOnMethods = "openurl")
public void EnterCredentials() throws IOException {
	Readingdata rd = new Readingdata();
	String ExpectedResult = "Dashboard - PHPTRAVELS";
	String username =rd.readrowandcol("C:\\Filehandling\\usernamedata.xlsx", "Mysheet", 1, 0);
	String password =rd.readrowandcol("C:\\Filehandling\\usernamedata.xlsx", "Mysheet", 1, 1);
	browser.findElement(By.name("email")).sendKeys(username);
	browser.findElement(By.name("password")).sendKeys(password);
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
    Assert.assertEquals(browser.getTitle(), ExpectedResult);
}
}
