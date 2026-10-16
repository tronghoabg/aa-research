package okhttp3.internal.g;

import androidx.core.os.EnvironmentCompat;
import com.waze.ce.x;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.ai;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f56287a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f56288b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f56289c;

    static {
        f gVar;
        if (x.g()) {
            int i2 = okhttp3.internal.g.a.c.f56255a;
            okhttp3.internal.g.a.c.a();
            gVar = a.f56251a ? new a() : null;
            if (gVar == null) {
                eVar = c.f56274a ? new c() : null;
                h.g.b.x.c(eVar);
            }
        } else {
            f fVar = f.f56286a ? new f() : null;
            if (fVar != null) {
                gVar = fVar;
            } else {
                int i3 = e.f56280a;
                String property = System.getProperty("java.specification.version", EnvironmentCompat.MEDIA_UNKNOWN);
                try {
                    h.g.b.x.c(property);
                } catch (NumberFormatException unused) {
                }
                if (Integer.parseInt(property) < 9) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                        Method method2 = cls.getMethod("get", SSLSocket.class);
                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                        h.g.b.x.c(method);
                        h.g.b.x.c(method2);
                        h.g.b.x.c(method3);
                        h.g.b.x.c(cls3);
                        h.g.b.x.c(cls4);
                        eVar = new e(method, method2, method3, cls3, cls4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    }
                }
                gVar = eVar == null ? new g() : eVar;
            }
        }
        f56287a = gVar;
        f56289c = Logger.getLogger(ai.class.getName());
    }

    public static /* synthetic */ void n(g gVar, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        gVar.m(str, i2, null);
    }

    public String a(SSLSocket sSLSocket) {
        h.g.b.x.f(sSLSocket, "sslSocket");
        return null;
    }

    public okhttp3.internal.i.c b(X509TrustManager x509TrustManager) {
        h.g.b.x.f(x509TrustManager, "trustManager");
        return new okhttp3.internal.i.a(o(x509TrustManager));
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        h.g.b.x.f(sSLSocket, "sslSocket");
        h.g.b.x.f(list, "protocols");
    }

    public boolean e(String str) {
        h.g.b.x.f(str, "hostname");
        return true;
    }

    public void f(String str, Object obj) {
        h.g.b.x.f(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(str, 5, (Throwable) obj);
    }

    public Object h() {
        h.g.b.x.f("response.body().close()", "closer");
        if (f56289c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void i(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        h.g.b.x.f(socket, "socket");
        h.g.b.x.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, 10000);
    }

    public final SSLSocketFactory k(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        h.g.b.x.f(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            h.g.b.x.e(sSLContext, "getInstance(...)");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            h.g.b.x.e(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            e2.toString();
            throw new AssertionError("No System TLS: ".concat(e2.toString()), e2);
        }
    }

    public final void m(String str, int i2, Throwable th) {
        h.g.b.x.f(str, "message");
        f56289c.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public okhttp3.internal.i.e o(X509TrustManager x509TrustManager) {
        h.g.b.x.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new okhttp3.internal.i.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void p(SSLSocket sSLSocket) {
        h.g.b.x.f(sSLSocket, "sslSocket");
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        h.g.b.x.e(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
