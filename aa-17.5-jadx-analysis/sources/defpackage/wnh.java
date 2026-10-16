package defpackage;

/* loaded from: classes.dex */
public final class wnh {
    public final double a;
    public final double b;
    public final int c;

    public wnh(int i) {
        this.c = i;
        int i2 = wnf.b;
        wnk wnkVar = wnk.a;
        double[][] dArr = wng.a;
        int i3 = (i >> 16) & 255;
        double dV = a.v(i3);
        int i4 = (i >> 8) & 255;
        double dV2 = a.v(i4);
        int i5 = i & 255;
        double dV3 = a.v(i5);
        double[][] dArr2 = wnf.a;
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
        double[] dArr6 = wnkVar.g;
        double d13 = dArr6[0] * (d2 + d4 + d6);
        double d14 = dArr6[1] * (d7 + d8 + d9);
        double d15 = dArr6[2] * (d10 + d11 + d12);
        double dPow = Math.pow((wnkVar.h * Math.abs(d13)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((wnkVar.h * Math.abs(d14)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((wnkVar.h * Math.abs(d15)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d16 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d17 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double degrees = Math.toDegrees(Math.atan2(d17, d16));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d18 = dSignum2 * 20.0d;
        double radians = Math.toRadians(degrees);
        double d19 = (((((40.0d * dSignum) + d18) + dSignum3) / 20.0d) * wnkVar.c) / wnkVar.b;
        double d20 = wnkVar.e;
        double dPow4 = Math.pow(d19, wnkVar.j * 0.69d) * 100.0d;
        double d21 = wnkVar.e;
        double d22 = dPow4 / 100.0d;
        Math.sqrt(d22);
        double d23 = wnkVar.b;
        double d24 = wnkVar.i;
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, wnkVar.f), 0.73d) * Math.pow((((((Math.cos(Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * wnkVar.d) * Math.hypot(d16, d17)) / (((((dSignum * 20.0d) + d18) + (21.0d * dSignum3)) / 20.0d) + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d22) * dPow5;
        double d25 = wnkVar.i * dSqrt;
        double d26 = wnkVar.e;
        Math.sqrt((dPow5 * 0.69d) / (wnkVar.b + 4.0d));
        Math.log1p(d25 * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        this.a = degrees;
        this.b = dSqrt;
        a.t(a.s(new double[]{a.v(i3), a.v(i4), a.v(i5)}, wng.a)[1] / 100.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ad, code lost:
    
        if (r9[0] > 100.01d) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b3, code lost:
    
        if (r9[1] > 100.01d) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b9, code lost:
    
        if (r9[2] <= 100.01d) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01bc, code lost:
    
        r2 = defpackage.wng.a(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wnh a(double r39, double r41, double r43) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnh.a(double, double, double):wnh");
    }
}
