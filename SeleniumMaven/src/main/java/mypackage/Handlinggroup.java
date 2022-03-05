package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinggroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();//opens browser
		c.manage().window().maximize();
		c.get("https://echoecho.com/htmlforms09.htm");
	    List<WebElement> checkboxes = c.findElements(By.name("Checkbox"));
        System.out.println(checkboxes.size());
        for(int i=0;i<checkboxes.size();i++) {
        	checkboxes.get(i).click();
        	System.out.println(checkboxes.get(i).getAttribute("checked"));
        }
	}

}
