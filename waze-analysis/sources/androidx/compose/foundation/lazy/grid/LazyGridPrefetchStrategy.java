package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyGridPrefetchStrategy {
    PrefetchScheduler getPrefetchScheduler();

    void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i2);

    void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope, float f2, LazyGridLayoutInfo lazyGridLayoutInfo);

    void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static PrefetchScheduler $default$getPrefetchScheduler(LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
            return null;
        }

        public static /* synthetic */ void getPrefetchScheduler$annotations() {
        }
    }
}
