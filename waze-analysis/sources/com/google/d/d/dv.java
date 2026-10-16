package com.google.d.d;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class dv<K, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f7549a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set f7550b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection f7551c;

    dv() {
    }

    abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7549a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setB = b();
        this.f7549a = setB;
        return setB;
    }

    Set g() {
        return new ds(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f7550b;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.f7550b = setG;
        return setG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f7551c;
        if (collection != null) {
            return collection;
        }
        du duVar = new du(this);
        this.f7551c = duVar;
        return duVar;
    }
}
