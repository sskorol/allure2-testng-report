package io.github.sskorol.listeners;

import io.qameta.allure.Allure;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

@SuppressWarnings("JavadocType")
public class BaseListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(final IInvokedMethod method, final ITestResult testResult) {
        // not implemented
    }

    @Override
    public void afterInvocation(final IInvokedMethod method, final ITestResult testResult) {
        if (method.isTestMethod()) {
            Allure.addByteAttachmentAsync("Test log", "text/plain", "afterInvocationContent"::getBytes);

            if (!testResult.isSuccess()) {
                Allure.addStreamAttachmentAsync("Failure screenshot",
                        "image/png",
                        () -> ClassLoader.getSystemResourceAsStream("attachments/screenshot.png"));
            }
        }
    }
}
