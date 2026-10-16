package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajuc implements ajtq, ajtm, ajtn {
    public static final ajuf a;
    public static final ajuf b;
    public volatile ajuf c;
    private final SSLSocketFactory d;

    static {
        new ajty();
        a = new ajtz();
        b = new ajud();
    }

    public ajuc(SSLContext sSLContext, ajuf ajufVar) {
        ahgm.e(sSLContext, "SSL context");
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        ahgm.e(socketFactory, "SSL socket factory");
        this.d = socketFactory;
        this.c = ajufVar == null ? a : ajufVar;
    }

    public static ajuc g() throws ajub {
        return new ajuc(akat.e(), a);
    }

    public static final Socket j() throws IOException {
        return SocketFactory.getDefault().createSocket();
    }

    private final void k(SSLSocket sSLSocket, String str) throws IOException {
        try {
            this.c.c(str, sSLSocket);
        } catch (IOException e) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e;
        }
    }

    @Override // defpackage.ajtm
    public final Socket a(Socket socket, String str, int i) throws IOException {
        return i(socket, str, i);
    }

    @Override // defpackage.ajtn
    public final Socket b(Socket socket, String str, int i) throws IOException {
        return i(socket, str, i);
    }

    @Override // defpackage.ajtw
    public final Socket c() throws IOException {
        return j();
    }

    @Override // defpackage.ajtu
    public final Socket d(akas akasVar) throws IOException {
        return j();
    }

    @Override // defpackage.ajtu
    public final boolean e(Socket socket) throws IllegalArgumentException {
        ahgm.e(socket, "Socket");
        ahkp.b(socket instanceof SSLSocket, "Socket not created by this factory");
        ahkp.b(!socket.isClosed(), "Socket is closed");
        return true;
    }

    @Override // defpackage.ajtq
    public final Socket f(Socket socket, String str, int i) throws IOException {
        return i(socket, str, i);
    }

    public final Socket h(int i, Socket socket, ajpe ajpeVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        ahgm.e(ajpeVar, "HTTP host");
        if (socket == null) {
            socket = j();
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            if (!(socket instanceof SSLSocket)) {
                return i(socket, ajpeVar.a, inetSocketAddress.getPort());
            }
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.startHandshake();
            k(sSLSocket, ajpeVar.a);
            return socket;
        } catch (SocketTimeoutException unused) {
            throw new ajsr(a.bW(inetSocketAddress, "Connect to ", " timed out"));
        }
    }

    public final Socket i(Socket socket, String str, int i) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.d.createSocket(socket, str, i, true);
        sSLSocket.startHandshake();
        k(sSLSocket, str);
        return sSLSocket;
    }

    @Override // defpackage.ajtu
    public final Socket l(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, akas akasVar) throws IOException {
        ahgm.e(akasVar, "HTTP parameters");
        int iD = akat.d(akasVar);
        int iC = akat.c(akasVar);
        socket.setSoTimeout(iD);
        return h(iC, socket, ((ajsw) inetSocketAddress).a, inetSocketAddress, inetSocketAddress2);
    }

    @Override // defpackage.ajtw
    public final Socket m(Socket socket, String str, int i, InetAddress inetAddress, int i2, akas akasVar) throws IOException {
        InetSocketAddress inetSocketAddress;
        InetAddress byName = InetAddress.getByName(str);
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        return l(socket, new ajsw(new ajpe(str, i, null), byName, i), inetSocketAddress, akasVar);
    }
}
