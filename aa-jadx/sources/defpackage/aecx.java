package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aecx extends defpackage.aeda {
    private final java.lang.reflect.Method d;
    private final java.lang.reflect.Method e;

    public aecx(java.security.Provider provider, java.lang.reflect.Method method, java.lang.reflect.Method method2) {
        super(provider);
        this.d = method;
        this.e = method2;
    }

    @Override // defpackage.aeda
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            return (java.lang.String) this.e.invoke(sSLSocket, null);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    @Override // defpackage.aeda
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.aedb aedbVar = (defpackage.aedb) it.next();
            if (aedbVar != defpackage.aedb.HTTP_1_0) {
                arrayList.add(aedbVar.e);
            }
        }
        try {
            this.d.invoke(sSLParameters, arrayList.toArray(new java.lang.String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    @Override // defpackage.aeda
    public final int c() {
        return 1;
    }
}
