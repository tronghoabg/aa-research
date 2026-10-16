package com.google.d.b;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends s implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final r f7246a = new r();
    private static final long serialVersionUID = 1;

    r() {
    }

    private Object readResolve() {
        return f7246a;
    }

    @Override // com.google.d.b.s
    protected final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // com.google.d.b.s
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
