package org.interview;

import org.interview.pages.BasePage;
import org.interview.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterviewScenarioTest extends BaseTest {

    @Test
    @DisplayName("Validation for successful login")
    public void loginTest() {
        var loginPage = new LoginPage();
        loginPage.open();
        loginPage.login("test01@example.com", "pass123");

        var actualMessage = loginPage.getSuccessMessage();
        assertEquals("Login successful", actualMessage, "Login attempt was unsuccessful.");
    }
}
