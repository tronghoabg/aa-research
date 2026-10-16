package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ajnm implements ajoc {
    private final InputStream a;
    private final ajoe b;

    public ajnm(InputStream inputStream, ajoe ajoeVar) {
        this.a = inputStream;
        this.b = ajoeVar;
    }

    @Override // defpackage.ajoc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) throws IOException {
        try {
            this.b.f();
            ajnx ajnxVarV = ajmyVar.v(1);
            int i = this.a.read(ajnxVarV.a, ajnxVarV.c, (int) Math.min(j, 8192 - ajnxVarV.c));
            if (i != -1) {
                ajnxVarV.c += i;
                long j2 = i;
                ajmyVar.b += j2;
                return j2;
            }
            if (ajnxVarV.b != ajnxVarV.c) {
                return -1L;
            }
            ajmyVar.a = ajnxVarV.a();
            ajny.b(ajnxVarV);
            return -1L;
        } catch (AssertionError e) {
            if (ajor.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
