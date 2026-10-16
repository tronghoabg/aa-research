package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cgp implements defpackage.cig {
    public final android.view.View a;
    public final defpackage.dep b;
    public final java.lang.String c;
    public final android.graphics.Rect d;
    public android.view.autofill.AutofillId e;
    public boolean f;
    public final defpackage.cgu g;
    public defpackage.zq h;
    public final defpackage.mku i;

    public cgp(defpackage.cgu cguVar, defpackage.mku mkuVar, android.view.View view, defpackage.dep depVar, java.lang.String str) {
        this.g = cguVar;
        this.i = mkuVar;
        this.a = view;
        this.b = depVar;
        this.c = str;
        this.d = new android.graphics.Rect();
        a$.ExternalSyntheticApiModelOutline1.m(view, 1);
        java.lang.Object obj = new defpackage.kwv(a$.ExternalSyntheticApiModelOutline1.m(view)).a;
        if (obj == null) {
            defpackage.csc.a("Required value was null.");
            throw new defpackage.afap();
        }
        this.e = a$.ExternalSyntheticApiModelOutline1.m(obj);
        this.h = new defpackage.zq(6);
    }

    @Override // defpackage.cig
    public final void dX(defpackage.cjc cjcVar, defpackage.cjc cjcVar2) {
        defpackage.cxl cxlVarR;
        defpackage.ddz ddzVarR;
        defpackage.cxl cxlVarR2;
        defpackage.ddz ddzVarR2;
        if (cjcVar != null && (cxlVarR2 = defpackage.cjv.r(cjcVar)) != null && (ddzVarR2 = cxlVarR2.r()) != null && defpackage.dai.ap(ddzVarR2)) {
            a$.ExternalSyntheticApiModelOutline1.m(this.g.a(), this.a, cxlVarR2.c);
        }
        if (cjcVar2 == null || (cxlVarR = defpackage.cjv.r(cjcVar2)) == null || (ddzVarR = cxlVarR.r()) == null || !defpackage.dai.ap(ddzVarR)) {
            return;
        }
        int i = cxlVarR.c;
        defpackage.dep depVar = this.b;
        defpackage.cxl cxlVar = (defpackage.cxl) depVar.a.a(i);
        if (cxlVar == null || !defpackage.dep.h(cxlVar)) {
            return;
        }
        defpackage.den denVar = depVar.b;
        int iA = depVar.a(cxlVar);
        long[] jArr = (long[]) denVar.b;
        long j = jArr[iA];
        long j2 = jArr[iA + 1];
        long j3 = j2 >> 32;
        int i2 = (int) j2;
        a$.ExternalSyntheticApiModelOutline1.m(this.g.a(), this.a, i, new android.graphics.Rect((int) (j >> 32), (int) j, (int) j3, i2));
    }

    public cgp() {
        throw null;
    }
}
