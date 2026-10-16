package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aedk implements defpackage.ajpc {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final defpackage.ajoa f;

    public aedk(defpackage.ajoa ajoaVar) {
        this.f = ajoaVar;
    }

    @Override // defpackage.ajpc
    public final long hg(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        int i;
        int iF;
        do {
            int i2 = this.d;
            defpackage.ajoa ajoaVar = this.f;
            if (i2 == 0) {
                ajoaVar.A(this.e);
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iB = defpackage.aedo.b(ajoaVar);
                    this.d = iB;
                    this.a = iB;
                    int iD = ajoaVar.d() & 255;
                    this.b = (byte) (ajoaVar.d() & 255);
                    java.util.logging.Logger logger = defpackage.aedo.a;
                    byte b = (byte) iD;
                    if (logger.isLoggable(java.util.logging.Level.FINE)) {
                        logger.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", defpackage.aedl.a(true, this.c, this.a, b, this.b));
                    }
                    iF = ajoaVar.f() & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                    this.c = iF;
                    if (b != 9) {
                        throw defpackage.aedo.c("%s != TYPE_CONTINUATION", java.lang.Byte.valueOf(b));
                    }
                }
            } else {
                long jHg = ajoaVar.hg(ajnyVar, java.lang.Math.min(8192L, i2));
                if (jHg != -1) {
                    this.d -= (int) jHg;
                    return jHg;
                }
            }
            return -1L;
        } while (iF == i);
        throw defpackage.aedo.c("TYPE_CONTINUATION streamId changed", new java.lang.Object[0]);
    }

    @Override // defpackage.ajpc
    public final defpackage.ajpe hh() {
        return this.f.hh();
    }

    @Override // defpackage.ajpc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }
}
