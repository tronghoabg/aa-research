package U1;

import N1.C0764m;
import N1.C0765n;
import j$.util.Objects;
import k2.d0;

/* renamed from: U1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0834d implements W, X {

    /* renamed from: b, reason: collision with root package name */
    public final int f12031b;

    /* renamed from: d, reason: collision with root package name */
    public Y f12033d;

    /* renamed from: e, reason: collision with root package name */
    public int f12034e;

    /* renamed from: f, reason: collision with root package name */
    public V1.k f12035f;

    /* renamed from: g, reason: collision with root package name */
    public Q1.q f12036g;

    /* renamed from: h, reason: collision with root package name */
    public int f12037h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f12038i;

    /* renamed from: j, reason: collision with root package name */
    public C0765n[] f12039j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f12040l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12042n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12043o;

    /* renamed from: q, reason: collision with root package name */
    public n2.o f12045q;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12030a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final S3.c f12032c = new S3.c(25, false);

    /* renamed from: m, reason: collision with root package name */
    public long f12041m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public N1.N f12044p = N1.N.f8072a;

    public AbstractC0834d(int i5) {
        this.f12031b = i5;
    }

    @Override // U1.W
    public final void A(long j8) {
        this.f12042n = false;
        this.f12040l = j8;
        this.f12041m = j8;
        F(j8, false);
    }

    @Override // U1.W
    public D B() {
        return null;
    }

    public final C0840j C(Exception exc, C0765n c0765n, boolean z2, int i5) {
        int iD;
        if (c0765n == null || this.f12043o) {
            iD = 4;
        } else {
            this.f12043o = true;
            try {
                iD = d(c0765n) & 7;
            } catch (C0840j unused) {
            } finally {
                this.f12043o = false;
            }
        }
        return new C0840j(1, exc, i5, getName(), this.f12034e, c0765n, c0765n == null ? 4 : iD, z2);
    }

    public abstract void D();

    public abstract void F(long j8, boolean z2);

    public final int L(S3.c cVar, T1.d dVar, int i5) {
        d0 d0Var = this.f12038i;
        d0Var.getClass();
        int iS = d0Var.s(cVar, dVar, i5);
        if (iS == -4) {
            if (dVar.h(4)) {
                this.f12041m = Long.MIN_VALUE;
                return this.f12042n ? -4 : -3;
            }
            long j8 = dVar.f11360g + this.k;
            dVar.f11360g = j8;
            this.f12041m = Math.max(this.f12041m, j8);
            return iS;
        }
        if (iS == -5) {
            C0765n c0765n = (C0765n) cVar.f10937c;
            c0765n.getClass();
            long j10 = c0765n.f8237s;
            if (j10 != Long.MAX_VALUE) {
                C0764m c0764mA = c0765n.a();
                c0764mA.f8199r = j10 + this.k;
                cVar.f10937c = new C0765n(c0764mA);
            }
        }
        return iS;
    }

    @Override // U1.W
    public final void a() {
        Q1.k.g(this.f12037h == 1);
        this.f12032c.i();
        this.f12037h = 0;
        this.f12038i = null;
        this.f12039j = null;
        this.f12042n = false;
        D();
    }

    @Override // U1.W
    public boolean b() {
        return i();
    }

    @Override // U1.W, U1.X
    public final int f() {
        return this.f12031b;
    }

    @Override // U1.W
    public final int getState() {
        return this.f12037h;
    }

    @Override // U1.X
    public final void h() {
        synchronized (this.f12030a) {
            this.f12045q = null;
        }
    }

    @Override // U1.W
    public final boolean i() {
        return this.f12041m == Long.MIN_VALUE;
    }

    @Override // U1.W
    public /* synthetic */ void j() {
    }

    @Override // U1.W
    public final void k() {
        this.f12042n = true;
    }

    @Override // U1.W
    public final void l(N1.N n10) {
        N1.N n11 = this.f12044p;
        int i5 = Q1.x.f9724a;
        if (Objects.equals(n11, n10)) {
            return;
        }
        this.f12044p = n10;
    }

    @Override // U1.W
    public final void m(Y y10, C0765n[] c0765nArr, d0 d0Var, boolean z2, boolean z10, long j8, long j10, k2.H h10) {
        Q1.k.g(this.f12037h == 0);
        this.f12033d = y10;
        this.f12037h = 1;
        E(z2, z10);
        o(c0765nArr, d0Var, j8, j10, h10);
        this.f12042n = false;
        this.f12040l = j8;
        this.f12041m = j8;
        F(j8, z2);
    }

    @Override // U1.W
    public final void o(C0765n[] c0765nArr, d0 d0Var, long j8, long j10, k2.H h10) {
        Q1.k.g(!this.f12042n);
        this.f12038i = d0Var;
        if (this.f12041m == Long.MIN_VALUE) {
            this.f12041m = j8;
        }
        this.f12039j = c0765nArr;
        this.k = j10;
        K(c0765nArr, j8, j10, h10);
    }

    @Override // U1.W
    public final void p() {
        d0 d0Var = this.f12038i;
        d0Var.getClass();
        d0Var.a();
    }

    @Override // U1.W
    public final boolean r() {
        return this.f12042n;
    }

    @Override // U1.W
    public final void release() {
        Q1.k.g(this.f12037h == 0);
        G();
    }

    @Override // U1.W
    public final void reset() {
        Q1.k.g(this.f12037h == 0);
        this.f12032c.i();
        H();
    }

    @Override // U1.W
    public final void start() {
        Q1.k.g(this.f12037h == 1);
        this.f12037h = 2;
        I();
    }

    @Override // U1.W
    public final void stop() {
        Q1.k.g(this.f12037h == 2);
        this.f12037h = 1;
        J();
    }

    @Override // U1.W
    public /* synthetic */ void t(float f10, float f11) {
    }

    @Override // U1.X
    public int u() {
        return 0;
    }

    @Override // U1.W
    public final void w(int i5, V1.k kVar, Q1.q qVar) {
        this.f12034e = i5;
        this.f12035f = kVar;
        this.f12036g = qVar;
    }

    @Override // U1.W
    public final d0 x() {
        return this.f12038i;
    }

    @Override // U1.X
    public final void y(n2.o oVar) {
        synchronized (this.f12030a) {
            this.f12045q = oVar;
        }
    }

    @Override // U1.W
    public final long z() {
        return this.f12041m;
    }

    public void G() {
    }

    public void H() {
    }

    public void I() {
    }

    public void J() {
    }

    @Override // U1.W
    public final X s() {
        return this;
    }

    public void E(boolean z2, boolean z10) {
    }

    @Override // U1.S
    public void c(int i5, Object obj) {
    }

    public void K(C0765n[] c0765nArr, long j8, long j10, k2.H h10) {
    }
}
