package RunnerClass;

import java.io.IOException;
import java.time.Duration;

import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DEmo_QA_POM.Amount_String_error_messagePOM6;
import DEmo_QA_POM.DEmo_DashBoard_page_pom2;
import DEmo_QA_POM.Verifying_Page_pom1;
import LiberyFile.BaseClass;
import maven_office_project.LoginPage;

public class TCNO13_AMOUNT_field_enter_string {
  
	WebDriver driver;
	
	@BeforeClass
	public void launchbrwser() throws InterruptedException {
		
		driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NTAyNTU4NiwiZXhwIjoxNjY1MDQ3MTg2fQ.7wbo30nt99mT4GJMxKC0RYgXhR6d1bAjvsVNjuaYHRA");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
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
		
		Reporter.log("TCNO13.Check that  entering  string value  in amount field then purchase button is disable ", true );

	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
