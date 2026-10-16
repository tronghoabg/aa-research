package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cme {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public cme(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (java.lang.Double.isNaN(d2) || java.lang.Double.isNaN(d3) || java.lang.Double.isNaN(d4) || java.lang.Double.isNaN(d5) || java.lang.Double.isNaN(d6) || java.lang.Double.isNaN(d7) || java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new java.lang.IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new java.lang.IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new java.lang.IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new java.lang.IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new java.lang.IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new java.lang.IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean a() {
        return this.a == -3.0d;
    }

    public final boolean b() {
        return this.a == -2.0d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cme)) {
            return false;
        }
        defpackage.cme cmeVar = (defpackage.cme) obj;
        return java.lang.Double.compare(this.a, cmeVar.a) == 0 && java.lang.Double.compare(this.b, cmeVar.b) == 0 && java.lang.Double.compare(this.c, cmeVar.c) == 0 && java.lang.Double.compare(this.d, cmeVar.d) == 0 && java.lang.Double.compare(this.e, cmeVar.e) == 0 && java.lang.Double.compare(this.f, cmeVar.f) == 0 && java.lang.Double.compare(this.g, cmeVar.g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.a);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.b);
        long j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = java.lang.Double.doubleToLongBits(this.c);
        long j3 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = java.lang.Double.doubleToLongBits(this.d);
        long j4 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = java.lang.Double.doubleToLongBits(this.e);
        long j5 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = java.lang.Double.doubleToLongBits(this.f);
        long j6 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = java.lang.Double.doubleToLongBits(this.g);
        return (((((((((((((int) j) * 31) + ((int) j2)) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
    }

    public final java.lang.String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ")";
    }
}
