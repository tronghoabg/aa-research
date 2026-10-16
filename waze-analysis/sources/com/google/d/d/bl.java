package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bl implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f7451a;

    bl(Object[] objArr) {
        this.f7451a = objArr;
    }

    Object readResolve() {
        return bn.o(this.f7451a);
    }
}
