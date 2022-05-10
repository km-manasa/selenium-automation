package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 
{
	@Test(priority=-1)
	public void calls()
	{
		Reporter.log("Calls",true);
	}
	@Test(priority=1,invocationCount=5)
	public void chats()
	{
		Reporter.log("Chats",true);
	}
	@Test(enabled=false)
	public void Settings()
	{
		Reporter.log("Settings",true);
	}

}
