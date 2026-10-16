package pd;

import K8.C0694f;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import qd.C3887b;
import qd.C3890e;

/* loaded from: classes5.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final List f43599a = DesugarCollections.unmodifiableList(Arrays.asList(qd.l.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i5, C3887b c3887b) throws IOException {
        qd.l lVar;
        Fe.e.t(sSLSocketFactory, "sslSocketFactory");
        Fe.e.t(socket, "socket");
        Fe.e.t(c3887b, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i5, true);
        String[] strArr = c3887b.f44211b;
        String[] strArr2 = strArr != null ? (String[]) qd.n.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) qd.n.a(c3887b.f44212c, sSLSocket.getEnabledProtocols());
        C0694f c0694f = new C0694f(c3887b);
        if (!c0694f.f6639a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            c0694f.f6641c = null;
        } else {
            c0694f.f6641c = (String[]) strArr2.clone();
        }
        if (!c0694f.f6639a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            c0694f.f6642d = null;
        } else {
            c0694f.f6642d = (String[]) strArr3.clone();
        }
        C3887b c3887b2 = new C3887b(c0694f);
        sSLSocket.setEnabledProtocols(c3887b2.f44212c);
        String[] strArr4 = c3887b2.f44211b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        p pVar = p.f43596c;
        boolean z2 = c3887b.f44213d;
        List list = f43599a;
        String strD = pVar.d(sSLSocket, str, z2 ? list : null);
        if (strD.equals("http/1.0")) {
            lVar = qd.l.HTTP_1_0;
        } else if (strD.equals("http/1.1")) {
            lVar = qd.l.HTTP_1_1;
        } else if (strD.equals("h2")) {
            lVar = qd.l.HTTP_2;
        } else {
            if (!strD.equals("spdy/3.1")) {
                throw new IOException("Unexpected protocol: ".concat(strD));
            }
            lVar = qd.l.SPDY_3;
        }
        Fe.e.y(list.contains(lVar), "Only " + list + " are supported, but negotiated protocol is %s", strD);
        if (C3890e.f44223a.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
