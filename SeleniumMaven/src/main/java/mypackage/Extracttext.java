package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extracttext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();//opens browser
		c.get("https://register.rediff.com/register/register.php?FormName=user_details");
		String text = c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[5]/font")).getText();
	    System.out.println(text);
	}

}
