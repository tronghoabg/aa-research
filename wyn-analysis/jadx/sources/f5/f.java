package F5;

import E5.C;
import E5.C0446d0;
import E5.C0450f0;
import E5.C0464n;
import E5.C0465o;
import E5.C0471v;
import E5.E;
import E5.H0;
import E5.I;
import E5.I0;
import E5.J0;
import E5.L0;
import E5.r0;
import E5.s0;
import E5.t0;
import E5.u0;
import E5.v0;
import K8.H;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import f6.C2603p;
import f6.C2608u;
import f6.C2611x;
import f6.C2613z;
import f6.InterfaceC2574D;
import h6.C2784c;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import l8.AbstractC3409K;
import l8.j0;
import r6.r;
import u6.AbstractC4256a;
import u6.q;
import u6.s;
import u6.v;
import v6.o;

/* loaded from: classes3.dex */
public final class f implements u0, InterfaceC2574D, I5.g {

    /* renamed from: a, reason: collision with root package name */
    public final q f3891a;

    /* renamed from: b, reason: collision with root package name */
    public final H0 f3892b;

    /* renamed from: c, reason: collision with root package name */
    public final I0 f3893c;

    /* renamed from: d, reason: collision with root package name */
    public final C6.l f3894d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f3895e;

    /* renamed from: f, reason: collision with root package name */
    public H f3896f;

    /* renamed from: g, reason: collision with root package name */
    public I f3897g;

    /* renamed from: h, reason: collision with root package name */
    public s f3898h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3899i;

    public f(q qVar) {
        qVar.getClass();
        this.f3891a = qVar;
        int i5 = v.f46721a;
        Looper looperMyLooper = Looper.myLooper();
        this.f3896f = new H(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, qVar, new b(5));
        H0 h02 = new H0();
        this.f3892b = h02;
        this.f3893c = new I0();
        this.f3894d = new C6.l(h02);
        this.f3895e = new SparseArray();
    }

    @Override // f6.InterfaceC2574D
    public final void A(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        O(M(i5, c2613z), BackupConstant.SCENE_BACKUP_RENDER_FAIL, new b(25));
    }

    @Override // E5.u0
    public final void B() {
        O(J(), -1, new A5.f(25));
    }

    @Override // f6.InterfaceC2574D
    public final void C(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        O(M(i5, c2613z), 1001, new b(28));
    }

    @Override // f6.InterfaceC2574D
    public final void D(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u) {
        O(M(i5, c2613z), 1000, new b(24));
    }

    @Override // E5.u0
    public final void E(C0446d0 c0446d0, int i5) {
        O(J(), 1, new A5.f(27));
    }

    @Override // E5.u0
    public final void F(C2784c c2784c) {
        O(J(), 27, new A5.f(28));
    }

    @Override // E5.u0
    public final void G(C0465o c0465o) {
        C2611x c2611x;
        O((!(c0465o instanceof C0465o) || (c2611x = c0465o.f3490h) == null) ? J() : L(new C2613z(c2611x)), 10, new b(12));
    }

    @Override // f6.InterfaceC2574D
    public final void H(int i5, C2613z c2613z, C2608u c2608u) {
        a aVarM = M(i5, c2613z);
        O(aVarM, 1004, new A5.h(3, aVarM, c2608u));
    }

    @Override // E5.u0
    public final void I(C0450f0 c0450f0) {
        O(J(), 14, new d(6));
    }

    public final a J() {
        return L((C2613z) this.f3894d.f1847d);
    }

    public final a K(J0 j02, int i5, C2613z c2613z) {
        C2613z c2613z2 = j02.p() ? null : c2613z;
        this.f3891a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = j02.equals(this.f3897g.o0()) && i5 == this.f3897g.l0();
        long jF = 0;
        if (c2613z2 == null || !c2613z2.a()) {
            if (z2) {
                jF = this.f3897g.i0();
            } else if (!j02.p()) {
                jF = v.F(j02.m(i5, this.f3893c, 0L).f3120l);
            }
        } else if (z2 && this.f3897g.j0() == c2613z2.f35113b && this.f3897g.k0() == c2613z2.f35114c) {
            jF = this.f3897g.m0();
        }
        C2613z c2613z3 = (C2613z) this.f3894d.f1847d;
        J0 j0O0 = this.f3897g.o0();
        int iL0 = this.f3897g.l0();
        long jM0 = this.f3897g.m0();
        I i10 = this.f3897g;
        i10.Q0();
        return new a(jElapsedRealtime, j02, i5, c2613z2, jF, j0O0, iL0, c2613z3, jM0, v.F(i10.f3089j0.f3514q));
    }

    public final a L(C2613z c2613z) {
        this.f3897g.getClass();
        J0 j02 = c2613z == null ? null : (J0) ((j0) this.f3894d.f1846c).get(c2613z);
        if (c2613z != null && j02 != null) {
            return K(j02, j02.g(c2613z.f35112a, this.f3892b).f3041c, c2613z);
        }
        int iL0 = this.f3897g.l0();
        J0 j0O0 = this.f3897g.o0();
        if (iL0 >= j0O0.o()) {
            j0O0 = J0.f3127a;
        }
        return K(j0O0, iL0, null);
    }

