package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dvk {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static double a(int i, int i2) {
        if (android.graphics.Color.alpha(i2) != 255) {
            throw new java.lang.IllegalArgumentException("background can not be translucent: #".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i2))));
        }
        if (android.graphics.Color.alpha(i) < 255) {
            i = d(i, i2);
        }
        double dB = b(i) + 0.05d;
        double dB2 = b(i2) + 0.05d;
        return java.lang.Math.max(dB, dB2) / java.lang.Math.min(dB, dB2);
    }

    public static double b(int i) {
        java.lang.ThreadLocal threadLocal = b;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = android.graphics.Color.red(i);
        int iGreen = android.graphics.Color.green(i);
        int iBlue = android.graphics.Color.blue(i);
        if (dArr.length != 3) {
            throw new java.lang.IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : java.lang.Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : java.lang.Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        double d4 = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
        return d4 / 100.0d;
    }

    public static int c(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return android.graphics.Color.rgb(g((int) java.lang.Math.round((d4 > 0.0031308d ? (java.lang.Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), g((int) java.lang.Math.round((d5 > 0.0031308d ? (java.lang.Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), g((int) java.lang.Math.round((d6 > 0.0031308d ? (java.lang.Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int d(int i, int i2) {
        int iAlpha = android.graphics.Color.alpha(i2);
        int iAlpha2 = android.graphics.Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha) * (255 - iAlpha2)) / 255);
        return android.graphics.Color.argb(i3, f(android.graphics.Color.red(i), iAlpha2, android.graphics.Color.red(i2), iAlpha, i3), f(android.graphics.Color.green(i), iAlpha2, android.graphics.Color.green(i2), iAlpha, i3), f(android.graphics.Color.blue(i), iAlpha2, android.graphics.Color.blue(i2), iAlpha, i3));
    }

    public static int e(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    private static int f(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static int g(int i) {
        if (i < 0) {
            return 0;
        }
        return java.lang.Math.min(i, 255);
    }
}
