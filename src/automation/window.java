package automation;

import java.util.Set;

import javax.swing.JOptionPane;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	public static void main(String[] args ) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adityak\\Downloads\\chromedriver_win32 (1)2\\chromedriver.exe\\" );
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.consultbuddy.com/admin/login");
		String winName=d.getTitle();
		System.out.println("Window Name Is "+winName);
		Thread.sleep(1000);
		d.get("http://democonsultbuddy.mahamining.com/login");
		Thread.sleep(1000);
		//Enter User name And PassWord
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("bidder.shauryatecnosoft@gmail.com");
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Akshay@123");
		//Enter Captcha
		String s3=JOptionPane.showInputDialog("Enter Your Consultant Captcha");
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s3);
		//Click On Login
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
		String WinName2=d.getTitle();
		System.out.println("WinName is"+WinName2);
	}

}
