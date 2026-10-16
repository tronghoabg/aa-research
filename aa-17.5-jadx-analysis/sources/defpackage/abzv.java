package defpackage;

/* loaded from: classes.dex */
public final class abzv {
    public final double a;
    public final double b;
    public final int c;
    private final double d;

    public abzv(int i) {
        this.c = i;
        int i2 = abzu.b;
        abzx abzxVar = abzx.a;
        double[][] dArr = acaf.a;
        double dV = a.v((i >> 16) & 255);
        double dV2 = a.v((i >> 8) & 255);
        double dV3 = a.v(i & 255);
        double[][] dArr2 = abzu.a;
        double[] dArr3 = dArr2[0];
        double d = (0.41233895d * dV) + (0.35762064d * dV2) + (0.18051042d * dV3);
        double d2 = dArr3[0] * d;
        double d3 = (0.2126d * dV) + (0.7152d * dV2) + (0.0722d * dV3);
        double d4 = dArr3[1] * d3;
        double d5 = (dV * 0.01932141d) + (dV2 * 0.11916382d) + (dV3 * 0.95034478d);
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        double d10 = d * dArr5[0];
        double d11 = d3 * dArr5[1];
        double d12 = d5 * dArr5[2];
        double[] dArr6 = abzxVar.g;
        double d13 = dArr6[0] * (d2 + d4 + d6);
        double d14 = dArr6[1] * (d7 + d8 + d9);
        double d15 = dArr6[2] * (d10 + d11 + d12);
        double dPow = Math.pow((abzxVar.h * Math.abs(d13)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((abzxVar.h * Math.abs(d14)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((abzxVar.h * Math.abs(d15)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d16 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d17 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double degrees = Math.toDegrees(Math.atan2(d17, d16)) % 360.0d;
        degrees = degrees < 0.0d ? degrees + 360.0d : degrees;
        double d18 = dSignum2 * 20.0d;
        double radians = Math.toRadians(degrees);
        double d19 = (((((40.0d * dSignum) + d18) + dSignum3) / 20.0d) * abzxVar.c) / abzxVar.b;
        double d20 = abzxVar.e;
        double dPow4 = Math.pow(d19, abzxVar.j * 0.69d) * 100.0d;
        double d21 = abzxVar.e;
        double d22 = dPow4 / 100.0d;
        Math.sqrt(d22);
        double d23 = abzxVar.b;
        double d24 = abzxVar.i;
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, abzxVar.f), 0.73d) * Math.pow((((((Math.cos(Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * abzxVar.d) * Math.hypot(d16, d17)) / (((((dSignum * 20.0d) + d18) + (21.0d * dSignum3)) / 20.0d) + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d22) * dPow5;
        double d25 = abzxVar.i * dSqrt;
        double d26 = abzxVar.e;
        Math.sqrt((dPow5 * 0.69d) / (abzxVar.b + 4.0d));
        Math.log1p(d25 * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        this.a = degrees;
        this.b = dSqrt;
        this.d = acaf.a(i);
    }

    public final String toString() {
        return "HCT(" + ((int) Math.round(this.a)) + ", " + ((int) Math.round(this.b)) + ", " + ((int) Math.round(this.d)) + ")";
    }
}
