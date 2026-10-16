package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RealConnection$connectTls$1 extends AbstractC3343n implements a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f42614i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Handshake f42615j;
    public final /* synthetic */ Address k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f42614i = certificatePinner;
        this.f42615j = handshake;
        this.k = address;
    }

    @Override // tf.a
    public final Object invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f42614i.f42197b;
        AbstractC3340k.b(certificateChainCleaner);
        return certificateChainCleaner.a(this.f42615j.a(), this.k.f42144h.f42276d);
    }
}
