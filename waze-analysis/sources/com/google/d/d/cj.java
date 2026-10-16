package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cj extends bn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ck f7493a;

    cj(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.f7493a = ckVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        cn cnVar = this.f7493a.f7494a;
        return new AbstractMap.SimpleImmutableEntry(cnVar.f7502e.f7616d.get(i2), cnVar.f7503f.get(i2));
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7493a.f7494a.size();
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
