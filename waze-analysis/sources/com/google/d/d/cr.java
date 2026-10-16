package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cr extends bn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cs f7510a;

    cr(cs csVar) {
        Objects.requireNonNull(csVar);
        this.f7510a = csVar;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f7510a.a(i2);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return this.f7510a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7510a.size();
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
