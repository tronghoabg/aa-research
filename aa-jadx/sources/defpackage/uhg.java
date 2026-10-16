package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class uhg {
    public abstract defpackage.ukz[] a(defpackage.uka ukaVar);

    final int b(defpackage.uka ukaVar) {
        return a(ukaVar).length;
    }

    final defpackage.ukz c(defpackage.uka ukaVar, int i) {
        defpackage.ukz[] ukzVarArrA = a(ukaVar);
        return ukzVarArrA.length > i ? ukzVarArrA[i] : defpackage.ukz.a;
    }
}
