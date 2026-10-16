package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cwz extends defpackage.cxv {
    public cwz(defpackage.cxa cxaVar) {
        super(cxaVar);
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int c(int i) {
        defpackage.tc tcVarAz = L().az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.a(cxlVar.q(), cxlVar.t(), i);
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int d(int i) {
        defpackage.tc tcVarAz = L().az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.b(cxlVar.q(), cxlVar.t(), i);
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int e(int i) {
        defpackage.tc tcVarAz = L().az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.c(cxlVar.q(), cxlVar.t(), i);
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int f(int i) {
        defpackage.tc tcVarAz = L().az();
        defpackage.cty ctyVarL = tcVarAz.l();
        defpackage.cxl cxlVar = (defpackage.cxl) tcVarAz.b;
        return ctyVarL.d(cxlVar.q(), cxlVar.t(), i);
    }

    @Override // defpackage.cxu
    public final int r(defpackage.csf csfVar) {
        defpackage.cxw cxwVar = (defpackage.cxw) u();
        if (!cxwVar.j) {
            if (cxwVar.H() == 2) {
                defpackage.cwe cweVar = cxwVar.p;
                cweVar.f = true;
                if (cweVar.b) {
                    cxwVar.f.e();
                }
            } else {
                cxwVar.p.g = true;
            }
        }
        defpackage.cxv cxvVar = ((defpackage.cxa) cxwVar.k()).g;
        java.lang.Boolean boolValueOf = cxvVar != null ? java.lang.Boolean.valueOf(cxvVar.m) : null;
        defpackage.cxv cxvVar2 = ((defpackage.cxa) cxwVar.k()).g;
        if (cxvVar2 != null) {
            cxvVar2.m = true;
        }
        cxwVar.m();
        defpackage.cxv cxvVar3 = ((defpackage.cxa) cxwVar.k()).g;
        if (cxvVar3 != null) {
            cxvVar3.m = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        java.lang.Integer num = (java.lang.Integer) cxwVar.p.h.get(csfVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.q.g(csfVar, iIntValue);
        return iIntValue;
    }

    @Override // defpackage.cxv
    protected final void s() {
        defpackage.cxw cxwVarN = L().n();
        cxwVarN.getClass();
        cxwVarN.u();
    }

    @Override // defpackage.ctx
    public final defpackage.cux v(long j) {
        A(j);
        defpackage.bzc bzcVarK = L().k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxw cxwVarN = ((defpackage.cxl) objArr[i2]).n();
            cxwVarN.getClass();
            cxwVarN.y = 3;
        }
        super.C(L().q.e(this, L().t(), j));
        return this;
    }
}
