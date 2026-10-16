package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListCacheWindowStrategy extends CacheWindowLogic implements LazyListPrefetchStrategy {
    public static final int $stable = 8;
    private final LazyListCacheWindowScope cacheWindowScope;

    public LazyListCacheWindowStrategy(LazyLayoutCacheWindow lazyLayoutCacheWindow) {
        super(lazyLayoutCacheWindow, false, 2, null);
        this.cacheWindowScope = new LazyListCacheWindowScope();
    }

    private final void applyWindowScope(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo, l<? super CacheWindowScope, ab> lVar) {
        this.cacheWindowScope.setLayoutInfo(lazyListLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyListPrefetchScope);
        lVar.invoke(this.cacheWindowScope);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public /* synthetic */ PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int nestedPrefetchItemCount = nestedPrefetchScope.getNestedPrefetchItemCount() == -1 ? 2 : nestedPrefetchScope.getNestedPrefetchItemCount();
        for (int i3 = 0; i3 < nestedPrefetchItemCount; i3++) {
            nestedPrefetchScope.schedulePrecomposition(i2 + i3);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f2, LazyListLayoutInfo lazyListLayoutInfo) {
        this.cacheWindowScope.setLayoutInfo(lazyListLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyListPrefetchScope);
        onScroll(this.cacheWindowScope, f2);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        this.cacheWindowScope.setLayoutInfo(lazyListLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyListPrefetchScope);
        onVisibleItemsUpdated(this.cacheWindowScope);
    }
}
