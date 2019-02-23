package com.rar.d.internal;

import com.rar.a.internal.A1;
import com.rar.base.internal.BaseClass;

public class D1 {
    A1 a1Object = new A1();
    BaseClass baseClass = new BaseClass();

    public String call() {
        return "called C1";
    }

    public String callDirectDependency() {
        return a1Object.call() + " via D1";
    }

    public String callTransitiveDependency() {
        throw new RuntimeException("not yet");
    }
}
