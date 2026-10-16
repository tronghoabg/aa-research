package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class alk extends defpackage.cge implements defpackage.cxe, defpackage.czc {
    public defpackage.all a;
    public boolean b = true;

    public alk(defpackage.all allVar) {
        this.a = allVar;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.afw.y(j, this.b ? defpackage.apn.a : defpackage.apn.b);
        boolean z = this.b;
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dlm.m(j, 0, z ? defpackage.dlm.b(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : defpackage.dlm.a(j), 5));
        int i = cuxVarV.a;
        int iB = defpackage.dlm.b(j);
        if (i <= iB) {
            iB = i;
        }
        int i2 = cuxVarV.b;
        int iA = defpackage.dlm.a(j);
        if (i2 <= iA) {
            iA = i2;
        }
        int i3 = i - iB;
        int i4 = i2 - iA;
        int i5 = 1;
        if (true == this.b) {
            i3 = i4;
        }
        defpackage.all allVar = this.a;
        allVar.f.h(i3);
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            if (allVar.c() > i3) {
                allVar.f(i3);
            }
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            this.a.d.h(true != this.b ? iB : iA);
            this.a.e.h(this.b ? cuxVarV.b : cuxVarV.a);
            this.a.a.b(java.lang.Boolean.FALSE);
            return cubVar.dS(iB, iA, defpackage.afcf.a, new defpackage.bfr(this, i3, cuxVarV, i5));
        } catch (java.lang.Throwable th) {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            throw th;
        }
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        dekVar.a(defpackage.def.n, java.lang.Boolean.TRUE);
        defpackage.ddx ddxVar = new defpackage.ddx(new defpackage.nz(this, 18), new defpackage.nz(this, 19));
        if (this.b) {
            dekVar.a(defpackage.def.x, ddxVar);
        } else {
            dekVar.a(defpackage.def.w, ddxVar);
        }
    }

    @Override // defpackage.cxe
    public final int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (true != this.b) {
            i = Integer.MAX_VALUE;
        }
        return csyVar.c(i);
    }

    @Override // defpackage.cxe
    public final int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (true == this.b) {
            i = Integer.MAX_VALUE;
        }
        return csyVar.d(i);
    }

    @Override // defpackage.cxe
    public final int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (true != this.b) {
            i = Integer.MAX_VALUE;
        }
        return csyVar.e(i);
    }

    @Override // defpackage.cxe
    public final int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        if (true == this.b) {
            i = Integer.MAX_VALUE;
        }
        return csyVar.f(i);
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
