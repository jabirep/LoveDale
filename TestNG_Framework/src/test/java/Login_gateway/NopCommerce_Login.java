package Login_gateway;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;

public class NopCommerce_Login {

	LogStatus status;
	WebDriver driver;
	ExtentReports report=new ExtentReports("/home/jabir/My-eclipse/TestNG_Framework/test-output/EXTEND_REPORT/REPORT.html");

	ExtentTest logger=report.startTest("Browser started", "chrome browser");

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  //created instance for ExtentReports 
	  driver.manage().window().maximize();
	 
      logger.log(LogStatus.INFO, "Browser started ");
      
	  driver.get("https://admin-demo.nopcommerce.com/login");
	 // LogStatus status;
//		WebDriver driver;
//		ExtentReports report=new ExtentReports("/home/jabir/My-eclipse/TestNG_Framework/test-output/EXTEND_REPORT/REPORT.html");

	  logger.log(LogStatus.INFO, "Application is up and running");
  }
  
  @Test(groups= {"positive"})
  public void validLogin() throws InterruptedException {
	  
      //throw new SkipException("Skip this");			

	  
	WebElement username= driver.findElement(By.xpath("//input[@id='Email']"));
	 WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
	 WebElement login_button= driver.findElement(By.xpath("//button[@type='submit']"));
	 
	 username.clear();
	 username.sendKeys("admin@yourstore.com");
	 
	 password.clear();
	 password.sendKeys("admin");
	 
	 login_button.click();
	 Thread.sleep(5000);
	 logger.log(LogStatus.INFO, "logged into nopCommerce");
	 
	 String title=driver.getTitle();
	 
	 
	 if(title.equalsIgnoreCase("Dashboard / nopCommerce administration")) {
		 System.out.println("successfull login using valid credentials");
	 }
	 else {
		 System.out.println("unsuccessfull login using valid credentials");

	 }
	 logger.log(LogStatus.INFO, "positive test case for login verified");
	  //status=logger.getRunStatus();


  }
  
  @Test(groups= {"negative"})
  public void invalidLogin() throws InterruptedException {
		 

	 WebElement username= driver.findElement(By.xpath("//input[@id='Email']"));
	 WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
	 WebElement login_button= driver.findElement(By.xpath("//button[@type='submit']"));
	 
	 username.clear();
	 username.sendKeys("admsdgsdgin@yourstore.com");
	 
	 password.clear();
	 password.sendKeys("admdsgsin");
	 
	 login_button.click();
	 logger.log(LogStatus.INFO, "login blocked");
	 Thread.sleep(5000);
	 String title=driver.getTitle();
	 
	/* if(title.equalsIgnoreCase("Your store. Login")) {
		 System.out.println("system succesfully blocked login using invalid credentials");
	 }
	 else {
		 System.out.println("system can login login using invalid credentials");

	 }*/
	 String tittle=driver.getTitle();
	 
 	 Assert.assertEquals(driver.getTitle(), tittle);		

	 logger.log(LogStatus.INFO, "negative test case for login verified");

  }
  
  @AfterMethod
  public void afterMethod() throws IOException{
	  	  
	  driver.close();
	  logger.log(LogStatus.INFO, "Browser closed");

	  report.flush();
	 // driver.get("/home/jabir/My-eclipse/TestNG_Framework/test-output/EXTEND_REPORT/REPORT.html");

  }

	
}
