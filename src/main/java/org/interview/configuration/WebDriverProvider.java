package org.interview.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.interview.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProvider {
    private final static Browser browser = Browser.CHROME;
    private static WebDriver driver;

    private static void setUpDriver(Browser browser) {
        switch (browser) {
            case CHROME -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            }
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setUpDriver(browser);
        }
        return driver;
    }
}
