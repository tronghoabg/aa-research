package okhttp3.internal.g;

import h.g.b.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b implements okhttp3.internal.i.e {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager f56272a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f56273b;

    public b(X509TrustManager x509TrustManager, Method method) {
        x.f(x509TrustManager, "trustManager");
        x.f(method, "findByIssuerAndSignatureMethod");
        this.f56272a = x509TrustManager;
        this.f56273b = method;
    }

    @Override // okhttp3.internal.i.e
    public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(x509Certificate, "cert");
        try {
            Object objInvoke = this.f56273b.invoke(this.f56272a, x509Certificate);
            x.d(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x.n(this.f56272a, bVar.f56272a) && x.n(this.f56273b, bVar.f56273b);
    }

    public final int hashCode() {
        return (this.f56272a.hashCode() * 31) + this.f56273b.hashCode();
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f56272a + ", findByIssuerAndSignatureMethod=" + this.f56273b + ")";
    }
}
