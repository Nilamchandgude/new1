package Com.Test;

import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.Pom.careprovider_withoutdata;

public class careproviderWithoutData_Test extends BaseClass {
	@Test
	public void verifycareproWithoutData() {
		careprovider_withoutdata cpwd=new careprovider_withoutdata(driver);
		cpwd.Move_to_country();
		cpwd.select_english();
		cpwd.ClickOnStartBtn();
		cpwd.ClickOnDataProviderContiBtn();
		cpwd.ClickOnCareProBackBtn();
	}
	@Test(groups = {"Smoke"})
	public void DM_test_01() {
		System.out.println("DM_test_01 open successfully");
	}

	@Test
	public void DM_test_02() {
		System.out.println("DM_test_02 open successfully");
	}
}
..
hii
hlo