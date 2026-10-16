package J5;

/* loaded from: classes3.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final c f5614a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5615b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5616c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5617d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5618e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5619f;

    public a(c cVar, long j8, long j10, long j11, long j12, long j13) {
        this.f5614a = cVar;
        this.f5615b = j8;
        this.f5616c = j10;
        this.f5617d = j11;
        this.f5618e = j12;
        this.f5619f = j13;
    }

    @Override // J5.t
    public final s c(long j8) {
        u uVar = new u(j8, b.a(this.f5614a.a(j8), 0L, this.f5616c, this.f5617d, this.f5618e, this.f5619f));
        return new s(uVar, uVar);
    }

    @Override // J5.t
    public final boolean e() {
        return true;
    }

    @Override // J5.t
    public final long f() {
        return this.f5615b;
    }
}
