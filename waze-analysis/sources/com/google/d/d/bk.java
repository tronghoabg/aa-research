package com.google.d.d;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bk<E> extends bn<E> {

    /* renamed from: a, reason: collision with root package name */
    private final transient bn f7450a;

    bk(bn bnVar) {
        this.f7450a = bnVar;
    }

    private final int B(int i2) {
        return (size() - 1) - i2;
    }

    private final int C(int i2) {
        return size() - i2;
    }

    @Override // com.google.d.d.bn
    public final bn a() {
        return this.f7450a;
    }

    @Override // com.google.d.d.bn
    /* renamed from: b */
    public final bn subList(int i2, int i3) {
        com.google.d.b.an.t(i2, i3, size());
        return this.f7450a.subList(C(i3), C(i2)).a();
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7450a.contains(obj);
    }

    @Override // java.util.List
    public final E get(int i2) {
        com.google.d.b.an.A(i2, size());
        return this.f7450a.get(B(i2));
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return this.f7450a.i();
    }

    @Override // com.google.d.d.bn, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f7450a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return B(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.d.d.bn, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f7450a.indexOf(obj);
        if (iIndexOf >= 0) {
            return B(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7450a.size();
    }

    @Override // com.google.d.d.bn, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
