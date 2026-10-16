package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bat implements defpackage.cqc {
    private final defpackage.bby a;
    private final defpackage.apn b;
    private final defpackage.dlz c;

    public bat(defpackage.bby bbyVar, defpackage.apn apnVar, defpackage.dlz dlzVar) {
        this.a = bbyVar;
        this.b = apnVar;
        this.c = dlzVar;
    }

    private final float e(long j) {
        return java.lang.Float.intBitsToFloat(this.b == defpackage.apn.b ? (int) (j >> 32) : (int) (j & 4294967295L));
    }

    @Override // defpackage.cqc
    public final long a(long j, long j2, int i) {
        if (i != 2) {
            return 0L;
        }
        if (java.lang.Float.intBitsToFloat((int) (this.b == defpackage.apn.b ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new java.util.concurrent.CancellationException("Scroll cancelled");
    }

    @Override // defpackage.cqc
    public final long b(long j, int i) {
        if (i != 1) {
            return 0L;
        }
        defpackage.bby bbyVar = this.a;
        if (java.lang.Math.abs(bbyVar.c()) <= 1.0E-6d || java.lang.Math.abs(e(j)) <= 0.0f) {
            return 0L;
        }
        defpackage.bbo bboVarW = bbyVar.w();
        float fC = bbyVar.c() * bbyVar.k();
        int i2 = bboVarW.b + bboVarW.c;
        float f = -java.lang.Math.signum(bbyVar.c());
        float fC2 = bbyVar.c();
        float fE = e(j);
        float f2 = (i2 * f) + fC;
        float f3 = fC2 > 0.0f ? fC : f2;
        if (fC2 > 0.0f) {
            fC = f2;
        }
        float fD = defpackage.afqt.d(fE, fC, f3);
        defpackage.apn apnVar = this.b;
        defpackage.apn apnVar2 = defpackage.apn.b;
        float fA = (apnVar == apnVar2 && this.c == defpackage.dlz.b) ? bbyVar.a(fD) : -bbyVar.a(-fD);
        float fIntBitsToFloat = apnVar == apnVar2 ? fA : java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (apnVar != defpackage.apn.a) {
            fA = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return defpackage.a.ag(fIntBitsToFloat, fA);
    }

    @Override // defpackage.cqc
    public final java.lang.Object c(long j, long j2, defpackage.afdk afdkVar) {
        return new defpackage.dmd(this.b == defpackage.apn.a ? defpackage.dmd.e(j2, 0.0f, 0.0f, 2) : defpackage.dmd.e(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.cqc
    public final /* synthetic */ java.lang.Object d(long j, defpackage.afdk afdkVar) {
        return new defpackage.dmd(0L);
    }
}
