package defpackage;

import android.os.Build;
import java.io.IOException;
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

/* loaded from: classes2.dex */
public class ajly {
    private static final Logger a;
    public static volatile ajly c;

    static {
        int i = ajmb.a;
        ajmb.b();
        ajly ajlxVar = null;
        ajly ajlvVar = ajlv.a ? new ajlv() : null;
        if (ajlvVar != null) {
            ajlxVar = ajlvVar;
        } else if (ajlx.b) {
            ajlxVar = new ajlx();
        }
        if (ajlxVar != null) {
            c = ajlxVar;
            a = Logger.getLogger(ajia.class.getName());
        } else {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public ajmn b(X509TrustManager x509TrustManager) {
        return new ajml(h(x509TrustManager));
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
    }

    public void d(String str, int i, Throwable th) {
        a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void e(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        d(str, 5, (Throwable) obj);
    }

    public boolean f(String str) {
        return true;
    }

    public Object g() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public ajmp h(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new ajmm((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void i(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        socket.getClass();
        socket.connect(inetSocketAddress, 10000);
    }

    public final SSLSocketFactory j(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        x509TrustManager.getClass();
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.getClass();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            e.toString();
            throw new AssertionError("No System TLS: ".concat(e.toString()), e);
        }
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        return simpleName;
    }
}
