package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class g extends dv {

    /* renamed from: a, reason: collision with root package name */
    final transient Map f7631a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f7632b;

    g(t tVar, Map map) {
        Objects.requireNonNull(tVar);
        this.f7632b = tVar;
        this.f7631a = map;
    }

    final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.f7632b.f(key, (Collection) entry.getValue()));
    }

    @Override // com.google.d.d.dv
    final Set b() {
        return new e(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        t tVar = this.f7632b;
        if (this.f7631a == tVar.f7657a) {
            tVar.w();
        } else {
            fo.L(new f(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f7631a;
        com.google.d.b.an.B(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f7631a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) fo.x(this.f7631a, obj);
        if (collection == null) {
            return null;
        }
        return this.f7632b.f(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f7631a.hashCode();
    }

    @Override // com.google.d.d.dv, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f7632b.C();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f7631a.remove(obj);
        if (collection == null) {
            return null;
        }
        t tVar = this.f7632b;
        Collection collectionA = tVar.a();
        collectionA.addAll(collection);
        tVar.f7658b -= collection.size();
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7631a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f7631a.toString();
    }
}
