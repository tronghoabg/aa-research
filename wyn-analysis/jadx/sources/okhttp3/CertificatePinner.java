package okhttp3;

import Bf.r;
import ff.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.tls.CertificateChainCleaner;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/CertificatePinner;", "", "Builder", "Companion", "Pin", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CertificatePinner {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f42194c = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f42195d = new CertificatePinner(o.X0(new Builder().f42198a), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f42196a;

    /* renamed from: b, reason: collision with root package name */
    public final CertificateChainCleaner f42197b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f42198a = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Pin {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            pin.getClass();
            pin.getClass();
            pin.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        this.f42196a = set;
        this.f42197b = certificateChainCleaner;
    }

    public final void a(String hostname, List peerCertificates) {
        AbstractC3340k.e(hostname, "hostname");
        AbstractC3340k.e(peerCertificates, "peerCertificates");
        b(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    public final void b(String hostname, a aVar) {
        AbstractC3340k.e(hostname, "hostname");
        Iterator it = this.f42196a.iterator();
        if (it.hasNext()) {
            ((Pin) it.next()).getClass();
            r.k0(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return AbstractC3340k.a(certificatePinner.f42196a, this.f42196a) && AbstractC3340k.a(certificatePinner.f42197b, this.f42197b);
    }

    public final int hashCode() {
        int iHashCode = (this.f42196a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f42197b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
