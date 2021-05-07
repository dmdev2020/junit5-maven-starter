package com.dmdev.junit;

import com.dmdev.junit.extension.GlobalExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({
        GlobalExtension.class
})
public abstract class TestBase {
}
