package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ew extends bn {

    /* renamed from: a, reason: collision with root package name */
    private final transient Object[] f7591a;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f7592b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f7593c;

    ew(Object[] objArr, int i2, int i3) {
        this.f7591a = objArr;
        this.f7592b = i2;
        this.f7593c = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        com.google.d.b.an.A(i2, this.f7593c);
        return Objects.requireNonNull(this.f7591a[i2 + i2 + this.f7592b]);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7593c;
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
