package com.dmdev.junit.extension;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ConditionalExtension implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        return System.getProperty("skip2") != null
                ? ConditionEvaluationResult.disabled("test is skipped")
                : ConditionEvaluationResult.enabled("enabled by default");
    }
}
