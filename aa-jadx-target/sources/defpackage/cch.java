package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cch<K, V> extends defpackage.afbx<K> implements java.util.Set<K>, java.util.Collection<K>, j$.util.Set<K>, defpackage.afhc {
    private final defpackage.cca a;
    private final /* synthetic */ int b;

    public cch(defpackage.cca ccaVar, int i) {
        this.b = i;
        this.a = ccaVar;
    }

    @Override // defpackage.afbm
    public final int a() {
        int i = this.b;
        return this.a.a();
    }

    @Override // defpackage.afbm, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (this.b == 0) {
            return this.a.containsKey(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!(entry instanceof java.util.Map.Entry)) {
            return false;
        }
        defpackage.cca ccaVar = this.a;
        V v = ccaVar.get(entry.getKey());
        if (v != null) {
            return defpackage.afga.f(v, entry.getValue());
        }
        return entry.getValue() == null && ccaVar.containsKey(entry.getKey());
    }

    @Override // defpackage.afbx, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        int i = 0;
        if (this.b != 0) {
            defpackage.ccl[] cclVarArr = new defpackage.ccl[8];
            while (i < 8) {
                cclVarArr[i] = new defpackage.ccm();
                i++;
            }
            return new defpackage.ccb(this.a.b, cclVarArr);
        }
        defpackage.ccl[] cclVarArr2 = new defpackage.ccl[8];
        while (i < 8) {
            cclVarArr2[i] = new defpackage.ccn();
            i++;
        }
        return new defpackage.ccb(this.a.b, cclVarArr2);
    }
}
