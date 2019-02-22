package com.rar.d.internal;

import org.junit.jupiter.api.Test;

public class TestD1 {
    @Test
    public void happyPath() {
        System.out.println(new D1().callDirectDependency());
    }
}
