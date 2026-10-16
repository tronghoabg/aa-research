package f6;

import E5.C0;

/* renamed from: f6.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2604q implements InterfaceC2610w, InterfaceC2609v {

    /* renamed from: a, reason: collision with root package name */
    public final C2613z f35088a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35089b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.e f35090c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC2588a f35091d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2610w f35092e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2609v f35093f;

    /* renamed from: g, reason: collision with root package name */
    public long f35094g = -9223372036854775807L;

    public C2604q(C2613z c2613z, o2.e eVar, long j8) {
        this.f35088a = c2613z;
        this.f35090c = eVar;
        this.f35089b = j8;
    }

    @Override // f6.InterfaceC2609v
    public final void a(InterfaceC2610w interfaceC2610w) {
        InterfaceC2609v interfaceC2609v = this.f35093f;
        int i5 = u6.v.f46721a;
        interfaceC2609v.a(this);
    }

    @Override // f6.InterfaceC2609v
    public final void b(W w2) {
        InterfaceC2609v interfaceC2609v = this.f35093f;
        int i5 = u6.v.f46721a;
        interfaceC2609v.b(this);
    }

    @Override // f6.W
    public final long c() {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        return interfaceC2610w.c();
    }

    @Override // f6.InterfaceC2610w
    public final long d(long j8) {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        return interfaceC2610w.d(j8);
    }

    @Override // f6.W
    public final boolean e() {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        return interfaceC2610w != null && interfaceC2610w.e();
    }

    @Override // f6.InterfaceC2610w
    public final long f() {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        return interfaceC2610w.f();
    }

    public final void g(C2613z c2613z) {
        long j8 = this.f35094g;
        if (j8 == -9223372036854775807L) {
            j8 = this.f35089b;
        }
        AbstractC2588a abstractC2588a = this.f35091d;
        abstractC2588a.getClass();
        InterfaceC2610w interfaceC2610wA = abstractC2588a.a(c2613z, this.f35090c, j8);
        this.f35092e = interfaceC2610wA;
        if (this.f35093f != null) {
            interfaceC2610wA.r(this, j8);
        }
    }

    @Override // f6.InterfaceC2610w
    public final void h() {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        if (interfaceC2610w != null) {
            interfaceC2610w.h();
            return;
        }
        AbstractC2588a abstractC2588a = this.f35091d;
        if (abstractC2588a != null) {
            abstractC2588a.i();
        }
    }

    @Override // f6.InterfaceC2610w
    public final void i(long j8) {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        interfaceC2610w.i(j8);
    }

    @Override // f6.InterfaceC2610w
    public final a0 j() {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        return interfaceC2610w.j();
    }

    @Override // f6.W
    public final long n() {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        return interfaceC2610w.n();
    }

    @Override // f6.W
    public final void o(long j8) {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        interfaceC2610w.o(j8);
    }

    @Override // f6.InterfaceC2610w
    public final void r(InterfaceC2609v interfaceC2609v, long j8) {
        this.f35093f = interfaceC2609v;
        InterfaceC2610w interfaceC2610w = this.f35092e;
        if (interfaceC2610w != null) {
            long j10 = this.f35094g;
            if (j10 == -9223372036854775807L) {
                j10 = this.f35089b;
            }
            interfaceC2610w.r(this, j10);
        }
    }

    @Override // f6.InterfaceC2610w
    public final long s(long j8, C0 c02) {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        return interfaceC2610w.s(j8, c02);
    }

    @Override // f6.InterfaceC2610w
    public final long y(r6.n[] nVarArr, boolean[] zArr, V[] vArr, boolean[] zArr2, long j8) {
        long j10;
        long j11 = this.f35094g;
        if (j11 == -9223372036854775807L || j8 != this.f35089b) {
            j10 = j8;
        } else {
            this.f35094g = -9223372036854775807L;
            j10 = j11;
        }
        InterfaceC2610w interfaceC2610w = this.f35092e;
        int i5 = u6.v.f46721a;
        return interfaceC2610w.y(nVarArr, zArr, vArr, zArr2, j10);
    }

    @Override // f6.W
    public final boolean z(long j8) {
        InterfaceC2610w interfaceC2610w = this.f35092e;
        return interfaceC2610w != null && interfaceC2610w.z(j8);
    }
}
