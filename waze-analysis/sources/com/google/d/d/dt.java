package com.google.d.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class dt<K, V1, V2> extends dr<K, V2> {

    /* renamed from: a, reason: collision with root package name */
    final Map f7546a;

    /* renamed from: b, reason: collision with root package name */
    final dp f7547b;

    dt(Map map, dp dpVar) {
        com.google.d.b.an.B(map);
        this.f7546a = map;
        this.f7547b = dpVar;
    }

    @Override // com.google.d.d.dr
    final Iterator a() {
        return fo.K(this.f7546a.entrySet().iterator(), fo.v(this.f7547b));
    }

    @Override // com.google.d.d.dr, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f7546a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f7546a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V2 get(Object obj) {
        Map map = this.f7546a;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return (V2) this.f7547b.a(obj, obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return this.f7546a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V2 remove(Object obj) {
        Map map = this.f7546a;
        if (map.containsKey(obj)) {
            return (V2) this.f7547b.a(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7546a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V2> values() {
        return new du(this);
    }
}
