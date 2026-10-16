package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@Deprecated
/* loaded from: classes2.dex */
public interface ajtw {
    Socket c() throws IOException;

    boolean e(Socket socket) throws IllegalArgumentException;

    Socket m(Socket socket, String str, int i, InetAddress inetAddress, int i2, akas akasVar) throws IOException;
}
