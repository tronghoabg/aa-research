package okhttp3.internal.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import k.al;
import k.ao;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final int f56112a;

    /* renamed from: b, reason: collision with root package name */
    private final w f56113b;

    /* renamed from: c, reason: collision with root package name */
    private long f56114c;

    /* renamed from: d, reason: collision with root package name */
    private long f56115d;

    /* renamed from: e, reason: collision with root package name */
    private long f56116e;

    /* renamed from: f, reason: collision with root package name */
    private long f56117f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f56118g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f56119h;

    /* renamed from: i, reason: collision with root package name */
    private final ab f56120i;

    /* renamed from: j, reason: collision with root package name */
    private final aa f56121j;

    /* renamed from: k, reason: collision with root package name */
    private final ac f56122k;

    /* renamed from: l, reason: collision with root package name */
    private final ac f56123l;
    private b m;
    private IOException n;

    public ad(int i2, w wVar, boolean z, boolean z2, okhttp3.z zVar) {
        h.g.b.x.f(wVar, "connection");
        this.f56112a = i2;
        this.f56113b = wVar;
        this.f56117f = wVar.T().h();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f56118g = arrayDeque;
        this.f56120i = new ab(this, wVar.S().h(), z2);
        this.f56121j = new aa(this, z);
        this.f56122k = new ac(this);
        this.f56123l = new ac(this);
        if (zVar == null) {
            if (!C()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (C()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(zVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r1.f56121j.b() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean E(okhttp3.internal.f.b r2, java.io.IOException r3) {
        /*
            r1 = this;
            byte[] r0 = okhttp3.internal.b.f55955a
            monitor-enter(r1)
            okhttp3.internal.f.b r0 = r1.m     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L8
            goto L22
        L8:
            r1.m = r2     // Catch: java.lang.Throwable -> L2f
            r1.n = r3     // Catch: java.lang.Throwable -> L2f
            r2 = r1
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L2f
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2f
            okhttp3.internal.f.ab r2 = r1.f56120i     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.d()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L25
            okhttp3.internal.f.aa r2 = r1.f56121j     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L25
        L22:
            monitor-exit(r1)
            r1 = 0
            return r1
        L25:
            monitor-exit(r1)
            okhttp3.internal.f.w r2 = r1.f56113b
            int r1 = r1.f56112a
            r2.p(r1)
            r1 = 1
            return r1
        L2f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.f.ad.E(okhttp3.internal.f.b, java.io.IOException):boolean");
    }

    public final void A(long j2) {
        this.f56116e = j2;
    }

    public final void B() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean C() {
        return (this.f56112a & 1) == 1;
    }

    public final synchronized boolean D() {
        if (this.m != null) {
            return false;
        }
        ab abVar = this.f56120i;
        if (abVar.d() || abVar.c()) {
            aa aaVar = this.f56121j;
            if (aaVar.b() || aaVar.a()) {
                if (this.f56119h) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int a() {
        return this.f56112a;
    }

    public final long b() {
        return this.f56115d;
    }

    public final long c() {
        return this.f56114c;
    }

    public final long d() {
        return this.f56117f;
    }

    public final long e() {
        return this.f56116e;
    }

    public final IOException f() {
        return this.n;
    }

    public final synchronized okhttp3.z g() {
        Object objRemoveFirst;
        this.f56122k.l();
        while (this.f56118g.isEmpty() && this.m == null) {
            try {
                B();
            } catch (Throwable th) {
                this.f56122k.b();
                throw th;
            }
        }
        this.f56122k.b();
        ArrayDeque arrayDeque = this.f56118g;
        if (arrayDeque.isEmpty()) {
            Throwable ajVar = this.n;
            if (ajVar == null) {
                b bVar = this.m;
                h.g.b.x.c(bVar);
                ajVar = new aj(bVar);
            }
            throw ajVar;
        }
        objRemoveFirst = arrayDeque.removeFirst();
        h.g.b.x.e(objRemoveFirst, "removeFirst(...)");
        return (okhttp3.z) objRemoveFirst;
    }

    public final synchronized b h() {
        return this.m;
    }

    public final w i() {
        return this.f56113b;
    }

    public final aa j() {
        return this.f56121j;
    }

    public final ab k() {
        return this.f56120i;
    }

    public final ac l() {
        return this.f56122k;
    }

    public final ac m() {
        return this.f56123l;
    }

    public final al n() {
        synchronized (this) {
            if (!this.f56119h && !C()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f56121j;
    }

    public final ao o() {
        return this.f56122k;
    }

    public final ao p() {
        return this.f56123l;
    }

    public final void q(long j2) {
        this.f56117f += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void r() {
        boolean z;
        boolean zD;
        byte[] bArr = okhttp3.internal.b.f55955a;
        synchronized (this) {
            ab abVar = this.f56120i;
            z = false;
            if (!abVar.d() && abVar.c()) {
                aa aaVar = this.f56121j;
                if (aaVar.b() || aaVar.a()) {
                    z = true;
                }
            }
            zD = D();
        }
        if (z) {
            t(b.f56147i, null);
        } else {
            if (zD) {
                return;
            }
            this.f56113b.p(this.f56112a);
        }
    }

    public final void s() throws Throwable {
        aa aaVar = this.f56121j;
        if (aaVar.a()) {
            throw new IOException("stream closed");
        }
        if (aaVar.b()) {
            throw new IOException("stream finished");
        }
        b bVar = this.m;
        if (bVar != null) {
            Throwable ajVar = this.n;
            if (ajVar == null) {
                ajVar = new aj(bVar);
            }
            throw ajVar;
        }
    }

    public final void t(b bVar, IOException iOException) {
        h.g.b.x.f(bVar, "rstStatusCode");
        if (E(bVar, iOException)) {
            this.f56113b.H(this.f56112a, bVar);
        }
    }

    public final void u(b bVar) {
        h.g.b.x.f(bVar, "errorCode");
        if (E(bVar, null)) {
            this.f56113b.I(this.f56112a, bVar);
        }
    }

    public final void v(k.j jVar, int i2) {
        h.g.b.x.f(jVar, "source");
        byte[] bArr = okhttp3.internal.b.f55955a;
        this.f56120i.b(jVar, i2);
    }

    public final void w(okhttp3.z zVar, boolean z) {
        boolean zD;
        h.g.b.x.f(zVar, "headers");
        byte[] bArr = okhttp3.internal.b.f55955a;
        synchronized (this) {
            if (this.f56119h) {
                if (!z) {
                    z = false;
                    this.f56119h = true;
                    this.f56118g.add(zVar);
                    if (z) {
                    }
                    zD = D();
                    notifyAll();
                }
                this.f56120i.e();
                zD = D();
                notifyAll();
            } else {
                this.f56119h = true;
                this.f56118g.add(zVar);
                if (z) {
                    this.f56120i.e();
                }
                zD = D();
                notifyAll();
            }
        }
        if (zD) {
            return;
        }
        this.f56113b.p(this.f56112a);
    }

    public final synchronized void x(b bVar) {
        h.g.b.x.f(bVar, "errorCode");
        if (this.m == null) {
            this.m = bVar;
            notifyAll();
        }
    }

    public final void y(long j2) {
        this.f56115d = j2;
    }

    public final void z(long j2) {
        this.f56114c = j2;
    }
}
