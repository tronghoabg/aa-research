package od;

import A7.C0237b0;
import Va.X7;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import md.AbstractC3537e;
import md.AbstractC3538f;
import md.C3535c;
import md.C3544l;
import md.C3549q;
import md.C3551t;

/* renamed from: od.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3716q extends AbstractC3538f {

    /* renamed from: q, reason: collision with root package name */
    public static final Logger f42058q = Logger.getLogger(C3716q.class.getName());

    /* renamed from: r, reason: collision with root package name */
    public static final double f42059r;

    /* renamed from: a, reason: collision with root package name */
    public final F6.r f42060a;

    /* renamed from: b, reason: collision with root package name */
    public final Xd.c f42061b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f42062c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42063d;

    /* renamed from: e, reason: collision with root package name */
    public final X7 f42064e;

    /* renamed from: f, reason: collision with root package name */
    public final C3549q f42065f;

    /* renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture f42066g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f42067h;

    /* renamed from: i, reason: collision with root package name */
    public C3535c f42068i;

    /* renamed from: j, reason: collision with root package name */
    public r f42069j;
    public volatile boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42070l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42071m;

    /* renamed from: n, reason: collision with root package name */
    public final d7.j f42072n;

    /* renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f42073o;

    /* renamed from: p, reason: collision with root package name */
    public C3551t f42074p = C3551t.f40724d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f42059r = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public C3716q(F6.r rVar, Executor executor, C3535c c3535c, d7.j jVar, ScheduledExecutorService scheduledExecutorService, X7 x72) {
        C3544l c3544l = C3544l.f40688b;
        this.f42060a = rVar;
        Object obj = rVar.f4012c;
        System.identityHashCode(this);
        Xd.b.f16226a.getClass();
        this.f42061b = Xd.a.f16224a;
        if (executor == p8.n.f43298a) {
            this.f42062c = new M1();
            this.f42063d = true;
        } else {
            this.f42062c = new P1(executor);
            this.f42063d = false;
        }
        this.f42064e = x72;
        this.f42065f = C3549q.b();
        md.c0 c0Var = md.c0.f40628a;
        md.c0 c0Var2 = (md.c0) rVar.f4014e;
        this.f42067h = c0Var2 == c0Var || c0Var2 == md.c0.f40629b;
        this.f42068i = c3535c;
        this.f42072n = jVar;
        this.f42073o = scheduledExecutorService;
    }

    @Override // md.AbstractC3538f
    public final void a(String str, Throwable th) {
        Xd.b.c();
        try {
            Xd.b.a();
            f(str, th);
            Xd.b.f16226a.getClass();
        } catch (Throwable th2) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // md.AbstractC3538f
    public final void b() {
        Xd.b.c();
        try {
            Xd.b.a();
            Fe.e.w("Not started", this.f42069j != null);
            Fe.e.w("call was cancelled", !this.f42070l);
            Fe.e.w("call already half-closed", !this.f42071m);
            this.f42071m = true;
            this.f42069j.j();
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // md.AbstractC3538f
    public final void c(int i5) {
        Xd.b.c();
        try {
            Xd.b.a();
            Fe.e.w("Not started", this.f42069j != null);
            Fe.e.p("Number requested must be non-negative", i5 >= 0);
            this.f42069j.d(i5);
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // md.AbstractC3538f
    public final void d(Object obj) {
        Xd.b.c();
        try {
            Xd.b.a();
            h(obj);
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // md.AbstractC3538f
    public final void e(AbstractC3537e abstractC3537e, md.b0 b0Var) {
        Xd.b.c();
        try {
            Xd.b.a();
            i(abstractC3537e, b0Var);
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f42058q.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f42070l) {
            return;
        }
        this.f42070l = true;
        try {
            if (this.f42069j != null) {
                md.k0 k0Var = md.k0.f40675f;
                md.k0 k0VarH = str != null ? k0Var.h(str) : k0Var.h("Call cancelled without message");
                if (th != null) {
                    k0VarH = k0VarH.g(th);
                }
                this.f42069j.g(k0VarH);
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public final void g() {
        this.f42065f.getClass();
        ScheduledFuture scheduledFuture = this.f42066g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(Object obj) {
        Fe.e.w("Not started", this.f42069j != null);
        Fe.e.w("call was cancelled", !this.f42070l);
        Fe.e.w("call was half-closed", !this.f42071m);
        try {
            r rVar = this.f42069j;
            if (rVar instanceof B0) {
                ((B0) rVar).v(obj);
            } else {
                rVar.c(this.f42060a.f(obj));
            }
            if (this.f42067h) {
                return;
            }
            this.f42069j.flush();
        } catch (Error e7) {
            this.f42069j.g(md.k0.f40675f.h("Client sendMessage() failed with Error"));
            throw e7;
        } catch (RuntimeException e10) {
            this.f42069j.g(md.k0.f40675f.g(e10).h("Failed to stream message"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(md.AbstractC3537e r17, md.b0 r18) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: od.C3716q.i(md.e, md.b0):void");
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f42060a, "method");
        return c0237b0S.toString();
    }
}
