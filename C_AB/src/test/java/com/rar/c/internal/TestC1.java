package com.rar.c.internal;

import org.junit.jupiter.api.Test;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.CoreMatchers.is;

public class TestC1 {
    @Test
    public void happyPath() {
        System.out.println(new C1().callDirectDependency());
    }
}
