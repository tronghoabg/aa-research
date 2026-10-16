package E5;

/* renamed from: E5.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0457j {

    /* renamed from: a, reason: collision with root package name */
    public final long f3428a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3429b;

    /* renamed from: c, reason: collision with root package name */
    public long f3430c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f3431d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f3433f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f3434g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f3437j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    public float f3436i = 1.03f;
    public float k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public long f3438l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f3432e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f3435h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f3439m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f3440n = -9223372036854775807L;

    public C0457j(long j8, long j10) {
        this.f3428a = j8;
        this.f3429b = j10;
    }

    public final void a() {
        long j8 = this.f3430c;
        if (j8 != -9223372036854775807L) {
            long j10 = this.f3431d;
            if (j10 != -9223372036854775807L) {
                j8 = j10;
            }
            long j11 = this.f3433f;
            if (j11 != -9223372036854775807L && j8 < j11) {
                j8 = j11;
            }
            long j12 = this.f3434g;
            if (j12 != -9223372036854775807L && j8 > j12) {
                j8 = j12;
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.f3432e == j8) {
            return;
        }
        this.f3432e = j8;
        this.f3435h = j8;
        this.f3439m = -9223372036854775807L;
        this.f3440n = -9223372036854775807L;
        this.f3438l = -9223372036854775807L;
    }
}
