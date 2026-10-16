package defpackage;

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

/* loaded from: classes3.dex */
public class aeca {
    public final Provider c;
    public static final Logger a = Logger.getLogger(aeca.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final aeca b = f();

    public aeca(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List list) {
        ajmy ajmyVar = new ajmy();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aecb aecbVar = (aecb) list.get(i);
            if (aecbVar != aecb.HTTP_1_0) {
                String str = aecbVar.e;
                ajmyVar.N(str.length());
                ajmyVar.V(str);
            }
        }
        return ajmyVar.D();
    }

    private static aeca f() throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, ClassNotFoundException, SecurityException, KeyManagementException, IllegalArgumentException, InvocationTargetException {
        Provider provider;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            String[] strArr = d;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 2;
        if (provider == null) {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                        return new aebx(provider3, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        return new aeca(provider3);
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused2) {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new aeby(cls.getMethod("put", SSLSocket.class, Class.forName(a.bK("org.eclipse.jetty.alpn.ALPN", "$Provider"))), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName(a.bK("org.eclipse.jetty.alpn.ALPN", "$ClientProvider")), Class.forName(a.bK("org.eclipse.jetty.alpn.ALPN", "$ServerProvider")), provider3);
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        zre zreVar = new zre((Class) null, "setUseSessionTickets", Boolean.TYPE);
        zre zreVar2 = new zre((Class) null, "setHostname", String.class);
        zre zreVar3 = new zre(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        zre zreVar4 = new zre((Class) null, "setAlpnProtocols", byte[].class);
        try {
            Class<?> cls2 = Class.forName("android.net.TrafficStats");
            cls2.getMethod("tagSocket", Socket.class);
            cls2.getMethod("untagSocket", Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
        }
        if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
            i = 1;
        } else {
            try {
                aeca.class.getClassLoader().loadClass("android.net.Network");
                i = 1;
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e2);
                try {
                    aeca.class.getClassLoader().loadClass("android.app.ActivityOptions");
                } catch (ClassNotFoundException e3) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e3);
                    i4 = 3;
                }
                i = i4;
            }
        }
        return new aebw(zreVar, zreVar2, zreVar3, zreVar4, provider, i);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }

    public void b(SSLSocket sSLSocket, String str, List list) {
    }
}
