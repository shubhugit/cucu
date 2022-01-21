package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.localpageUI;
import com.mindtree.utility.Logs;

public class localpage {

	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log ;
	localpageUI localui;
	public localpage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	public void clickonlocal() throws WebDriverHelperException {
		log = loggerUtil.createLog("localpage.java");
		helper.clickButton(localpageUI.local);
		helper.switchHandles(1);	
		log.info("switchtab");
	}
	public void cityname(String s) throws WebDriverHelperException, InterruptedException {
		helper.sendText(localpageUI.city,s);
		helper.applicationWait(5000);
		helper.clickButton(localpageUI.selectedcity);
		log.info("cityname");
	}
	public void date(String s1,String s2) throws InterruptedException {
		helper.selectdate(localpageUI.calender,localpageUI.dMonth,localpageUI.Month,localpageUI.date, s1,s2);
		log.info("date selected");	
	}
	
	public void time(String s) {
		helper.select(localpageUI.time,s);
		log.info("time");
	}
	public void selectbutton() throws WebDriverHelperException {
		helper.clickButton(localpageUI.selectbutton);
		log.info("selectbutton");
	}
	public void selectcar() throws WebDriverHelperException, InterruptedException {
		helper.applicationWait(5000);
		helper.clickButton(localpageUI.selectcar);
		log.info("selectcar");
	}
	public void validate() throws WebDriverHelperException
	{
		   String ExpectedCarType ="Toyota Etios or Equivalent";
		   String ActualCarType = helper.getText(localpageUI.car);
		   if(ActualCarType.contains(ExpectedCarType)) {
			   log.info("CarType Validated :"+ActualCarType);
		
		   
	}
		
	}
}


