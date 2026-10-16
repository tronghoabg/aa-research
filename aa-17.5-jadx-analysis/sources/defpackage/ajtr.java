package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

@Deprecated
/* loaded from: classes2.dex */
final class ajtr implements ajtq {
    private final ajtm a;

    public ajtr(ajtm ajtmVar) {
        this.a = ajtmVar;
    }

    @Override // defpackage.ajtu
    public final Socket d(akas akasVar) throws IOException {
        return this.a.d(akasVar);
    }

    @Override // defpackage.ajtu
    public final boolean e(Socket socket) throws IllegalArgumentException {
        this.a.e(socket);
        return true;
    }

    @Override // defpackage.ajtq
    public final Socket f(Socket socket, String str, int i) throws IOException {
        return this.a.a(socket, str, i);
    }

    @Override // defpackage.ajtu
    public final Socket l(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, akas akasVar) throws IOException {
        return this.a.l(socket, inetSocketAddress, inetSocketAddress2, akasVar);
    }
}
