package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acba {
    public static final defpackage.acba a;
    public final double b;
    public final double c;
    public final double d;
    public final double e = 0.69d;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    static {
        double[] dArr = defpackage.acbh.c;
        double[][] dArr2 = defpackage.acax.a;
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        double d10 = d * dArr5[0];
        double d11 = d3 * dArr5[1];
        double d12 = d5 * dArr5[2];
        double dT = ((defpackage.a.t(0.5689655172413793d) * 100.0d) * 63.66197723675813d) / 100.0d;
        double dExp = 1.0d - (java.lang.Math.exp(((-dT) - 42.0d) / 92.0d) * 0.2777777777777778d);
        if (dExp < 0.0d) {
            dExp = 0.0d;
        } else if (dExp > 1.0d) {
            dExp = 1.0d;
        }
        double d13 = d10 + d11 + d12;
        double d14 = d7 + d8 + d9;
        double d15 = d2 + d4 + d6;
        double[] dArr6 = {(((100.0d / d15) * dExp) + 1.0d) - dExp, (((100.0d / d14) * dExp) + 1.0d) - dExp, (((100.0d / d13) * dExp) + 1.0d) - dExp};
        double d16 = 5.0d * dT;
        double d17 = 1.0d / (d16 + 1.0d);
        double d18 = d17 * d17 * d17 * d17;
        double d19 = 1.0d - d18;
        double d20 = d18 * dT;
        double dCbrt = 0.1d * d19 * d19 * java.lang.Math.cbrt(d16);
        double dT2 = (defpackage.a.t(0.5689655172413793d) * 100.0d) / dArr[1];
        double dSqrt = java.lang.Math.sqrt(dT2) + 1.48d;
        double dPow = 0.725d / java.lang.Math.pow(dT2, 0.2d);
        double d21 = d20 + dCbrt;
        double dPow2 = java.lang.Math.pow(((dArr6[0] * d21) * d15) / 100.0d, 0.42d);
        double dPow3 = java.lang.Math.pow(((dArr6[1] * d21) * d14) / 100.0d, 0.42d);
        double dPow4 = java.lang.Math.pow(((dArr6[2] * d21) * d13) / 100.0d, 0.42d);
        double[] dArr7 = {dPow2, dPow3, dPow4};
        double d22 = dArr7[0];
        double d23 = (d22 * 400.0d) / (d22 + 27.13d);
        double d24 = dArr7[1];
        double d25 = (400.0d * dPow4) / (dPow4 + 27.13d);
        double[] dArr8 = {d23, (d24 * 400.0d) / (d24 + 27.13d), d25};
        double d26 = dArr8[0];
        a = new defpackage.acba(dT2, (d26 + d26 + dArr8[1] + (d25 * 0.05d)) * dPow, dPow, dPow, dArr6, d21, java.lang.Math.pow(d21, 0.25d), dSqrt);
    }

    private acba(double d, double d2, double d3, double d4, double[] dArr, double d5, double d6, double d7) {
        this.f = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.g = dArr;
        this.h = d5;
        this.i = d6;
        this.j = d7;
    }
}
