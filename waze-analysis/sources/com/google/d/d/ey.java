package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ey extends cs {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fa f7598a;

    /* synthetic */ ey(fa faVar) {
        Objects.requireNonNull(faVar);
        this.f7598a = faVar;
    }

    @Override // com.google.d.d.cs
    final Object a(int i2) {
        return this.f7598a.f7605b.f(i2);
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7598a.contains(obj);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7598a.f7605b.f7573c;
    }

    @Override // com.google.d.d.cs, com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
