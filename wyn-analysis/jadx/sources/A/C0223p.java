package A;

/* renamed from: A.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223p {

    /* renamed from: a, reason: collision with root package name */
    public double f179a;

    /* renamed from: b, reason: collision with root package name */
    public double f180b;

    public C0223p(double d3, double d5) {
        this.f179a = d3;
        this.f180b = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0223p)) {
            return false;
        }
        C0223p c0223p = (C0223p) obj;
        return Double.valueOf(this.f179a).equals(Double.valueOf(c0223p.f179a)) && Double.valueOf(this.f180b).equals(Double.valueOf(c0223p.f180b));
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f179a);
        int i5 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f180b);
        return i5 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f179a + ", _imaginary=" + this.f180b + ')';
    }
}
