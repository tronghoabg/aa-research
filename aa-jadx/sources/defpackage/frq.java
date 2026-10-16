package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class frq implements java.io.Closeable {
    public final defpackage.frm a;

    public frq(defpackage.frm frmVar) {
        this.a = frmVar;
    }

    public final defpackage.ajor a() {
        return this.a.a(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
