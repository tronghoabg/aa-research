package okhttp3.internal.f;

import java.io.EOFException;
import java.io.IOException;
import k.am;
import k.ao;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ab implements am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f56105a;

    /* renamed from: b, reason: collision with root package name */
    private final long f56106b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f56107c;

    /* renamed from: d, reason: collision with root package name */
    private final k.h f56108d = new k.h();

    /* renamed from: e, reason: collision with root package name */
    private final k.h f56109e = new k.h();

    /* renamed from: f, reason: collision with root package name */
    private boolean f56110f;

    public ab(ad adVar, long j2, boolean z) {
        this.f56105a = adVar;
        this.f56106b = j2;
        this.f56107c = z;
    }

    private final void f(long j2) {
        byte[] bArr = okhttp3.internal.b.f55955a;
        this.f56105a.i().E(j2);
    }

    @Override // k.am
    public final long a(k.h hVar, long j2) throws IOException {
        IOException iOException;
        aj ajVarF;
        boolean z;
        long jA;
        h.g.b.x.f(hVar, "sink");
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        while (true) {
            ad adVar = this.f56105a;
            synchronized (adVar) {
                adVar.l().l();
                try {
                    iOException = null;
                    if (adVar.h() == null || this.f56107c) {
                        ajVarF = null;
                    } else {
                        ajVarF = adVar.f();
                        if (ajVarF == null) {
                            b bVarH = adVar.h();
                            h.g.b.x.c(bVarH);
                            ajVarF = new aj(bVarH);
                        }
                    }
                    if (this.f56110f) {
                        throw new IOException("stream closed");
                    }
                    k.h hVar2 = this.f56109e;
                    z = false;
                    if (hVar2.q() > j3) {
                        jA = hVar2.a(hVar, Math.min(j2, hVar2.q()));
                        adVar.z(adVar.c() + jA);
                        long jC = adVar.c() - adVar.b();
                        if (ajVarF != null) {
                            iOException = ajVarF;
                        } else if (jC >= adVar.i().S().h() / 2) {
                            adVar.i().J(adVar.a(), jC);
                            adVar.y(adVar.c());
                        }
                    } else {
                        if (this.f56107c || ajVarF != null) {
                            iOException = ajVarF;
                        } else {
                            adVar.B();
                            z = true;
                        }
                        jA = -1;
                    }
                } finally {
                }
            }
            if (!z) {
                if (jA != -1) {
                    return jA;
                }
                if (iOException == null) {
                    return -1L;
                }
                throw iOException;
            }
            j3 = 0;
        }
    }

    public final void b(k.j jVar, long j2) {
        boolean z;
        k.h hVar;
        long jQ;
        long j3;
        h.g.b.x.f(jVar, "source");
        byte[] bArr = okhttp3.internal.b.f55955a;
        long j4 = j2;
        while (j4 > 0) {
            ad adVar = this.f56105a;
            synchronized (adVar) {
                z = this.f56107c;
                hVar = this.f56109e;
                jQ = hVar.q() + j4;
                j3 = this.f56106b;
            }
            if (jQ > j3) {
                jVar.Q(j4);
                this.f56105a.u(b.f56142d);
                return;
            }
            if (z) {
                jVar.Q(j4);
                return;
            }
            k.h hVar2 = this.f56108d;
            long jA = jVar.a(hVar2, j4);
            if (jA == -1) {
                throw new EOFException();
            }
            j4 -= jA;
            synchronized (adVar) {
                if (this.f56110f) {
                    hVar2.N();
                } else {
                    long jQ2 = hVar.q();
                    hVar.ac(hVar2);
                    if (jQ2 == 0) {
                        adVar.notifyAll();
                    }
                }
            }
        }
        f(j2);
    }

    public final boolean c() {
        return this.f56110f;
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long jQ;
        ad adVar = this.f56105a;
        synchronized (adVar) {
            this.f56110f = true;
            k.h hVar = this.f56109e;
            jQ = hVar.q();
            hVar.N();
            adVar.notifyAll();
        }
        if (jQ > 0) {
            f(jQ);
        }
        this.f56105a.r();
    }

    public final boolean d() {
        return this.f56107c;
    }

    public final void e() {
        this.f56107c = true;
    }

    @Override // k.am
    public final ao h() {
        return this.f56105a.l();
    }
}
