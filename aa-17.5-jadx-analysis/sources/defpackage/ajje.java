package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes3.dex */
public final class ajje extends ajni {
    final /* synthetic */ scz a;
    private final long c;
    private final boolean d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajje(scz sczVar, ajoc ajocVar, long j, boolean z) {
        super(ajocVar);
        ajocVar.getClass();
        this.a = sczVar;
        this.c = j;
        this.d = z;
        this.f = true;
        if (j == 0) {
            c(null);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.g) {
            return iOException;
        }
        this.g = true;
        if (iOException == null && this.f) {
            this.f = false;
        }
        return this.a.h(this.d, true, false, iOException);
    }

    @Override // defpackage.ajni, defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        this.h = true;
        try {
            super.close();
            c(null);
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [ajkc, java.lang.Object] */
    @Override // defpackage.ajni, defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws IOException {
        if (this.h) {
            throw new IllegalStateException("closed");
        }
        try {
            long jHU = this.b.hU(ajmyVar, 8192L);
            if (this.f) {
                this.f = false;
            }
            if (jHU == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.e + jHU;
            long j3 = this.c;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            }
            this.e = j2;
            if (this.a.c.h()) {
                c(null);
            }
            return jHU;
        } catch (IOException e) {
            IOException iOExceptionC = c(e);
            iOExceptionC.getClass();
            throw iOExceptionC;
        }
    }
}
