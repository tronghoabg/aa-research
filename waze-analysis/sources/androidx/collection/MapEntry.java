package androidx.collection;

import h.g.b.a.a;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, a {
    private final K key;
    private final V value;

    public MapEntry(K k2, V v) {
        this.key = k2;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
