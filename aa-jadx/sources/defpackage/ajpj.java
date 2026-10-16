package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajpj implements defpackage.ajpa {
    final /* synthetic */ defpackage.ajpl a;
    private final java.io.OutputStream b;
    private final defpackage.ajpo c;

    public ajpj(defpackage.ajpl ajplVar) {
        this.a = ajplVar;
        this.b = ajplVar.a.getOutputStream();
        this.c = new defpackage.ajpo(ajplVar.a);
    }

    @Override // defpackage.ajpa
    public final void a(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        defpackage.aiqt.d(ajnyVar.b, 0L, j);
        while (j > 0) {
            defpackage.ajpo ajpoVar = this.c;
            ajpoVar.f();
            defpackage.ajox ajoxVar = ajnyVar.a;
            ajoxVar.getClass();
            int iMin = (int) java.lang.Math.min(j, ajoxVar.c - ajoxVar.b);
            ajpoVar.d();
            try {
                try {
                    this.b.write(ajoxVar.a, ajoxVar.b, iMin);
                    if (ajpoVar.e()) {
                        throw ajpoVar.c(null);
                    }
                    int i = ajoxVar.b + iMin;
                    ajoxVar.b = i;
                    long j2 = iMin;
                    j -= j2;
                    ajnyVar.b -= j2;
                    if (i == ajoxVar.c) {
                        ajnyVar.a = ajoxVar.a();
                        defpackage.ajoy.b(ajoxVar);
                    }
                } catch (java.io.IOException e) {
                    if (!ajpoVar.e()) {
                        throw e;
                    }
                    throw ajpoVar.c(e);
                }
            } catch (java.lang.Throwable th) {
                ajpoVar.e();
                throw th;
            }
        }
    }

    @Override // defpackage.ajpa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        defpackage.ajpo ajpoVar = this.c;
        ajpoVar.d();
        defpackage.ajpl ajplVar = this.a;
        try {
            try {
                int iB = defpackage.aguo.b(ajplVar.b, 1);
                if (iB != 0) {
                    if (iB != 3) {
                        java.net.Socket socket = ajplVar.a;
                        if (!socket.isClosed() && !socket.isOutputShutdown()) {
                            this.b.flush();
                            try {
                                socket.shutdownOutput();
                            } catch (java.lang.UnsupportedOperationException unused) {
                                this.b.close();
                            }
                        }
                    } else {
                        ajplVar.a.close();
                    }
                    if (ajpoVar.e()) {
                        throw ajpoVar.c(null);
                    }
                    return;
                }
                ajpoVar.e();
            } catch (java.io.IOException e) {
                if (!ajpoVar.e()) {
                    throw e;
                }
                throw ajpoVar.c(e);
            }
        } catch (java.lang.Throwable th) {
            ajpoVar.e();
            throw th;
        }
    }

    @Override // defpackage.ajpa, java.io.Flushable
    public final void flush() throws java.io.IOException {
        defpackage.ajpo ajpoVar = this.c;
        ajpoVar.d();
        try {
            try {
                this.b.flush();
                if (ajpoVar.e()) {
                    throw ajpoVar.c(null);
                }
            } catch (java.io.IOException e) {
                if (!ajpoVar.e()) {
                    throw e;
                }
                throw ajpoVar.c(e);
            }
        } catch (java.lang.Throwable th) {
            ajpoVar.e();
            throw th;
        }
    }

    @Override // defpackage.ajpa
    public final /* synthetic */ defpackage.ajpe hh() {
        return this.c;
    }

    public final java.lang.String toString() {
        return "sink(" + this.a.a + ")";
    }
}
