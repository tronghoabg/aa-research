package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajnq implements ajoa {
    private final OutputStream a;
    private final ajoe b;

    public ajnq(OutputStream outputStream, ajoe ajoeVar) {
        this.a = outputStream;
        this.b = ajoeVar;
    }

    @Override // defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) throws IOException {
        ahfd.g(ajmyVar.b, 0L, j);
        while (j > 0) {
            this.b.f();
            ajnx ajnxVar = ajmyVar.a;
            ajnxVar.getClass();
            int iMin = (int) Math.min(j, ajnxVar.c - ajnxVar.b);
            this.a.write(ajnxVar.a, ajnxVar.b, iMin);
            int i = ajnxVar.b + iMin;
            ajnxVar.b = i;
            long j2 = iMin;
            ajmyVar.b -= j2;
            j -= j2;
            if (i == ajnxVar.c) {
                ajmyVar.a = ajnxVar.a();
                ajny.b(ajnxVar);
            }
        }
    }

    @Override // defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ajoa, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.ajoa
    public final ajoe hV() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ")";
    }
}
