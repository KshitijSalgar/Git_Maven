package testframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("https://proposalfinder.com/");
		d.manage().window().fullscreen();
		
		//Syntax of xpath:- 
		//tagname[@attribute='attribute name']
		
		//a[@id='open-login-modal']
		
		WebElement login=d.findElement(By.xpath("//a[@id='open-login-modal']"));
		login.click();
		
		
	}

}
