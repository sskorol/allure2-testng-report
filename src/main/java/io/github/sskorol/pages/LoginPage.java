package io.github.sskorol.pages;

import io.github.sskorol.model.User;
import io.qameta.allure.Step;

import static io.github.sskorol.core.PageFactory.at;
import static io.qameta.allure.Allure.addByteAttachmentAsync;
import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("JavadocType")
public class LoginPage implements Page {

    @Step("Log into web site.")
    public HomePage loginWith(final User user) {
        return typeUsername(user.getUsername())
                .typePassword(user.getPassword())
                .clickLogOn();
    }

    @Step("Type \"{username}\" into \"Username\" input.")
    public LoginPage typeUsername(final String username) {
        addByteAttachmentAsync("Log", "text/plain", "This is my super log"::getBytes);
        return this;
    }

    @Step("Type \"{password}\" into \"Password\" input.")
    public LoginPage typePassword(final String password) {
        return this;
    }

    @Step("Handle an error popup.")
    public LoginPage acceptPopup() {
        return accept();
    }

    @Step("Handle an error popup.")
    public LoginPage cancelPopup() {
        return cancel();
    }

    @Step("Handle an error popup.")
    public boolean isPopupDisplayed() {
        return isDisplayed();
    }

    @Step("Click \"OK\" button.")
    public LoginPage accept() {
        return this;
    }

    @Step("Click \"Cancel\" button.")
    public LoginPage cancel() {
        throw new IllegalStateException("Unable to find \"Cancel\" button");
    }

    @Step("Click button \"Log On\"")
    public HomePage clickLogOn() {
        return at(HomePage.class);
    }

    @Step("Check if element is displayed.")
    private boolean isDisplayed() {
        assertThat(false).as("Popup is displayed").isTrue();
        return true;
    }
}
