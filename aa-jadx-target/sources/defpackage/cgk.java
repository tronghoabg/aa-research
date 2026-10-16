package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cgk extends defpackage.cge implements defpackage.cxe {
    public float a;

    public cgk(float f) {
        this.a = f;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(j);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.bpn(cuxVarV, this, 2));
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.b(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.c(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.d(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.e(this, cszVar, csyVar, i);
    }

    public final java.lang.String toString() {
        return "ZIndexModifier(zIndex=" + this.a + ")";
    }
}
