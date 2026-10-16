package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyListPrefetchStrategy {
    PrefetchScheduler getPrefetchScheduler();

    void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i2);

    void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f2, LazyListLayoutInfo lazyListLayoutInfo);

    void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyListPrefetchStrategy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static PrefetchScheduler $default$getPrefetchScheduler(LazyListPrefetchStrategy lazyListPrefetchStrategy) {
            return null;
        }

        public static /* synthetic */ void getPrefetchScheduler$annotations() {
        }
    }
}
