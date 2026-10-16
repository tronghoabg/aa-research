package okhttp3.internal.i;

import h.g.b.x;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f56292a;

    public b(X509Certificate... x509CertificateArr) {
        x.f(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = (Set) new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f56292a = linkedHashMap;
    }

    @Override // okhttp3.internal.i.e
    public final X509Certificate a(X509Certificate x509Certificate) {
        x.f(x509Certificate, "cert");
        Set set = (Set) this.f56292a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof b) && x.n(((b) obj).f56292a, this.f56292a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f56292a.hashCode();
    }
}
