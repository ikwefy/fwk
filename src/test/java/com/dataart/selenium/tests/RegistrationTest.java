package com.dataart.selenium.tests;

import com.dataart.selenium.framework.BaseTest;
import com.dataart.selenium.framework.Settings;
import com.dataart.selenium.models.User;
import com.dataart.selenium.pages.BasicPage;
import com.dataart.selenium.pages.HeaderPage;
import com.dataart.selenium.pages.LoginPage;
import com.dataart.selenium.pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.dataart.selenium.framework.BasePage.driver;
import static com.dataart.selenium.framework.Utils.isElementPresent;
import static com.dataart.selenium.models.UserBuilder.admin;
import static com.dataart.selenium.models.UserBuilder.newuser;
import static org.fest.assertions.Assertions.assertThat;
import static com.dataart.selenium.framework.BasePage.initPage;

public class RegistrationTest extends BaseTest {

    private LoginPage loginPage;
    private BasicPage basicPage;
    private HeaderPage headerPage;
    private RegisterPage registerPage;
    private User user;
    private Settings settings;

    @BeforeMethod(alwaysRun = true)
    public void openRegisterPage() {
        basicPage = initPage(BasicPage.class);
        headerPage = initPage(HeaderPage.class);
        registerPage = initPage(RegisterPage.class);
        headerPage = initPage(HeaderPage.class);
        user = admin();
        driver.findElement(By.xpath("html/body/div[1]/a")).click();
        user = newuser();
    }

    @Test
    public void RegisterValildUser() {
        registerPage.registerAs(user);
        assertHeader(user);
    }

    private void assertHeader(User user) {
        assertThat(headerPage.getWelcomeMessage()).isEqualTo("Welcome " + user.getFname() + " " + user.getLname());
    }
}