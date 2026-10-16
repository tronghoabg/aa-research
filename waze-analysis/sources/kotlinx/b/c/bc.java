package kotlinx.b.c;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bc<K, V> implements Map.Entry<K, V>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f50983a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f50984b;

    public bc(Object obj, Object obj2) {
        this.f50983a = obj;
        this.f50984b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return h.g.b.x.n(this.f50983a, bcVar.f50983a) && h.g.b.x.n(this.f50984b, bcVar.f50984b);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.f50983a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return (V) this.f50984b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f50983a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f50984b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f50983a + ", value=" + this.f50984b + ')';
    }
}
