package com.google.l.b;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f12385a;

    s(v vVar) {
        Objects.requireNonNull(vVar);
        this.f12385a = vVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12385a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12385a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new r(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f12385a.d(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12385a.f12401b;
    }
}
