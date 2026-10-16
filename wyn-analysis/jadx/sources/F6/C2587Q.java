package f6;

import A.e0;
import E5.C0440a0;
import E5.C0446d0;
import E5.J0;
import android.net.Uri;
import android.os.Looper;
import g5.RunnableC2707d;
import java.util.concurrent.ExecutorService;
import t6.C4129E;
import t6.HandlerC4127C;
import t6.InterfaceC4143k;
import t6.InterfaceC4144l;
import u6.AbstractC4256a;

/* renamed from: f6.Q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2587Q extends AbstractC2588a {

    /* renamed from: h, reason: collision with root package name */
    public final C0446d0 f34959h;

    /* renamed from: i, reason: collision with root package name */
    public final C0440a0 f34960i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC4143k f34961j;
    public final com.unity3d.services.core.webview.b k;

    /* renamed from: l, reason: collision with root package name */
    public final I5.i f34962l;

    /* renamed from: m, reason: collision with root package name */
    public final ae.d f34963m;

    /* renamed from: n, reason: collision with root package name */
    public final int f34964n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34965o;

    /* renamed from: p, reason: collision with root package name */
    public long f34966p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34967q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34968r;

    /* renamed from: s, reason: collision with root package name */
    public t6.K f34969s;

    public C2587Q(C0446d0 c0446d0, InterfaceC4143k interfaceC4143k, com.unity3d.services.core.webview.b bVar, I5.i iVar, ae.d dVar, int i5) {
        C0440a0 c0440a0 = c0446d0.f3305b;
        c0440a0.getClass();
        this.f34960i = c0440a0;
        this.f34959h = c0446d0;
        this.f34961j = interfaceC4143k;
        this.k = bVar;
        this.f34962l = iVar;
        this.f34963m = dVar;
        this.f34964n = i5;
        this.f34965o = true;
        this.f34966p = -9223372036854775807L;
    }

    @Override // f6.AbstractC2588a
    public final InterfaceC2610w a(C2613z c2613z, o2.e eVar, long j8) {
        InterfaceC4144l interfaceC4144lB = this.f34961j.b();
        t6.K k = this.f34969s;
        if (k != null) {
            interfaceC4144lB.z(k);
        }
        Uri uri = this.f34960i.f3282a;
        AbstractC4256a.j(this.f35028g);
        int i5 = 0;
        return new C2584N(uri, interfaceC4144lB, new b7.k((J5.i) this.k.f32729b), this.f34962l, new I5.f(this.f35025d.f5394c, i5, c2613z), this.f34963m, new I5.f(this.f35024c.f5394c, i5, c2613z), this, eVar, this.f34964n);
    }

    @Override // f6.AbstractC2588a
    public final C0446d0 g() {
        return this.f34959h;
    }

    @Override // f6.AbstractC2588a
    public final void k(t6.K k) {
        this.f34969s = k;
        I5.i iVar = this.f34962l;
        iVar.f();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        F5.l lVar = this.f35028g;
        AbstractC4256a.j(lVar);
        iVar.g(looperMyLooper, lVar);
        r();
    }

    @Override // f6.AbstractC2588a
    public final void m(InterfaceC2610w interfaceC2610w) {
        C2584N c2584n = (C2584N) interfaceC2610w;
        if (c2584n.f34948u) {
            for (U u10 : c2584n.f34945r) {
                u10.g();
                e0 e0Var = u10.f34989h;
                if (e0Var != null) {
                    e0Var.y(u10.f34986e);
                    u10.f34989h = null;
                    u10.f34988g = null;
                }
            }
        }
        C4129E c4129e = c2584n.f34938j;
        HandlerC4127C handlerC4127C = c4129e.f45821b;
        if (handlerC4127C != null) {
            handlerC4127C.a(true);
        }
        RunnableC2707d runnableC2707d = new RunnableC2707d(c2584n, 25);
        ExecutorService executorService = c4129e.f45820a;
        executorService.execute(runnableC2707d);
        executorService.shutdown();
        c2584n.f34942o.removeCallbacksAndMessages(null);
        c2584n.f34943p = null;
        c2584n.f34928K = true;
    }

    @Override // f6.AbstractC2588a
    public final void o() {
        this.f34962l.release();
    }

    public final void r() {
        J0 y10 = new Y(this.f34966p, this.f34967q, this.f34968r, this.f34959h);
        if (this.f34965o) {
            y10 = new C2585O(y10);
        }
        l(y10);
    }

    public final void s(long j8, boolean z2, boolean z10) {
        if (j8 == -9223372036854775807L) {
            j8 = this.f34966p;
        }
        if (!this.f34965o && this.f34966p == j8 && this.f34967q == z2 && this.f34968r == z10) {
            return;
        }
        this.f34966p = j8;
        this.f34967q = z2;
        this.f34968r = z10;
        this.f34965o = false;
        r();
    }

    @Override // f6.AbstractC2588a
    public final void i() {
    }
}
