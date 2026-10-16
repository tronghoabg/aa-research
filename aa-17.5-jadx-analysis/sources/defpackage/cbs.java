package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public class cbs<K, V> implements Map.Entry<K, V>, afgc {
    public final Object a;
    private final Object b;

    public cbs(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        if (entry != null) {
            if (affa.f(entry.getKey(), this.a) && affa.f(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return this.a + "=" + getValue();
    }
}
