package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajoq implements defpackage.ajpa {
    private final java.io.OutputStream a;
    private final defpackage.ajpe b;

    public ajoq(java.io.OutputStream outputStream, defpackage.ajpe ajpeVar) {
        this.a = outputStream;
        this.b = ajpeVar;
    }

    @Override // defpackage.ajpa
    public final void a(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        defpackage.aiqt.d(ajnyVar.b, 0L, j);
        while (j > 0) {
            this.b.f();
            defpackage.ajox ajoxVar = ajnyVar.a;
            ajoxVar.getClass();
            int iMin = (int) java.lang.Math.min(j, ajoxVar.c - ajoxVar.b);
            this.a.write(ajoxVar.a, ajoxVar.b, iMin);
            int i = ajoxVar.b + iMin;
            ajoxVar.b = i;
            long j2 = iMin;
            ajnyVar.b -= j2;
            j -= j2;
            if (i == ajoxVar.c) {
                ajnyVar.a = ajoxVar.a();
                defpackage.ajoy.b(ajoxVar);
            }
        }
    }

    @Override // defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // defpackage.ajpa, java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.a.flush();
    }

    @Override // defpackage.ajpa
    public final defpackage.ajpe hh() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "sink(" + this.a + ")";
    }
}
