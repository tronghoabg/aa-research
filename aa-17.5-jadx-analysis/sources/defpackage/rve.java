package defpackage;

import java.io.ByteArrayInputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class rve implements X509KeyManager {
    public final X509TrustManager a;
    private final PrivateKey b;
    private final X509Certificate c;
    private final X509Certificate d;
    private final /* synthetic */ int e;

    public rve(PrivateKey privateKey, String str, int i) throws Exception {
        this.e = i;
        vqk vqkVar = rsm.a;
        rlc.a(vqkVar);
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        rvg.a.l().ai(8371).y("Loading certificate factory from provider: %s", certificateFactory.getProvider());
        this.c = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
        X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8)));
        this.d = x509Certificate;
        this.b = privateKey;
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        X509TrustManager x509TrustManager = null;
        keyStore.load(null, null);
        keyStore.setCertificateEntry("GAL", x509Certificate);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        int length = trustManagers.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            TrustManager trustManager = trustManagers[i2];
            if (trustManager instanceof X509TrustManager) {
                x509TrustManager = (X509TrustManager) trustManager;
                break;
            }
            i2++;
        }
        if (x509TrustManager == null) {
            throw new KeyManagementException("No X509TrustManager in among default TrustManagers: ".concat(String.valueOf(Arrays.toString(trustManagers))));
        }
        this.a = x509TrustManager;
        rlc.a(vqkVar);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        if (this.e != 0) {
            throw new UnsupportedOperationException("client alias should not be requested for server side");
        }
        throw new UnsupportedOperationException("client alias should not be requested for server side");
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
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
    public final X509Certificate[] getCertificateChain(String str) {
        if (this.e != 0) {
            if (str.equals("com.google.android.gms.car")) {
                return new X509Certificate[]{this.c, this.d};
            }
            throw new IllegalArgumentException("Certificates requested for an unknown server alias ".concat(String.valueOf(str)));
        }
        if (str.equals("com.google.android.gms.car")) {
            return new X509Certificate[]{this.c, this.d};
        }
        throw new IllegalArgumentException("Certificates requested for an unknown server alias ".concat(String.valueOf(str)));
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getClientAliases(String str, Principal[] principalArr) {
        if (this.e != 0) {
            throw new UnsupportedOperationException("client aliases should not be requested for server side");
        }
        throw new UnsupportedOperationException("client aliases should not be requested for server side");
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String str) {
        return this.b;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getServerAliases(String str, Principal[] principalArr) {
        return this.e != 0 ? str.equals("RSA") ? new String[]{"com.google.android.gms.car"} : new String[0] : str.equals("RSA") ? new String[]{"com.google.android.gms.car"} : new String[0];
    }

    public rve(PrivateKey privateKey, String str, int i, byte[] bArr) throws Exception {
        this.e = i;
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        jca.a.l().ai(1826).y("Loading certificate factory from provider: %s", certificateFactory.getProvider());
        this.c = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
        X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream("-----BEGIN CERTIFICATE-----\nMIIDiTCCAnGgAwIBAgIJAMFO56WkVE1CMA0GCSqGSIb3DQEBBQUAMFsxCzAJBgNV\nBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRYwFAYDVQQHDA1Nb3VudGFpbiBW\naWV3MR8wHQYDVQQKDBZHb29nbGUgQXV0b21vdGl2ZSBMaW5rMB4XDTE0MDYwNjE4\nMjgxOVoXDTQ0MDYwNTE4MjgxOVowWzELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNh\nbGlmb3JuaWExFjAUBgNVBAcMDU1vdW50YWluIFZpZXcxHzAdBgNVBAoMFkdvb2ds\nZSBBdXRvbW90aXZlIExpbmswggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIB\nAQDUH+iIbwwVb74NdI5eBv/ACFmh4ml/NOW7gUVWdYX50n8uQQsHHLCNIhk5VV2H\nhanvAZ/XXHPuVAPadE2HpnNqePKF/RDo4eJo/+rOief8gBYq/Z+OQTZeLdNm+GoI\nHBrEjU4Ms8IdLuFW0jF8LlIRgekjLHpc7duUl3QpwBlmAWQK40T/SZjprlmhyqfJ\ng1rxFdnGbrSibmCsTmb3m6WZyZUyrcwmd7t6q3pHbMABO+o02asPG/YPj/SJo4+i\nfb5/Nk56f3hH9pBiPKQXJnVUdVLKMXSRgydDBsGSBol4C0JL77MNDrMR5jdafJ4j\nmWmsa2+mnzoAv9AxEL9T0LiNAgMBAAGjUDBOMB0GA1UdDgQWBBS5dqvv8DPQiwrM\nfgn8xKR91k7wgjAfBgNVHSMEGDAWgBS5dqvv8DPQiwrMfgn8xKR91k7wgjAMBgNV\nHRMEBTADAQH/MA0GCSqGSIb3DQEBBQUAA4IBAQDKcnBsrbB0Jbz2VGJKP2lwYB6P\ndCTCCpQu7dVp61UQOX+zWfd2hnNMnLs/r1xPO+eyN0vmw7sD05phaIhbXVauKWZi\n9WqWHTaR+9s6CTyBOc1Mye0DMj+4vHt+WLmf0lYjkYUVYvR1EImX8ktXzkVmOqn+\ne30siqlZ8pQpsOgegIKfJ+pNQM8c3eXVv3KFMUgjZW33SziZL8IMsLvSO+1LtH37\nKqbTEMP6XUwVuZopgGvaHU74eT/WSRGlL7vX4OL5/UXXP4qsGH2Zp7uQlErv4H9j\nkMs37UL1vGb4M8RM7Eyu9/RulepSmqZUF+3i+3eby8iGq/3OWk9wgJf7AXnx\n-----END CERTIFICATE-----\n".getBytes(StandardCharsets.UTF_8)));
        this.d = x509Certificate;
        this.b = privateKey;
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        X509TrustManager x509TrustManager = null;
        keyStore.load(null, null);
        keyStore.setCertificateEntry("GAL", x509Certificate);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        int length = trustManagers.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            TrustManager trustManager = trustManagers[i2];
            if (trustManager instanceof X509TrustManager) {
                x509TrustManager = (X509TrustManager) trustManager;
                break;
            }
            i2++;
        }
        if (x509TrustManager != null) {
            this.a = x509TrustManager;
            return;
        }
        throw new KeyManagementException("No X509TrustManager in among default TrustManagers: ".concat(String.valueOf(Arrays.toString(trustManagers))));
    }
}
