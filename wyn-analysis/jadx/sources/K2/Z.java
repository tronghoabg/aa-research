package k2;

import N1.C0770t;
import N1.C0773w;
import android.os.Looper;

/* loaded from: classes.dex */
public final class Z extends AbstractC3144a {

    /* renamed from: h, reason: collision with root package name */
    public final S3.c f39005h;

    /* renamed from: i, reason: collision with root package name */
    public final com.unity3d.services.core.webview.b f39006i;

    /* renamed from: j, reason: collision with root package name */
    public final Z1.g f39007j;
    public final ae.d k;

    /* renamed from: l, reason: collision with root package name */
    public final int f39008l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f39009m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39010n = true;

    /* renamed from: o, reason: collision with root package name */
    public long f39011o = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39012p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f39013q;

    /* renamed from: r, reason: collision with root package name */
    public S1.A f39014r;

    /* renamed from: s, reason: collision with root package name */
    public C0773w f39015s;

    public Z(C0773w c0773w, S3.c cVar, com.unity3d.services.core.webview.b bVar, Z1.g gVar, ae.d dVar, int i5, boolean z2) {
        this.f39015s = c0773w;
        this.f39005h = cVar;
        this.f39006i = bVar;
        this.f39007j = gVar;
        this.k = dVar;
        this.f39008l = i5;
        this.f39009m = z2;
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, o2.e eVar, long j8) {
        S1.h hVarB = this.f39005h.b();
        S1.A a5 = this.f39014r;
        if (a5 != null) {
            ((S1.l) hVarB).C(a5);
        }
        C0770t c0770t = h().f8272b;
        c0770t.getClass();
        Q1.k.h(this.f39022g);
        Dd.c cVar = new Dd.c((s2.p) this.f39006i.f32729b);
        Z1.d dVar = new Z1.d(this.f39019d.f16928c, 0, h10);
        Z1.d dVarA = a(h10);
        long jK = Q1.x.K(c0770t.f8269f);
        return new X(c0770t.f8264a, hVarB, cVar, this.f39007j, dVar, this.k, dVarA, this, eVar, this.f39008l, this.f39009m, jK, null);
    }

    @Override // k2.AbstractC3144a
    public final synchronized C0773w h() {
        return this.f39015s;
    }

    @Override // k2.AbstractC3144a
    public final void l(S1.A a5) {
        this.f39014r = a5;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        V1.k kVar = this.f39022g;
        Q1.k.h(kVar);
        Z1.g gVar = this.f39007j;
        gVar.h(looperMyLooper, kVar);
        gVar.f();
        t();
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        X x5 = (X) f10;
        if (x5.f38996w) {
            for (c0 c0Var : x5.f38993t) {
                c0Var.j();
                S3.l lVar = c0Var.f39040h;
                if (lVar != null) {
                    lVar.s(c0Var.f39037e);
                    c0Var.f39040h = null;
                    c0Var.f39039g = null;
                }
            }
        }
        x5.f38985l.e(x5);
        x5.f38990q.removeCallbacksAndMessages(null);
        x5.f38991r = null;
        x5.f38974O = true;
    }

    @Override // k2.AbstractC3144a
    public final void p() {
        this.f39007j.release();
    }

    @Override // k2.AbstractC3144a
    public final synchronized void s(C0773w c0773w) {
        this.f39015s = c0773w;
    }

    public final void t() {
        N1.N k0Var = new k0(this.f39011o, this.f39012p, this.f39013q, h());
        if (this.f39010n) {
            k0Var = new g2.t(k0Var, 1);
        }
        m(k0Var);
    }

    public final void u(long j8, boolean z2, boolean z10) {
        if (j8 == -9223372036854775807L) {
            j8 = this.f39011o;
        }
        if (!this.f39010n && this.f39011o == j8 && this.f39012p == z2 && this.f39013q == z10) {
            return;
        }
        this.f39011o = j8;
        this.f39012p = z2;
        this.f39013q = z10;
        this.f39010n = false;
        t();
    }

    @Override // k2.AbstractC3144a
    public final void j() {
    }
}
