package A;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public float f19a;

    /* renamed from: b, reason: collision with root package name */
    public double f20b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21c;

    public final long a(float f10, float f11, long j8) {
        if (!this.f21c) {
            if (this.f19a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            this.f21c = true;
        }
        float f12 = f10 - this.f19a;
        double d3 = j8 / 1000.0d;
        double d5 = this.f20b;
        double d10 = f12;
        double d11 = (d5 * d10) + f11;
        double d12 = (d11 * d3) + d10;
        double dExp = Math.exp((-d5) * d3) * d12;
        double dExp2 = Math.exp((-this.f20b) * d3) * d12;
        double d13 = -this.f20b;
        float fExp = (float) ((Math.exp(d13 * d3) * d11) + (dExp2 * d13));
        return (Float.floatToIntBits(fExp) & 4294967295L) | (Float.floatToIntBits((float) (dExp + this.f19a)) << 32);
    }
}
