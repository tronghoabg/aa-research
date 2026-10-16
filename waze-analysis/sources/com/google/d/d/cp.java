package com.google.d.d;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cp implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Comparator f7506a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f7507b;

    cp(Comparator comparator, Object[] objArr) {
        this.f7506a = comparator;
        this.f7507b = objArr;
    }

    Object readResolve() {
        co coVar = new co(this.f7506a);
        coVar.l(this.f7507b);
        return coVar.j();
    }
}
