package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aecy extends defpackage.aeda {
    private final java.lang.reflect.Method d;
    private final java.lang.reflect.Method e;
    private final java.lang.reflect.Method f;
    private final java.lang.Class g;
    private final java.lang.Class h;

    public aecy(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2, java.security.Provider provider) {
        super(provider);
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    @Override // defpackage.aeda
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            defpackage.aecz aeczVar = (defpackage.aecz) java.lang.reflect.Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            int i = defpackage.aecz.c;
            if (aeczVar.a) {
                return null;
            }
            java.lang.String str = aeczVar.b;
            if (str != null) {
                return str;
            }
            a.logp(java.util.logging.Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.reflect.InvocationTargetException unused2) {
            throw new java.lang.AssertionError();
        }
    }

    @Override // defpackage.aeda
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.aedb aedbVar = (defpackage.aedb) list.get(i);
            if (aedbVar != defpackage.aedb.HTTP_1_0) {
                arrayList.add(aedbVar.e);
            }
        }
        try {
            this.d.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(defpackage.aeda.class.getClassLoader(), new java.lang.Class[]{this.g, this.h}, new defpackage.aecz(arrayList)));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    @Override // defpackage.aeda
    public final int c() {
        return 1;
    }

    @Override // defpackage.aeda
    public final void d(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.f.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.reflect.InvocationTargetException e) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (java.lang.Throwable) e);
        }
    }
}
