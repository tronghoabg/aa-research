package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class avc extends defpackage.auy implements defpackage.cxe {
    private defpackage.awu a;

    public avc(defpackage.awu awuVar) {
        this.a = awuVar;
    }

    @Override // defpackage.auy
    public final defpackage.awu b(defpackage.awu awuVar) {
        return new defpackage.awo(awuVar, this.a);
    }

    @Override // defpackage.auy
    public final void d() {
        super.d();
        defpackage.cjv.r(this).I();
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        int iB = this.c.b(cubVar, cubVar.p()) - this.b.b(cubVar, cubVar.p());
        int iD = this.c.d(cubVar) - this.b.d(cubVar);
        int iC = this.c.c(cubVar, cubVar.p()) - this.b.c(cubVar, cubVar.p());
        int iA = (this.c.a(cubVar) - this.b.a(cubVar)) + iD;
        int i = iC + iB;
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.h(j, -i, -iA));
        int i2 = cuxVarV.a + i;
        int iD2 = defpackage.dlm.d(j);
        if (i2 < iD2) {
            i2 = iD2;
        }
        int iB2 = defpackage.dlm.b(j);
        if (i2 > iB2) {
            i2 = iB2;
        }
        int i3 = cuxVarV.b + iA;
        int iC2 = defpackage.dlm.c(j);
        int iA2 = defpackage.dlm.a(j);
        if (i3 < iC2) {
            i3 = iC2;
        }
        if (i3 <= iA2) {
            iA2 = i3;
        }
        return cubVar.dS(i2, iA2, defpackage.afcf.a, new defpackage.avb(cuxVarV, iB, iD, 0));
    }

    public final void f(defpackage.awu awuVar) {
        if (defpackage.afga.f(awuVar, this.a)) {
            return;
        }
        this.a = awuVar;
        d();
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
