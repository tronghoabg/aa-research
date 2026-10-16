package od;

import md.AbstractC3541i;
import md.C3535c;
import md.C3549q;

/* renamed from: od.a1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3670a1 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3727u f41902a;

    /* renamed from: b, reason: collision with root package name */
    public final F6.r f41903b;

    /* renamed from: c, reason: collision with root package name */
    public final md.b0 f41904c;

    /* renamed from: d, reason: collision with root package name */
    public final C3535c f41905d;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f41907f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC3541i[] f41908g;

    /* renamed from: i, reason: collision with root package name */
    public r f41910i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41911j;
    public L k;

    /* renamed from: h, reason: collision with root package name */
    public final Object f41909h = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final C3549q f41906e = C3549q.b();

    public C3670a1(InterfaceC3727u interfaceC3727u, F6.r rVar, md.b0 b0Var, C3535c c3535c, com.google.android.gms.ads.nativead.l lVar, AbstractC3541i[] abstractC3541iArr) {
        this.f41902a = interfaceC3727u;
        this.f41903b = rVar;
        this.f41904c = b0Var;
        this.f41905d = c3535c;
        this.f41907f = lVar;
        this.f41908g = abstractC3541iArr;
    }

    public final void a(md.k0 k0Var) {
        Fe.e.p("Cannot fail with OK status", !k0Var.f());
        Fe.e.w("apply() or fail() already called", !this.f41911j);
        b(new S(AbstractC3669a0.h(k0Var), EnumC3721s.f42082a, this.f41908g));
    }

    public final void b(r rVar) {
        boolean z2;
        Fe.e.w("already finalized", !this.f41911j);
        this.f41911j = true;
        synchronized (this.f41909h) {
            try {
                if (this.f41910i == null) {
                    this.f41910i = rVar;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            C3692i c3692i = (C3692i) this.f41907f.f26356b;
            if (c3692i.f41982b.decrementAndGet() == 0) {
                C3692i.h(c3692i);
                return;
            }
            return;
        }
        Fe.e.w("delayedStream is null", this.k != null);
        J jQ = this.k.q(rVar);
        if (jQ != null) {
            jQ.run();
        }
        C3692i c3692i2 = (C3692i) this.f41907f.f26356b;
        if (c3692i2.f41982b.decrementAndGet() == 0) {
            C3692i.h(c3692i2);
        }
    }
}
