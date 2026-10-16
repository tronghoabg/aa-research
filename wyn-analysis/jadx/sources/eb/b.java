package eb;

import N1.C0765n;
import N1.N;
import Q1.k;
import Q1.q;
import R8.v;
import U1.D;
import U1.W;
import U1.X;
import U1.Y;
import k2.H;
import k2.d0;
import n2.o;

/* loaded from: classes4.dex */
public final class b implements W, X {

    /* renamed from: a, reason: collision with root package name */
    public int f34592a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f34593b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34594c;

    /* renamed from: d, reason: collision with root package name */
    public long f34595d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f34596e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f34597f;

    public b(c cVar) {
        this.f34597f = cVar;
    }

    @Override // U1.W
    public final void A(long j8) {
        this.f34594c = false;
    }

    @Override // U1.W
    public final D B() {
        return null;
    }

    @Override // U1.W
    public final void a() {
        k.g(this.f34592a == 1);
        this.f34592a = 0;
        this.f34593b = null;
        this.f34594c = false;
    }

    @Override // U1.W
    public final boolean b() {
        return true;
    }

    @Override // U1.X
    public final int d(C0765n c0765n) {
        return v.a(0, 0, 0, 0);
    }

    @Override // U1.W, U1.X
    public final int f() {
        return -2;
    }

    @Override // U1.W, U1.X
    public final String getName() {
        return "ObserverRenderer";
    }

    @Override // U1.W
    public final int getState() {
        return this.f34592a;
    }

    @Override // U1.X
    public final /* synthetic */ void h() {
    }

    @Override // U1.W
    public final boolean i() {
        return true;
    }

    @Override // U1.W
    public final boolean isReady() {
        return true;
    }

    @Override // U1.W
    public final /* synthetic */ void j() {
    }

    @Override // U1.W
    public final void k() {
        this.f34594c = true;
    }

    @Override // U1.W
    public final void m(Y y10, C0765n[] c0765nArr, d0 d0Var, boolean z2, boolean z10, long j8, long j10, H h10) {
        k.g(this.f34592a == 0);
        this.f34592a = 1;
        o(c0765nArr, d0Var, j8, j10, h10);
    }

    @Override // U1.W
    public final void o(C0765n[] c0765nArr, d0 d0Var, long j8, long j10, H h10) {
        k.g(!this.f34594c);
        this.f34593b = d0Var;
    }

    @Override // U1.W
    public final boolean r() {
        return this.f34594c;
    }

    @Override // U1.W
    public final /* synthetic */ void release() {
    }

    @Override // U1.W
    public final void reset() {
        k.g(this.f34592a == 0);
    }

    @Override // U1.W
    public final void start() {
        k.g(this.f34592a == 1);
        this.f34592a = 2;
    }

    @Override // U1.W
    public final void stop() {
        k.g(this.f34592a == 2);
        this.f34592a = 1;
    }

    @Override // U1.W
    public final /* synthetic */ void t(float f10, float f11) {
    }

    @Override // U1.X
    public final int u() {
        return 0;
    }

    @Override // U1.W
    public final void v(long j8, long j10) {
        if (j8 == this.f34595d) {
            this.f34596e++;
        } else {
            if (this.f34596e >= 3) {
                this.f34597f.f34601C.post(new com.applovin.adview.a(this, 22));
            }
            this.f34596e = 0;
        }
        this.f34595d = j8;
    }

    @Override // U1.W
    public final d0 x() {
        return this.f34593b;
    }

    @Override // U1.X
    public final /* synthetic */ void y(o oVar) {
    }

    @Override // U1.W
    public final long z() {
        return Long.MIN_VALUE;
    }

    @Override // U1.W
    public final void p() {
    }

    @Override // U1.W
    public final X s() {
        return this;
    }

    @Override // U1.W
    public final void l(N n10) {
    }

    @Override // U1.S
    public final void c(int i5, Object obj) {
    }

    @Override // U1.W
    public final void w(int i5, V1.k kVar, q qVar) {
    }
}
