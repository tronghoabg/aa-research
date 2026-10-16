package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awg extends defpackage.awh {
    public defpackage.csf a;

    public awg(defpackage.csf csfVar) {
        this.a = csfVar;
    }

    @Override // defpackage.cyy
    public final java.lang.Object ds(java.lang.Object obj) {
        defpackage.awa awaVar = obj instanceof defpackage.awa ? (defpackage.awa) obj : null;
        if (awaVar == null) {
            awaVar = new defpackage.awa(null);
        }
        awaVar.c = new defpackage.aub(new defpackage.asu(this.a));
        return awaVar;
    }
}
