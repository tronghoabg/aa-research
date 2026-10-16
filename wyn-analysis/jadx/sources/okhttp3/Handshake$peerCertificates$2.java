package okhttp3;

import ff.v;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class Handshake$peerCertificates$2 extends AbstractC3343n implements a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC3343n f42268i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(a aVar) {
        super(0);
        this.f42268i = (AbstractC3343n) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.n, tf.a] */
    @Override // tf.a
    public final Object invoke() {
        try {
            return (List) this.f42268i.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return v.f35432a;
        }
    }
}
