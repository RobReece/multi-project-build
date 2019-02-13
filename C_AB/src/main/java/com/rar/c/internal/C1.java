package com.rar.c.internal;

import com.rar.a.internal.A1;
import com.rar.b.internal.B1;

public class C1 {
    A1 a1Object = new A1();
    B1 b1Object = new B1();

    public String call() {
        return "called C1";
    }

    public String callDirectDependency() {
        return a1Object.call() + " via C1 and " + b1Object.call() + " via C1";
    }

    public String callTransitiveDependency() {
        throw new RuntimeException("not yet");
    }

}
