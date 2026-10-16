package com.google.d.f.b;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f7786a;

    x(z zVar) {
        Objects.requireNonNull(zVar);
        this.f7786a = zVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<com.google.d.f.aa<?>> iterator() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7786a.f7794d;
    }
}
