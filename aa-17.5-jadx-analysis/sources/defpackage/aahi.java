package defpackage;

import android.util.LruCache;

/* loaded from: classes3.dex */
final class aahi extends LruCache {
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        aahj aahjVar = (aahj) obj2;
        aahj aahjVar2 = (aahj) obj3;
        if (aahjVar == null || aahjVar2 != null) {
            return;
        }
        aahjVar.a.delete();
    }
}
