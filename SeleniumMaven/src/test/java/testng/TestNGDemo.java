package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDemo {
@Test(priority = 1)
	public void mytestcase1() {
		System.out.println("This is from Testcase1");
		Assert.assertEquals("ACTUAL", "ACTUAL");
	}
@Test(priority = 2,dependsOnMethods = "mytestcase1")
public void mytestcase2() {
	System.out.println("This is from Testcase2");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("ACTUAL", "actual");
	sa.assertAll();
}
@BeforeTest
public void precondition() {
	System.out.println("This is from Precondition");
}
@AfterTest
public void postcondition() {
	System.out.println("This is from Postcondition");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("This is from Beforesuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("This is from Aftersuite");
}
@BeforeClass
public void beforeclass() {
	System.out.println("This is from Beforeclass");
}
@AfterClass
public void afterclass() {
	System.out.println("This is from Afterclass");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("This is from BeforeMethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("This is from AfterMethod");
}
}
