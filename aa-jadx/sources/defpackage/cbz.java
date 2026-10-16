package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cbz<K, V> extends defpackage.cby<K, V> implements java.util.Map.Entry<K, V>, defpackage.afhf {
    private final defpackage.cce b;
    private java.lang.Object c;

    public cbz(defpackage.cce cceVar, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2);
        this.b = cceVar;
        this.c = obj2;
    }

    @Override // defpackage.cby, java.util.Map.Entry
    public final V getValue() {
        return (V) this.c;
    }

    @Override // defpackage.cby, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = (V) this.c;
        this.c = v;
        defpackage.ccd ccdVar = this.b.a;
        defpackage.ccc cccVar = ccdVar.d;
        java.lang.Object obj = this.a;
        if (cccVar.containsKey(obj)) {
            if (ccdVar.c) {
                java.lang.Object objA = ccdVar.a();
                cccVar.put(obj, v);
                ccdVar.b(objA != null ? objA.hashCode() : 0, cccVar.a, objA, 0);
            } else {
                cccVar.put(obj, v);
            }
            ccdVar.e = cccVar.c;
        }
        return v2;
    }
}
