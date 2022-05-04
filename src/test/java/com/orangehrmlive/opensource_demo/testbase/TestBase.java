package com.orangehrmlive.opensource_demo.testbase;

import com.orangehrmlive.opensource_demo.propertyreader.PropertyReader;
import com.orangehrmlive.opensource_demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();

    }
}
