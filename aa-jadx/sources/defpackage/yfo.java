package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yfo<K, V> extends defpackage.yfr implements java.util.Map<K, V> {
    protected yfo() {
    }

    protected abstract java.util.Map a();

    @Override // java.util.Map
    public final void clear() {
        a().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return a().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return a().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj == this || a().equals(obj);
    }

    @Override // java.util.Map
    public V get(java.lang.Object obj) {
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
    public final java.util.Set<K> keySet() {
        return a().keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) a().put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        a().putAll(map);
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        return (V) a().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return a().size();
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
        return a().values();
    }
}
