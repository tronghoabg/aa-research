package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class vyp extends defpackage.vzh {
    public vyp(defpackage.ajgy ajgyVar, boolean z) {
        super(z, ajgyVar);
    }

    @Override // defpackage.vzh
    public final defpackage.vzf a(java.lang.String str) {
        defpackage.ajgy ajgyVarC = c(null);
        return ajgyVarC.equals(defpackage.ajgy.a) ? defpackage.vzf.a : defpackage.vzf.b(ajgyVarC);
    }

    @Override // defpackage.vzh
    public final defpackage.ajgy b(defpackage.vzf vzfVar) {
        return c(vzfVar);
    }

    public final defpackage.ajgy c(defpackage.vzf vzfVar) {
        return this.a ? f(vzfVar) : e();
    }
}
