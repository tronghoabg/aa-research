package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acbh {
    public static final double[][] a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final double[] c = {95.047d, 100.0d, 108.883d};

    public static double a(int i) {
        return (defpackage.a.s(defpackage.a.r(new double[]{defpackage.a.u((i >> 16) & 255), defpackage.a.u((i >> 8) & 255), defpackage.a.u(i & 255)}, a)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static int b(double[] dArr) {
        return defpackage.a.aR(dArr[2]) | (defpackage.a.aR(dArr[0]) << 16) | (-16777216) | (defpackage.a.aR(dArr[1]) << 8);
    }
}
