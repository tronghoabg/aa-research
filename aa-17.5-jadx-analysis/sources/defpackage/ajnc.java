package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
final class ajnc implements ajoc {
    private final ajnd a;
    private long b;
    private boolean c;

    public ajnc(ajnd ajndVar, long j) {
        this.a = ajndVar;
        this.b = j;
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        ajnd ajndVar = this.a;
        ReentrantLock reentrantLock = ajndVar.c;
        reentrantLock.lock();
        try {
            int i = ajndVar.b - 1;
            ajndVar.b = i;
            if (i == 0) {
                if (ajndVar.a) {
                    reentrantLock.unlock();
                    this.a.e();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) {
        long j2;
        long j3;
        long j4;
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        ajnd ajndVar = this.a;
        long j5 = this.b;
        long j6 = j5 + 8192;
        long j7 = j5;
        while (true) {
            if (j7 >= j6) {
                j2 = j7;
                j3 = -1;
                break;
            }
            ajnx ajnxVarV = ajmyVar.v(1);
            j3 = -1;
            ajnd ajndVar2 = ajndVar;
            j2 = j7;
            int iC = ajndVar2.c(j2, ajnxVarV.a, ajnxVarV.c, (int) Math.min(j6 - j7, 8192 - r7));
            if (iC == -1) {
                if (ajnxVarV.b == ajnxVarV.c) {
                    ajmyVar.a = ajnxVarV.a();
                    ajny.b(ajnxVarV);
                }
                if (j5 == j2) {
                    j4 = -1;
                }
            } else {
                ajnxVarV.c += iC;
                long j8 = iC;
                j7 = j2 + j8;
                ajmyVar.b += j8;
                ajndVar = ajndVar2;
            }
        }
        j4 = j2 - j5;
        if (j4 != j3) {
            this.b += j4;
        }
        return j4;
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return ajoe.k;
    }
}
