package io.github.sskorol.testcases.common;

import io.github.sskorol.model.User;
import io.github.sskorol.pages.LoginPage;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.stream.Stream;

import static io.github.sskorol.core.PageFactory.open;
import static org.assertj.core.api.Assertions.assertThat;

public class CommonTests {

    @DataProvider
    public static Iterator<Object[]> getData() {
        return Stream.of(new User("dummyUsername", "dummyPassword"))
                     .map(user -> new Object[]{user})
                     .iterator();
    }

    @BeforeMethod
    public void prepareEnvironment() {
    }

    @AfterMethod
    public void cleanUpEnvironment() {
    }

    @Issue("21")
    @Feature("Authorization")
    @Story("ALR-23")
    @TmsLink("24")
    @Owner("sskorol")
    @Severity(SeverityLevel.CRITICAL)
    @Test(dataProvider = "getData")
    public void loginWithRegisteredUser(final User user) {
        open(LoginPage.class)
                .loginWith(user);
    }

    @Test
    @Flaky
    @Owner("baev")
    @Severity(SeverityLevel.BLOCKER)
    public void shouldFailOnAssertion() {
        assertThat(true).as("Dummy status").isFalse();
    }

    @Test
    @Flaky
    @Owner("sskorol")
    @Severity(SeverityLevel.MINOR)
    public void shouldThrowUnhandledException() {
        throw new IllegalArgumentException("Unable to parse some value");
    }

    @Test
    @Feature("Authorization")
    @Story("ALR-24")
    @Severity(SeverityLevel.NORMAL)
    public void shouldFailOnSubStep() {
        open(LoginPage.class)
                .typeUsername("badUsername")
                .cancelPopup();
    }

    @Test
    @Flaky
    @Feature("Authorization")
    @Story("ALR-25")
    @Severity(SeverityLevel.MINOR)
    public void shouldFailOnAssertionSubStep() {
        open(LoginPage.class)
                .typePassword("wrongPassword")
                .isPopupDisplayed();
    }

    @Test(dataProvider = "getData")
    @Feature("Payments")
    @Story("ALR-26")
    @TmsLink("25")
    @Issue("27")
    @Severity(SeverityLevel.BLOCKER)
    public void shouldDisplayUserBalance(final User user) {
        open(LoginPage.class)
                .loginWith(user)
                .displayBalance();
    }
}
