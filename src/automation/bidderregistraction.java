package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bidderregistraction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\adityak\\\\Downloads\\\\chromedriver_win32 (1)2\\\\chromedriver.exe\\\\");
		WebDriver b=new ChromeDriver();
		b.get("http://demo.consultbuddy.com/bidder-registration");
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select")).click();
		Thread.sleep(2000);
		b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
		Thread.sleep(1000);
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Rahul");
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Jaywant");
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[1]/div[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Gade");
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("9801021202");
		b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("rahulg123@gmail.com");
		//b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[4]")).click();
		//b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]")).click();
		Thread.sleep(1000);
		//b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[2]/div[2]")).click();
		//b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[3]/div[2]")).click();
		//b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[3]/div[2]")).click();
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[4]")).click();
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[2]")).click();
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]")).click();
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[2]")).click();
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[2]/div[2]/div[3]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("920557670099");
	    b.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("306,manan app,CT hospital,karad,45454");
	    Thread.sleep(2000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[3]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[22]/span")).click();
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[3]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Nashik");
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[3]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("CT hospital");
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[3]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("455667");
	    //Scroll down
	    Thread.sleep(2000);
	    String s;
	    JavascriptExecutor js=(JavascriptExecutor  ) b;
	    js.executeScript(s= "window.scrollBy(0,400)");
	    //Add category
	   Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[4]/div[2]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[4]/div[2]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[4]/div[2]/div/div[1]/div/div[3]/button[2]")).click();
	    //Scrolll Down 
	    Thread.sleep(2000);
	    String s1;
	    JavascriptExecutor js1=(JavascriptExecutor  ) b;
	    js.executeScript(s1= "window.scrollBy(0,400)");
	    Thread.sleep(2000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[5]/div[2]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[5]/div[2]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[5]/div[2]/div/div[1]/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[5]/div[2]/div/div[1]/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[5]/div[2]/div/div[1]/div/div[6]/button[2]/span[1]")).click();
	    //Scroll Down 
	    Thread.sleep(2000);
	    String s2;
	    JavascriptExecutor js2=(JavascriptExecutor  ) b;
	    js.executeScript(s2= "window.scrollBy(0,200)");
	    Thread.sleep(1000);
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[6]/div[1]/mat-checkbox/label/span[1]")).click();
	    
	    b.findElement(By.xpath("/html/body/app-root/app-web/div/app-registration/div/div[2]/div/form/div/div/div[6]/div[2]/button[2]/span[1]")).click();
	    Thread.sleep(6000);
	    b.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-success-modal/div/div/div/div/div[2]/div[2]/div/button")).click();
	    
	    
	    
	    
	    		
	}
	
	
	

}
