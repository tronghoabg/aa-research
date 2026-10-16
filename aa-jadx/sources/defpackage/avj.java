package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class avj extends defpackage.avh {
    public int b = 2;
    public boolean a = true;

    @Override // defpackage.avh
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.avh
    public final long f(defpackage.ctx ctxVar, long j) {
        if (this.a && defpackage.dlm.j(j)) {
            return j;
        }
        int iF = this.b == 1 ? ctxVar.f(defpackage.dlm.a(j)) : ctxVar.d(defpackage.dlm.a(j));
        if (iF < 0) {
            iF = 0;
        }
        return defpackage.dln.g(iF, iF, 0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.avh, defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b == 1 ? csyVar.f(i) : csyVar.d(i);
    }

    @Override // defpackage.avh, defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return this.b == 1 ? csyVar.f(i) : csyVar.d(i);
    }
}
