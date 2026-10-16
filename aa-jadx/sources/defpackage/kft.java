package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kft extends android.util.LruCache {
    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(java.lang.Object obj, java.lang.Object obj2) {
        return ((android.graphics.Bitmap) ((defpackage.adnr) obj2).b).getByteCount();
    }
}
