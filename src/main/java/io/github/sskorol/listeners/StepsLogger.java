package io.github.sskorol.listeners;

import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;
import lombok.extern.slf4j.Slf4j;

@SuppressWarnings("JavadocType")
@Slf4j
public class StepsLogger implements StepLifecycleListener {

    @Override
    public void beforeStepStop(final StepResult result) {
        log.info("Finishing step: {}", result.getName());
    }
}
