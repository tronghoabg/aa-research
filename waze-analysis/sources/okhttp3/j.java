package okhttp3;

import com.waze.strings.DisplayStrings;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f56294a = new j(h.a.i.au(new ArrayList()), null);

    /* renamed from: b, reason: collision with root package name */
    private final Set f56295b;

    /* renamed from: c, reason: collision with root package name */
    private final okhttp3.internal.i.c f56296c;

    public j(Set set, okhttp3.internal.i.c cVar) {
        h.g.b.x.f(set, "pins");
        this.f56295b = set;
        this.f56296c = cVar;
    }

    static final List a(j jVar, List list, String str) {
        List listA;
        okhttp3.internal.i.c cVar = jVar.f56296c;
        if (cVar != null && (listA = cVar.a(list, str)) != null) {
            list = listA;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        for (Certificate certificate : list2) {
            h.g.b.x.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public final j b(okhttp3.internal.i.c cVar) {
        h.g.b.x.f(cVar, "certificateChainCleaner");
        return h.g.b.x.n(this.f56296c, cVar) ? this : new j(this.f56295b, cVar);
    }

    public final okhttp3.internal.i.c c() {
        return this.f56296c;
    }

    public final void d(String str, h.g.a.a aVar) {
        h.g.b.x.f(str, "hostname");
        h.g.b.x.f(aVar, "cleanedPeerCertificatesFn");
        h.g.b.x.f(str, "hostname");
        Set set = this.f56295b;
        List<i> listH = h.a.i.h();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw null;
        }
        if (listH.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) aVar.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it2 = listH.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(kotlinx.coroutines.i.c.e(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (i iVar : listH) {
            sb.append("\n    ");
            sb.append(iVar);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.g.b.x.n(jVar.f56295b, this.f56295b) && h.g.b.x.n(jVar.f56296c, this.f56296c);
    }

    public final int hashCode() {
        int iHashCode = this.f56295b.hashCode() + DisplayStrings.DS_TRANSPORTATION_POPUP_BODY_IOS_PS_PS;
        okhttp3.internal.i.c cVar = this.f56296c;
        return (iHashCode * 41) + (cVar != null ? cVar.hashCode() : 0);
    }
}
