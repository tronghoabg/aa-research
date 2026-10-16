package androidx.compose.foundation.lazy.layout;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutItemProviderKt {
    public static final int findIndexByKey(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2) {
        int index;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i2 < lazyLayoutItemProvider.getItemCount() && x.n(obj, lazyLayoutItemProvider.getKey(i2))) || (index = lazyLayoutItemProvider.getIndex(obj)) == -1) ? i2 : index;
    }
}
