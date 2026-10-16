package okhttp3;

import ff.p;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.internal.tls.CertificateChainCleaner;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CertificatePinner$check$1 extends AbstractC3343n implements a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f42199i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f42200j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.f42199i = certificatePinner;
        this.f42200j = list;
        this.k = str;
    }

    @Override // tf.a
    public final Object invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f42199i.f42197b;
        List list = this.f42200j;
        List listA = certificateChainCleaner == null ? null : certificateChainCleaner.a(list, this.k);
        if (listA != null) {
            list = listA;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(p.a0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
