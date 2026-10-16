package okhttp3;

import Fe.c;
import ef.C2532p;
import ff.p;
import ff.v;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Handshake;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Handshake {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f42261e = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final TlsVersion f42262a;

    /* renamed from: b, reason: collision with root package name */
    public final CipherSuite f42263b;

    /* renamed from: c, reason: collision with root package name */
    public final List f42264c;

    /* renamed from: d, reason: collision with root package name */
    public final C2532p f42265d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static Handshake a(SSLSession sSLSession) throws IOException {
            Certificate[] peerCertificates;
            List listK = v.f35432a;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(AbstractC3340k.k(cipherSuite, "cipherSuite == "));
            }
            CipherSuite cipherSuiteB = CipherSuite.f42203b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.f42430b.getClass();
            TlsVersion tlsVersionA = TlsVersion.Companion.a(protocol);
            try {
                peerCertificates = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
            }
            List listK2 = peerCertificates != null ? Util.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK;
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                listK = Util.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new Handshake(tlsVersionA, cipherSuiteB, listK, new Handshake$Companion$handshake$1(listK2));
        }

        private Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, a aVar) {
        this.f42262a = tlsVersion;
        this.f42263b = cipherSuite;
        this.f42264c = list;
        this.f42265d = c.z(new Handshake$peerCertificates$2(aVar));
    }

    public final List a() {
        return (List) this.f42265d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f42262a == this.f42262a && AbstractC3340k.a(handshake.f42263b, this.f42263b) && AbstractC3340k.a(handshake.a(), a()) && AbstractC3340k.a(handshake.f42264c, this.f42264c);
    }

    public final int hashCode() {
        return this.f42264c.hashCode() + ((a().hashCode() + ((this.f42263b.hashCode() + ((this.f42262a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(p.a0(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC3340k.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f42262a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f42263b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f42264c;
        ArrayList arrayList2 = new ArrayList(p.a0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC3340k.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
