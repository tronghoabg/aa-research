package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aail extends android.util.LruCache {
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.aaim aaimVar = (defpackage.aaim) obj2;
        defpackage.aaim aaimVar2 = (defpackage.aaim) obj3;
        if (aaimVar == null || aaimVar2 != null) {
            return;
        }
        aaimVar.a.delete();
    }
}
