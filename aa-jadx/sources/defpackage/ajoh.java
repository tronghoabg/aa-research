package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajoh implements defpackage.ajpa {
    private final defpackage.ajpa a;

    public ajoh(defpackage.ajpa ajpaVar) {
        this.a = ajpaVar;
    }

    @Override // defpackage.ajpa
    public void a(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        this.a.a(ajnyVar, j);
    }

    @Override // defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // defpackage.ajpa, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.a.flush();
    }

    @Override // defpackage.ajpa
    public final defpackage.ajpe hh() {
        return this.a.hh();
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + "(" + this.a + ")";
    }
}
