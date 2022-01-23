package com.totdomvc.tests;

import com.totdomvc.utilities.Configurations_Reader;
import static com.totdomvc.utilities.Driver.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;


    @BeforeMethod
    public void setUp(){
        driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url = Configurations_Reader.getKey("url");
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(url);
    }




    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        closeDriver();
    }

}
