package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afcv<K, V> implements java.util.Map.Entry<K, V>, defpackage.afhf {
    private final defpackage.afcy a;
    private final int b;
    private final int c;

    public afcv(defpackage.afcy afcyVar, int i) {
        this.a = afcyVar;
        this.b = i;
        this.c = afcyVar.f;
    }

    private final void a() {
        if (this.a.f != this.c) {
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return defpackage.afga.f(entry.getKey(), getKey()) && defpackage.afga.f(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        a();
        return (K) this.a.b[this.b];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        a();
        java.lang.Object[] objArr = this.a.c;
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
        defpackage.afcy afcyVar = this.a;
        afcyVar.f();
        java.lang.Object[] objArrK = afcyVar.k();
        int i = this.b;
        V v2 = (V) objArrK[i];
        objArrK[i] = v;
        return v2;
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
