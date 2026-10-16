package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class epp<K, V> implements java.util.Map.Entry<K, V>, defpackage.afhc {
    public final java.lang.Object a;
    public defpackage.epp b;
    public defpackage.epp c;
    public boolean d;
    private final java.lang.Object e;

    public epp(java.lang.Object obj, java.lang.Object obj2) {
        this.e = obj;
        this.a = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.epp)) {
            return false;
        }
        defpackage.epp eppVar = (defpackage.epp) obj;
        return defpackage.afga.f(this.e, eppVar.e) && defpackage.afga.f(this.a, eppVar.a);
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
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final java.lang.String toString() {
        return "Entry(key=" + this.e + ", value=" + this.a + ")";
    }
}
