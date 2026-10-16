package defpackage;

/* loaded from: classes3.dex */
public final class wnm {
    public static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    static final double[] b = {95.047d, 100.0d, 108.883d};

    public static int a(double[] dArr) {
        return a.aS(dArr[2]) | (a.aS(dArr[0]) << 16) | (-16777216) | (a.aS(dArr[1]) << 8);
    }
}
