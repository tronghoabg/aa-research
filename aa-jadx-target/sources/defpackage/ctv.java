package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctv extends defpackage.cuw {
    private final defpackage.cxu a;

    public ctv(defpackage.cxu cxuVar) {
        this.a = cxuVar;
    }

    @Override // defpackage.cuw, defpackage.dlo
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.cuw, defpackage.dlu
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.cuw
    public final int n() {
        return this.a.x();
    }

    @Override // defpackage.cuw
    public final defpackage.dlz o() {
        return this.a.p();
    }

    @Override // defpackage.cuw
    public final float p(defpackage.cvd cvdVar) {
        int iBJ;
        defpackage.affg affgVar = cvdVar.a;
        if (affgVar != null) {
            return ((java.lang.Number) affgVar.invoke(this, java.lang.Float.valueOf(Float.NaN))).floatValue();
        }
        defpackage.cxu cxuVar = this.a;
        if (cxuVar.m) {
            return Float.NaN;
        }
        defpackage.afgv afgvVar = new defpackage.afgv();
        afgvVar.a = cxuVar;
        while (true) {
            defpackage.czb czbVar = ((defpackage.cxu) afgvVar.a).o;
            float f = (czbVar == null || (iBJ = defpackage.afga.bJ(czbVar.b, cvdVar)) < 0) ? Float.NaN : czbVar.c[iBJ];
            if (!java.lang.Float.isNaN(f)) {
                ((defpackage.cxu) afgvVar.a).P(cxuVar.L(), cvdVar);
                return cvdVar.a(f, ((defpackage.cxu) afgvVar.a).J(), cxuVar.J());
            }
            defpackage.cxu cxuVar2 = (defpackage.cxu) afgvVar.a;
            defpackage.affg affgVar2 = cxuVar2.j;
            defpackage.cxu cxuVarO = cxuVar2.O();
            if (cxuVarO == null) {
                ((defpackage.cxu) afgvVar.a).P(cxuVar.L(), cvdVar);
                return Float.NaN;
            }
            afgvVar.a = cxuVarO;
        }
    }
}
