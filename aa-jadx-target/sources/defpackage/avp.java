package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avp extends defpackage.cge implements defpackage.cxe {
    public defpackage.affc a;
    public boolean b = true;

    public avp(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(j);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.ajy(this, cuxVarV, 9, null));
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

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }
}
