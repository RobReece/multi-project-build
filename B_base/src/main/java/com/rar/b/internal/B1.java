package com.rar.b.internal;

import com.rar.base.internal.BaseClass;

public class B1 {
    BaseClass baseClassObject = new BaseClass();

    public String call() {
        return "called B1";
    }

    public String callDirectDependency() {
        return baseClassObject.call() + " via B1";
    }

    public String callTransitiveDependency() {
        throw new RuntimeException("not yet");
    }
}
