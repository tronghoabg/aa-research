package V1;

import C6.l;
import E5.C;
import E5.C0471v;
import N1.B;
import N1.C0754c;
import N1.C0773w;
import N1.E;
import N1.F;
import N1.G;
import N1.H;
import N1.I;
import N1.L;
import N1.N;
import N1.V;
import N1.Y;
import N1.z;
import Q1.q;
import Q1.s;
import Q1.x;
import U1.C0840j;
import U1.C0847q;
import U1.C0850u;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.io.IOException;
import java.util.List;
import k2.C3168z;
import k2.M;
import l8.AbstractC3409K;
import l8.j0;
import n2.C3586i;

/* loaded from: classes.dex */
public final class d implements H, M, Z1.e {

    /* renamed from: a, reason: collision with root package name */
    public final q f12899a;

    /* renamed from: b, reason: collision with root package name */
    public final L f12900b;

    /* renamed from: c, reason: collision with root package name */
    public final N1.M f12901c;

    /* renamed from: d, reason: collision with root package name */
    public final l f12902d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f12903e;

    /* renamed from: f, reason: collision with root package name */
    public Q1.j f12904f;

    /* renamed from: g, reason: collision with root package name */
    public C0850u f12905g;

    /* renamed from: h, reason: collision with root package name */
    public s f12906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12907i;

    public d(q qVar) {
        qVar.getClass();
        this.f12899a = qVar;
        int i5 = x.f9724a;
        Looper looperMyLooper = Looper.myLooper();
        this.f12904f = new Q1.j(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, qVar, new b(3));
        L l10 = new L();
        this.f12900b = l10;
        this.f12901c = new N1.M();
        this.f12902d = new l(l10);
        this.f12903e = new SparseArray();
    }

    @Override // N1.H
    public final void A(F f10) {
        L(G(), 12, new Uc.l(13));
    }

    @Override // k2.M
    public final void B(int i5, k2.H h10, h2.g gVar) {
        L(J(i5, h10), WebSocketProtocol.CLOSE_NO_STATUS_CODE, new b(21));
    }

    @Override // N1.H
    public final void C(E e7) {
        k2.H h10;
        a aVarG = (!(e7 instanceof C0840j) || (h10 = ((C0840j) e7).f12088h) == null) ? G() : I(h10);
        L(aVarG, 10, new S8.b(aVarG, e7, 8));
    }

    @Override // k2.M
    public final void D(int i5, k2.H h10, C3168z c3168z, h2.g gVar) {
        L(J(i5, h10), BackupConstant.SCENE_BACKUP_RENDER_FAIL, new b(22));
    }

    @Override // N1.H
    public final void E(G g9) {
        L(G(), 13, new Uc.l(14));
    }

    @Override // N1.H
    public final void F(V v2) {
        L(G(), 2, new Uc.l(23));
    }

    public final a G() {
        return I((k2.H) this.f12902d.f1847d);
    }

    public final a H(N n10, int i5, k2.H h10) {
        k2.H h11 = n10.p() ? null : h10;
        this.f12899a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = n10.equals(this.f12905g.o0()) && i5 == this.f12905g.l0();
        long jW = 0;
        if (h11 == null || !h11.b()) {
            if (z2) {
                C0850u c0850u = this.f12905g;
                c0850u.S0();
                jW = c0850u.i0(c0850u.f12152d0);
            } else if (!n10.p()) {
                jW = x.W(n10.m(i5, this.f12901c, 0L).f8067l);
            }
        } else if (z2 && this.f12905g.j0() == h11.f38904b && this.f12905g.k0() == h11.f38905c) {
            jW = this.f12905g.m0();
        }
        k2.H h12 = (k2.H) this.f12902d.f1847d;
        N nO0 = this.f12905g.o0();
        int iL0 = this.f12905g.l0();
        long jM0 = this.f12905g.m0();
        C0850u c0850u2 = this.f12905g;
        c0850u2.S0();
        return new a(jElapsedRealtime, n10, i5, h11, jW, nO0, iL0, h12, jM0, x.W(c0850u2.f12152d0.f11993r));
    }

    public final a I(k2.H h10) {
        this.f12905g.getClass();
        N n10 = h10 == null ? null : (N) ((j0) this.f12902d.f1846c).get(h10);
        if (h10 != null && n10 != null) {
            return H(n10, n10.g(h10.f38903a, this.f12900b).f8050c, h10);
        }
        int iL0 = this.f12905g.l0();
        N nO0 = this.f12905g.o0();
        if (iL0 >= nO0.o()) {
            nO0 = N.f8072a;
        }
        return H(nO0, iL0, null);
    }

    public final a J(int i5, k2.H h10) {
        this.f12905g.getClass();
        if (h10 != null) {
            return ((N) ((j0) this.f12902d.f1846c).get(h10)) != null ? I(h10) : H(N.f8072a, i5, h10);
        }
        N nO0 = this.f12905g.o0();
        if (i5 >= nO0.o()) {
            nO0 = N.f8072a;
        }
        return H(nO0, i5, null);
    }

