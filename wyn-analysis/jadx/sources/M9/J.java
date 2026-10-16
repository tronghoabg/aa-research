package m9;

import w9.AbstractC4397p;

/* loaded from: classes4.dex */
public final class J implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final double f40437a;

    /* renamed from: b, reason: collision with root package name */
    public final double f40438b;

    public J(double d3, double d5) {
        if (Double.isNaN(d3) || d3 < -90.0d || d3 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d5) || d5 < -180.0d || d5 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f40437a = d3;
        this.f40438b = d5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        J j8 = (J) obj;
        double d3 = j8.f40437a;
        B b5 = AbstractC4397p.f47455a;
        int iW = Fe.b.w(this.f40437a, d3);
        return iW == 0 ? Fe.b.w(this.f40438b, j8.f40438b) : iW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J)) {
            return false;
        }
        J j8 = (J) obj;
        return this.f40437a == j8.f40437a && this.f40438b == j8.f40438b;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f40437a);
        int i5 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f40438b);
        return (i5 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "GeoPoint { latitude=" + this.f40437a + ", longitude=" + this.f40438b + " }";
    }
}
