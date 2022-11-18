package RunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LiberyFile.BaseClass;
import deposit_bc.LoginPageBTC_pom1;
import deposit_bc.PaymentRecipt_pom2;
import deposit_bc.PaywithBITcoin_pom4;
import deposit_bc.QuickpayBTC_pom3;
import maven_office_project.LoginPage;

public class btc_crptocurrency_Check {
  
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		
		driver=BaseClass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
		Thread.sleep(3000);

	}
	
	@AfterMethod
	public void lognpage() throws InterruptedException {
		
		LoginPageBTC_pom1 l1=PageFactory.initElements(driver, LoginPageBTC_pom1.class);
		l1.clickOnaPaytoMerchant();
		Thread.sleep(3000);
		PaymentRecipt_pom2 l2=PageFactory.initElements(driver, PaymentRecipt_pom2.class);
		l2.paymentbuttonclick();
		Thread.sleep(3000);
		QuickpayBTC_pom3 l3=PageFactory.initElements(driver, QuickpayBTC_pom3.class);
		l3.selectbtccurrency();
		l3.paybuttonclick();
		Thread.sleep(4000);
		
	}
	
	@Test
	public void  test() throws InterruptedException {
		PaywithBITcoin_pom4 l4=PageFactory.initElements(driver, PaywithBITcoin_pom4.class);
		l4.btc();
	
		
		
	}
	
}

