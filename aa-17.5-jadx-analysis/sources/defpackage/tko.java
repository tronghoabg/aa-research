package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tko<K, V> implements Map<K, V>, afgg {
    private final Map a;
    private final afdr b;

    public tko(Map map, afdr afdrVar) {
        this.a = map;
        this.b = afdrVar;
    }

    private final void c() {
        if (!((Boolean) this.b.invoke()).booleanValue()) {
            throw new IllegalStateException("CheckedMutableMap used in wrong context");
        }
    }

    public final Collection a() {
        c();
        return this.a.values();
    }

    public final Set b() {
        c();
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        c();
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        c();
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        c();
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        c();
        return (V) this.a.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        c();
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        c();
        return (V) this.a.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        c();
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        c();
        return (V) this.a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        c();
        return this.a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return a();
    }
}
