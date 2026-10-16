package od;

import md.AbstractC3541i;
import md.C3549q;

/* loaded from: classes5.dex */
public final class G extends L {

    /* renamed from: j, reason: collision with root package name */
    public final C3709n1 f41560j;
    public final C3549q k = C3549q.b();

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC3541i[] f41561l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f41562m;

    public G(H h10, C3709n1 c3709n1, AbstractC3541i[] abstractC3541iArr) {
        this.f41562m = h10;
        this.f41560j = c3709n1;
        this.f41561l = abstractC3541iArr;
    }

    @Override // od.L, od.r
    public final void g(md.k0 k0Var) {
        super.g(k0Var);
        synchronized (this.f41562m.f41569b) {
            try {
                H h10 = this.f41562m;
                if (h10.f41574g != null) {
                    boolean zRemove = h10.f41576i.remove(this);
                    if (!this.f41562m.h() && zRemove) {
                        H h11 = this.f41562m;
                        h11.f41571d.c(h11.f41573f);
                        H h12 = this.f41562m;
                        if (h12.f41577j != null) {
                            h12.f41571d.c(h12.f41574g);
                            this.f41562m.f41574g = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f41562m.f41571d.b();
    }

    @Override // od.L, od.r
    public final void i(N.J0 j02) {
        if (Boolean.TRUE.equals(this.f41560j.f42020a.f40625f)) {
            j02.f7714b.add("wait_for_ready");
        }
        super.i(j02);
    }

    @Override // od.L
    public final void p(md.k0 k0Var) {
        for (AbstractC3541i abstractC3541i : this.f41561l) {
            abstractC3541i.m(k0Var);
        }
    }
}
