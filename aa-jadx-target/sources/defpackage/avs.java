package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avs extends defpackage.cge implements defpackage.cxe {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    public avs(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        int iDN = cubVar.dN(this.a) + cubVar.dN(this.c);
        int iDN2 = cubVar.dN(this.b) + cubVar.dN(this.d);
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.h(j, -iDN, -iDN2));
        int i = cuxVarV.a + iDN;
        int iD = defpackage.dlm.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = defpackage.dlm.b(j);
        if (i > iB) {
            i = iB;
        }
        int i2 = cuxVarV.b + iDN2;
        int iC = defpackage.dlm.c(j);
        int iA = defpackage.dlm.a(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return cubVar.dS(i, iA, defpackage.afcf.a, new defpackage.ajy(this, cuxVarV, 10, null));
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
