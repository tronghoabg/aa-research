package h.a.a;

import h.g.b.x;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f<K, V> implements Map.Entry<K, V>, h.g.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final i f47938a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47939b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47940c;

    public f(i iVar, int i2) {
        x.f(iVar, "map");
        this.f47938a = iVar;
        this.f47939b = i2;
        this.f47940c = iVar.f47954i;
    }

    private final void a() {
        if (this.f47938a.f47954i != this.f47940c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return x.n(entry.getKey(), getKey()) && x.n(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        a();
        return (K) this.f47938a.f47947b[this.f47939b];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        a();
        Object[] objArr = this.f47938a.f47948c;
        x.c(objArr);
        return (V) objArr[this.f47939b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        a();
        i iVar = this.f47938a;
        iVar.i();
        Object[] objArrC = iVar.C();
        int i2 = this.f47939b;
        V v2 = (V) objArrC[i2];
        objArrC[i2] = v;
        return v2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
