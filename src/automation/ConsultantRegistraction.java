package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConsultantRegistraction {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adityak\\Downloads\\chromedriver_win32 (1)2\\chromedriver.exe");
		WebDriver con=new ChromeDriver();
		con.manage().window().maximize();
		con.get("http://demo.consultbuddy.com/consultant-registration");
		
		//First Name
		con.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Mohini");
		//Middle Name
		con.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Namdeo");
		//Last Name
		con.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Madgulkar");
		//Mobile no
		con.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("7434344444");
		//Email id
		con.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("mohini123@gmail.com");
		//DOB
		con.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
		//select year arrow
		Thread.sleep(2000);
		con.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/div")).click();
		//select perticular year
		con.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[3]")).click();
		//select Month
		con.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]")).click();
		//selct Date
		Thread.sleep(2000);
		con.findElement(By.xpath("//*[@id=\"mat-datepicker-22\"]/div/mat-month-view/table/tbody/tr[1]/td[2]")).click();
		
	}

}
