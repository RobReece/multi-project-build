package com.rar.a.internal;

import com.rar.base.internal.BaseClass;

public class A1 {
    BaseClass baseClassObject = new BaseClass();

    public String call2() { return "call 2"; }
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
