package com.google.d.b;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q extends s implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final q f7245a = new q();
    private static final long serialVersionUID = 1;

    q() {
    }

    private Object readResolve() {
        return f7245a;
    }

    @Override // com.google.d.b.s
    protected final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // com.google.d.b.s
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
