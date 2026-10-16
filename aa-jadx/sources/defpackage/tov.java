package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tov {
    public static double a(double d, double d2, double d3, double d4, double d5) {
        double dMin = java.lang.Math.min(1.0d, java.lang.Math.max(0.0d, d));
        double d6 = 1.0d - dMin;
        double d7 = d5 - d4;
        return (d6 * d6 * 3.0d * (d3 - d2)) + (6.0d * d6 * dMin * (d4 - d3)) + (dMin * dMin * 3.0d * d7);
    }

    public static double b(double d, double d2, double d3, double d4, double d5) {
        if (d > 1.0d) {
            return d5 + (a(1.0d, d2, d3, d4, d5) * (d - 1.0d));
        }
        if (d < 0.0d) {
            return d2 + (a(0.0d, d2, d3, d4, d5) * d);
        }
        double d6 = 1.0d - d;
        double d7 = d6 * d6;
        double d8 = d * d;
        return (d7 * d6 * d2) + (d7 * 3.0d * d * d3) + (d6 * 3.0d * d8 * d4) + (d8 * d * d5);
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }
}
