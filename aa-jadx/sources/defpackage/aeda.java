package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aeda {
    public final java.security.Provider c;
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aeda.class.getName());
    private static final java.lang.String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final defpackage.aeda b = f();

    public aeda(java.security.Provider provider) {
        this.c = provider;
    }

    public static byte[] e(java.util.List list) {
        defpackage.ajny ajnyVar = new defpackage.ajny();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.aedb aedbVar = (defpackage.aedb) list.get(i);
            if (aedbVar != defpackage.aedb.HTTP_1_0) {
                java.lang.String str = aedbVar.e;
                ajnyVar.N(str.length());
                ajnyVar.V(str);
            }
        }
        return ajnyVar.D();
    }

    private static defpackage.aeda f() {
        java.security.Provider provider;
        int i;
        java.security.Provider[] providers = java.security.Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                provider = null;
                break;
            }
            java.security.Provider provider2 = providers[i2];
            java.lang.String[] strArr = d;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                java.lang.String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 2;
        if (provider == null) {
            try {
                java.security.Provider provider3 = javax.net.ssl.SSLContext.getDefault().getProvider();
                try {
                    try {
                        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        javax.net.ssl.SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                        return new defpackage.aecx(provider3, javax.net.ssl.SSLParameters.class.getMethod("setApplicationProtocols", java.lang.String[].class), javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", null));
                    } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                        return new defpackage.aeda(provider3);
                    }
                } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException | java.security.KeyManagementException | java.security.NoSuchAlgorithmException unused2) {
                    java.lang.Class<?> cls = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new defpackage.aecy(cls.getMethod("put", javax.net.ssl.SSLSocket.class, java.lang.Class.forName(defpackage.a.bJ("org.eclipse.jetty.alpn.ALPN", "$Provider"))), cls.getMethod("get", javax.net.ssl.SSLSocket.class), cls.getMethod("remove", javax.net.ssl.SSLSocket.class), java.lang.Class.forName(defpackage.a.bJ("org.eclipse.jetty.alpn.ALPN", "$ClientProvider")), java.lang.Class.forName(defpackage.a.bJ("org.eclipse.jetty.alpn.ALPN", "$ServerProvider")), provider3);
                }
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        defpackage.kez kezVar = new defpackage.kez(null, "setUseSessionTickets", new java.lang.Class[]{java.lang.Boolean.TYPE}, null);
        defpackage.kez kezVar2 = new defpackage.kez(null, "setHostname", new java.lang.Class[]{java.lang.String.class}, null);
        defpackage.kez kezVar3 = new defpackage.kez(byte[].class, "getAlpnSelectedProtocol", new java.lang.Class[0], null);
        defpackage.kez kezVar4 = new defpackage.kez(null, "setAlpnProtocols", new java.lang.Class[]{byte[].class}, null);
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.net.TrafficStats");
            cls2.getMethod("tagSocket", java.net.Socket.class);
            cls2.getMethod("untagSocket", java.net.Socket.class);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused3) {
        }
        if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
            try {
                defpackage.aeda.class.getClassLoader().loadClass("android.net.Network");
            } catch (java.lang.ClassNotFoundException e2) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (java.lang.Throwable) e2);
                try {
                    defpackage.aeda.class.getClassLoader().loadClass("android.app.ActivityOptions");
                } catch (java.lang.ClassNotFoundException e3) {
                    a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (java.lang.Throwable) e3);
                    i4 = 3;
                }
                i = i4;
            }
        }
        i = 1;
        return new defpackage.aecw(kezVar, kezVar2, kezVar3, kezVar4, provider, i);
    }

    public java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(javax.net.ssl.SSLSocket sSLSocket) {
    }

    public void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
    }
}
