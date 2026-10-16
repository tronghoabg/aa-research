package e.a.d;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends e.a.k {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46593a = Logger.getLogger(ae.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final double f46594b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.cq f46595c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f46596d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f46597e;

    /* renamed from: f, reason: collision with root package name */
    private final u f46598f;

    /* renamed from: g, reason: collision with root package name */
    private final e.a.ac f46599g;

    /* renamed from: h, reason: collision with root package name */
    private y f46600h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f46601i;

    /* renamed from: j, reason: collision with root package name */
    private e.a.h f46602j;

    /* renamed from: k, reason: collision with root package name */
    private af f46603k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f46604l;
    private boolean m;
    private final ScheduledExecutorService n;
    private e.a.ag o = e.a.ag.b();
    private e.a.t p = e.a.t.b();
    private final et q;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f46594b = 1.0E9d;
    }

    ae(e.a.cq cqVar, Executor executor, e.a.h hVar, et etVar, ScheduledExecutorService scheduledExecutorService, u uVar) {
        this.f46595c = cqVar;
        cqVar.f();
        System.identityHashCode(this);
        int i2 = e.b.b.f47862a;
        if (executor == com.google.d.m.a.cf.y()) {
            this.f46596d = new jf();
            this.f46597e = true;
        } else {
            this.f46596d = new jj(executor);
            this.f46597e = false;
        }
        this.f46598f = uVar;
        this.f46599g = e.a.ac.g();
        this.f46601i = cqVar.b() == e.a.cp.f46544a || cqVar.b() == e.a.cp.f46546c;
        this.f46602j = hVar;
        this.q = etVar;
        this.n = scheduledExecutorService;
    }

    static /* bridge */ /* synthetic */ void s(com.waze.uid.f fVar, e.a.ee eeVar, e.a.cm cmVar) {
        try {
            fVar.a(eeVar, cmVar);
        } catch (RuntimeException e2) {
            f46593a.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a.ad t() {
        e.a.ad adVarL = this.f46602j.l();
        this.f46599g.d();
        if (adVarL == null) {
            return null;
        }
        return adVarL;
    }

    private final void u(Object obj) {
        com.google.d.b.an.v(this.f46603k != null, "Not started");
        com.google.d.b.an.v(!this.f46604l, "call was cancelled");
        com.google.d.b.an.v(!this.m, "call was half-closed");
        try {
            af afVar = this.f46603k;
            if (afVar instanceof iy) {
                ((iy) afVar).W(obj);
            } else {
                afVar.n(this.f46595c.c(obj));
            }
            if (this.f46601i) {
                return;
            }
            this.f46603k.d();
        } catch (Error e2) {
            this.f46603k.c(e.a.ee.f47402b.g("Client sendMessage() failed with Error"));
            throw e2;
        } catch (RuntimeException e3) {
            this.f46603k.c(e.a.ee.f47402b.f(e3).g("Failed to stream message"));
        }
    }

    @Override // e.a.k
    public final void a(String str, Throwable th) {
        int i2 = e.b.b.f47862a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            f46593a.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.f46604l) {
            return;
        }
        this.f46604l = true;
        try {
            if (this.f46603k != null) {
                e.a.ee eeVar = e.a.ee.f47402b;
                e.a.ee eeVarG = str != null ? eeVar.g(str) : eeVar.g("Call cancelled without message");
                if (th != null) {
                    eeVarG = eeVarG.f(th);
                }
                this.f46603k.c(eeVarG);
            }
            y yVar = this.f46600h;
            if (yVar != null) {
                yVar.d();
            }
        } finally {
        }
    }

    @Override // e.a.k
    public final void b() {
        int i2 = e.b.b.f47862a;
        com.google.d.b.an.v(this.f46603k != null, "Not started");
        com.google.d.b.an.v(!this.f46604l, "call was cancelled");
        com.google.d.b.an.v(!this.m, "call already half-closed");
        this.m = true;
        this.f46603k.e();
    }

    @Override // e.a.k
    public final void c(int i2) {
        int i3 = e.b.b.f47862a;
        com.google.d.b.an.v(this.f46603k != null, "Not started");
        com.google.d.b.an.m(i2 >= 0, "Number requested must be non-negative");
        this.f46603k.g(i2);
    }

    @Override // e.a.k
    public final void d(Object obj) {
        int i2 = e.b.b.f47862a;
        u(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    @Override // e.a.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.waze.uid.f r18, e.a.cm r19) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.ae.e(com.waze.uid.f, e.a.cm):void");
    }

    @Override // e.a.k
    public final boolean i() {
        if (this.m) {
            return false;
        }
        return this.f46603k.o();
    }

    final void q(e.a.t tVar) {
        this.p = tVar;
    }

    final void r(e.a.ag agVar) {
        this.o = agVar;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("method", this.f46595c);
        return zVarH.toString();
    }
}
