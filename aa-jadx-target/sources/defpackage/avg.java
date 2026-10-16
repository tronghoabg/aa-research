package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class avg extends defpackage.avh {
    public boolean a = true;
    public int b;

    public avg(int i) {
        this.b = i;
    }

    @Override // defpackage.avh
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.avh
    public final long f(defpackage.ctx ctxVar, long j) {
        if (this.a && defpackage.dlm.i(j)) {
            return j;
        }
        int iE = this.b == 1 ? ctxVar.e(defpackage.dlm.b(j)) : ctxVar.c(defpackage.dlm.b(j));
        if (iE < 0) {
            iE = 0;
        }
        return defpackage.dln.g(0, Integer.MAX_VALUE, iE, iE);
    }

    @Override // defpackage.avh, defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b == 1 ? csyVar.e(i) : csyVar.c(i);
    }

    @Override // defpackage.avh, defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b == 1 ? csyVar.e(i) : csyVar.c(i);
    }
}
