package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aqm implements defpackage.apw {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public aqm(defpackage.amv amvVar, defpackage.amz amzVar, int i) {
        this.c = i;
        this.b = amvVar;
        this.a = amzVar;
    }

    @Override // defpackage.apw
    public final float a(float f) {
        if (this.c != 0) {
            defpackage.amv amvVar = (defpackage.amv) this.b;
            float fC = amvVar.a.c(f);
            float fB = fC - amvVar.a.b();
            ((defpackage.amz) this.a).a(fC, 0.0f);
            return fB;
        }
        if (java.lang.Math.abs(f) != 0.0f && !((java.lang.Boolean) ((defpackage.aqp) this.a).e.invoke()).booleanValue()) {
            throw new defpackage.aos();
        }
        java.lang.Object obj = this.a;
        defpackage.aqp aqpVar = (defpackage.aqp) obj;
        return aqpVar.a(aqpVar.b(((defpackage.izq) this.b).o(aqpVar.d(aqpVar.f(f)), 2)));
    }

    public aqm(defpackage.aqp aqpVar, defpackage.izq izqVar, int i) {
        this.c = i;
        this.a = aqpVar;
        this.b = izqVar;
    }
}
