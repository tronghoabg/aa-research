package com.google.d.d;

import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bm extends bn {

    /* renamed from: a, reason: collision with root package name */
    final transient int f7452a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f7453b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f7454c;

    bm(bn bnVar, int i2, int i3) {
        Objects.requireNonNull(bnVar);
        this.f7454c = bnVar;
        this.f7452a = i2;
        this.f7453b = i3;
    }

    @Override // com.google.d.d.bn
    /* renamed from: b */
    public final bn subList(int i2, int i3) {
        com.google.d.b.an.t(i2, i3, this.f7453b);
        int i4 = this.f7452a;
        return this.f7454c.subList(i2 + i4, i3 + i4);
    }

    @Override // com.google.d.d.bh
    final int e() {
        return this.f7454c.f() + this.f7452a + this.f7453b;
    }

    @Override // com.google.d.d.bh
    final int f() {
        return this.f7454c.f() + this.f7452a;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        com.google.d.b.an.A(i2, this.f7453b);
        return this.f7454c.get(i2 + this.f7452a);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return true;
    }

    @Override // com.google.d.d.bh
    final Object[] j() {
        return this.f7454c.j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7453b;
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
