package J5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f5620a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5621b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5622c;

    /* renamed from: d, reason: collision with root package name */
    public long f5623d;

    /* renamed from: e, reason: collision with root package name */
    public long f5624e;

    /* renamed from: f, reason: collision with root package name */
    public long f5625f;

    /* renamed from: g, reason: collision with root package name */
    public long f5626g;

    /* renamed from: h, reason: collision with root package name */
    public long f5627h;

    public b(long j8, long j10, long j11, long j12, long j13, long j14, int i5) {
        switch (i5) {
            case 1:
                this.f5620a = j8;
                this.f5621b = j10;
                this.f5623d = 0L;
                this.f5624e = j11;
                this.f5625f = j12;
                this.f5626g = j13;
                this.f5622c = j14;
                this.f5627h = b(j10, 0L, j11, j12, j13, j14);
                break;
            default:
                this.f5620a = j8;
                this.f5621b = j10;
                this.f5623d = 0L;
                this.f5624e = j11;
                this.f5625f = j12;
                this.f5626g = j13;
                this.f5622c = j14;
                this.f5627h = a(j10, 0L, j11, j12, j13, j14);
                break;
        }
    }

    public static long a(long j8, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || j10 + 1 >= j11) {
            return j12;
        }
        long j15 = (long) ((j8 - j10) * ((j13 - j12) / (j11 - j10)));
        return u6.v.i(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
    }

    public static long b(long j8, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || j10 + 1 >= j11) {
            return j12;
        }
        long j15 = (long) ((j8 - j10) * ((j13 - j12) / (j11 - j10)));
        return Q1.x.j(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
    }
}
