package common;

import org.openqa.selenium.WebDriver;

import common.CommonAction;

public class Constant extends CommonAction{
	//---------------------------------FairAnB------------------------------------//
	public static final String URL = "http://fairanb.com:8080/";

	
	//---------------------------------Driver pack------------------------------------//
	public static WebDriver driver = null;
	public static int TimeWait = 10;
	public static final String email = "Automation";
	public static final String DRIVER_PATH = "..\\LnCAdmin\\src\\test\\resources\\";
	public static final String CHROME_DRIVER_SERVER = "chromedriver228";
	public static final String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
	public static final String GECKO_DRIVER_SERVER = "geckodriver";
	public static final String IE_WEBDRIVER = "webdriver.ie.driver";
	public static final String IE_SERVER_DRIVER = "IEDriverServer";


	

	
}
