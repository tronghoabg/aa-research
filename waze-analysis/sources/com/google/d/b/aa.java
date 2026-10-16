package com.google.d.b;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class aa<T> implements Serializable {
    private static final long serialVersionUID = 0;

    aa() {
    }

    public static aa g() {
        return a.f7194a;
    }

    public static aa h(Object obj) {
        return obj == null ? a.f7194a : new ae(obj);
    }

    public static aa i(Object obj) {
        an.B(obj);
        return new ae(obj);
    }

    public abstract aa a(t tVar);

    public abstract Object b();

    public abstract Object c(aj ajVar);

    public abstract Object d(Object obj);

    public abstract Object e();

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract int hashCode();
}
