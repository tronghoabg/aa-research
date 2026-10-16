package okhttp3;

import com.waze.strings.DisplayStrings;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final av f56347a;

    /* renamed from: b, reason: collision with root package name */
    private final m f56348b;

    /* renamed from: c, reason: collision with root package name */
    private final List f56349c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f56350d;

    public y(av avVar, m mVar, List list, final h.g.a.a aVar) {
        h.g.b.x.f(avVar, "tlsVersion");
        h.g.b.x.f(mVar, "cipherSuite");
        h.g.b.x.f(list, "localCertificates");
        h.g.b.x.f(aVar, "peerCertificatesFn");
        this.f56347a = avVar;
        this.f56348b = mVar;
        this.f56349c = list;
        this.f56350d = h.g.a(new h.g.a.a() { // from class: okhttp3.x
            @Override // h.g.a.a
            public final Object invoke() {
                return y.c(aVar);
            }
        });
    }

    static final List c(h.g.a.a aVar) {
        try {
            return (List) aVar.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return h.a.i.h();
        }
    }

    private static final String f(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        h.g.b.x.e(type, "getType(...)");
        return type;
    }

    public final List a() {
        return this.f56349c;
    }

    public final List b() {
        return (List) this.f56350d.getValue();
    }

    public final m d() {
        return this.f56348b;
    }

    public final av e() {
        return this.f56347a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return yVar.f56347a == this.f56347a && h.g.b.x.n(yVar.f56348b, this.f56348b) && h.g.b.x.n(yVar.b(), b()) && h.g.b.x.n(yVar.f56349c, this.f56349c);
    }

    public final int hashCode() {
        return ((((((this.f56347a.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.f56348b.hashCode()) * 31) + b().hashCode()) * 31) + this.f56349c.hashCode();
    }

    public final String toString() {
        List listB = b();
        ArrayList arrayList = new ArrayList(h.a.i.q(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(f((Certificate) it.next()));
        }
        String string = arrayList.toString();
        av avVar = this.f56347a;
        m mVar = this.f56348b;
        List list = this.f56349c;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + avVar + " cipherSuite=" + mVar + " peerCertificates=" + string + " localCertificates=" + arrayList2 + "}";
    }
}
