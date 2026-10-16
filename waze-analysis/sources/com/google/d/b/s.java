package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class s {
    protected s() {
    }

    public static s d() {
        return q.f7245a;
    }

    public static s e() {
        return r.f7246a;
    }

    protected abstract int a(Object obj);

    protected abstract boolean b(Object obj, Object obj2);

    public final int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return a(obj);
    }

    public final boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return b(obj, obj2);
    }
}
