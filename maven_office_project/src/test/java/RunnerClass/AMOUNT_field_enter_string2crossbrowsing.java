package RunnerClass;

import java.io.IOException;
import java.time.Duration;

import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import DEmo_QA_POM.Amount_String_error_messagePOM6;
import DEmo_QA_POM.DEmo_DashBoard_page_pom2;
import DEmo_QA_POM.Verifying_Page_pom1;
import LiberyFile.BaseClass;
import maven_office_project.LoginPage;

public class AMOUNT_field_enter_string2crossbrowsing {
  
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void launchbrwser(String browser) throws InterruptedException {
		if (browser.equals("chrome")) {
		
		driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NDc2MjcxMCwiZXhwIjoxNjY0Nzg0MzEwfQ.9lZfHS_vUgwX-YtFDmBBSRIsMr5CwxmoE56WtcfLQUI");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		}
		
		else if (browser.equals("ieb")) {
			BaseClass.IEBrowser("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NDc2MjcxMCwiZXhwIjoxNjY0Nzg0MzEwfQ.9lZfHS_vUgwX-YtFDmBBSRIsMr5CwxmoE56WtcfLQUI");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
			
		}
		
	}
	
	@BeforeMethod
	public void clickonPRoceedButtton() {
		Verifying_Page_pom1 p1=PageFactory.initElements(driver, Verifying_Page_pom1.class);
		p1.ClickONProceedButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
//		DEmo_DashBoard_page_pom2 p2=PageFactory.initElements(driver, DEmo_DashBoard_page_pom2.class);
//		p2.clickonLTCPurchaseButton();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	}
	@Test
	public void checkstatus() throws InterruptedException {
		Amount_String_error_messagePOM6 p3=PageFactory.initElements(driver, Amount_String_error_messagePOM6.class);
		p3.enteramount();
		p3.functionality_pruchseButton();
	}
	@AfterMethod
	public void screencshot() throws IOException {
		BaseClass.TakesScreenShot();
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
