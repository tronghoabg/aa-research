package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajnu implements defpackage.ajpc {
    final /* synthetic */ defpackage.ajnv a;
    final /* synthetic */ defpackage.ajpc b;

    public ajnu(defpackage.ajnv ajnvVar, defpackage.ajpc ajpcVar) {
        this.a = ajnvVar;
        this.b = ajpcVar;
    }

    @Override // defpackage.ajpc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        defpackage.ajnv ajnvVar = this.a;
        ajnvVar.d();
        try {
            try {
                this.b.close();
                if (ajnvVar.e()) {
                    throw ajnvVar.c(null);
                }
            } catch (java.io.IOException e) {
                if (!ajnvVar.e()) {
                    throw e;
                }
                throw ajnvVar.c(e);
            }
        } catch (java.lang.Throwable th) {
            ajnvVar.e();
            throw th;
        }
    }

    @Override // defpackage.ajpc
    public final long hg(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        defpackage.ajnv ajnvVar = this.a;
        ajnvVar.d();
        try {
            try {
                long jHg = this.b.hg(ajnyVar, j);
                if (ajnvVar.e()) {
                    throw ajnvVar.c(null);
                }
                return jHg;
            } catch (java.io.IOException e) {
                if (ajnvVar.e()) {
                    throw ajnvVar.c(e);
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            ajnvVar.e();
            throw th;
        }
    }

    @Override // defpackage.ajpc
    public final /* synthetic */ defpackage.ajpe hh() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
