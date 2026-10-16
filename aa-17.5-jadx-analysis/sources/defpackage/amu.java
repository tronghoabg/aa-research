package defpackage;

/* loaded from: classes.dex */
public final class amu {
    final /* synthetic */ amv a;
    private Object b;
    private Object c;
    private float d = Float.NaN;

    public amu(amv amvVar) {
        this.a = amvVar;
    }

    public final void a(float f, float f2) {
        amv amvVar = this.a;
        float fB = amvVar.b();
        amvVar.e.h(f);
        amvVar.f.h(f2);
        if (Float.isNaN(fB)) {
            return;
        }
        boolean z = f >= fB;
        if (amvVar.b() == amvVar.n().a(amvVar.g())) {
            Object objC = amvVar.n().c(amvVar.b() + (f >= fB ? 1.0f : -1.0f), z);
            if (objC == null) {
                objC = amvVar.g();
            }
            if (z) {
                this.b = amvVar.g();
                this.c = objC;
            } else {
                this.b = objC;
                this.c = amvVar.g();
            }
        } else {
            Object objC2 = amvVar.n().c(amvVar.b(), false);
            if (objC2 == null) {
                objC2 = amvVar.g();
            }
            Object objC3 = amvVar.n().c(amvVar.b(), true);
            if (objC3 == null) {
                objC3 = amvVar.g();
            }
            this.b = objC2;
            this.c = objC3;
        }
        anf anfVarN = amvVar.n();
        Object obj = this.b;
        obj.getClass();
        float fA = anfVarN.a(obj);
        anf anfVarN2 = amvVar.n();
        Object obj2 = this.c;
        obj2.getClass();
        this.d = Math.abs(fA - anfVarN2.a(obj2));
        if (Math.abs(amvVar.b() - amvVar.n().a(amvVar.g())) >= this.d / 2.0f) {
            Object objG = z ? this.c : this.b;
            if (objG == null) {
                objG = amvVar.g();
            }
            Boolean bool = true;
            bool.getClass();
            amvVar.k(objG);
        }
    }
}
