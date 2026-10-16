package defpackage;

/* loaded from: classes.dex */
final class cwp extends cxl {
    public cwp(cwq cwqVar) {
        super(cwqVar);
    }

    @Override // defpackage.cxl, defpackage.csp
    public final int c(int i) {
        sx sxVarAz = L().az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.a(cxbVar.q(), cxbVar.t(), i);
    }

    @Override // defpackage.cxl, defpackage.csp
    public final int d(int i) {
        sx sxVarAz = L().az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.b(cxbVar.q(), cxbVar.t(), i);
    }

    @Override // defpackage.cxl, defpackage.csp
    public final int e(int i) {
        sx sxVarAz = L().az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.c(cxbVar.q(), cxbVar.t(), i);
    }

    @Override // defpackage.cxl, defpackage.csp
    public final int f(int i) {
        sx sxVarAz = L().az();
        ctp ctpVarL = sxVarAz.l();
        cxb cxbVar = (cxb) sxVarAz.b;
        return ctpVarL.d(cxbVar.q(), cxbVar.t(), i);
    }

    @Override // defpackage.cxk
    public final int r(crw crwVar) {
        cxn cxnVar = (cxn) u();
        if (!cxnVar.j) {
            if (cxnVar.H() == 2) {
                cvv cvvVar = cxnVar.p;
                cvvVar.f = true;
                if (cvvVar.b) {
                    cxnVar.f.e();
                }
            } else {
                cxnVar.p.g = true;
            }
        }
        cxl cxlVar = ((cwq) cxnVar.k()).g;
        Boolean boolValueOf = cxlVar != null ? Boolean.valueOf(cxlVar.m) : null;
        cxl cxlVar2 = ((cwq) cxnVar.k()).g;
        if (cxlVar2 != null) {
            cxlVar2.m = true;
        }
        cxnVar.m();
        cxl cxlVar3 = ((cwq) cxnVar.k()).g;
        if (cxlVar3 != null) {
            cxlVar3.m = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) cxnVar.p.h.get(crwVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.q.g(crwVar, iIntValue);
        return iIntValue;
    }

    @Override // defpackage.cxl
    protected final void s() {
        cxn cxnVarN = L().n();
        cxnVarN.getClass();
        cxnVarN.u();
    }

    @Override // defpackage.cto
    public final cuo v(long j) {
        A(j);
        byw bywVarK = L().k();
        Object[] objArr = bywVarK.a;
        int i = bywVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            cxn cxnVarN = ((cxb) objArr[i2]).n();
            cxnVarN.getClass();
            cxnVarN.y = 3;
        }
        super.C(L().q.e(this, L().t(), j));
        return this;
    }
}
