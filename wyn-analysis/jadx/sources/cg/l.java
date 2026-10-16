package cg;

import A7.AbstractC0279p0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class l implements H {

    /* renamed from: a, reason: collision with root package name */
    public final t f19910a;

    /* renamed from: b, reason: collision with root package name */
    public long f19911b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19912c;

    public l(t fileHandle, long j8) {
        AbstractC3340k.e(fileHandle, "fileHandle");
        this.f19910a = fileHandle;
        this.f19911b = j8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19912c) {
            return;
        }
        this.f19912c = true;
        t tVar = this.f19910a;
        ReentrantLock reentrantLock = tVar.f19932c;
        reentrantLock.lock();
        try {
            int i5 = tVar.f19931b - 1;
            tVar.f19931b = i5;
            if (i5 == 0) {
                if (tVar.f19930a) {
                    synchronized (tVar) {
                        tVar.f19933d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // cg.H
    public final long read(C1618g sink, long j8) {
        long j10;
        long j11;
        int i5;
        AbstractC3340k.e(sink, "sink");
        if (this.f19912c) {
            throw new IllegalStateException("closed");
        }
        t tVar = this.f19910a;
        long j12 = this.f19911b;
        tVar.getClass();
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        long j13 = j8 + j12;
        long j14 = j12;
        while (true) {
            if (j14 >= j13) {
                j10 = -1;
                break;
            }
            C1611C c1611cP = sink.P(1);
            byte[] array = c1611cP.f19866a;
            int i10 = c1611cP.f19868c;
            j10 = -1;
            int iMin = (int) Math.min(j13 - j14, 8192 - i10);
            synchronized (tVar) {
                AbstractC3340k.e(array, "array");
                tVar.f19933d.seek(j14);
                i5 = 0;
                while (true) {
                    if (i5 >= iMin) {
                        break;
                    }
                    int i11 = tVar.f19933d.read(array, i10, iMin - i5);
                    if (i11 != -1) {
                        i5 += i11;
                    } else if (i5 == 0) {
                        i5 = -1;
                    }
                }
            }
            if (i5 == -1) {
                if (c1611cP.f19867b == c1611cP.f19868c) {
                    sink.f19901a = c1611cP.a();
                    D.a(c1611cP);
                }
                if (j12 == j14) {
                    j11 = -1;
                }
            } else {
                c1611cP.f19868c += i5;
                long j15 = i5;
                j14 += j15;
                sink.f19902b += j15;
            }
        }
        j11 = j14 - j12;
        if (j11 != j10) {
            this.f19911b += j11;
        }
        return j11;
    }

    @Override // cg.H
    public final J timeout() {
        return J.f19879d;
    }
}
