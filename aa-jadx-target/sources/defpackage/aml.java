package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aml implements defpackage.arw {
    final /* synthetic */ defpackage.ana a;
    final /* synthetic */ defpackage.affc b;
    final /* synthetic */ defpackage.afer c;

    public aml(defpackage.ana anaVar, defpackage.affc affcVar, defpackage.afer aferVar) {
        this.a = anaVar;
        this.b = affcVar;
        this.c = aferVar;
    }

    @Override // defpackage.arw
    public final float a(float f, float f2) {
        return 0.0f;
    }

    @Override // defpackage.arw
    public final float b(float f) {
        java.lang.Object objC;
        defpackage.ana anaVar = this.a;
        float fD = anaVar.d();
        defpackage.ank ankVarN = anaVar.n();
        if (java.lang.Float.isNaN(fD)) {
            throw new java.lang.IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = java.lang.Math.abs(f) > 0.0f;
        boolean z2 = z && f > 0.0f;
        if (z) {
            if (java.lang.Math.abs(f) >= java.lang.Math.abs(((java.lang.Number) this.c.invoke()).floatValue())) {
                objC = ankVarN.c(fD, z2);
                objC.getClass();
            } else {
                defpackage.affc affcVar = this.b;
                java.lang.Object objC2 = ankVarN.c(fD, false);
                objC2.getClass();
                float fA = ankVarN.a(objC2);
                java.lang.Object objC3 = ankVarN.c(fD, true);
                objC3.getClass();
                float fA2 = ankVarN.a(objC3);
                float fAbs = java.lang.Math.abs(((java.lang.Number) affcVar.invoke(java.lang.Float.valueOf(java.lang.Math.abs(fA - fA2)))).floatValue());
                if (true != z2) {
                    fA = fA2;
                }
                objC = (java.lang.Math.abs(fA - fD) < fAbs ? !z2 : z2) ? objC3 : objC2;
            }
        } else {
            objC = ankVarN.b(fD);
            objC.getClass();
        }
        defpackage.affc affcVar2 = anaVar.a;
        java.lang.Boolean.TRUE.booleanValue();
        return anaVar.n().a(objC) - fD;
    }
}
