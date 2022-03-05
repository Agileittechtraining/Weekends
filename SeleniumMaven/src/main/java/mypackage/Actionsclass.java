package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();//opens browser
		c.manage().window().maximize();
		c.get("https://www.snapdeal.com/");
		c.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebElement Mensfashion = c.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"));
	    Actions a = new Actions(c);
	    a.moveToElement(Mensfashion).build().perform();
	    WebElement officebags = c.findElement(By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[18]/a/span"));
	    a.moveToElement(officebags).click().build().perform();
	    WebDriverWait wd = new WebDriverWait(c, Duration.ofSeconds(30));
	    wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	    WebElement leftslider = c.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
	    a.dragAndDropBy(leftslider, 80, 0).build().perform();
	}

}
