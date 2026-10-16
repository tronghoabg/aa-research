package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajoi implements defpackage.ajpc {
    public final defpackage.ajpc b;

    public ajoi(defpackage.ajpc ajpcVar) {
        this.b = ajpcVar;
    }

    @Override // defpackage.ajpc, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.b.close();
    }

    @Override // defpackage.ajpc
    public long hg(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        return this.b.hg(ajnyVar, 8192L);
    }

    @Override // defpackage.ajpc
    public final defpackage.ajpe hh() {
        return this.b.hh();
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
