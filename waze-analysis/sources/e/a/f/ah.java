package e.a.f;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class ah {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f47643b = Logger.getLogger(ah.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final e.a.f.a.l f47644c = e.a.f.a.l.e();

    /* renamed from: d, reason: collision with root package name */
    private static final ah f47645d;

    /* renamed from: a, reason: collision with root package name */
    protected final e.a.f.a.l f47646a;

    static {
        ah ahVar;
        ClassLoader classLoader = ah.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e2) {
            f47643b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e2);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e3) {
                f47643b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e3);
                ahVar = new ah(f47644c);
            }
        }
        ahVar = new ag(f47644c);
        f47645d = ahVar;
    }

    ah(e.a.f.a.l lVar) {
        com.google.d.b.an.C(lVar, "platform");
        this.f47646a = lVar;
    }

    public static ah d() {
        return f47645d;
    }

    public String a(SSLSocket sSLSocket) {
        return this.f47646a.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strA = a(sSLSocket);
            if (strA != null) {
                return strA;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + String.valueOf(list));
        } finally {
            this.f47646a.d(sSLSocket);
        }
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.f47646a.b(sSLSocket, str, list);
    }
}
