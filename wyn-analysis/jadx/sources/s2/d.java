package s2;

/* loaded from: classes.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    public final e f44872a;

    /* renamed from: b, reason: collision with root package name */
    public final long f44873b;

    /* renamed from: c, reason: collision with root package name */
    public final long f44874c;

    /* renamed from: d, reason: collision with root package name */
    public final long f44875d;

    /* renamed from: e, reason: collision with root package name */
    public final long f44876e;

    /* renamed from: f, reason: collision with root package name */
    public final long f44877f;

    public d(e eVar, long j8, long j10, long j11, long j12, long j13) {
        this.f44872a = eVar;
        this.f44873b = j8;
        this.f44874c = j10;
        this.f44875d = j11;
        this.f44876e = j12;
        this.f44877f = j13;
    }

    @Override // s2.w
    public final v c(long j8) {
        x xVar = new x(j8, J5.b.b(this.f44872a.a(j8), 0L, this.f44874c, this.f44875d, this.f44876e, this.f44877f));
        return new v(xVar, xVar);
    }

    @Override // s2.w
    public final boolean e() {
        return true;
    }

    @Override // s2.w
    public final long f() {
        return this.f44873b;
    }
}
