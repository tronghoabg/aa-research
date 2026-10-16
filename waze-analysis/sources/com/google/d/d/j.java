package com.google.d.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class j extends ds {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f7641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(t tVar, Map map) {
        super(map);
        Objects.requireNonNull(tVar);
        this.f7641a = tVar;
    }

    @Override // com.google.d.d.ds, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        fo.L(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f7545d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f7545d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7545d.keySet().hashCode();
    }

    @Override // com.google.d.d.ds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i(this, this.f7545d.entrySet().iterator());
    }

    @Override // com.google.d.d.ds, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f7545d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f7641a.f7658b -= size;
        return size > 0;
    }
}
