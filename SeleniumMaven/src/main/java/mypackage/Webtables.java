package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {
public static String companyname = "SKF India";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();//opens browser
		c.manage().window().maximize();
		c.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> companynames = c.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> price = c.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		for(int i=0;i<companynames.size();i++) {
			if(companynames.get(i).getText().equals(companyname)) {
			System.out.print(companynames.get(i).getText()+"--->");
			System.out.println(price.get(i).getText());
		}
	}

}
}
