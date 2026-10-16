package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
final class ajkm extends ajkj {
    private boolean c;

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c(ajkn.a);
        }
        d();
    }

    @Override // defpackage.ajkj, defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        if (this.c) {
            return -1L;
        }
        long jHU = super.hU(ajmyVar, 8192L);
        if (jHU != -1) {
            return jHU;
        }
        this.c = true;
        c(ajhv.a);
        return -1L;
    }
}
