package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

@Deprecated
/* loaded from: classes2.dex */
public final class ajto implements ajtw, ajtu {
    @Override // defpackage.ajtw
    public final Socket c() {
        return new Socket();
    }

    @Override // defpackage.ajtu
    public final Socket d(akas akasVar) {
        return new Socket();
    }

    @Override // defpackage.ajtw, defpackage.ajtu
    public final boolean e(Socket socket) {
        return false;
    }

    @Override // defpackage.ajtu
    public final Socket l(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, akas akasVar) throws IOException {
        ahgm.e(akasVar, "HTTP parameters");
        if (socket == null) {
            socket = new Socket();
        }
        if (inetSocketAddress2 != null) {
            ahgm.e(akasVar, "HTTP parameters");
            socket.setReuseAddress(akasVar.d("http.socket.reuseaddr", false));
            socket.bind(inetSocketAddress2);
        }
        int iC = akat.c(akasVar);
        try {
            socket.setSoTimeout(akat.d(akasVar));
            socket.connect(inetSocketAddress, iC);
            return socket;
        } catch (SocketTimeoutException unused) {
            throw new ajsr(a.bW(inetSocketAddress, "Connect to ", " timed out"));
        }
    }

    @Override // defpackage.ajtw
    @Deprecated
    public final Socket m(Socket socket, String str, int i, InetAddress inetAddress, int i2, akas akasVar) throws IOException {
        InetSocketAddress inetSocketAddress;
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        return l(socket, new InetSocketAddress(InetAddress.getByName(str), i), inetSocketAddress, akasVar);
    }
}
