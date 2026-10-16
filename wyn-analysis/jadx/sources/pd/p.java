package pd;

import com.qonversion.android.sdk.internal.Constants;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import od.AbstractC3669a0;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f43595b = Logger.getLogger(p.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final p f43596c;

    /* renamed from: a, reason: collision with root package name */
    public final qd.k f43597a;

    static {
        p pVar;
        qd.k kVar = qd.k.f44243d;
        ClassLoader classLoader = p.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e7) {
            Level level = Level.FINE;
            Logger logger = f43595b;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e7);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e10) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e10);
                pVar = new p(kVar);
            }
        }
        pVar = new o(kVar);
        f43596c = pVar;
    }

    public p(qd.k kVar) {
        Fe.e.t(kVar, "platform");
        this.f43597a = kVar;
    }

    public static boolean c(String str) {
        if (str.contains(Constants.USER_ID_SEPARATOR)) {
            return false;
        }
        try {
            Fe.e.r(AbstractC3669a0.a(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f43597a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f43597a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        qd.k kVar = this.f43597a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strB = b(sSLSocket);
            if (strB != null) {
                return strB;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            kVar.a(sSLSocket);
        }
    }
}
