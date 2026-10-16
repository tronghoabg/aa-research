package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class axc extends defpackage.cge implements defpackage.cxe {
    public boolean a;
    public defpackage.affg b;
    public int c;

    public axc(int i, boolean z, defpackage.affg affgVar) {
        this.c = i;
        this.a = z;
        this.b = affgVar;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        int i = this.c;
        int iC = 0;
        int iD = i != 1 ? 0 : defpackage.dlm.d(j);
        if (i == 2) {
            iC = defpackage.dlm.c(j);
            i = 2;
        }
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.d(iD, (i == 1 || !this.a) ? defpackage.dlm.b(j) : Integer.MAX_VALUE, iC, (i == 2 || !this.a) ? defpackage.dlm.a(j) : Integer.MAX_VALUE));
        int iG = defpackage.afqt.g(cuxVarV.a, defpackage.dlm.d(j), defpackage.dlm.b(j));
        int iG2 = defpackage.afqt.g(cuxVarV.b, defpackage.dlm.c(j), defpackage.dlm.a(j));
        return cubVar.dS(iG, iG2, defpackage.afcf.a, new defpackage.axb(this, iG, cuxVarV, iG2, cubVar, 0));
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.c(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.e(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(this), cszVar, csyVar, i);
    }
}
