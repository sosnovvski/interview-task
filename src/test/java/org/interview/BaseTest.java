package org.interview;

import org.interview.configuration.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;

import static org.interview.configuration.WebDriverProvider.getDriver;

public class BaseTest {

    @AfterEach
    public void tearDown() {
        if (WebDriverProvider.getDriver() != null) {
            getDriver().quit();
        }
    }
}
