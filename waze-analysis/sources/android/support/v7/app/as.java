package android.support.v7.app;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class as {

    /* renamed from: d, reason: collision with root package name */
    private static as f546d;

    /* renamed from: a, reason: collision with root package name */
    public long f547a;

    /* renamed from: b, reason: collision with root package name */
    public long f548b;

    /* renamed from: c, reason: collision with root package name */
    public int f549c;

    static as a() {
        as asVar = f546d;
        if (asVar != null) {
            return asVar;
        }
        as asVar2 = new as();
        f546d = asVar2;
        return asVar2;
    }

    public final void b(long j2, double d2, double d3) {
        double d4 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = Math.sin(d4) * 0.03341960161924362d;
        double dSin2 = Math.sin(r2 + r2) * 3.4906598739326E-4d;
        double dSin3 = Math.sin(r2 * 3.0f) * 5.236000106378924E-6d;
        double d5 = (-d3) / 360.0d;
        float fRound = Math.round((r1 - 9.0E-4f) - d5);
        double dSin4 = Math.sin(d4) * 0.0053d;
        double d6 = d4 + dSin + dSin2 + dSin3 + 1.796593063d + 3.141592653589793d;
        double dSin5 = Math.sin(d6 + d6) * (-0.0069d);
        double dAsin = Math.asin(Math.sin(d6) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d2;
        double dSin6 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(dAsin))) / (Math.cos(d7) * Math.cos(dAsin));
        int i2 = 1;
        if (dSin6 < 1.0d) {
            if (dSin6 > -1.0d) {
                double d8 = fRound + 9.0E-4f + d5 + dSin4 + dSin5;
                double dAcos = (float) (Math.acos(dSin6) / 6.283185307179586d);
                this.f547a = Math.round((d8 + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((d8 - dAcos) * 8.64E7d) + 946728000000L;
                this.f548b = jRound;
                if (jRound < j2 && this.f547a > j2) {
                    i2 = 0;
                }
                this.f549c = i2;
                return;
            }
            i2 = 0;
        }
        this.f549c = i2;
        this.f547a = -1L;
        this.f548b = -1L;
    }
}
