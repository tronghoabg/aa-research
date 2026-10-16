package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rvx implements javax.net.ssl.X509KeyManager {
    public final javax.net.ssl.X509TrustManager a;
    private final java.security.PrivateKey b;
    private final java.security.cert.X509Certificate c;
    private final java.security.cert.X509Certificate d;
    private final /* synthetic */ int e;

    public rvx(java.security.PrivateKey privateKey, java.lang.String str, int i) throws java.lang.Exception {
        this.e = i;
        defpackage.kwv kwvVar = defpackage.rtg.a;
        defpackage.rly.a(kwvVar);
        java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
        defpackage.rvz.a.l().ai(8396).y("Loading certificate factory from provider: %s", certificateFactory.getProvider());
        this.c = (java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        this.d = x509Certificate;
        this.b = privateKey;
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
        javax.net.ssl.X509TrustManager x509TrustManager = null;
        keyStore.load(null, null);
        keyStore.setCertificateEntry("GAL", x509Certificate);
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        for (javax.net.ssl.TrustManager trustManager : trustManagers) {
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                break;
            }
        }
        if (x509TrustManager == null) {
            throw new java.security.KeyManagementException("No X509TrustManager in among default TrustManagers: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(trustManagers))));
        }
        this.a = x509TrustManager;
        defpackage.rly.a(kwvVar);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final java.lang.String chooseClientAlias(java.lang.String[] strArr, java.security.Principal[] principalArr, java.net.Socket socket) {
        if (this.e != 0) {
            throw new java.lang.UnsupportedOperationException("client alias should not be requested for server side");
        }
        throw new java.lang.UnsupportedOperationException("client alias should not be requested for server side");
    }

    @Override // javax.net.ssl.X509KeyManager
    public final java.lang.String chooseServerAlias(java.lang.String str, java.security.Principal[] principalArr, java.net.Socket socket) {
        if (this.e != 0) {
            if (str.equals("RSA")) {
                return "com.google.android.gms.car";
            }
            return null;
        }
        if (str.equals("RSA")) {
            return "com.google.android.gms.car";
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final java.security.cert.X509Certificate[] getCertificateChain(java.lang.String str) {
        if (this.e != 0) {
            if (str.equals("com.google.android.gms.car")) {
                return new java.security.cert.X509Certificate[]{this.c, this.d};
            }
            throw new java.lang.IllegalArgumentException("Certificates requested for an unknown server alias ".concat(java.lang.String.valueOf(str)));
        }
        if (str.equals("com.google.android.gms.car")) {
            return new java.security.cert.X509Certificate[]{this.c, this.d};
        }
        throw new java.lang.IllegalArgumentException("Certificates requested for an unknown server alias ".concat(java.lang.String.valueOf(str)));
    }

    @Override // javax.net.ssl.X509KeyManager
    public final java.lang.String[] getClientAliases(java.lang.String str, java.security.Principal[] principalArr) {
        if (this.e != 0) {
            throw new java.lang.UnsupportedOperationException("client aliases should not be requested for server side");
        }
        throw new java.lang.UnsupportedOperationException("client aliases should not be requested for server side");
    }

    @Override // javax.net.ssl.X509KeyManager
    public final java.security.PrivateKey getPrivateKey(java.lang.String str) {
        return this.b;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final java.lang.String[] getServerAliases(java.lang.String str, java.security.Principal[] principalArr) {
        if (this.e != 0) {
            return str.equals("RSA") ? new java.lang.String[]{"com.google.android.gms.car"} : new java.lang.String[0];
        }
        return str.equals("RSA") ? new java.lang.String[]{"com.google.android.gms.car"} : new java.lang.String[0];
    }

    public rvx(java.security.PrivateKey privateKey, java.lang.String str, int i, byte[] bArr) throws java.lang.Exception {
        this.e = i;
        java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
        defpackage.jch.a.l().ai(1826).y("Loading certificate factory from provider: %s", certificateFactory.getProvider());
        this.c = (java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        this.d = x509Certificate;
        this.b = privateKey;
        java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
        javax.net.ssl.X509TrustManager x509TrustManager = null;
        keyStore.load(null, null);
        keyStore.setCertificateEntry("GAL", x509Certificate);
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        for (javax.net.ssl.TrustManager trustManager : trustManagers) {
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                break;
            }
        }
        if (x509TrustManager != null) {
            this.a = x509TrustManager;
            return;
        }
        throw new java.security.KeyManagementException("No X509TrustManager in among default TrustManagers: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(trustManagers))));
    }
}
