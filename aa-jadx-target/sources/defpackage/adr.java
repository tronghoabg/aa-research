package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adr implements defpackage.aff {
    private final defpackage.ada a;

    public adr(defpackage.dlo dloVar) {
        this.a = new defpackage.ada(defpackage.ads.a, dloVar);
    }

    @Override // defpackage.aff
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.aff
    public final float b(float f, float f2) {
        defpackage.ada adaVar = this.a;
        double dA = adaVar.a(f2);
        double d = defpackage.adb.a;
        return f + (((float) (((double) (adaVar.a * adaVar.b)) * java.lang.Math.exp((d / ((-1.0d) + d)) * dA))) * java.lang.Math.signum(f2));
    }

    @Override // defpackage.aff
    public final float c(long j, float f, float f2) {
        defpackage.acz aczVarB = this.a.b(f2);
        long j2 = aczVarB.c;
        float f3 = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
        float fSignum = aczVarB.b * java.lang.Math.signum(aczVarB.a);
        int i = defpackage.abi.a;
        return f + (fSignum * defpackage.abi.a(f3).a);
    }

    @Override // defpackage.aff
    public final long d(float f) {
        return ((long) (java.lang.Math.exp(this.a.a(f) / (((double) defpackage.adb.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.aff
    public final float e(long j, float f) {
        defpackage.acz aczVarB = this.a.b(f);
        long j2 = aczVarB.c;
        float f2 = j2;
        float f3 = j2 > 0 ? (j / 1000000) / f2 : 1.0f;
        int i = defpackage.abi.a;
        return (((defpackage.abi.a(f3).b * java.lang.Math.signum(aczVarB.a)) * aczVarB.b) / f2) * 1000.0f;
    }
}
