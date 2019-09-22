package AlertinSelenium;
/**HOW WILL YOU HANDLE ALERT AND POP-Ups?????**/
//we have to use alert api to switch
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1.Alert, 2.pomptalert, 3.confirmatiomn Alert
public class Alert1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//click on OK button
	//	alert.dismiss();//click on cancel button
		
		
	}

}
