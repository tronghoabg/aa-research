package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class afkd<V> extends defpackage.afjv<V> {
    private volatile defpackage.afke<V> classValue;

    public afkd(defpackage.affc<? super java.lang.Class<?>, ? extends V> affcVar) {
        affcVar.getClass();
        this.classValue = new defpackage.afke<>(affcVar);
    }

    @Override // defpackage.afjv
    public void clear() {
        this.classValue = this.classValue.createNewCopy();
    }

    @Override // defpackage.afjv
    public V get(java.lang.Class<?> cls) {
        cls.getClass();
        defpackage.afke<V> afkeVar = this.classValue;
        V v = (V) ((java.lang.ref.SoftReference) afkeVar.get(cls)).get();
        if (v != null) {
            return v;
        }
        afkeVar.remove(cls);
        V v2 = (V) ((java.lang.ref.SoftReference) afkeVar.get(cls)).get();
        return v2 != null ? v2 : afkeVar.compute.invoke(cls);
    }
}
