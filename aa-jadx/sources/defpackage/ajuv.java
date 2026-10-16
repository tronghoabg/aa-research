package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
class ajuv implements defpackage.ajuu {
    private final defpackage.ajuw a;

    public ajuv(defpackage.ajuw ajuwVar) {
        this.a = ajuwVar;
    }

    @Override // defpackage.ajuu
    public final java.net.Socket d(defpackage.akbs akbsVar) throws java.io.IOException {
        return this.a.c();
    }

    @Override // defpackage.ajuu
    public final boolean e(java.net.Socket socket) throws java.lang.IllegalArgumentException {
        return this.a.e(socket);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof defpackage.ajuv;
        defpackage.ajuw ajuwVar = this.a;
        return z ? ajuwVar.equals(((defpackage.ajuv) obj).a) : ajuwVar.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ajuu
    public final java.net.Socket l(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, java.net.InetSocketAddress inetSocketAddress2, defpackage.akbs akbsVar) throws java.io.IOException {
        int port;
        java.net.InetAddress address;
        java.lang.String hostName = inetSocketAddress.getHostName();
        int port2 = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            address = inetSocketAddress2.getAddress();
            port = inetSocketAddress2.getPort();
        } else {
            port = 0;
            address = null;
        }
        return this.a.m(socket, hostName, port2, address, port, akbsVar);
    }
}
