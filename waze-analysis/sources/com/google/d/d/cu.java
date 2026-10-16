package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cu extends bc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterable f7513a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f7514b;

    cu(Iterable iterable, int i2) {
        this.f7513a = iterable;
        this.f7514b = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f7513a.iterator();
        com.google.d.b.an.B(it);
        int i2 = this.f7514b;
        com.google.d.b.an.m(i2 >= 0, "limit is negative");
        return new cx(i2, it);
    }
}
