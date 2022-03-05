package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleinputbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("https://www.facebook.com/");
		c.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		c.findElement(By.id("pass")).sendKeys("Hello how are you");
	}

}
