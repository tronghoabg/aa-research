package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajna extends defpackage.ajnn {
    private final javax.net.ssl.X509TrustManager a;
    private final android.net.http.X509TrustManagerExtensions b;

    public ajna(javax.net.ssl.X509TrustManager x509TrustManager, android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    @Override // defpackage.ajnn
    public final java.util.List a(java.util.List list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException {
        list.getClass();
        try {
            java.util.List<java.security.cert.X509Certificate> listCheckServerTrusted = this.b.checkServerTrusted((java.security.cert.X509Certificate[]) list.toArray(new java.security.cert.X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (java.security.cert.CertificateException e) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ajna) && ((defpackage.ajna) obj).a == this.a;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.a);
    }
}
