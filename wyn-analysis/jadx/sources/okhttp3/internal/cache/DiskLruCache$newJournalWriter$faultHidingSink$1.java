package okhttp3.internal.cache;

import ef.C2515C;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.internal.Util;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lef/C;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f42518i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f42518i = diskLruCache;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        IOException it = (IOException) obj;
        AbstractC3340k.e(it, "it");
        byte[] bArr = Util.f42438a;
        this.f42518i.k = true;
        return C2515C.f34653a;
    }
}
