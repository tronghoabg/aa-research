package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class avh extends defpackage.cge implements defpackage.cxe {
    public abstract boolean d();

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        long jF = f(ctxVar, j);
        if (d()) {
            jF = defpackage.dln.f(j, jF);
        }
        defpackage.cux cuxVarV = ctxVar.v(jF);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.aun(cuxVarV, 7));
    }

    public abstract long f(defpackage.ctx ctxVar, long j);

    public int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return csyVar.c(i);
    }

    @Override // defpackage.cxe
    public int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return csyVar.d(i);
    }

    public int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return csyVar.e(i);
    }

    @Override // defpackage.cxe
    public int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return csyVar.f(i);
    }
}
