package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class afbv<K, V> implements Map.Entry<K, V>, afgf {
    private final afby a;
    private final int b;
    private final int c;

    public afbv(afby afbyVar, int i) {
        this.a = afbyVar;
        this.b = i;
        this.c = afbyVar.f;
    }

    private final void a() {
        if (this.a.f != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return affa.f(entry.getKey(), getKey()) && affa.f(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        a();
        return (K) this.a.b[this.b];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        a();
        Object[] objArr = this.a.c;
        objArr.getClass();
        return (V) objArr[this.b];
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
        afby afbyVar = this.a;
        afbyVar.f();
        Object[] objArrK = afbyVar.k();
        int i = this.b;
        V v2 = (V) objArrK[i];
        objArrK[i] = v;
        return v2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
