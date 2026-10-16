package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class ajkl extends ajkj {
    final /* synthetic */ ajkn c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajkl(ajkn ajknVar, ajhx ajhxVar, long j) {
        super(ajknVar, ajhxVar);
        this.c = ajknVar;
        this.d = j;
        if (j == 0) {
            c(ajhv.a);
        }
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !ajis.k(this, TimeUnit.MILLISECONDS)) {
            this.c.c.h();
            c(ajkn.a);
        }
        d();
    }

    @Override // defpackage.ajkj, defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jHU = super.hU(ajmyVar, Math.min(j2, 8192L));
        if (jHU == -1) {
            this.c.c.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c(ajkn.a);
            throw protocolException;
        }
        long j3 = this.d - jHU;
        this.d = j3;
        if (j3 == 0) {
            c(ajhv.a);
        }
        return jHU;
    }
}
