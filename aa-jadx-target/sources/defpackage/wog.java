package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wog {
    final java.util.Map a = new java.util.HashMap();
    public final double b;
    public final double c;

    private wog(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    public static defpackage.wog b(double d, double d2) {
        double d3;
        double d4;
        d = d;
        java.util.HashMap map = new java.util.HashMap();
        int i = 100;
        int i2 = 0;
        while (i2 < i) {
            int i3 = (i2 + i) / 2;
            double dC = defpackage.wpu.c(i3, d, map);
            int i4 = i3 + 1;
            double dC2 = defpackage.wpu.c(i4, d, map);
            if (defpackage.wpu.c(i3, d, map) >= d2 - 0.01d) {
                if (java.lang.Math.abs(i2 - 50) < java.lang.Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        d4 = d2;
                        defpackage.woe.a(d, d4, i2);
                        d3 = d;
                        return new defpackage.wog(d3, d4);
                    }
                    i2 = i3;
                }
            } else if (dC < dC2) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        d3 = d;
        d4 = d2;
        defpackage.woe.a(d3, d4, i2);
        return new defpackage.wog(d3, d4);
    }

    public static defpackage.wog c(int i) {
        defpackage.woe woeVar = new defpackage.woe(i);
        return new defpackage.wog(woeVar.a, woeVar.b);
    }

    public final int a(int i) {
        java.util.Map map = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer numValueOf2 = (java.lang.Integer) map.get(numValueOf);
        if (numValueOf2 == null) {
            numValueOf2 = java.lang.Integer.valueOf(defpackage.woe.a(this.b, this.c, i).c);
            map.put(numValueOf, numValueOf2);
        }
        return numValueOf2.intValue();
    }
}
