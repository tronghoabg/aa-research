package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public class ajnh implements ajoa {
    private final ajoa a;

    public ajnh(ajoa ajoaVar) {
        this.a = ajoaVar;
    }

    @Override // defpackage.ajoa
    public void a(ajmy ajmyVar, long j) throws IOException {
        this.a.a(ajmyVar, j);
    }

    @Override // defpackage.ajoa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ajoa, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.ajoa
    public final ajoe hV() {
        return this.a.hV();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.a + ")";
    }
}