    public final a K() {
        return I((k2.H) this.f12902d.f1849f);
    }

    public final void L(a aVar, int i5, Q1.g gVar) {
        this.f12903e.put(i5, aVar);
        this.f12904f.e(i5, gVar);
    }

    public final void M(C0850u c0850u, Looper looper) {
        Q1.k.g(this.f12905g == null || ((AbstractC3409K) this.f12902d.f1845b).isEmpty());
        c0850u.getClass();
        this.f12905g = c0850u;
        this.f12906h = this.f12899a.a(looper, null);
        Q1.j jVar = this.f12904f;
        this.f12904f = new Q1.j(jVar.f9682d, looper, jVar.f9679a, new A5.h(20, this, c0850u), jVar.f9687i);
    }

    @Override // N1.H
    public final void a(int i5) {
        L(G(), 6, new Uc.l(27));
    }

    @Override // N1.H
    public final void b(int i5) {
        L(G(), 4, new b(6));
    }

    @Override // N1.H
    public final void c(boolean z2) {
        L(G(), 9, new b(16));
    }

    @Override // N1.H
    public final void d(int i5) {
        C0850u c0850u = this.f12905g;
        c0850u.getClass();
        l lVar = this.f12902d;
        lVar.f1847d = l.r(c0850u, (AbstractC3409K) lVar.f1845b, (k2.H) lVar.f1848e, (L) lVar.f1844a);
        lVar.F(c0850u.o0());
        L(G(), 0, new Uc.l(15));
    }

    @Override // N1.H
    public final void e(boolean z2) {
        L(K(), 23, new Uc.l(17));
    }

    @Override // N1.H
    public final void f(List list) {
        a aVarG = G();
        L(aVarG, 27, new C(aVarG, list, 3));
    }

    @Override // N1.H
    public final void g(int i5, int i10) {
        L(K(), 24, new b(17));
    }

    @Override // N1.H
    public final void h(boolean z2) {
        L(G(), 3, new b(28));
    }

    @Override // N1.H
    public final void i(int i5, boolean z2) {
        L(G(), 5, new b(1));
    }

    @Override // N1.H
    public final void j(float f10) {
        L(K(), 22, new Uc.l(18));
    }

    @Override // N1.H
    public final void k(int i5) {
        L(G(), 8, new b(12));
    }

    @Override // N1.H
    public final void l(int i5, boolean z2) {
        L(G(), -1, new Uc.l(20));
    }

    @Override // N1.H
    public final void m(boolean z2) {
        L(G(), 7, new Uc.l(25));
    }

    @Override // N1.H
    public final void n(C3586i c3586i) {
        a aVarG = G();
        L(aVarG, 19, new b(aVarG, c3586i));
    }

    @Override // N1.H
    public final void o(B b5) {
        L(G(), 28, new Uc.l(22));
    }

    @Override // N1.H
    public final void p(Y y10) {
        a aVarK = K();
        L(aVarK, 25, new C0847q(aVarK, y10));
    }

    @Override // k2.M
    public final void q(int i5, k2.H h10, h2.g gVar) {
        a aVarJ = J(i5, h10);
        L(aVarJ, 1004, new A5.h(21, aVarJ, gVar));
    }

    @Override // k2.M
    public final void r(int i5, k2.H h10, C3168z c3168z, h2.g gVar) {
        L(J(i5, h10), 1001, new b(23));
    }

    @Override // k2.M
    public final void s(int i5, k2.H h10, C3168z c3168z, h2.g gVar, IOException iOException, boolean z2) {
        a aVarJ = J(i5, h10);
        L(aVarJ, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, new S8.b(aVarJ, c3168z, gVar, iOException, z2));
    }

    @Override // N1.H
    public final void t(I i5, I i10, int i11) {
        if (i11 == 1) {
            this.f12907i = false;
        }
        C0850u c0850u = this.f12905g;
        c0850u.getClass();
        l lVar = this.f12902d;
        lVar.f1847d = l.r(c0850u, (AbstractC3409K) lVar.f1845b, (k2.H) lVar.f1848e, (L) lVar.f1844a);
        a aVarG = G();
        L(aVarG, 11, new C0471v(i11, 3, aVarG, i5, i10));
    }

    @Override // N1.H
    public final void u(P1.c cVar) {
        L(G(), 27, new b(11));
    }

    @Override // N1.H
    public final void v(C0754c c0754c) {
        L(K(), 20, new Uc.l(21));
    }

    @Override // N1.H
    public final void w(z zVar) {
        L(G(), 14, new b(20));
    }

    @Override // N1.H
    public final void x(E e7) {
        k2.H h10;
        L((!(e7 instanceof C0840j) || (h10 = ((C0840j) e7).f12088h) == null) ? G() : I(h10), 10, new b(0));
    }

    @Override // k2.M
    public final void y(int i5, k2.H h10, C3168z c3168z, h2.g gVar) {
        L(J(i5, h10), 1000, new c(0));
    }

    @Override // N1.H
    public final void z(C0773w c0773w, int i5) {
        L(G(), 1, new Uc.l(16));
    }
}
