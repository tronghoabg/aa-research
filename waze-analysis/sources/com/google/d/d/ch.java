package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ch implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f7491a;

    ch(Object[] objArr) {
        this.f7491a = objArr;
    }

    Object readResolve() {
        return ci.n(this.f7491a);
    }
}