    public final a M(int i5, C2613z c2613z) {
        this.f3897g.getClass();
        J0 j02 = J0.f3127a;
        if (c2613z != null) {
            return ((J0) ((j0) this.f3894d.f1846c).get(c2613z)) != null ? L(c2613z) : K(j02, i5, c2613z);
        }
        J0 j0O0 = this.f3897g.o0();
        if (i5 < j0O0.o()) {
            j02 = j0O0;
        }
        return K(j02, i5, null);
    }

    public final a N() {
        return L((C2613z) this.f3894d.f1849f);
    }

    public final void O(a aVar, int i5, u6.g gVar) {
        this.f3895e.put(i5, aVar);
        this.f3896f.p(i5, gVar);
    }

    public final void P(I i5, Looper looper) {
        AbstractC4256a.i(this.f3897g == null || ((AbstractC3409K) this.f3894d.f1845b).isEmpty());
        i5.getClass();
        this.f3897g = i5;
        this.f3898h = this.f3891a.a(looper, null);
        H h10 = this.f3896f;
        this.f3896f = new H((CopyOnWriteArraySet) h10.f6586e, looper, (q) h10.f6583b, new A5.h(2, this, i5));
    }

    @Override // E5.u0
    public final void a(int i5) {
        O(J(), 6, new b(13));
    }

    @Override // E5.u0
    public final void b(int i5) {
        O(J(), 4, new b(3));
    }

    @Override // E5.u0
    public final void c(boolean z2) {
        O(J(), 9, new d(4));
    }

    @Override // E5.u0
    public final void d(int i5) {
        I i10 = this.f3897g;
        i10.getClass();
        C6.l lVar = this.f3894d;
        lVar.f1847d = C6.l.q(i10, (AbstractC3409K) lVar.f1845b, (C2613z) lVar.f1848e, (H0) lVar.f1844a);
        lVar.E(i10.o0());
        O(J(), 0, new b(17));
    }

    @Override // E5.u0
    public final void e(boolean z2) {
        O(N(), 23, new d(1));
    }

    @Override // E5.u0
    public final void f(List list) {
        a aVarJ = J();
        O(aVarJ, 27, new C(aVarJ, list, 1));
    }

    @Override // E5.u0
    public final void g(int i5, int i10) {
        O(N(), 24, new A5.f(26));
    }

    @Override // E5.u0
    public final void h(boolean z2) {
        O(J(), 3, new b(18));
    }

    @Override // E5.u0
    public final void i(int i5, boolean z2) {
        O(J(), 5, new A5.f(29));
    }

    @Override // E5.u0
    public final void j(float f10) {
        O(N(), 22, new b(19));
    }

    @Override // E5.u0
    public final void k(int i5) {
        O(J(), 8, new b(8));
    }

    @Override // E5.u0
    public final void l(int i5, boolean z2) {
        O(J(), -1, new A5.f(23));
    }

    @Override // E5.u0
    public final void m(boolean z2) {
        O(J(), 7, new b(27));
    }

    @Override // f6.InterfaceC2574D
    public final void o(int i5, C2613z c2613z, C2603p c2603p, C2608u c2608u, IOException iOException, boolean z2) {
        a aVarM = M(i5, c2613z);
        O(aVarM, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, new B8.b(aVarM, c2603p, c2608u, iOException, z2));
    }

    @Override // E5.u0
    public final void p(v0 v0Var, v0 v0Var2, int i5) {
        if (i5 == 1) {
            this.f3899i = false;
        }
        I i10 = this.f3897g;
        i10.getClass();
        C6.l lVar = this.f3894d;
        lVar.f1847d = C6.l.q(i10, (AbstractC3409K) lVar.f1845b, (C2613z) lVar.f1848e, (H0) lVar.f1844a);
        a aVarJ = J();
        O(aVarJ, 11, new C0471v(i5, 1, aVarJ, v0Var, v0Var2));
    }

    @Override // E5.u0
    public final void q(s0 s0Var) {
        O(J(), 13, new b(0));
    }

    @Override // E5.u0
    public final void r(r0 r0Var) {
        O(J(), 12, new A5.f(22));
    }

    @Override // E5.u0
    public final void s(C0464n c0464n) {
        O(J(), 29, new b(20));
    }

    @Override // E5.u0
    public final void t(int i5, boolean z2) {
        O(J(), 30, new b(21));
    }

    @Override // E5.u0
    public final void u(L0 l02) {
        O(J(), 2, new b(10));
    }

    @Override // E5.u0
    public final void v(r rVar) {
        O(J(), 19, new d(0));
    }

    @Override // E5.u0
    public final void x(o oVar) {
        a aVarN = N();
        O(aVarN, 25, new E(aVarN, oVar));
    }

    @Override // E5.u0
    public final void y(C0465o c0465o) {
        C2611x c2611x;
        a aVarJ = (!(c0465o instanceof C0465o) || (c2611x = c0465o.f3490h) == null) ? J() : L(new C2613z(c2611x));
        O(aVarJ, 10, new B8.b(aVarJ, c0465o, 10));
    }

    @Override // E5.u0
    public final void z(W5.c cVar) {
        O(J(), 28, new b(22));
    }

    @Override // E5.u0
    public final void w() {
    }

    @Override // E5.u0
    public final void n(t0 t0Var) {
    }
}
