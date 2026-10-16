package p9;

import A7.C0237b0;
import android.content.Context;
import m9.H;
import m9.T;
import me.C3558a;
import p7.AbstractC3772b;
import r9.C3948e;
import r9.C3955l;
import r9.C3960q;
import r9.K;
import r9.P;
import w9.C4386e;

/* loaded from: classes4.dex */
public final class x extends s {
    @Override // p9.s
    public final P a(C3558a c3558a) {
        AbstractC3772b abstractC3772b = this.f43399c;
        A6.c.A(abstractC3772b, "persistence not initialized yet", new Object[0]);
        C3960q c3960q = (C3960q) ((K) abstractC3772b).f44581j.f829d;
        C3955l c3955lD = d();
        c3960q.getClass();
        C4386e c4386e = (C4386e) c3558a.f40737b;
        M.y yVar = new M.y();
        yVar.f7230e = c3960q;
        yVar.f7226a = false;
        yVar.f7227b = c4386e;
        yVar.f7228c = c3955lD;
        return yVar;
    }

    @Override // p9.s
    public final C3948e b(C3558a c3558a) {
        AbstractC3772b abstractC3772b = this.f43399c;
        A6.c.A(abstractC3772b, "persistence not initialized yet", new Object[0]);
        return new C3948e(abstractC3772b, (C4386e) c3558a.f40737b, d());
    }

    @Override // p9.s
    public final AbstractC3772b c(C3558a c3558a) {
        long j8;
        v9.o oVar = (v9.o) this.f43398b.f1940c;
        A6.c.A(oVar, "remoteSerializer not initialized yet", new Object[0]);
        a2.v vVar = new a2.v(oVar, 23);
        H h10 = this.f43397a;
        m9.P p10 = h10.f40430e;
        if (p10 == null) {
            j8 = h10.f40429d;
        } else if (p10 instanceof T) {
            j8 = ((T) p10).f40455a;
        } else {
            j8 = -1;
        }
        J5.n nVar = new J5.n();
        nVar.f5655a = j8;
        C0237b0 c0237b0 = (C0237b0) c3558a.f40738c;
        return new K((Context) c3558a.f40736a, (String) c0237b0.f813c, (s9.f) c0237b0.f815e, vVar, nVar);
    }
}
