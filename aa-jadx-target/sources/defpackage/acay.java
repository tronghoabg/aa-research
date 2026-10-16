package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acay {
    public final double a;
    public final double b;
    public final int c;
    private final double d;

    public acay(int i) {
        this.c = i;
        int i2 = defpackage.acax.b;
        defpackage.acba acbaVar = defpackage.acba.a;
        double[][] dArr = defpackage.acbh.a;
        double dU = defpackage.a.u((i >> 16) & 255);
        double dU2 = defpackage.a.u((i >> 8) & 255);
        double dU3 = defpackage.a.u(i & 255);
        double[][] dArr2 = defpackage.acax.a;
        double[] dArr3 = dArr2[0];
        double d = (0.41233895d * dU) + (0.35762064d * dU2) + (0.18051042d * dU3);
        double d2 = dArr3[0] * d;
        double d3 = (0.2126d * dU) + (0.7152d * dU2) + (0.0722d * dU3);
        double d4 = dArr3[1] * d3;
        double d5 = (dU * 0.01932141d) + (dU2 * 0.11916382d) + (dU3 * 0.95034478d);
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        double d10 = d * dArr5[0];
        double d11 = d3 * dArr5[1];
        double d12 = d5 * dArr5[2];
        double[] dArr6 = acbaVar.g;
        double d13 = dArr6[0] * (d2 + d4 + d6);
        double d14 = dArr6[1] * (d7 + d8 + d9);
        double d15 = dArr6[2] * (d10 + d11 + d12);
        double dPow = java.lang.Math.pow((acbaVar.h * java.lang.Math.abs(d13)) / 100.0d, 0.42d);
        double dPow2 = java.lang.Math.pow((acbaVar.h * java.lang.Math.abs(d14)) / 100.0d, 0.42d);
        double dPow3 = java.lang.Math.pow((acbaVar.h * java.lang.Math.abs(d15)) / 100.0d, 0.42d);
        double dSignum = ((java.lang.Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((java.lang.Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((java.lang.Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d16 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d17 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double degrees = java.lang.Math.toDegrees(java.lang.Math.atan2(d17, d16)) % 360.0d;
        degrees = degrees < 0.0d ? degrees + 360.0d : degrees;
        double d18 = dSignum2 * 20.0d;
        double d19 = (((((40.0d * dSignum) + d18) + dSignum3) / 20.0d) * acbaVar.c) / acbaVar.b;
        double d20 = acbaVar.e;
        double dPow4 = java.lang.Math.pow(d19, acbaVar.j * 0.69d) * 100.0d;
        double d21 = acbaVar.e;
        double d22 = dPow4 / 100.0d;
        double d23 = acbaVar.b;
        double d24 = acbaVar.i;
        double dPow5 = java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, acbaVar.f), 0.73d) * java.lang.Math.pow((((((java.lang.Math.cos(java.lang.Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * acbaVar.d) * java.lang.Math.hypot(d16, d17)) / (((((dSignum * 20.0d) + d18) + (21.0d * dSignum3)) / 20.0d) + 0.305d), 0.9d) * java.lang.Math.sqrt(d22);
        double d25 = acbaVar.i;
        double d26 = acbaVar.e;
        double d27 = acbaVar.b;
        this.a = degrees;
        this.b = dPow5;
        this.d = defpackage.acbh.a(i);
    }

    public final java.lang.String toString() {
        return "HCT(" + ((int) java.lang.Math.round(this.a)) + ", " + ((int) java.lang.Math.round(this.b)) + ", " + ((int) java.lang.Math.round(this.d)) + ")";
    }
}
