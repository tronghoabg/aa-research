package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class frp extends defpackage.ajoh {
    private final defpackage.affc a;
    private boolean b;

    public frp(defpackage.ajpa ajpaVar, defpackage.affc affcVar) {
        super(ajpaVar);
        this.a = affcVar;
    }

    @Override // defpackage.ajoh, defpackage.ajpa
    public final void a(defpackage.ajny ajnyVar, long j) throws java.io.EOFException {
        if (this.b) {
            ajnyVar.A(j);
            return;
        }
        try {
            super.a(ajnyVar, j);
        } catch (java.io.IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }

    @Override // defpackage.ajoh, defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (java.io.IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }

    @Override // defpackage.ajoh, defpackage.ajpa, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (java.io.IOException e) {
            this.b = true;
            this.a.invoke(e);
        }
    }
}
