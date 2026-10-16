package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajom implements defpackage.ajpc {
    private final java.io.InputStream a;
    private final defpackage.ajpe b;

    public ajom(java.io.InputStream inputStream, defpackage.ajpe ajpeVar) {
        this.a = inputStream;
        this.b = ajpeVar;
    }

    @Override // defpackage.ajpc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // defpackage.ajpc
    public final long hg(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        try {
            this.b.f();
            defpackage.ajox ajoxVarV = ajnyVar.v(1);
            int i = this.a.read(ajoxVarV.a, ajoxVarV.c, (int) java.lang.Math.min(j, 8192 - ajoxVarV.c));
            if (i != -1) {
                ajoxVarV.c += i;
                long j2 = i;
                ajnyVar.b += j2;
                return j2;
            }
            if (ajoxVarV.b != ajoxVarV.c) {
                return -1L;
            }
            ajnyVar.a = ajoxVarV.a();
            defpackage.ajoy.b(ajoxVarV);
            return -1L;
        } catch (java.lang.AssertionError e) {
            if (defpackage.ajpr.a(e)) {
                throw new java.io.IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.ajpc
    public final defpackage.ajpe hh() {
        return this.b;
    }

    public final java.lang.String toString() {
        return "source(" + this.a + ")";
    }
}
