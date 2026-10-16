package l2;

import k2.c0;
import k2.d0;

/* renamed from: l2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3382g implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3383h f39898a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f39899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39900c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3383h f39902e;

    public C3382g(C3383h c3383h, C3383h c3383h2, c0 c0Var, int i5) {
        this.f39902e = c3383h;
        this.f39898a = c3383h2;
        this.f39899b = c0Var;
        this.f39900c = i5;
    }

    public final void b() {
        if (this.f39901d) {
            return;
        }
        C3383h c3383h = this.f39902e;
        Z1.d dVar = c3383h.f39909g;
        int[] iArr = c3383h.f39904b;
        int i5 = this.f39900c;
        dVar.b(iArr[i5], c3383h.f39905c[i5], 0, null, c3383h.f39921t);
        this.f39901d = true;
    }

    @Override // k2.d0
    public final int g(long j8) {
        C3383h c3383h = this.f39902e;
        if (c3383h.u()) {
            return 0;
        }
        boolean z2 = c3383h.f39926y;
        c0 c0Var = this.f39899b;
        int iT = c0Var.t(j8, z2);
        AbstractC3376a abstractC3376a = c3383h.f39923v;
        if (abstractC3376a != null) {
            iT = Math.min(iT, abstractC3376a.c(this.f39900c + 1) - c0Var.r());
        }
        c0Var.G(iT);
        if (iT > 0) {
            b();
        }
        return iT;
    }

    @Override // k2.d0
    public final boolean isReady() {
        C3383h c3383h = this.f39902e;
        return !c3383h.u() && this.f39899b.v(c3383h.f39926y);
    }

    @Override // k2.d0
    public final int s(S3.c cVar, T1.d dVar, int i5) {
        C3383h c3383h = this.f39902e;
        if (c3383h.u()) {
            return -3;
        }
        AbstractC3376a abstractC3376a = c3383h.f39923v;
        c0 c0Var = this.f39899b;
        if (abstractC3376a != null && abstractC3376a.c(this.f39900c + 1) <= c0Var.r()) {
            return -3;
        }
        b();
        return c0Var.A(cVar, dVar, i5, c3383h.f39926y);
    }

    @Override // k2.d0
    public final void a() {
    }
}
