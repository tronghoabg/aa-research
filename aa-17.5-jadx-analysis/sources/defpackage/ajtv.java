package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

@Deprecated
/* loaded from: classes2.dex */
class ajtv implements ajtu {
    private final ajtw a;

    public ajtv(ajtw ajtwVar) {
        this.a = ajtwVar;
    }

    @Override // defpackage.ajtu
    public final Socket d(akas akasVar) throws IOException {
        return this.a.c();
    }

    @Override // defpackage.ajtu
    public final boolean e(Socket socket) throws IllegalArgumentException {
        return this.a.e(socket);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof ajtv;
        ajtw ajtwVar = this.a;
        return z ? ajtwVar.equals(((ajtv) obj).a) : ajtwVar.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ajtu
    public final Socket l(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, akas akasVar) throws IOException {
        int port;
        InetAddress address;
        String hostName = inetSocketAddress.getHostName();
        int port2 = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            address = inetSocketAddress2.getAddress();
            port = inetSocketAddress2.getPort();
        } else {
            port = 0;
            address = null;
        }
        return this.a.m(socket, hostName, port2, address, port, akasVar);
    }
}
