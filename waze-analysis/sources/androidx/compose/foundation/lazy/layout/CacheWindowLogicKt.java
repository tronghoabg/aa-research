package androidx.compose.foundation.lazy.layout;

import h.ab;
import h.g.a.a;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CacheWindowLogicKt {
    private static final boolean DebugEnabled = false;
    public static final int InvalidIndex = -1;
    private static final int InvalidItemSize = -1;
    private static final int UnsetItemCount = -1;

    public static final void forEachVisibleItem(CacheWindowScope cacheWindowScope, q<? super Integer, Object, ? super Integer, ab> qVar) {
        int visibleLineCount = cacheWindowScope.getVisibleLineCount();
        for (int i2 = 0; i2 < visibleLineCount; i2++) {
            qVar.invoke(Integer.valueOf(cacheWindowScope.getVisibleItemLine(i2)), cacheWindowScope.getVisibleLineKey(i2), Integer.valueOf(cacheWindowScope.getVisibleItemSize(i2)));
        }
    }

    private static final void debugLog(a<String> aVar) {
    }
}
