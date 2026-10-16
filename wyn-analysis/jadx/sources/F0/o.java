package f0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final double f34793a;

    /* renamed from: b, reason: collision with root package name */
    public final double f34794b;

    /* renamed from: c, reason: collision with root package name */
    public final double f34795c;

    /* renamed from: d, reason: collision with root package name */
    public final double f34796d;

    /* renamed from: e, reason: collision with root package name */
    public final double f34797e;

    public o(double d3, double d5, double d10, double d11, double d12) {
        this.f34793a = d3;
        this.f34794b = d5;
        this.f34795c = d10;
        this.f34796d = d11;
        this.f34797e = d12;
        if (Double.isNaN(d5) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(0.0d) || Double.isNaN(0.0d) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d5 == 0.0d || d3 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d5 == 0.0d || d3 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d5 < 0.0d || d3 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Double.valueOf(this.f34793a).equals(Double.valueOf(oVar.f34793a)) && Double.valueOf(this.f34794b).equals(Double.valueOf(oVar.f34794b)) && Double.valueOf(this.f34795c).equals(Double.valueOf(oVar.f34795c)) && Double.valueOf(this.f34796d).equals(Double.valueOf(oVar.f34796d)) && Double.valueOf(this.f34797e).equals(Double.valueOf(oVar.f34797e)) && Double.valueOf(0.0d).equals(Double.valueOf(0.0d)) && Double.valueOf(0.0d).equals(Double.valueOf(0.0d));
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f34793a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f34794b);
        int i5 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f34795c);
        int i10 = (i5 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f34796d);
        int i11 = (i10 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f34797e);
        int i12 = (i11 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(0.0d);
        long jDoubleToLongBits7 = Double.doubleToLongBits(0.0d);
        return ((i12 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f34793a + ", a=" + this.f34794b + ", b=" + this.f34795c + ", c=" + this.f34796d + ", d=" + this.f34797e + ", e=0.0, f=0.0)";
    }
}
