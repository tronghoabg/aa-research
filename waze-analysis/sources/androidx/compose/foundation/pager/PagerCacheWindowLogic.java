package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import h.ab;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerCacheWindowLogic extends CacheWindowLogic {
    public static final int $stable = 8;
    private final LazyLayoutCacheWindow cacheWindow;
    private final PagerCacheWindowScope cacheWindowScope;
    private final a<Integer> itemCount;
    private final LazyLayoutPrefetchState state;

    public PagerCacheWindowLogic(LazyLayoutCacheWindow lazyLayoutCacheWindow, LazyLayoutPrefetchState lazyLayoutPrefetchState, a<Integer> aVar) {
        super(lazyLayoutCacheWindow, false);
        this.cacheWindow = lazyLayoutCacheWindow;
        this.state = lazyLayoutPrefetchState;
        this.itemCount = aVar;
        this.cacheWindowScope = new PagerCacheWindowScope(aVar);
    }

    private final void applyWindowScope(PagerMeasureResult pagerMeasureResult, l<? super CacheWindowScope, ab> lVar) {
        this.cacheWindowScope.setLayoutInfo(pagerMeasureResult);
        this.cacheWindowScope.setState(this.state);
        lVar.invoke(this.cacheWindowScope);
    }

    public final LazyLayoutCacheWindow getCacheWindow() {
        return this.cacheWindow;
    }

    public final a<Integer> getItemCount() {
        return this.itemCount;
    }

    public final LazyLayoutPrefetchState getState() {
        return this.state;
    }

    public final void onScroll(float f2, PagerMeasureResult pagerMeasureResult) {
        this.cacheWindowScope.setLayoutInfo(pagerMeasureResult);
        this.cacheWindowScope.setState(this.state);
        onScroll(this.cacheWindowScope, -f2);
    }

    public final void onVisibleItemsChanged(PagerMeasureResult pagerMeasureResult) {
        this.cacheWindowScope.setLayoutInfo(pagerMeasureResult);
        this.cacheWindowScope.setState(this.state);
        onVisibleItemsUpdated(this.cacheWindowScope);
    }
}
