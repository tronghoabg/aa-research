package com.google.d.c;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bd f7320a;

    at(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.f7320a = bdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f7320a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7320a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f7320a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ar(this.f7320a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7320a.size();
    }
}
