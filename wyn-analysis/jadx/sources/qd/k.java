package qd;

import cg.C1618g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import me.C3558a;

/* loaded from: classes5.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f44241b = Logger.getLogger(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f44242c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d, reason: collision with root package name */
    public static final k f44243d;

    /* renamed from: a, reason: collision with root package name */
    public final Provider f44244a;

    static {
        Logger logger;
        int i5;
        Provider provider;
        Provider provider2;
        k kVar;
        int i10;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i11 = 0;
        loop0: while (true) {
            logger = f44241b;
            if (i11 >= length) {
                i5 = 0;
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i11];
            for (String str : f44242c) {
                i5 = 0;
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i11++;
        }
        if (provider != null) {
            Class[] clsArr = new Class[1];
            clsArr[i5] = Boolean.TYPE;
            C3558a c3558a = new C3558a(null, "setUseSessionTickets", clsArr);
            Class[] clsArr2 = new Class[1];
            clsArr2[i5] = String.class;
            C3558a c3558a2 = new C3558a(null, "setHostname", clsArr2);
            int i12 = i5;
            C3558a c3558a3 = new C3558a(byte[].class, "getAlpnSelectedProtocol", new Class[i12]);
            Class[] clsArr3 = new Class[1];
            clsArr3[i12] = byte[].class;
            C3558a c3558a4 = new C3558a(null, "setAlpnProtocols", clsArr3);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                Class<?>[] clsArr4 = new Class[1];
                clsArr4[i12] = Socket.class;
                cls.getMethod("tagSocket", clsArr4);
                Class<?>[] clsArr5 = new Class[1];
                clsArr5[i12] = Socket.class;
                cls.getMethod("untagSocket", clsArr5);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                i10 = 1;
                kVar = new g(c3558a, c3558a2, c3558a3, c3558a4, provider, i10);
            } else {
                try {
                    k.class.getClassLoader().loadClass("android.net.Network");
                    i10 = 1;
                } catch (ClassNotFoundException e7) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e7);
                    try {
                        k.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i10 = 2;
                    } catch (ClassNotFoundException e10) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e10);
                        i10 = 3;
                    }
                }
                kVar = new g(c3558a, c3558a2, c3558a3, c3558a4, provider, i10);
            }
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new C3891f(0))).invoke(sSLContext.createSSLEngine(), new Object[0]);
                        kVar = new h(provider4, (Method) AccessController.doPrivileged(new C3891f(1)), (Method) AccessController.doPrivileged(new C3891f(2)));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        try {
                            kVar = new i(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                            provider2 = provider4;
                            kVar = new k(provider2);
                            f44243d = kVar;
                        }
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    provider2 = provider4;
                    kVar = new k(provider2);
                    f44243d = kVar;
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
        f44243d = kVar;
    }

    public k(Provider provider) {
        this.f44244a = provider;
    }

    public static byte[] b(List list) {
        C1618g c1618g = new C1618g();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            l lVar = (l) list.get(i5);
            if (lVar != l.HTTP_1_0) {
                c1618g.X(lVar.f44250a.length());
                c1618g.d0(lVar.f44250a);
            }
        }
        return c1618g.readByteArray(c1618g.f19902b);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
