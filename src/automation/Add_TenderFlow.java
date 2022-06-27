package automation;

import javax.swing.JOptionPane;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_TenderFlow {
	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\adityak\\Downloads\\chromedriver_win32 (1)2\\chromedriver.exe\\" );
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	//navigate url
d.get("http://demo.consultbuddy.com/login");
//Enter user name and password
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("admin@gmail.com");
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Admin@123");
//Enter captcha 
String s=JOptionPane.showInputDialog("enter our captcha");
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s);
//Click on Login 
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
//Click on tender 
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/h2/button/div")).click();
//Click on Tenders 
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/div/div/div/div/a[1]")).click();
//Click on Add Tender
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-tenders/div/div[2]/a/span[1]/mat-icon")).click();
//Select Govt.Body 
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(4000);
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
Thread.sleep(2000);
//Select Ministry 
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
Thread.sleep(4000);
//Select Zone/Region 
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(4000);
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
Thread.sleep(4000);
//Select District /Division
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(4000);
d.findElement(By.xpath("//span[@class=\"mat-option-text\"]")).click();
//Select Category
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
Thread.sleep(2000);
//Select Expertise Area 
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[7]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(1000);
d.findElement(By.xpath("//span[@class=\"mat-option-text\"]")).click();
//Enter Tender Id
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("T-11");
//Enter Tender Ammount 
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("1000000");
//Enter Booklet Price
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).click();
//Enter Tender Name 
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Electrical9");
//Select Closing Date 
Thread.sleep(1000);
d.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).click();
Thread.sleep(1000);
//Select Next Month
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[3]")).click();
Thread.sleep(1000);
//Select Date 
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[2]/div[1]")).click();
//Enter Description
d.findElement(By.xpath("//textarea[@id=\"mat-input-11\"]")).sendKeys("this Tender Related To The Space");
//Scroll BarDown
JavascriptExecutor js1=(JavascriptExecutor) d;
js1.executeScript("window.scrollBy(0,213)");
//Enter Location
d.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys("GV24+R6M, Saras Baug Rd, Dadawadi, Shukrawar Peth, Pune, Maharashtra 411002");
Thread.sleep(3000);
//Enter Longitude And Lattitude
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("18.5020566");
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("73.8527081");
//Enter officer Name
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("A.K.Patil");
//Enter Designation 
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("D.Y.S.P");
//Enter Contact No
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("9865642456");
//Upload RFP
Thread.sleep(3000);
d.findElement(By.xpath("//*[@id=\"mat-radio-3\"]/label/span[1]/span[1]")).click();
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("https://demo.consultbuddy.com/consultant-appointments");
//Select Img
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[5]/div[2]/div[2]/button[1]/img")).click();
Thread.sleep(2000);
//Select Questiories 
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[6]/div[2]/div[2]/button[1]/img")).click();
//Click On Add Tender 
Thread.sleep(15000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[3]/div/button[2]/span[1]")).click();
//Click on Confir mation Ok
Thread.sleep(2000);
d.findElement(By.xpath("//*[@id=\"success-modal\"]/div[2]/div[2]/div/button")).click();
//Published Tender By Admin
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-tenders/mat-card/div/div[2]/mat-table/mat-row[1]/mat-cell[7]/mat-icon/mat-slide-toggle/label/div")).click();
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-confirmation-modal/div/div/div/div/div[2]/div[2]/div/button[2]")).click();
Thread.sleep(1000);
//Verify Added Tender Display Or in Consultant Login
d.get("http://democonsultbuddy.mahamining.com/login");
Thread.sleep(1000);
//Enter User name And PassWord
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("adikhutwad635@gmail.com");
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Amol@123");
//Enter Captcha
String s1=JOptionPane.showInputDialog("Enter Your Consultant Captcha");
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s1);
//Click On Login
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
//Performe Analysis
Thread.sleep(4000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-consultant-suggested-tenders/mat-card/div/div/div[2]/div[2]/div/div[1]/div[4]/div[5]/div/a[2]")).click();
Thread.sleep(1000);
//Select Questions
Thread.sleep(1000);
WebElement q=d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-perform-tender-analysis/mat-card/div/div/div/form/div[1]/div/div/div/mat-radio-button[1]/label/span[1]"));
WebDriverWait w=new WebDriverWait(d, 80);
w.until(ExpectedConditions.elementToBeClickable(q));
q.click();
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-perform-tender-analysis/mat-card/div/div/div/form/div[1]/div/div/div/div/ng-container[1]/div/input")).click();
//Click On Submit
Thread.sleep(2000);
String s6;
JavascriptExecutor js6=(JavascriptExecutor) d;
js1.executeScript(s6="window.scrollBy(0,400)");
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-perform-tender-analysis/mat-card/div/div/div/form/div[4]/div/button[3]/span[1]")).click();
//Click On Confirm 
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-modal/div/div/div/div/div[2]/div[2]/div/button[2]")).click();
//Click on Submitted Booklet
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-submitted-booklets/mat-card/div/div/div/mat-table/mat-row[1]/mat-cell[6]/button[3]")).click();

//click On Update 
//Thread.sleep(1000);
//d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-edit-booklet/mat-card/div/div/div/div[2]/div[3]/div[2]/div/button[2]")).click();
//click On Send For Confirmation 
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-submitted-booklets/mat-card/div/div/div/mat-table/mat-row[1]/mat-cell[6]/button[3]/span[1]")).click();
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-confirmation-modal/div/div/div/div/div[2]/div[2]/div/button[2]")).click();
//Click On Confirm 
Thread.sleep(2000);
//Publish Booklet By the Admin
d.get("http://demo.consultbuddy.com/admin/login");
//Enter user name and password
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("admin@gmail.com");
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Admin@123");
//Enter captcha 
String s2=JOptionPane.showInputDialog("enter your captcha");
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s2);
//Click on Login 
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
//click On Tender
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/h2/button/div")).click();
//Click On Booklets
Thread.sleep(2000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/div/div/div/div/a[2]")).click();
//click On Publish
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-booklets/mat-card/div/div/div/div/mat-table/mat-row[1]/mat-cell[7]/button[3]")).click();
//Click On Confirm 
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-confirmation-modal/div/div/div/div/div[2]/div[2]/div/button[2]")).click();
//Take Appointment through Bidder 
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
Thread.sleep(2000);
String s4;
JavascriptExecutor js4=(JavascriptExecutor) d;
js4.executeScript(s4= "window.scrollBy(0,2100)");
//Click On Next Arrow 
Thread.sleep(4000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-suggested-tenders/mat-card/div/div/div/mat-paginator/div/div/div[2]/button[3]/span[1]")).click();
//Click On View Details
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-suggested-tenders/mat-card/div/div/div/div[5]/div/div[2]/div/div[1]/div[4]/div[3]/div/a[2]")).click();
//click On Book
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-tender-details/div/div[2]/div/div[2]/div/div[2]/div/mat-table/mat-row/mat-cell[6]/button")).click();
//Sroll Down
String s5;
JavascriptExecutor js5=(JavascriptExecutor) d;
js5.executeScript(s5= "window.scrollBy(0,200)");
//Select Date 
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div/div[1]/div/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[6]/div[1]")).click();
//Select Consultation Mode
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div/div[2]/div/table/tbody/tr/td[4]/mat-checkbox")).click();
//Select Time Duration
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select"));
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[2]/mat-pseudo-checkbox")).click();
d.switchTo().defaultContent();
//Click On Confirm
Thread.sleep(1000);
d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-book-appointment/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[1]/div[4]/a")).click();




	}
}