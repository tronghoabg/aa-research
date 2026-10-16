package k;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class m implements am {

    /* renamed from: a, reason: collision with root package name */
    private final n f50850a;

    /* renamed from: b, reason: collision with root package name */
    private long f50851b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f50852c;

    public m(n nVar, long j2) {
        h.g.b.x.f(nVar, "fileHandle");
        this.f50850a = nVar;
        this.f50851b = j2;
    }

    @Override // k.am
    public final long a(h hVar, long j2) {
        long j3;
        long j4;
        h.g.b.x.f(hVar, "sink");
        if (this.f50852c) {
            throw new IllegalStateException("closed");
        }
        n nVar = this.f50850a;
        long j5 = this.f50851b;
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "byteCount < 0: "));
        }
        long j6 = j2 + j5;
        long j7 = j5;
        while (true) {
            if (j7 >= j6) {
                j3 = -1;
                break;
            }
            ai aiVarK = hVar.K(1);
            j3 = -1;
            long j8 = j6;
            int iH = nVar.h(j7, aiVarK.f50806a, aiVarK.f50808c, (int) Math.min(j6 - j7, 8192 - r9));
            if (iH == -1) {
                if (aiVarK.f50807b == aiVarK.f50808c) {
                    hVar.f50841a = aiVarK.a();
                    aj.b(aiVarK);
                }
                if (j5 == j7) {
                    j4 = -1;
                }
            } else {
                aiVarK.f50808c += iH;
                long j9 = iH;
                j7 += j9;
                hVar.P(hVar.q() + j9);
                j6 = j8;
            }
        }
        j4 = j7 - j5;
        if (j4 != j3) {
            this.f50851b += j4;
        }
        return j4;
    }

    @Override // k.am, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f50852c) {
            return;
        }
        this.f50852c = true;
        n nVar = this.f50850a;
        ReentrantLock reentrantLockC = nVar.c();
        reentrantLockC.lock();
        try {
            nVar.f50855c--;
            if (nVar.f50855c == 0) {
                if (nVar.f50854b) {
                    reentrantLockC.unlock();
                    this.f50850a.j();
                }
            }
        } finally {
            reentrantLockC.unlock();
        }
    }

    @Override // k.am
    public final ao h() {
        return ao.f50818c;
    }
}
