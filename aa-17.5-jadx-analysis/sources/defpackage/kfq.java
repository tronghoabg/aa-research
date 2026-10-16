package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes2.dex */
final class kfq extends LruCache {
    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) ((admq) obj2).b).getByteCount();
    }
}
