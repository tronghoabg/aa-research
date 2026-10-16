package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajoc implements defpackage.ajpc {
    private final defpackage.ajod a;
    private long b;
    private boolean c;

    public ajoc(defpackage.ajod ajodVar, long j) {
        this.a = ajodVar;
        this.b = j;
    }

    @Override // defpackage.ajpc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.ajod ajodVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = ajodVar.c;
        reentrantLock.lock();
        try {
            int i = ajodVar.b - 1;
            ajodVar.b = i;
            if (i == 0 && ajodVar.a) {
                reentrantLock.unlock();
                this.a.e();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ajpc
    public final long hg(defpackage.ajny ajnyVar, long j) {
        long j2;
        long j3;
        long j4;
        if (this.c) {
            throw new java.lang.IllegalStateException("closed");
        }
        defpackage.ajod ajodVar = this.a;
        long j5 = this.b;
        long j6 = j5 + 8192;
        long j7 = j5;
        while (true) {
            if (j7 < j6) {
                defpackage.ajox ajoxVarV = ajnyVar.v(1);
                byte[] bArr = ajoxVarV.a;
                int i = ajoxVarV.c;
                j3 = -1;
                defpackage.ajod ajodVar2 = ajodVar;
                j2 = j7;
                int iC = ajodVar2.c(j2, bArr, i, (int) java.lang.Math.min(j6 - j7, 8192 - i));
                if (iC == -1) {
                    if (ajoxVarV.b == ajoxVarV.c) {
                        ajnyVar.a = ajoxVarV.a();
                        defpackage.ajoy.b(ajoxVarV);
                    }
                    if (j5 == j2) {
                        j4 = -1;
                        break;
                    }
                } else {
                    ajoxVarV.c += iC;
                    long j8 = iC;
                    j7 = j2 + j8;
                    ajnyVar.b += j8;
                    ajodVar = ajodVar2;
                }
            } else {
                j2 = j7;
                j3 = -1;
            }
            j4 = j2 - j5;
            break;
        }
        if (j4 != j3) {
            this.b += j4;
        }
        return j4;
    }

    @Override // defpackage.ajpc
    public final defpackage.ajpe hh() {
        return defpackage.ajpe.k;
    }
}
