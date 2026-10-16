package com.google.d.d;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af<F, T> extends AbstractCollection<T> {

    /* renamed from: a, reason: collision with root package name */
    final Collection f7409a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.d.b.t f7410b;

    af(Collection collection, com.google.d.b.t tVar) {
        com.google.d.b.an.B(collection);
        this.f7409a = collection;
        this.f7410b = tVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f7409a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f7409a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return fo.K(this.f7409a.iterator(), this.f7410b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7409a.size();
    }
}
