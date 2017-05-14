package io.github.sskorol.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import static io.qameta.allure.Allure.addByteAttachmentAsync;
import static io.qameta.allure.Allure.addStreamAttachmentAsync;
import static java.lang.ClassLoader.getSystemResourceAsStream;

@SuppressWarnings("JavadocType")
public class BaseListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(final IInvokedMethod method, final ITestResult testResult) {
        // not implemented
    }

    @Override
    public void afterInvocation(final IInvokedMethod method, final ITestResult testResult) {
        if (method.isTestMethod()) {
            addByteAttachmentAsync("Test log", "text/plain", "afterInvocationContent"::getBytes);

            if (!testResult.isSuccess()) {
                addStreamAttachmentAsync("Failure screenshot", "image/png", () ->
                        getSystemResourceAsStream("attachments/screenshot.png"));
            }
        }
    }
}
