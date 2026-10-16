package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
final class ajur implements defpackage.ajuq {
    private final defpackage.ajum a;

    public ajur(defpackage.ajum ajumVar) {
        this.a = ajumVar;
    }

    @Override // defpackage.ajuu
    public final java.net.Socket d(defpackage.akbs akbsVar) throws java.io.IOException {
        return this.a.d(akbsVar);
    }

    @Override // defpackage.ajuu
    public final boolean e(java.net.Socket socket) throws java.lang.IllegalArgumentException {
        this.a.e(socket);
        return true;
    }

    @Override // defpackage.ajuq
    public final java.net.Socket f(java.net.Socket socket, java.lang.String str, int i) throws java.io.IOException {
        return this.a.a(socket, str, i);
    }

    @Override // defpackage.ajuu
    public final java.net.Socket l(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, java.net.InetSocketAddress inetSocketAddress2, defpackage.akbs akbsVar) throws java.io.IOException {
        return this.a.l(socket, inetSocketAddress, inetSocketAddress2, akbsVar);
    }
}
