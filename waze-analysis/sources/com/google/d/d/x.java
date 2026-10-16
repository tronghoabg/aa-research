package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f7660a;

    x(y yVar) {
        Objects.requireNonNull(yVar);
        this.f7660a = yVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f7660a.w();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7660a.E(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f7660a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7660a.i();
    }
}
