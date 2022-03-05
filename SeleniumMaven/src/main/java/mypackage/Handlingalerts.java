package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();//opens browser
		c.manage().window().maximize();
		c.get("https://echoecho.com/javascript4.htm");
		c.findElement(By.name("B2")).click();
		System.out.println(c.switchTo().alert().getText());
		c.switchTo().alert().accept(); // to click ok
		//c.switchTo().alert().dismiss(); // to click cancel
		//c.switchTo().alert().sendKeys("Sample text");
	}

}
