package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cci<K, V> extends defpackage.afbm<V> implements java.util.Collection<V>, j$.util.Collection<V>, defpackage.afhc {
    private final defpackage.cca a;

    public cci(defpackage.cca ccaVar) {
        this.a = ccaVar;
    }

    @Override // defpackage.afbm
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.afbm, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        defpackage.ccl[] cclVarArr = new defpackage.ccl[8];
        for (int i = 0; i < 8; i++) {
            cclVarArr[i] = new defpackage.ccp();
        }
        return new defpackage.ccb(this.a.b, cclVarArr);
    }
}
