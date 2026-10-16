package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajpk implements defpackage.ajpc {
    final /* synthetic */ defpackage.ajpl a;
    private final java.io.InputStream b;
    private final defpackage.ajpo c;

    public ajpk(defpackage.ajpl ajplVar) {
        this.a = ajplVar;
        this.b = ajplVar.a.getInputStream();
        this.c = new defpackage.ajpo(ajplVar.a);
    }

    @Override // defpackage.ajpc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        defpackage.ajpo ajpoVar = this.c;
        ajpoVar.d();
        defpackage.ajpl ajplVar = this.a;
        try {
            try {
                int iB = defpackage.aguo.b(ajplVar.b, 2);
                if (iB != 0) {
                    if (iB != 3) {
                        java.net.Socket socket = ajplVar.a;
                        if (!socket.isClosed() && !socket.isInputShutdown()) {
                            try {
                                socket.shutdownInput();
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
            } catch (java.lang.Throwable th) {
                ajpoVar.e();
                throw th;
            }
        } catch (java.io.IOException e) {
            if (!ajpoVar.e()) {
                throw e;
            }
            throw ajpoVar.c(e);
        }
    }

    @Override // defpackage.ajpc
    public final long hg(defpackage.ajny ajnyVar, long j) throws java.io.IOException {
        defpackage.ajpo ajpoVar = this.c;
        ajpoVar.f();
        defpackage.ajox ajoxVarV = ajnyVar.v(1);
        int iMin = (int) java.lang.Math.min(8192L, 8192 - ajoxVarV.c);
        try {
            ajpoVar.d();
            try {
                try {
                    int i = this.b.read(ajoxVarV.a, ajoxVarV.c, iMin);
                    if (ajpoVar.e()) {
                        throw ajpoVar.c(null);
                    }
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
                } catch (java.lang.Throwable th) {
                    ajpoVar.e();
                    throw th;
                }
            } catch (java.io.IOException e) {
                if (ajpoVar.e()) {
                    throw ajpoVar.c(e);
                }
                throw e;
            }
        } catch (java.lang.AssertionError e2) {
            if (defpackage.ajpr.a(e2)) {
                throw new java.io.IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.ajpc
    public final /* synthetic */ defpackage.ajpe hh() {
        return this.c;
    }

    public final java.lang.String toString() {
        return "source(" + this.a.a + ")";
    }
}
