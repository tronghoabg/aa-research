package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpg implements java.io.Serializable {
    static final long serialVersionUID = 2026947877447454771L;
    public final double a;
    public final double b;

    public tpg(double d, double d2) {
        this.b = (d2 < -180.0d || d2 >= 180.0d) ? ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d2;
        this.a = java.lang.Math.max(-90.0d, java.lang.Math.min(90.0d, d));
    }

    private static boolean a(double d, double d2) {
        return (java.lang.Double.doubleToLongBits(d) & (-2)) == (java.lang.Double.doubleToLongBits(d2) & (-2));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tpg)) {
            return false;
        }
        defpackage.tpg tpgVar = (defpackage.tpg) obj;
        return a(this.a, tpgVar.a) && a(this.b, tpgVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Long.valueOf(java.lang.Double.doubleToLongBits(this.a)), java.lang.Long.valueOf(java.lang.Double.doubleToLongBits(this.b)));
    }

    public final java.lang.String toString() {
        return "lat/lng: (" + this.a + "," + this.b + ")";
    }

    public tpg() {
        throw null;
    }
}
