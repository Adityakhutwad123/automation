package automation;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class speedcheckdemo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","W:\\chromedriver\\crom_drvr-2\\chromedriver.exe\\" );
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//navigate url
	d.get("http://democonsultbuddy.mahamining.com/admin/login");
	//Enter user name and password
	d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("admin@gmail.com");
	d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Admin@123");
	String s=JOptionPane.showInputDialog("enter your captcha");
	Thread.sleep(2000);
//Enter captcha 
	d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s);
	//Click on Login 
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
	Thread.sleep(5000);
	//click on master 
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/h2/button")).click();
	//click on ministries
	//d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[1]")).click();
	//Thread.sleep(4000);
//click on goverment body Drop Down 
//d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
//Enter alphabates in Search ministry text field 
//d.findElement(By.id("mat-input-3")).sendKeys("a");
//Enter numaric value in Search ministry text field
//d.findElement(By.id("mat-input-3")).sendKeys("233");
	//Enter special character
	//d.findElement(By.id("mat-input-3")).sendKeys("@#");
	//Enter space at start
	//d.findElement(By.id("mat-input-3")).sendKeys(Keys.SPACE+"abcd");
	//Enter space Between two character 
	//d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("abc"+Keys.SPACE+"pqr");

//1]Verify Add functionality
          // d.findElement(By.xpath("//*[@id=\"mat-select-value-5\"]/span")).click();
	     //  d.findElement(By.xpath("//*[@id=\"mat-option-6\"]/span")).click();
	      // d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[2]/div[2]/div/form/mat-form-field[3]/div/div[1]/div[3]/input")).sendKeys("psu1");
	      // d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[2]/div[2]/div/form/div/div/button[2]")).click();
//search Element display or not 
	//d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(Keys.SPACE + "Bank");
 //2]Verify Updated recore display or not with update 
	   //  d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[2]/div[1]/mat-table/mat-row[1]/mat-cell[4]/button/span[1]/mat-icon")).click();
	  //   d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[2]/div[2]/div/form/mat-form-field[3]/div/div[1]/div[3]/input")).clear();
	   // d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[2]/div[2]/div/form/mat-form-field[3]/div/div[1]/div[3]/input")).sendKeys("Psu2223");
	  //   d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[2]/div[2]/div/form/div/div/button[2]/span[1]")).click();
/*3]Verify Added Ministry display or not in Ministry Drop Down present in Zone Region page Government body as central 
         d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-ministries/mat-card/div[2]/div[2]/div/form/mat-form-field[2]/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
        d.findElement(By.xpath("//*[@id=\"mat-option-4\"]/span")).click();
        d.findElement(By.id("mat-input-4")).sendKeys("mechanical deparment Ministry12 ");
        d.findElement(By.xpath("//*[@id=\"content\"]/div/div/app-ministries/mat-card/div[2]/div[2]/div/form/div/div/button[2]/span[1]")).click();
          Thread.sleep(1000);
    //Click on Zone Region
      d.findElement(By.id("menu-item-1")).click();
          Thread.sleep(3000);
      d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div/a[2]")).click();
           Thread.sleep(3000);
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
            Thread.sleep(3000);
      d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
            Thread.sleep(2000);
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
4]Verify Zone/Region Add Successfully  or not 
	Thread.sleep(3000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[2]")).click();
     d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
     d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
     d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
     Thread.sleep(1000);
     d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
      Thread.sleep(1000);
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("North1");
       Thread.sleep(1000);
       d.findElement(By.xpath("//*[@id=\"content\"]/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[5]/div/button[2]/span[1]")).click();
//5]Verify Added Zone/Region Display or not in Zone/Region Drop Down Present in district Division  page */
	 Thread.sleep(3000);
     d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[2]")).click();
     Thread.sleep(1000);
     d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
     d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
       Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
        Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("North1");
         Thread.sleep(1000);
       d.findElement(By.xpath("//*[@id=\"content\"]/div/div/app-zone-region/mat-card/div[2]/div[2]/div/form/div[5]/div/button[2]/span[1]")).click();
          Thread.sleep(1000);
     //Click on District Division page
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/h2/button/div/img")).click();
       Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[3]")).click();
       Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]")).click();
       d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
       Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
       d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
       Thread.sleep(1000);
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
       d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
//6]Add District/Division
       Thread.sleep(1000);
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/h2/button")).click();
       d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/h2/button")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[3]")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]")).click();
        d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
        d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
        d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
        Thread.sleep(1000);
        d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Sub-North1");
        d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-dist-division/mat-card/div[2]/div[2]/div/form/div[6]/div/button[2]/span[1]")).click();
        
//7]Add Category in Category page 
        d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/h2/button/div/img")).click();
         Thread.sleep(1000);
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[4]")).click();
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-category/mat-card/div[2]/div[2]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("space category");
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-category/mat-card/div[2]/div[2]/div/form/mat-form-field/div/div[1]/div[3]/textarea")).sendKeys("This Category Related To Space ,So If You Are Worked In Space Then You Fill The Booklet,or if You Will be  Interested To Work in space then you can buy the tender ");
      d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-category/mat-card/div[2]/div[2]/div/form/div[2]/div/button[2]/span[1]")).click();
//8]Verify Added Category Display or not in  Category Drop Down Present in Expertise Area page 
	         Thread.sleep(1000);
	         d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/h2/button/div/img")).click();
	 d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[4]")).click();
     d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-category/mat-card/div[2]/div[2]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("space category");
     d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-category/mat-card/div[2]/div[2]/div/form/mat-form-field/div/div[1]/div[3]/textarea")).sendKeys("This Category Related To Space ,So If You Are Worked In Space Then You Fill The Booklet,or if You Will be  Interested To Work in space then you can buy the tender ");
     d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-category/mat-card/div[2]/div[2]/div/form/div[2]/div/button[2]/span[1]")).click();
	       Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/h2/button/div")).click();
	       Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div/a[5]")).click();
	    Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-expertise-area/mat-card/div[2]/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
/*9]Add Expertise Area 
	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"collapse1\"]/div/div/div/a[5]")).click();
	    Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-expertise-area/mat-card/div[2]/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
    d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[7]/span")).click();
    d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-expertise-area/mat-card/div[2]/div[2]/div/form/div[2]/div[1]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Space maintanance");
    d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-expertise-area/mat-card/div[2]/div[2]/div/form/div[3]/div/button[2]")).click();
///10]Verify Add functionality of package 
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[2]/div/div/div/div/a[6]")).click();
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-packages/mat-card/div[2]/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Gold1");
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-packages/mat-card/div[2]/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("2000");
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-packages/mat-card/div[2]/div[2]/div/form/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("1600");
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-packages/mat-card/div[2]/div[2]/div/form/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[1]/span")).click();
	d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-packages/mat-card/div[2]/div[2]/div/form/div[5]/div/button[2]/span[1]")).click();*/











	}


}
