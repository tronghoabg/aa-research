package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vyp extends defpackage.vzh {
    public vyp(ajgy ajgyVar, boolean z) {
        super(z, ajgyVar);
    }

    @Override // defpackage.vzh
    public final defpackage.vzf a(java.lang.String str) {
        ajgy ajgyVarC = c(null);
        return ajgyVarC.equals(ajgy.a) ? defpackage.vzf.a : defpackage.vzf.b(ajgyVarC);
    }

    @Override // defpackage.vzh
    public final ajgy b(defpackage.vzf vzfVar) {
        return c(vzfVar);
    }

    public final ajgy c(defpackage.vzf vzfVar) {
        return this.a ? f(vzfVar) : e();
    }
}
