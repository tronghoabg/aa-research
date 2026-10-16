package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cng extends defpackage.cne {
    private final defpackage.cld a;
    private final defpackage.cnh b;
    private float c = 1.0f;
    private defpackage.cke d;
    private final defpackage.cok e;

    public cng(defpackage.cld cldVar, defpackage.cnh cnhVar, defpackage.cok cokVar) {
        this.a = cldVar;
        this.b = cnhVar;
        this.e = cokVar;
    }

    @Override // defpackage.cne
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.cne
    protected final void b(defpackage.cml cmlVar) {
        defpackage.cni cniVar;
        defpackage.cke ckeVar;
        defpackage.cni cniVar2;
        defpackage.cjr cjrVar;
        defpackage.cni cniVar3;
        defpackage.cnh cnhVar = this.b;
        defpackage.cld cldVar = this.a;
        long jO = cmlVar.o();
        defpackage.dlz dlzVarP = cmlVar.p();
        defpackage.cok cokVar = this.e;
        synchronized (cokVar) {
            java.lang.Object obj = cokVar.b;
            if (obj == null) {
                defpackage.cnf cnfVar = new defpackage.cnf(defpackage.cky.a, 0L, defpackage.dlz.a, 1.0f, null);
                cokVar.b = cnfVar;
                obj = cnfVar;
            }
            ((defpackage.cnf) obj).a = cldVar;
            ((defpackage.cnf) obj).b = jO;
            ((defpackage.cnf) obj).c = dlzVarP;
            ((defpackage.cnf) obj).d = cmlVar.a();
            float f = cnhVar.a;
            float f2 = cnhVar.b;
            long j = cnhVar.e;
            float f3 = cnhVar.f;
            int i = cnhVar.d;
            ((defpackage.cnf) obj).e = new defpackage.cnh(f, f2, 0L, j, f3);
            cniVar = (defpackage.cni) cokVar.c().a(obj);
            if (cniVar == null) {
                cniVar = new defpackage.cni(cnhVar, cldVar.a(jO, dlzVarP, cmlVar));
                cokVar.c().m(new defpackage.cnf(((defpackage.cnf) obj).a, ((defpackage.cnf) obj).b, ((defpackage.cnf) obj).c, ((defpackage.cnf) obj).d, ((defpackage.cnf) obj).e), cniVar);
            }
        }
        long j2 = cnhVar.c;
        float fDI = cmlVar.dI(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + 0.0f);
        float f4 = -fDI;
        float fDI2 = cmlVar.dI(java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + 0.0f);
        float f5 = -fDI2;
        cmlVar.r().c.l(fDI, fDI2);
        try {
            defpackage.cke cjxVar = this.d;
            long jO2 = cmlVar.o();
            defpackage.cnh cnhVar2 = cniVar.i;
            long j3 = cnhVar2.e;
            float fD = defpackage.afqt.d(this.c * cnhVar2.f, 0.0f, 1.0f);
            int i2 = cnhVar2.d;
            defpackage.cku ckuVar = cniVar.a;
            long j4 = 0;
            if (ckuVar instanceof defpackage.ckr) {
                cniVar.h = ((defpackage.ckr) ckuVar).a;
                cniVar.d = 0L;
            } else {
                if (ckuVar instanceof defpackage.ckt) {
                    defpackage.ckt cktVar = (defpackage.ckt) ckuVar;
                    defpackage.cjk cjkVar = cktVar.a;
                    if (defpackage.bzo.B(cjkVar)) {
                        cniVar.h = null;
                        j4 = cjkVar.e;
                    } else {
                        cniVar.h = cktVar.b;
                    }
                } else {
                    if (!(ckuVar instanceof defpackage.cks)) {
                        throw new defpackage.afas();
                    }
                    cniVar.h = null;
                }
                cniVar.d = j4;
            }
            if (cjxVar != null) {
                ckeVar = cjxVar;
            } else if (j3 != 16) {
                cjxVar = cniVar.b;
                if (cjxVar == null || cniVar.c != j3) {
                    cjxVar = new defpackage.cjx(j3, 5);
                    cniVar.c = j3;
                    cniVar.b = cjxVar;
                }
                ckeVar = cjxVar;
            } else {
                ckeVar = null;
            }
            long j5 = cniVar.e;
            if (j5 != 9205357640488583168L && j5 == jO2 && cniVar.f == cmlVar.p() && cniVar.g == cmlVar.a()) {
                cniVar2 = cniVar;
            } else {
                long j6 = cniVar.d;
                defpackage.cju cjuVar = cniVar.h;
                float fDI3 = cmlVar.dI(cnhVar2.a);
                float fDI4 = cmlVar.dI(cnhVar2.b);
                defpackage.cni cniVar4 = cniVar;
                long j7 = jO2 & 4294967295L;
                long j8 = jO2 >> 32;
                float f6 = fDI4 + fDI4;
                float f7 = fDI3 + fDI3 + f6;
                if (cjuVar != null) {
                    defpackage.cjr cjrVarF = defpackage.cjv.f((int) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) j8) + f7), (int) java.lang.Math.ceil(java.lang.Float.intBitsToFloat((int) j7) + f7), 1, 24);
                    defpackage.ckc ckcVarB = defpackage.cjn.b(cjrVarF);
                    if (fDI4 > 0.0f) {
                        float f8 = fDI3 + fDI4;
                        ckcVarB.i(f8, f8);
                        cniVar3 = cniVar4;
                        defpackage.cjs cjsVar = cniVar3.j;
                        defpackage.dai.R(cjsVar, fDI3 > 0.0f ? new android.graphics.BlurMaskFilter(fDI3, android.graphics.BlurMaskFilter.Blur.NORMAL) : null, 0, 11);
                        ckcVarB.p(cjuVar, cjsVar);
                        defpackage.dai.R(cjsVar, fDI3 > 0.0f ? new android.graphics.BlurMaskFilter(fDI3, android.graphics.BlurMaskFilter.Blur.NORMAL) : null, 1, 3);
                        cjsVar.q(f6);
                        ckcVarB.p(cjuVar, cjsVar);
                    } else {
                        cniVar3 = cniVar4;
                        defpackage.cjs cjsVar2 = cniVar3.j;
                        defpackage.dai.R(cjsVar2, fDI3 > 0.0f ? new android.graphics.BlurMaskFilter(fDI3, android.graphics.BlurMaskFilter.Blur.NORMAL) : null, 0, 11);
                        ckcVarB.i(fDI3, fDI3);
                        ckcVarB.p(cjuVar, cjsVar2);
                    }
                    cniVar2 = cniVar3;
                    cjrVar = cjrVarF;
                } else {
                    cniVar2 = cniVar4;
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) j8) + f7;
                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) j7) + f7;
                    defpackage.cjr cjrVarF2 = defpackage.cjv.f((int) java.lang.Math.ceil(fIntBitsToFloat), (int) java.lang.Math.ceil(fIntBitsToFloat2), 1, 24);
                    defpackage.ckc ckcVarB2 = defpackage.cjn.b(cjrVarF2);
                    float f9 = fIntBitsToFloat - fDI3;
                    float f10 = fIntBitsToFloat2 - fDI3;
                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j6 >> 32));
                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L));
                    defpackage.cjs cjsVar3 = cniVar2.j;
                    defpackage.dai.R(cjsVar3, fDI3 > 0.0f ? new android.graphics.BlurMaskFilter(fDI3, android.graphics.BlurMaskFilter.Blur.NORMAL) : null, 0, 11);
                    ckcVarB2.m(fDI3, fDI3, f9, f10, fIntBitsToFloat3, fIntBitsToFloat4, cjsVar3);
                    cjrVar = cjrVarF2;
                }
                cniVar2.k = cjrVar;
                cniVar2.e = jO2;
                cniVar2.f = cmlVar.p();
                cniVar2.g = cmlVar.a();
            }
            defpackage.cjr cjrVar2 = cniVar2.k;
            if (cjrVar2 != null) {
                float f11 = -(cmlVar.dI(cnhVar2.a) + cmlVar.dI(cnhVar2.b));
                defpackage.dai.W(cmlVar, cjrVar2, (((long) java.lang.Float.floatToRawIntBits(f11)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f11)) & 4294967295L), fD, ckeVar, 3, 8);
            }
            cmlVar.r().c.l(f4, f5);
        } catch (java.lang.Throwable th) {
            cmlVar.r().c.l(f4, f5);
            throw th;
        }
    }

    @Override // defpackage.cne
    protected final boolean c(float f) {
        this.c = f;
        return true;
    }

    @Override // defpackage.cne
    protected final boolean d(defpackage.cke ckeVar) {
        this.d = ckeVar;
        return true;
    }

    @Override // defpackage.cne
    protected final void f(defpackage.dlz dlzVar) {
    }
}
