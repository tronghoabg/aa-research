package U1;

/* renamed from: U1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836f {

    /* renamed from: a, reason: collision with root package name */
    public final float f12051a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12052b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12053c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12054d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12055e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12056f;

    /* renamed from: g, reason: collision with root package name */
    public final float f12057g;

    /* renamed from: n, reason: collision with root package name */
    public float f12063n;

    /* renamed from: o, reason: collision with root package name */
    public float f12064o;

    /* renamed from: h, reason: collision with root package name */
    public long f12058h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f12059i = -9223372036854775807L;
    public long k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f12061l = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public float f12065p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f12066q = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public long f12060j = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f12062m = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public long f12067r = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f12068s = -9223372036854775807L;

    public C0836f(float f10, float f11, long j8, float f12, long j10, long j11, float f13) {
        this.f12051a = f10;
        this.f12052b = f11;
        this.f12053c = j8;
        this.f12054d = f12;
        this.f12055e = j10;
        this.f12056f = j11;
        this.f12057g = f13;
        this.f12064o = f10;
        this.f12063n = f11;
    }

    public final void a() {
        long j8;
        long j10 = this.f12058h;
        if (j10 != -9223372036854775807L) {
            j8 = this.f12059i;
            if (j8 == -9223372036854775807L) {
                long j11 = this.k;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j8 = this.f12061l;
                if (j8 == -9223372036854775807L || j10 <= j8) {
                    j8 = j10;
                }
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.f12060j == j8) {
            return;
        }
        this.f12060j = j8;
        this.f12062m = j8;
        this.f12067r = -9223372036854775807L;
        this.f12068s = -9223372036854775807L;
        this.f12066q = -9223372036854775807L;
    }
}
