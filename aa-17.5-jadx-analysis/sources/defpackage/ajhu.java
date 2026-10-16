package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes3.dex */
public final class ajhu {
    public final ajij a;
    public final ajhk b;
    public final List c;
    private final aezr d;

    public ajhu(ajij ajijVar, ajhk ajhkVar, List list, afdr afdrVar) {
        list.getClass();
        this.a = ajijVar;
        this.b = ajhkVar;
        this.c = list;
        this.d = woy.dG(new tim(afdrVar, 11));
    }

    public static final List b(afdr afdrVar) {
        try {
            return (List) afdrVar.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return afbe.a;
        }
    }

    private static final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajhu)) {
            return false;
        }
        ajhu ajhuVar = (ajhu) obj;
        return ajhuVar.a == this.a && affa.f(ajhuVar.b, this.b) && affa.f(ajhuVar.a(), a()) && affa.f(ajhuVar.c, this.c);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        List listA = a();
        ArrayList arrayList = new ArrayList(woy.bp(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        ajij ajijVar = this.a;
        ajhk ajhkVar = this.b;
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(woy.bp(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + ajijVar + " cipherSuite=" + ajhkVar + " peerCertificates=" + string + " localCertificates=" + arrayList2 + "}";
    }
}
