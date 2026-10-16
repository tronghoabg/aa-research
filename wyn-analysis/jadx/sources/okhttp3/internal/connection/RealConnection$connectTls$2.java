package okhttp3.internal.connection;

import ff.p;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.Handshake;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RealConnection$connectTls$2 extends AbstractC3343n implements a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ RealConnection f42616i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f42616i = realConnection;
    }

    @Override // tf.a
    public final Object invoke() {
        Handshake handshake = this.f42616i.f42601e;
        AbstractC3340k.b(handshake);
        List listA = handshake.a();
        ArrayList arrayList = new ArrayList(p.a0(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
