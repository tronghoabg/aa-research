package k2;

/* renamed from: k2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3139A implements F, InterfaceC3143E {

    /* renamed from: a, reason: collision with root package name */
    public final H f38884a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38885b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.e f38886c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC3144a f38887d;

    /* renamed from: e, reason: collision with root package name */
    public F f38888e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3143E f38889f;

    /* renamed from: g, reason: collision with root package name */
    public long f38890g = -9223372036854775807L;

    public C3139A(H h10, o2.e eVar, long j8) {
        this.f38884a = h10;
        this.f38886c = eVar;
        this.f38885b = j8;
    }

    @Override // k2.e0
    public final void a(f0 f0Var) {
        InterfaceC3143E interfaceC3143E = this.f38889f;
        int i5 = Q1.x.f9724a;
        interfaceC3143E.a(this);
    }

    @Override // k2.F
    public final long b(long j8, U1.a0 a0Var) {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        return f10.b(j8, a0Var);
    }

    @Override // k2.f0
    public final long c() {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        return f10.c();
    }

    @Override // k2.F
    public final long d(long j8) {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        return f10.d(j8);
    }

    @Override // k2.f0
    public final boolean e() {
        F f10 = this.f38888e;
        return f10 != null && f10.e();
    }

    @Override // k2.F
    public final long f() {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        return f10.f();
    }

    public final void g(H h10) {
        long j8 = this.f38890g;
        if (j8 == -9223372036854775807L) {
            j8 = this.f38885b;
        }
        AbstractC3144a abstractC3144a = this.f38887d;
        abstractC3144a.getClass();
        F fB = abstractC3144a.b(h10, this.f38886c, j8);
        this.f38888e = fB;
        if (this.f38889f != null) {
            fB.q(this, j8);
        }
    }

    @Override // k2.F
    public final void h() {
        F f10 = this.f38888e;
        if (f10 != null) {
            f10.h();
            return;
        }
        AbstractC3144a abstractC3144a = this.f38887d;
        if (abstractC3144a != null) {
            abstractC3144a.j();
        }
    }

    @Override // k2.F
    public final void i(long j8) {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        f10.i(j8);
    }

    @Override // k2.F
    public final n0 j() {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        return f10.j();
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        F f10 = this.f38888e;
        return f10 != null && f10.k(c10);
    }

    @Override // k2.InterfaceC3143E
    public final void l(F f10) {
        InterfaceC3143E interfaceC3143E = this.f38889f;
        int i5 = Q1.x.f9724a;
        interfaceC3143E.l(this);
    }

    @Override // k2.f0
    public final long n() {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        return f10.n();
    }

    @Override // k2.f0
    public final void o(long j8) {
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        f10.o(j8);
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        this.f38889f = interfaceC3143E;
        F f10 = this.f38888e;
        if (f10 != null) {
            long j10 = this.f38890g;
            if (j10 == -9223372036854775807L) {
                j10 = this.f38885b;
            }
            f10.q(this, j10);
        }
    }

    @Override // k2.F
    public final long r(n2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j8) {
        long j10 = this.f38890g;
        long j11 = (j10 == -9223372036854775807L || j8 != this.f38885b) ? j8 : j10;
        this.f38890g = -9223372036854775807L;
        F f10 = this.f38888e;
        int i5 = Q1.x.f9724a;
        return f10.r(qVarArr, zArr, d0VarArr, zArr2, j11);
    }
}
