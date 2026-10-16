package j;

/* renamed from: j.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3063D {

    /* renamed from: d, reason: collision with root package name */
    public static C3063D f38370d;

    /* renamed from: a, reason: collision with root package name */
    public long f38371a;

    /* renamed from: b, reason: collision with root package name */
    public long f38372b;

    /* renamed from: c, reason: collision with root package name */
    public int f38373c;

    public final void a(long j8, double d3, double d5) {
        double d10 = (0.01720197f * ((j8 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d10) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d5) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d11 = 0.01745329238474369d * d3;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d11))) / (Math.cos(dAsin) * Math.cos(d11));
        if (dSin3 >= 1.0d) {
            this.f38373c = 1;
            this.f38371a = -1L;
            this.f38372b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f38373c = 0;
                this.f38371a = -1L;
                this.f38372b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f38371a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f38372b = jRound;
            if (jRound >= j8 || this.f38371a <= j8) {
                this.f38373c = 1;
            } else {
                this.f38373c = 0;
            }
        }
    }
}
