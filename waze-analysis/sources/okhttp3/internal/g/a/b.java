package okhttp3.internal.g.a;

import android.net.http.X509TrustManagerExtensions;
import h.g.b.x;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b extends okhttp3.internal.i.c {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager f56253a;

    /* renamed from: b, reason: collision with root package name */
    private final X509TrustManagerExtensions f56254b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        x.f(x509TrustManager, "trustManager");
        x.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f56253a = x509TrustManager;
        this.f56254b = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.i.c
    public final List a(List list, String str) throws CertificateException, SSLPeerUnverifiedException {
        x.f(list, "chain");
        x.f(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f56254b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            x.e(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f56253a == this.f56253a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f56253a);
    }
}
