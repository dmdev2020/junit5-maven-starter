package com.dmdev.junit.extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class GlobalExtension implements BeforeAllCallback, AfterTestExecutionCallback {

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("before all callback");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("after test execution");
    }
}
