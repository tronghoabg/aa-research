package s2;

/* loaded from: classes.dex */
public class i implements w {

    /* renamed from: a, reason: collision with root package name */
    public final long f44888a;

    /* renamed from: b, reason: collision with root package name */
    public final long f44889b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44890c;

    /* renamed from: d, reason: collision with root package name */
    public final long f44891d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44892e;

    /* renamed from: f, reason: collision with root package name */
    public final long f44893f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f44894g;

    public i(long j8, long j10, int i5, int i10, boolean z2) {
        this.f44888a = j8;
        this.f44889b = j10;
        this.f44890c = i10 == -1 ? 1 : i10;
        this.f44892e = i5;
        this.f44894g = z2;
        if (j8 == -1) {
            this.f44891d = -1L;
            this.f44893f = -9223372036854775807L;
        } else {
            long j11 = j8 - j10;
            this.f44891d = j11;
            this.f44893f = (Math.max(0L, j11) * 8000000) / i5;
        }
    }

    @Override // s2.w
    public final v c(long j8) {
        long j10 = this.f44891d;
        long j11 = this.f44889b;
        if (j10 == -1 && !this.f44894g) {
            x xVar = new x(0L, j11);
            return new v(xVar, xVar);
        }
        int i5 = this.f44892e;
        long j12 = this.f44890c;
        long jMin = (((i5 * j8) / 8000000) / j12) * j12;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j12);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / i5;
        x xVar2 = new x(jMax2, jMax);
        if (j10 != -1 && jMax2 < j8) {
            long j13 = jMax + j12;
            if (j13 < this.f44888a) {
                return new v(xVar2, new x((Math.max(0L, j13 - j11) * 8000000) / i5, j13));
            }
        }
        return new v(xVar2, xVar2);
    }

    @Override // s2.w
    public final boolean e() {
        return this.f44891d != -1 || this.f44894g;
    }

    @Override // s2.w
    public final long f() {
        return this.f44893f;
    }
}
