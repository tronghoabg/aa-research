package k;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class l implements al {

    /* renamed from: a, reason: collision with root package name */
    private final n f50847a;

    /* renamed from: b, reason: collision with root package name */
    private long f50848b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f50849c;

    public l(n nVar) {
        h.g.b.x.f(nVar, "fileHandle");
        this.f50847a = nVar;
        this.f50848b = 0L;
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f50849c) {
            return;
        }
        this.f50849c = true;
        n nVar = this.f50847a;
        ReentrantLock reentrantLockC = nVar.c();
        reentrantLockC.lock();
        try {
            nVar.f50855c--;
            if (nVar.f50855c == 0) {
                if (nVar.f50854b) {
                    reentrantLockC.unlock();
                    this.f50847a.j();
                }
            }
        } finally {
            reentrantLockC.unlock();
        }
    }

    @Override // k.al, java.io.Flushable
    public final void flush() {
        if (this.f50849c) {
            throw new IllegalStateException("closed");
        }
        this.f50847a.k();
    }

    @Override // k.al
    public final ao h() {
        return ao.f50818c;
    }

    @Override // k.al
    public final void l(h hVar, long j2) {
        h.g.b.x.f(hVar, "source");
        if (this.f50849c) {
            throw new IllegalStateException("closed");
        }
        n nVar = this.f50847a;
        long j3 = this.f50848b;
        okhttp3.internal.publicsuffix.a.g(hVar.q(), 0L, j2);
        long j4 = j3 + j2;
        while (j3 < j4) {
            ai aiVar = hVar.f50841a;
            h.g.b.x.c(aiVar);
            int iMin = (int) Math.min(j4 - j3, aiVar.f50808c - aiVar.f50807b);
            nVar.l(j3, aiVar.f50806a, aiVar.f50807b, iMin);
            aiVar.f50807b += iMin;
            long j5 = iMin;
            hVar.P(hVar.q() - j5);
            j3 += j5;
            if (aiVar.f50807b == aiVar.f50808c) {
                hVar.f50841a = aiVar.a();
                aj.b(aiVar);
            }
        }
        this.f50848b += j2;
    }
}
