package AlertinSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E://Alert//PromptAlert.html");
	driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
	Alert alert=driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	alert.sendKeys("balasaheb");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	alert.dismiss();
	//	alert.accept();
	}

}
