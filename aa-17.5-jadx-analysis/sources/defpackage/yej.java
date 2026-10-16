package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class yej<K, V> extends yel implements Map.Entry<K, V> {
    protected yej() {
    }

    protected abstract Map.Entry a();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) a().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) a().getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        return (V) a().setValue(v);
    }
}
