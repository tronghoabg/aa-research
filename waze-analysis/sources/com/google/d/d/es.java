package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class es<E> extends bn<E> {

    /* renamed from: a, reason: collision with root package name */
    static final bn f7582a = new es(new Object[0], 0);

    /* renamed from: b, reason: collision with root package name */
    final transient Object[] f7583b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f7584c;

    es(Object[] objArr, int i2) {
        this.f7583b = objArr;
        this.f7584c = i2;
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        Object[] objArr2 = this.f7583b;
        int i3 = this.f7584c;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // com.google.d.d.bh
    final int e() {
        return this.f7584c;
    }

    @Override // com.google.d.d.bh
    final int f() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i2) {
        com.google.d.b.an.A(i2, this.f7584c);
        return (E) Objects.requireNonNull(this.f7583b[i2]);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return false;
    }

    @Override // com.google.d.d.bh
    final Object[] j() {
        return this.f7583b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7584c;
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
