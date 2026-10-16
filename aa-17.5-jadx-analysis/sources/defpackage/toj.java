package defpackage;

/* loaded from: classes3.dex */
public final class toj {
    public double a = Double.POSITIVE_INFINITY;
    public double b = Double.NEGATIVE_INFINITY;
    public double c = Double.NaN;
    public double d = Double.NaN;

    public final boolean a() {
        return Double.isNaN(this.c);
    }

    public final void b(toi toiVar) {
        double d = this.a;
        double d2 = toiVar.a;
        this.a = Math.min(d, d2);
        this.b = Math.max(this.b, d2);
        double d3 = toiVar.b;
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
        int i = tog.a;
        if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - this.d) + 360.0d) % 360.0d) {
            this.c = d3;
        } else {
            this.d = d3;
        }
    }
}
