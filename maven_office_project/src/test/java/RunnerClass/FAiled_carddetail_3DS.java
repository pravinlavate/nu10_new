package RunnerClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DEmo_QA_POM.DEMO_PurchaseScreeen_pom3;
import DEmo_QA_POM.DEMO_paymentGATEWAY_SCreenPOM4;
import DEmo_QA_POM.DEmo_DashBoard_page_pom2;
import DEmo_QA_POM.POPup_pom5;
import DEmo_QA_POM.Verifying_Page_pom1;
import LiberyFile.BaseClass;
import maven_office_project.External_uat_deposit_onePom;

public class FAiled_carddetail_3DS {
 WebDriver driver;
	
	@BeforeClass
	public void launchBroswser() throws InterruptedException {
		
		driver=BaseClass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InByYXZpbmxAbnUxMC5jbyIsImlhdCI6MTY2NDYyODYyNCwiZXhwIjoxNjY0NjUwMjI0fQ.aQMVRmnZyvspp4MIlB3UcxYDskEMKffqj28XHVbvH8c");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));	
	}
	
	@BeforeMethod
	public void clickonprocesdbuttton() throws InterruptedException {
		Verifying_Page_pom1 p1 = PageFactory.initElements(driver, Verifying_Page_pom1.class);
		p1.ClickONProceedButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		DEmo_DashBoard_page_pom2 p2 = PageFactory.initElements(driver, DEmo_DashBoard_page_pom2.class);
		p2.clickonLTCPurchaseButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		DEMO_PurchaseScreeen_pom3 p3 = PageFactory.initElements(driver, DEMO_PurchaseScreeen_pom3.class);
		p3.enteramount();
		p3.clickONPurchaseBUtton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		DEMO_paymentGATEWAY_SCreenPOM4 p4 = PageFactory.initElements(driver, DEMO_paymentGATEWAY_SCreenPOM4.class);
		p4.enterDATA();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		p4.clickoncontinuebutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	}
	
	@Test
	public void CHEckedStauts() throws IOException {
		
		
		
		POPup_pom5 p5 = PageFactory.initElements(driver, POPup_pom5.class);
		p5.handle_pop();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		BaseClass.TakesScreenShot();
		System.out.println("test case pass");
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}
