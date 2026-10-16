package pd;

import cg.C1614c;
import cg.C1618g;
import cg.F;
import cg.J;
import g5.RunnableC2707d;
import java.io.IOException;
import java.net.Socket;
import od.P1;

/* loaded from: classes5.dex */
public final class c implements F {

    /* renamed from: c, reason: collision with root package name */
    public final P1 f43469c;

    /* renamed from: d, reason: collision with root package name */
    public final m f43470d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43471e;

    /* renamed from: i, reason: collision with root package name */
    public C1614c f43475i;

    /* renamed from: j, reason: collision with root package name */
    public Socket f43476j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f43477l;

    /* renamed from: m, reason: collision with root package name */
    public int f43478m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f43467a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C1618g f43468b = new C1618g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f43472f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43473g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43474h = false;

    public c(P1 p12, m mVar) {
        Fe.e.t(p12, "executor");
        this.f43469c = p12;
        this.f43470d = mVar;
        this.f43471e = 10000;
    }

    @Override // cg.F
    public final void E(C1618g c1618g, long j8) throws IOException {
        Fe.e.t(c1618g, "source");
        if (this.f43474h) {
            throw new IOException("closed");
        }
        Xd.b.c();
        try {
            synchronized (this.f43467a) {
                try {
                    this.f43468b.E(c1618g, j8);
                    int i5 = this.f43478m + this.f43477l;
                    this.f43478m = i5;
                    boolean z2 = false;
                    this.f43477l = 0;
                    if (!this.k && i5 > this.f43471e) {
                        this.k = true;
                        z2 = true;
                    } else if (!this.f43472f && !this.f43473g && this.f43468b.d() > 0) {
                        this.f43472f = true;
                    }
                    if (z2) {
                        try {
                            this.f43476j.close();
                        } catch (IOException e7) {
                            this.f43470d.q(e7);
                        }
                        Xd.b.f16226a.getClass();
                        return;
                    }
                    this.f43469c.execute(new C3792a(this, 0));
                } finally {
                }
            }
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

    public final void a(C1614c c1614c, Socket socket) {
        Fe.e.w("AsyncSink's becomeConnected should only be called once.", this.f43475i == null);
        this.f43475i = c1614c;
        this.f43476j = socket;
    }

    @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f43474h) {
            return;
        }
        this.f43474h = true;
        this.f43469c.execute(new RunnableC2707d(this, 17));
    }

    @Override // cg.F, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f43474h) {
            throw new IOException("closed");
        }
        Xd.b.c();
        try {
            synchronized (this.f43467a) {
                if (!this.f43473g) {
                    this.f43473g = true;
                    this.f43469c.execute(new C3792a(this, 1));
                }
            }
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

    @Override // cg.F
    public final J timeout() {
        return J.f19879d;
    }
}
