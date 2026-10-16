package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class amz {
    final /* synthetic */ defpackage.ana a;
    private java.lang.Object b;
    private java.lang.Object c;
    private float d = Float.NaN;

    public amz(defpackage.ana anaVar) {
        this.a = anaVar;
    }

    public final void a(float f, float f2) {
        defpackage.ana anaVar = this.a;
        float fB = anaVar.b();
        anaVar.e.h(f);
        anaVar.f.h(f2);
        if (java.lang.Float.isNaN(fB)) {
            return;
        }
        boolean z = f >= fB;
        if (anaVar.b() == anaVar.n().a(anaVar.g())) {
            java.lang.Object objC = anaVar.n().c(anaVar.b() + (f >= fB ? 1.0f : -1.0f), z);
            if (objC == null) {
                objC = anaVar.g();
            }
            if (z) {
                this.b = anaVar.g();
                this.c = objC;
            } else {
                this.b = objC;
                this.c = anaVar.g();
            }
        } else {
            java.lang.Object objC2 = anaVar.n().c(anaVar.b(), false);
            if (objC2 == null) {
                objC2 = anaVar.g();
            }
            java.lang.Object objC3 = anaVar.n().c(anaVar.b(), true);
            if (objC3 == null) {
                objC3 = anaVar.g();
            }
            this.b = objC2;
            this.c = objC3;
        }
        defpackage.ank ankVarN = anaVar.n();
        java.lang.Object obj = this.b;
        obj.getClass();
        float fA = ankVarN.a(obj);
        defpackage.ank ankVarN2 = anaVar.n();
        java.lang.Object obj2 = this.c;
        obj2.getClass();
        this.d = java.lang.Math.abs(fA - ankVarN2.a(obj2));
        if (java.lang.Math.abs(anaVar.b() - anaVar.n().a(anaVar.g())) >= this.d / 2.0f) {
            java.lang.Object objG = z ? this.c : this.b;
            if (objG == null) {
                objG = anaVar.g();
            }
            java.lang.Boolean.TRUE.booleanValue();
            anaVar.k(objG);
        }
    }
}
