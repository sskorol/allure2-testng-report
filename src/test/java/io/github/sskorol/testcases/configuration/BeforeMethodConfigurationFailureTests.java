package io.github.sskorol.testcases.configuration;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BeforeMethodConfigurationFailureTests {

    @BeforeMethod
    public static void prepareMethod() {
        throw new IllegalStateException("Unable to prepare method");
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void shouldNotBeExecutedDueToMethodConfigurationFailure() {
        assertThat("Actual value")
                .as("Dummy string")
                .isEqualTo("Actual value");
    }
}
