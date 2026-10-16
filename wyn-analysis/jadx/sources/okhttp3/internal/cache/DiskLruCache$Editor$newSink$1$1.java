package okhttp3.internal.cache;

import ef.C2515C;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import okhttp3.internal.cache.DiskLruCache;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lef/C;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class DiskLruCache$Editor$newSink$1$1 extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f42498i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.Editor f42499j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.f42498i = diskLruCache;
        this.f42499j = editor;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        IOException it = (IOException) obj;
        AbstractC3340k.e(it, "it");
        DiskLruCache diskLruCache = this.f42498i;
        DiskLruCache.Editor editor = this.f42499j;
        synchronized (diskLruCache) {
            editor.c();
        }
        return C2515C.f34653a;
    }
}
