package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajpo extends defpackage.ajnv {
    private final java.net.Socket a;

    public ajpo(java.net.Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.ajnv
    protected final void a() {
        try {
            this.a.close();
        } catch (java.lang.AssertionError e) {
            if (!defpackage.ajpr.a(e)) {
                throw e;
            }
            java.net.Socket socket = this.a;
            java.util.logging.Logger logger = defpackage.ajpr.a;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.util.Objects.toString(socket);
            logger.log(level, "Failed to close timed out socket ".concat(socket.toString()), (java.lang.Throwable) e);
        } catch (java.lang.Exception e2) {
            java.net.Socket socket2 = this.a;
            java.util.logging.Logger logger2 = defpackage.ajpr.a;
            java.util.logging.Level level2 = java.util.logging.Level.WARNING;
            java.util.Objects.toString(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(socket2.toString()), (java.lang.Throwable) e2);
        }
    }

    @Override // defpackage.ajnv
    public final java.io.IOException c(java.io.IOException iOException) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
