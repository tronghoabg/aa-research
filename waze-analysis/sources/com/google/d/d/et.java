package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class et extends bn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eu f7585a;

    et(eu euVar) {
        Objects.requireNonNull(euVar);
        this.f7585a = euVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        eu euVar = this.f7585a;
        com.google.d.b.an.A(i2, euVar.f7588c);
        int i3 = i2 + i2;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(euVar.f7587b[i3]), Objects.requireNonNull(euVar.f7587b[i3 + 1]));
    }

    @Override // com.google.d.d.bh
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7585a.f7588c;
    }

    @Override // com.google.d.d.bn, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
