package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridCacheWindowPrefetchStrategy extends CacheWindowLogic implements LazyGridPrefetchStrategy {
    public static final int $stable = 8;
    private final LazyGridCacheWindowScope cacheWindowScope;

    public LazyGridCacheWindowPrefetchStrategy(LazyLayoutCacheWindow lazyLayoutCacheWindow) {
        super(lazyLayoutCacheWindow, false, 2, null);
        this.cacheWindowScope = new LazyGridCacheWindowScope();
    }

    private final void applyWindowScope(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo, l<? super CacheWindowScope, ab> lVar) {
        this.cacheWindowScope.setLayoutInfo(lazyGridLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyGridPrefetchScope);
        lVar.invoke(this.cacheWindowScope);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public /* synthetic */ PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int nestedPrefetchItemCount = nestedPrefetchScope.getNestedPrefetchItemCount();
        for (int i3 = 0; i3 < nestedPrefetchItemCount; i3++) {
            nestedPrefetchScope.schedulePrecomposition(i2 + i3);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope, float f2, LazyGridLayoutInfo lazyGridLayoutInfo) {
        this.cacheWindowScope.setLayoutInfo(lazyGridLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyGridPrefetchScope);
        onScroll(this.cacheWindowScope, f2);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo) {
        this.cacheWindowScope.setLayoutInfo(lazyGridLayoutInfo);
        this.cacheWindowScope.setPrefetchScope(lazyGridPrefetchScope);
        onVisibleItemsUpdated(this.cacheWindowScope);
    }
}
