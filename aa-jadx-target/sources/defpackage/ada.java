package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ada {
    public final float a;
    public final float b;
    private final defpackage.dlo c;

    public ada(float f, defpackage.dlo dloVar) {
        this.a = f;
        this.c = dloVar;
        float fA = dloVar.a();
        float f2 = defpackage.adb.a;
        this.b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = defpackage.abi.a;
        return java.lang.Math.log(((double) (java.lang.Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }

    public final defpackage.acz b(float f) {
        double dA = a(f);
        double d = defpackage.adb.a;
        double d2 = (-1.0d) + d;
        return new defpackage.acz(f, (float) (((double) (this.a * this.b)) * java.lang.Math.exp((d / d2) * dA)), (long) (java.lang.Math.exp(dA / d2) * 1000.0d));
    }
}
