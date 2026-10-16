package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class zv<K, V> implements Map.Entry<K, V>, afgc {
    private final Object a;
    private final Object b;

    public zv(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
