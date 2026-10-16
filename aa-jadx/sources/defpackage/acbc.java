package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acbc {
    final java.util.Map a = new java.util.HashMap();
    public final double b;
    public final double c;

    public acbc(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    public static defpackage.acbc b(int i) {
        defpackage.acay acayVar = new defpackage.acay(i);
        return new defpackage.acbc(acayVar.a, acayVar.b);
    }

    public final int a(int i) {
        java.lang.Integer numValueOf;
        java.util.Map map = this.a;
        java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(i));
        if (num == null) {
            int i2 = 99;
            if (i == 99) {
                double d = this.b;
                if (d < 105.0d || d >= 125.0d) {
                    i = 99;
                    numValueOf = java.lang.Integer.valueOf(new defpackage.acay(defpackage.acaz.b(this.b, this.c, i)).c);
                    i2 = i;
                } else {
                    int iA = a(98);
                    int iA2 = a(100);
                    numValueOf = java.lang.Integer.valueOf((java.lang.Math.round(((iA & 255) + (iA2 & 255)) / 2.0f) & 255) | ((java.lang.Math.round((((iA >>> 16) & 255) + ((iA2 >>> 16) & 255)) / 2.0f) & 255) << 16) | (-16777216) | ((java.lang.Math.round((((iA >>> 8) & 255) + ((iA2 >>> 8) & 255)) / 2.0f) & 255) << 8));
                }
            } else {
                numValueOf = java.lang.Integer.valueOf(new defpackage.acay(defpackage.acaz.b(this.b, this.c, i)).c);
                i2 = i;
            }
            map.put(java.lang.Integer.valueOf(i2), numValueOf);
            num = numValueOf;
        }
        return num.intValue();
    }
}
