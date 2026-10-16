package okhttp3.internal.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.ab;
import okhttp3.ai;
import okhttp3.al;
import okhttp3.aq;
import okhttp3.w;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class j implements okhttp3.f {

    /* renamed from: a, reason: collision with root package name */
    private final ai f56019a;

    /* renamed from: b, reason: collision with root package name */
    private final al f56020b;

    /* renamed from: c, reason: collision with root package name */
    private final o f56021c;

    /* renamed from: d, reason: collision with root package name */
    private final w f56022d;

    /* renamed from: e, reason: collision with root package name */
    private final i f56023e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f56024f;

    /* renamed from: g, reason: collision with root package name */
    private Object f56025g;

    /* renamed from: h, reason: collision with root package name */
    private f f56026h;

    /* renamed from: i, reason: collision with root package name */
    private m f56027i;

    /* renamed from: j, reason: collision with root package name */
    private e f56028j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f56029k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f56030l;
    private boolean m;
    private volatile boolean n;
    private volatile e o;
    private volatile m p;

    public j(ai aiVar, al alVar) {
        x.f(aiVar, "client");
        x.f(alVar, "originalRequest");
        this.f56019a = aiVar;
        this.f56020b = alVar;
        this.f56021c = aiVar.z().k();
        Object obj = aiVar.A().f33818a;
        byte[] bArr = okhttp3.internal.b.f55955a;
        x.f(this, "it");
        this.f56022d = (w) obj;
        i iVar = new i(this);
        iVar.t(aiVar.a(), TimeUnit.MILLISECONDS);
        this.f56023e = iVar;
        this.f56024f = new AtomicBoolean();
        this.m = true;
    }

    public static final /* synthetic */ String g(j jVar) {
        return (true != jVar.n ? "" : "canceled ") + "call to " + jVar.h();
    }

    private final IOException w(IOException iOException) throws IOException {
        InterruptedIOException interruptedIOException;
        Socket socketI;
        byte[] bArr = okhttp3.internal.b.f55955a;
        m mVar = this.f56027i;
        if (mVar != null) {
            synchronized (mVar) {
                socketI = i();
            }
            if (this.f56027i == null) {
                if (socketI != null) {
                    okhttp3.internal.b.t(socketI);
                }
                w.c(this, mVar);
            } else if (socketI != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f56023e.m()) {
            InterruptedIOException interruptedIOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException2.initCause(iOException);
            }
            interruptedIOException = interruptedIOException2;
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            x.f(this, NotificationCompat.CATEGORY_CALL);
            return interruptedIOException;
        }
        x.c(interruptedIOException);
        x.f(this, NotificationCompat.CATEGORY_CALL);
        x.f(interruptedIOException, "ioe");
        return interruptedIOException;
    }

    private final void x() {
        this.f56025g = okhttp3.internal.g.g.f56287a.h();
        x.f(this, NotificationCompat.CATEGORY_CALL);
    }

    @Override // okhttp3.f
    public final al a() {
        return this.f56020b;
    }

    @Override // okhttp3.f
    public final aq b() {
        if (!this.f56024f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f56023e.l();
        x();
        try {
            this.f56019a.u().c(this);
            return l();
        } finally {
            this.f56019a.u().e(this);
        }
    }

    @Override // okhttp3.f
    public final void c() {
        if (this.n) {
            return;
        }
        this.n = true;
        e eVar = this.o;
        if (eVar != null) {
            eVar.f();
        }
        m mVar = this.p;
        if (mVar != null) {
            mVar.i();
        }
        x.f(this, NotificationCompat.CATEGORY_CALL);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new j(this.f56019a, this.f56020b);
    }

    @Override // okhttp3.f
    public final void d(okhttp3.g gVar) {
        x.f(gVar, "responseCallback");
        if (!this.f56024f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        x();
        this.f56019a.u().b(new g(this, gVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException e(okhttp3.internal.c.e r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            h.g.b.x.f(r3, r0)
            okhttp3.internal.c.e r0 = r2.o
            boolean r3 = h.g.b.x.n(r3, r0)
            if (r3 != 0) goto Le
            goto L59
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f56029k     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L21
            goto L1a
        L18:
            r3 = move-exception
            goto L42
        L1a:
            if (r5 == 0) goto L44
            boolean r5 = r2.f56030l     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L44
            r5 = r3
        L21:
            if (r4 == 0) goto L25
            r2.f56029k = r0     // Catch: java.lang.Throwable -> L18
        L25:
            if (r5 == 0) goto L29
            r2.f56030l = r0     // Catch: java.lang.Throwable -> L18
        L29:
            boolean r4 = r2.f56029k     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L33
            boolean r5 = r2.f56030l     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L33
            r5 = r3
            goto L34
        L33:
            r5 = r0
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.f56030l     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3f
            boolean r4 = r2.m     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r3 = r0
        L40:
            r0 = r5
            goto L45
        L42:
            monitor-exit(r2)
            throw r3
        L44:
            r3 = r0
        L45:
            monitor-exit(r2)
            if (r0 == 0) goto L52
            r4 = 0
            r2.o = r4
            okhttp3.internal.c.m r4 = r2.f56027i
            if (r4 == 0) goto L52
            r4.j()
        L52:
            if (r3 == 0) goto L59
            java.io.IOException r2 = r2.w(r6)
            return r2
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.j.e(okhttp3.internal.c.e, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException f(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.m) {
                this.m = false;
                if (!this.f56029k) {
                    if (!this.f56030l) {
                        z = true;
                    }
                }
            }
        }
        return z ? w(iOException) : iOException;
    }

    public final String h() {
        return this.f56020b.g().g();
    }

    public final Socket i() {
        m mVar = this.f56027i;
        x.c(mVar);
        byte[] bArr = okhttp3.internal.b.f55955a;
        List listE = mVar.e();
        Iterator it = listE.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (x.n(((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listE.remove(i2);
        this.f56027i = null;
        if (listE.isEmpty()) {
            mVar.n(System.nanoTime());
            if (this.f56021c.d(mVar)) {
                return mVar.c();
            }
        }
        return null;
    }

    public final ai j() {
        return this.f56019a;
    }

    public final al k() {
        return this.f56020b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.aq l() throws java.lang.Throwable {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            okhttp3.ai r1 = r11.f56019a
            java.util.List r2 = r1.h()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            h.a.i.aD(r0, r2)
            okhttp3.internal.d.i r2 = new okhttp3.internal.d.i
            r2.<init>(r1)
            r0.add(r2)
            okhttp3.internal.d.a r2 = new okhttp3.internal.d.a
            okhttp3.s r4 = r1.t()
            r2.<init>(r4)
            r0.add(r2)
            okhttp3.internal.c.a r2 = new okhttp3.internal.c.a
            r9 = 1
            r10 = 0
            r2.<init>(r9, r10)
            r0.add(r2)
            okhttp3.internal.c.a r2 = okhttp3.internal.c.a.f55982a
            r0.add(r2)
            java.util.List r2 = r1.i()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            h.a.i.aD(r0, r2)
            okhttp3.internal.d.b r2 = new okhttp3.internal.d.b
            r2.<init>()
            r0.add(r2)
            r0 = r1
            okhttp3.internal.d.g r1 = new okhttp3.internal.d.g
            okhttp3.al r6 = r11.f56020b
            int r7 = r0.b()
            int r8 = r0.c()
            r4 = 0
            r5 = 0
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            okhttp3.aq r11 = r1.g(r6)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7a
            boolean r0 = r2.n     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7a
            if (r0 != 0) goto L69
            r2.f(r10)
            return r11
        L69:
            java.io.Closeable r11 = (java.io.Closeable) r11     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7a
            okhttp3.internal.b.s(r11)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7a
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7a
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7a
            throw r11     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L7a
        L76:
            r0 = move-exception
            r11 = r0
            r9 = 0
            goto L8a
        L7a:
            r0 = move-exception
            r11 = r0
            java.io.IOException r11 = r2.f(r11)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Throwable"
            h.g.b.x.d(r11, r0)     // Catch: java.lang.Throwable -> L88
            java.lang.Throwable r11 = (java.lang.Throwable) r11     // Catch: java.lang.Throwable -> L88
            throw r11     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            r11 = r0
        L8a:
            if (r9 != 0) goto L8f
            r2.f(r10)
        L8f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.j.l():okhttp3.aq");
    }

    public final e m() {
        return this.f56028j;
    }

    public final e n(okhttp3.internal.d.g gVar) throws IOException {
        x.f(gVar, "chain");
        synchronized (this) {
            if (!this.m) {
                throw new IllegalStateException("released");
            }
            if (this.f56030l) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f56029k) {
                throw new IllegalStateException("Check failed.");
            }
        }
        f fVar = this.f56026h;
        x.c(fVar);
        e eVar = new e(this, this.f56022d, fVar, fVar.b(this.f56019a, gVar));
        this.f56028j = eVar;
        this.o = eVar;
        synchronized (this) {
            this.f56029k = true;
            this.f56030l = true;
        }
        if (this.n) {
            throw new IOException("Canceled");
        }
        return eVar;
    }

    public final m p() {
        return this.f56027i;
    }

    public final void q(m mVar) {
        x.f(mVar, "connection");
        byte[] bArr = okhttp3.internal.b.f55955a;
        if (this.f56027i != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f56027i = mVar;
        mVar.e().add(new h(this, this.f56025g));
    }

    public final void r(al alVar, boolean z) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        okhttp3.j jVarS;
        x.f(alVar, "request");
        if (this.f56028j != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f56030l) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f56029k) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (z) {
            o oVar = this.f56021c;
            ab abVarG = alVar.g();
            if (abVarG.q()) {
                ai aiVar = this.f56019a;
                SSLSocketFactory sSLSocketFactoryN = aiVar.n();
                HostnameVerifier hostnameVerifierL = aiVar.l();
                jVarS = aiVar.s();
                sSLSocketFactory = sSLSocketFactoryN;
                hostnameVerifier = hostnameVerifierL;
            } else {
                sSLSocketFactory = null;
                hostnameVerifier = null;
                jVarS = null;
            }
            String strF = abVarG.f();
            int iA = abVarG.a();
            ai aiVar2 = this.f56019a;
            this.f56026h = new f(oVar, new okhttp3.a(strF, iA, aiVar2.v(), aiVar2.k(), sSLSocketFactory, hostnameVerifier, jVarS, aiVar2.q(), aiVar2.j(), aiVar2.g(), aiVar2.d()), this, this.f56022d);
        }
    }

    public final void s(boolean z) {
        e eVar;
        synchronized (this) {
            if (!this.m) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (eVar = this.o) != null) {
            eVar.g();
        }
        this.f56028j = null;
    }

    public final void t(m mVar) {
        this.p = mVar;
    }

    public final boolean u() {
        return this.n;
    }

    public final boolean v() {
        f fVar = this.f56026h;
        x.c(fVar);
        return fVar.d();
    }
}
