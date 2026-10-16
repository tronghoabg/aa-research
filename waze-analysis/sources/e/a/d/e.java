package e.a.d;

import androidx.core.app.NotificationCompat;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class e implements h, gf {

    /* renamed from: a, reason: collision with root package name */
    private final Object f46840a;

    /* renamed from: b, reason: collision with root package name */
    private final kc f46841b;

    /* renamed from: c, reason: collision with root package name */
    private final gi f46842c;

    /* renamed from: d, reason: collision with root package name */
    private int f46843d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46844e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46845f;

    /* renamed from: g, reason: collision with root package name */
    private int f46846g;

    /* renamed from: h, reason: collision with root package name */
    private final jt f46847h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46848i;

    /* renamed from: j, reason: collision with root package name */
    private ah f46849j;

    /* renamed from: k, reason: collision with root package name */
    private e.a.ag f46850k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f46851l;
    private Runnable m;
    private volatile boolean n;
    private boolean o;
    private boolean p;
    private gi q;

    protected e(int i2, jt jtVar, kc kcVar, e.a.h hVar) {
        Object obj = new Object();
        this.f46840a = obj;
        this.f46841b = kcVar;
        gi giVar = new gi(this, e.a.q.f47844a, i2, jtVar, kcVar);
        this.f46842c = giVar;
        this.q = giVar;
        this.f46846g = 32768;
        this.f46850k = e.a.ag.b();
        this.f46851l = false;
        this.f46847h = jtVar;
        if (hVar.o() != null) {
            int iIntValue = hVar.o().intValue();
            synchronized (obj) {
                this.f46846g = iIntValue;
            }
        }
    }

    static /* bridge */ /* synthetic */ void b(e eVar, int i2) {
        synchronized (eVar.f46840a) {
            eVar.f46843d += i2;
        }
    }

    static /* bridge */ /* synthetic */ void c(e eVar, int i2) {
        gi giVar = eVar.q;
        int i3 = e.b.b.f47862a;
        eVar.v(new az(eVar, i2, 1));
    }

    static /* bridge */ /* synthetic */ void s(e eVar, e.a.ag agVar) {
        com.google.d.b.an.v(eVar.f46849j == null, "Already called start");
        com.google.d.b.an.C(agVar, "decompressorRegistry");
        eVar.f46850k = agVar;
    }

    private final void w() {
        boolean zX;
        synchronized (this.f46840a) {
            zX = x();
            if (!zX && f.f46913a.isLoggable(Level.FINEST)) {
                f.f46913a.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.f46844e), Integer.valueOf(this.f46843d), Integer.valueOf(this.f46846g), Boolean.valueOf(this.f46845f)});
            }
        }
        if (zX) {
            this.f46849j.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x() {
        boolean z;
        synchronized (this.f46840a) {
            z = false;
            if (this.f46844e && this.f46843d < this.f46846g && !this.f46845f) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        if (this.f46848i) {
            return;
        }
        this.f46848i = true;
        this.f46847h.m();
        this.f46841b.f(eeVar.l());
        this.f46849j.c(eeVar, agVar, cmVar);
    }

    protected final kc a() {
        return this.f46841b;
    }

    @Override // e.a.d.gf
    public final void d(jv jvVar) {
        this.f46849j.e(jvVar);
    }

    public final void e(int i2) {
        boolean z;
        synchronized (this.f46840a) {
            com.google.d.b.an.v(this.f46844e, "onStreamAllocated was not called, but it seems the stream is active");
            int i3 = this.f46843d;
            int i4 = this.f46846g;
            int i5 = i3 - i2;
            this.f46843d = i5;
            z = false;
            if (i3 >= i4 && i5 < i4) {
                z = true;
            }
        }
        if (z) {
            w();
        }
    }

    protected final void f() {
        com.google.d.b.an.u(this.f46849j != null);
        synchronized (this.f46840a) {
            com.google.d.b.an.v(!this.f46844e, "Already allocated");
            this.f46844e = true;
        }
        w();
    }

    final void g() {
        gi giVar = this.f46842c;
        giVar.e(this);
        this.q = giVar;
    }

    final void h(int i2) {
        this.q.f(i2);
    }

    @Override // e.a.d.gf
    public void j(boolean z) {
        com.google.d.b.an.v(this.o, "status should have been reported on deframer closed");
        this.f46851l = true;
        if (this.p && z) {
            o(e.a.ee.f47410j.g("Encountered end-of-stream mid-frame"), true, new e.a.cm());
        }
        Runnable runnable = this.m;
        if (runnable != null) {
            runnable.run();
            this.m = null;
        }
    }

    protected final void k(ho hoVar) throws Throwable {
        boolean z = true;
        try {
            if (this.o) {
                c.f46711a.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                hoVar.close();
                return;
            }
            try {
                this.q.b(hoVar);
            } catch (Throwable th) {
                try {
                    B(th);
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    if (z) {
                        hoVar.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected final void l(e.a.cm cmVar) {
        com.google.d.b.an.v(!this.o, "Received headers on closed stream");
        this.f46847h.c();
        String str = (String) cmVar.e(dh.f46792b);
        if (str != null) {
            e.a.ae aeVarA = this.f46850k.a(str);
            if (aeVarA == null) {
                B(new e.a.eh(e.a.ee.f47410j.g(String.format("Can't find decompressor for %s", str))));
                return;
            } else if (aeVarA != e.a.q.f47844a) {
                this.q.d(aeVarA);
            }
        }
        this.f46849j.d(cmVar);
    }

    protected final void m(e.a.cm cmVar, e.a.ee eeVar) {
        if (this.o) {
            c.f46711a.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{eeVar, cmVar});
        } else {
            this.f46847h.d();
            o(eeVar, false, cmVar);
        }
    }

    public final void n(ah ahVar) {
        com.google.d.b.an.v(this.f46849j == null, "Already called setListener");
        this.f46849j = ahVar;
    }

    public final void o(e.a.ee eeVar, boolean z, e.a.cm cmVar) {
        p(eeVar, ag.f46605a, z, cmVar);
    }

    public final void p(e.a.ee eeVar, ag agVar, boolean z, e.a.cm cmVar) {
        com.google.d.b.an.C(eeVar, NotificationCompat.CATEGORY_STATUS);
        com.google.d.b.an.C(cmVar, "trailers");
        if (this.o) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.o = true;
        this.p = eeVar.l();
        synchronized (this.f46840a) {
            this.f46845f = true;
        }
        if (this.f46851l) {
            this.m = null;
            y(eeVar, agVar, cmVar);
            return;
        }
        this.m = new b(this, eeVar, agVar, cmVar);
        gi giVar = this.q;
        if (z) {
            giVar.close();
        } else {
            giVar.a();
        }
    }

    protected final boolean q() {
        return this.n;
    }
}
