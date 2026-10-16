package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class tcs<K, V> implements Map<K, V>, afgg, afgc {
    public final Map a;
    public final eqj b;
    private final aezr c;
    private final aezr d;
    private final aezr e;
    private final eqm f;

    public tcs(Map map) {
        this.a = map;
        this.c = woy.dG(new ooq(this, 16));
        this.d = woy.dG(new ooq(this, 17));
        this.e = woy.dG(new ooq(this, 18));
    }

    public final Collection a() {
        return (Collection) this.d.a();
    }

    public final void b() {
        this.f.m(wub.u(this.a));
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
        b();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set) this.e.a();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) this.a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set) this.c.a();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        V v2 = (V) this.a.put(k, v);
        b();
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        this.a.putAll(map);
        b();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        V v = (V) this.a.remove(obj);
        if (v != null) {
            b();
        }
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return a();
    }

    public tcs(Map map, byte[] bArr) {
        this(map);
        eqm eqmVar = new eqm(wub.u(map));
        this.f = eqmVar;
        this.b = eqmVar;
    }
}
