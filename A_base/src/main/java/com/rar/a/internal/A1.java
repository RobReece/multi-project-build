package com.rar.a.internal;

import com.rar.base.internal.BaseClass;
import org.apache.commons.lang3.StringUtils;

public class A1 {
    BaseClass baseClassObject = new BaseClass();
    StringUtils x = new StringUtils();

    public String call() {
        return "called A1";
    }

    public String callDirectDependency() {
        return baseClassObject.call() + " via A1";
    }

    public String callTransitiveDependency() {
        throw new RuntimeException("not yet");
    }
}
