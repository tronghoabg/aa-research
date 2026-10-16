package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tph {
    public double a = Double.POSITIVE_INFINITY;
    public double b = Double.NEGATIVE_INFINITY;
    public double c = Double.NaN;
    public double d = Double.NaN;

    public final boolean a() {
        return java.lang.Double.isNaN(this.c);
    }

    public final void b(defpackage.tpg tpgVar) {
        double d = this.a;
        double d2 = tpgVar.a;
        this.a = java.lang.Math.min(d, d2);
        this.b = java.lang.Math.max(this.b, d2);
        double d3 = tpgVar.b;
        if (a()) {
            this.c = d3;
            this.d = d3;
            return;
        }
        double d4 = this.c;
        double d5 = this.d;
        if (d4 <= d5) {
            if (d4 <= d3 && d3 <= d5) {
                return;
            }
        } else if (d4 <= d3 || d3 <= d5) {
            return;
        }
        int i = defpackage.tpe.a;
        if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - this.d) + 360.0d) % 360.0d) {
            this.c = d3;
        } else {
            this.d = d3;
        }
    }
}
