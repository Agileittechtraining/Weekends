package mypackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
ChromeDriver c = new ChromeDriver();//opens browser
//c.get("https://www.selenium.dev/");
c.navigate().to("https://www.selenium.dev/");
	}

}
