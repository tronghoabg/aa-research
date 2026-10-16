package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ajlj implements ajob {
    public final int a;
    public final ajlc b;
    public final ajlr c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public final ajlh g;
    public final ajlg h;
    public final ajli i;
    public final ajli j;
    public IOException k;
    private boolean l;
    private int m;

    public ajlj(int i, ajlc ajlcVar, boolean z, boolean z2, ajhv ajhvVar) {
        this.a = i;
        this.b = ajlcVar;
        this.c = new ajlr(i);
        this.e = ajlcVar.r.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.g = new ajlh(this, ajlcVar.q.c(), z2);
        this.h = new ajlg(this, z);
        this.i = new ajli(this);
        this.j = new ajli(this);
        if (ajhvVar == null) {
            if (!i()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (i()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(ajhvVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1.h.a != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean o(int r2, java.io.IOException r3) {
        /*
            r1 = this;
            java.util.TimeZone r0 = defpackage.ajis.a
            monitor-enter(r1)
            int r0 = r1.k()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto La
            goto L1d
        La:
            r1.m = r2     // Catch: java.lang.Throwable -> L2a
            r1.k = r3     // Catch: java.lang.Throwable -> L2a
            r1.notifyAll()     // Catch: java.lang.Throwable -> L2a
            ajlh r2 = r1.g     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.b     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L20
            ajlg r2 = r1.h     // Catch: java.lang.Throwable -> L2a
            boolean r2 = r2.a     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L20
        L1d:
            monitor-exit(r1)
            r1 = 0
            return r1
        L20:
            monitor-exit(r1)
            ajlc r2 = r1.b
            int r1 = r1.a
            r2.b(r1)
            r1 = 1
            return r1
        L2a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlj.o(int, java.io.IOException):boolean");
    }

    @Override // defpackage.ajob
    public final /* synthetic */ ajoa a() {
        return this.h;
    }

    @Override // defpackage.ajob
    public final /* synthetic */ ajoc b() {
        return this.g;
    }

    public final void c(long j) {
        this.e += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void d() throws IOException {
        boolean z;
        boolean zJ;
        TimeZone timeZone = ajis.a;
        synchronized (this) {
            ajlh ajlhVar = this.g;
            z = false;
            if (!ajlhVar.b && ajlhVar.e) {
                ajlg ajlgVar = this.h;
                if (ajlgVar.a || ajlgVar.b) {
                    z = true;
                }
            }
            zJ = j();
        }
        if (z) {
            l(9, null);
        } else {
            if (zJ) {
                return;
            }
            this.b.b(this.a);
        }
    }

    public final void e() throws IOException {
        ajlg ajlgVar = this.h;
        if (ajlgVar.b) {
            throw new IOException("stream closed");
        }
        if (ajlgVar.a) {
            throw new IOException("stream finished");
        }
        if (k() != 0) {
            IOException iOException = this.k;
            if (iOException != null) {
                throw iOException;
            }
            int iK = k();
            if (iK != 0) {
                throw new ajlq(iK);
            }
            throw null;
        }
    }

    public final void f(ajhv ajhvVar, boolean z) {
        boolean zJ;
        TimeZone timeZone = ajis.a;
        synchronized (this) {
            if (!this.l || ajhvVar.b(":status") != null || ajhvVar.b(":method") != null) {
                this.l = true;
                this.f.add(ajhvVar);
            }
            if (z) {
                this.g.b = true;
            }
            zJ = j();
            notifyAll();
        }
        if (zJ) {
            return;
        }
        this.b.b(this.a);
    }

    public final void g() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean h() {
        ajlg ajlgVar = this.h;
        return ajlgVar.b || ajlgVar.a;
    }

    public final boolean i() {
        return (this.a & 1) == 1;
    }

    public final boolean j() {
        synchronized (this) {
            if (k() != 0) {
                return false;
            }
            ajlh ajlhVar = this.g;
            if (ajlhVar.b || ajlhVar.e) {
                ajlg ajlgVar = this.h;
                if (ajlgVar.a || ajlgVar.b) {
                    if (this.l) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public final int k() {
        int i;
        synchronized (this) {
            i = this.m;
        }
        return i;
    }

    public final void l(int i, IOException iOException) throws IOException {
        if (o(i, iOException)) {
            this.b.l(this.a, i);
        }
    }

    public final void m(int i) {
        if (o(i, null)) {
            this.b.m(this.a, i);
        }
    }

    public final void n(int i) {
        synchronized (this) {
            if (k() == 0) {
                this.m = i;
                notifyAll();
            }
        }
    }
}
