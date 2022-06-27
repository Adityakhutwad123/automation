package automation;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\adityak\\\\Downloads\\\\chromedriver_win32 (1)2\\\\chromedriver.exe\\\\" );
	WebDriver app=new ChromeDriver();
	app.manage().window().maximize();
	app.get("http://demo.consultbuddy.com/login");
	//navigate url
//d.get("https://scroll.in/article/1025536/why-the-debate-around-the-age-of-aisha-the-prophets-wife-is-irrelevant");
//JavascriptExecutor js=(JavascriptExecutor) d;
//js.executeScript("window.scrollBy(0,2000)");
	// Bidder Login
			app.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("bidder.shauryatecnosoft@gmail.com");
			app.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Akshay@123");
			String m=JOptionPane.showInputDialog("Enter Captcha");
			app.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(m);
			app.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
			Thread.sleep(3000);
			//JavascriptExecutor js = (JavascriptExecutor) app;
		       //js.executeScript("window.scrollBy(0,-550)", "");
			app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-suggested-tenders/mat-card/div/div/div/div[5]/div/div[2]/div/div[1]/div[4]/div[3]/div/a[2]")).click();
			Thread.sleep(1000);
			app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-tender-details/div/div[2]/div/div[2]/div/div[2]/div/mat-table/mat-row/mat-cell[6]/button")).click();
			Thread.sleep(1000);
			app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div/div[1]/div/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[4]/div[1]")).click();
			Thread.sleep(1000);
			app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/table/tbody/tr/td[4]/mat-checkbox/label/span[1]")).click();
			Thread.sleep(1000);
			app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]")).click();
			Thread.sleep(2000);
			app.findElement(By.xpath("//mat-pseudo-checkbox[@class=\"mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted\"]")).click();
			app.switchTo().defaultContent();
			Thread.sleep(3000);
			app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/div[4]/a/span[1]")).click();
			//app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/div[4]/a/span[1]")).click();
			Thread.sleep(1000);
			app.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[1]/h2/button")).click();
			Thread.sleep(1000);
			app.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[3]/form/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div/button[1]/div/div[1]/div")).click();

}
}
