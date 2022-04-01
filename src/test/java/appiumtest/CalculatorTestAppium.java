package appiumtest;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class CalculatorTestAppium {

	
	AppiumDriver driver;
	
	public static void main(String[] args) {
		
	}
	public static void openCalculator() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "realme C11");
		cap.setCapability("udid", "AEFUNJ5LW47HGABI");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.coloros.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	}

}
