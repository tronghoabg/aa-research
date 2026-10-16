package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class epj<K, V> implements Map.Entry<K, V>, afgc {
    public final Object a;
    public epj b;
    public epj c;
    public boolean d;
    private final Object e;

    public epj(Object obj, Object obj2) {
        this.e = obj;
        this.a = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epj)) {
            return false;
        }
        epj epjVar = (epj) obj;
        return affa.f(this.e, epjVar.e) && affa.f(this.a, epjVar.a);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.e;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.e + ", value=" + this.a + ")";
    }
}
