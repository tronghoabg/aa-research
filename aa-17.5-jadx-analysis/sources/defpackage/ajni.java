package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public class ajni implements ajoc {
    public final ajoc b;

    public ajni(ajoc ajocVar) {
        this.b = ajocVar;
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
    }

    @Override // defpackage.ajoc
    public long hU(ajmy ajmyVar, long j) throws IOException {
        return this.b.hU(ajmyVar, 8192L);
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.b.hV();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
