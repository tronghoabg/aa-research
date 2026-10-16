package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awf extends defpackage.awh {
    public defpackage.izq a;

    public awf(defpackage.izq izqVar) {
        this.a = izqVar;
    }

    @Override // defpackage.cyy
    public final java.lang.Object ds(java.lang.Object obj) {
        defpackage.awa awaVar = obj instanceof defpackage.awa ? (defpackage.awa) obj : null;
        if (awaVar == null) {
            awaVar = new defpackage.awa(null);
        }
        awaVar.c = new defpackage.aub(new defpackage.ast(this.a));
        return awaVar;
    }
}
