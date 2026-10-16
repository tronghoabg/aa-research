package defpackage;

/* loaded from: classes.dex */
public final class ctm extends cun {
    private final cxk a;

    public ctm(cxk cxkVar) {
        this.a = cxkVar;
    }

    @Override // defpackage.cun, defpackage.dlg
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.cun, defpackage.dlm
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.cun
    public final int n() {
        return this.a.x();
    }

    @Override // defpackage.cun
    public final dlr o() {
        return this.a.p();
    }

    @Override // defpackage.cun
    public final float p(cuu cuuVar) {
        int iCP;
        afeg afegVar = cuuVar.a;
        if (afegVar != null) {
            return ((Number) afegVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
        }
        cxk cxkVar = this.a;
        if (cxkVar.m) {
            return Float.NaN;
        }
        affv affvVar = new affv();
        affvVar.a = cxkVar;
        while (true) {
            cyt cytVar = ((cxk) affvVar.a).o;
            float f = (cytVar == null || (iCP = woy.cP(cytVar.b, cuuVar)) < 0) ? Float.NaN : cytVar.c[iCP];
            if (!Float.isNaN(f)) {
                ((cxk) affvVar.a).P(cxkVar.L(), cuuVar);
                return cuuVar.a(f, ((cxk) affvVar.a).J(), cxkVar.J());
            }
            cxk cxkVar2 = (cxk) affvVar.a;
            afeg afegVar2 = cxkVar2.j;
            cxk cxkVarO = cxkVar2.O();
            if (cxkVarO == null) {
                ((cxk) affvVar.a).P(cxkVar.L(), cuuVar);
                return Float.NaN;
            }
            affvVar.a = cxkVarO;
        }
    }
}
