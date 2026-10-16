package k2;

/* loaded from: classes.dex */
public final class l0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f39118a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39119b;

    public l0(d0 d0Var, long j8) {
        this.f39118a = d0Var;
        this.f39119b = j8;
    }

    @Override // k2.d0
    public final void a() {
        this.f39118a.a();
    }

    @Override // k2.d0
    public final int g(long j8) {
        return this.f39118a.g(j8 - this.f39119b);
    }

    @Override // k2.d0
    public final boolean isReady() {
        return this.f39118a.isReady();
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) {
        int iS = this.f39118a.s(cVar, dVar, i5);
        if (iS == -4) {
            dVar.f11360g += this.f39119b;
        }
        return iS;
    }
}
