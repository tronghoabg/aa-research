package e.a.f.a;

import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f47587a = Logger.getLogger(l.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f47588b = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: c, reason: collision with root package name */
    private static final l f47589c = h();

    /* renamed from: d, reason: collision with root package name */
    private final Provider f47590d;

    public l(Provider provider) {
        this.f47590d = provider;
    }

    public static l e() {
        return f47589c;
    }

    public static byte[] g(List list) {
        k.h hVar = new k.h();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) list.get(i2);
            if (mVar != m.HTTP_1_0) {
                hVar.ae(mVar.toString().length());
                hVar.ar(mVar.toString());
            }
        }
        return hVar.T();
    }

    private static l h() throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, ClassNotFoundException, SecurityException, KeyManagementException, IllegalArgumentException, InvocationTargetException {
        Provider provider;
        int i2;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i3 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                provider = null;
                break;
            }
            Provider provider2 = providers[i3];
            String[] strArr = f47588b;
            int length2 = strArr.length;
            for (int i4 = 0; i4 < 5; i4++) {
                String str = strArr[i4];
                if (str.equals(provider2.getClass().getName())) {
                    f47587a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i3++;
        }
        int i5 = 2;
        if (provider != null) {
            com.waze.stats.storage.c cVar = new com.waze.stats.storage.c((Class) null, "setUseSessionTickets", Boolean.TYPE);
            com.waze.stats.storage.c cVar2 = new com.waze.stats.storage.c((Class) null, "setHostname", String.class);
            com.waze.stats.storage.c cVar3 = new com.waze.stats.storage.c(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            com.waze.stats.storage.c cVar4 = new com.waze.stats.storage.c((Class) null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                i2 = 1;
            } else {
                try {
                    l.class.getClassLoader().loadClass("android.net.Network");
                    i2 = 1;
                } catch (ClassNotFoundException e2) {
                    f47587a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e2);
                    try {
                        l.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (ClassNotFoundException e3) {
                        f47587a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e3);
                        i5 = 3;
                    }
                    i2 = i5;
                }
            }
            return new h(cVar, cVar2, cVar3, cVar4, provider, i2);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new i(provider3, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return new l(provider3);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused3) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                return new j(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void b(SSLSocket sSLSocket, String str, List list) {
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }

    public final Provider f() {
        return this.f47590d;
    }
}
