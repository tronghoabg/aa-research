package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class yei<K, V> extends yel implements Map<K, V> {
    protected yei() {
    }

    protected abstract Map a();

    @Override // java.util.Map
    public final void clear() {
        a().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return a().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) a().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return a().keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) a().put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        a().putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) a().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return a().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return a().values();
    }
}
