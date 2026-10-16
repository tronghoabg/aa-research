package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PagerCacheWindowScope implements CacheWindowScope {
    private final a<Integer> itemCount;
    public PagerMeasureResult layoutInfo;
    public LazyLayoutPrefetchState state;

    public PagerCacheWindowScope(a<Integer> aVar) {
        this.itemCount = aVar;
    }

    static final ab schedulePrefetch$lambda$0(p pVar, PagerCacheWindowScope pagerCacheWindowScope, LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        pVar.invoke(Integer.valueOf(prefetchResultScope.getIndex()), Integer.valueOf(pagerCacheWindowScope.getLayoutInfo().getPageSize()));
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Density getDensity() {
        return getLayoutInfo().getDensity();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getFirstVisibleLineIndex() {
        if (getLayoutInfo().getVisiblePagesInfo().isEmpty()) {
            return -1;
        }
        return (int) n.k(((MeasuredPage) i.P(getLayoutInfo().getVisiblePagesInfo())).getIndex() - getLayoutInfo().getBeyondViewportPageCount(), 0L);
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public boolean getHasVisibleItems() {
        return !getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    public final a<Integer> getItemCount() {
        return this.itemCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastLineIndex() {
        if (getLayoutInfo().getVisiblePagesInfo().isEmpty()) {
            return -1;
        }
        return getTotalItemsCount() - 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastVisibleLineIndex() {
        if (getLayoutInfo().getVisiblePagesInfo().isEmpty()) {
            return -1;
        }
        return (int) n.l(((MeasuredPage) i.T(getLayoutInfo().getVisiblePagesInfo())).getIndex() + getLayoutInfo().getBeyondViewportPageCount(), getTotalItemsCount() - 1);
    }

    public final PagerMeasureResult getLayoutInfo() {
        PagerMeasureResult pagerMeasureResult = this.layoutInfo;
        if (pagerMeasureResult != null) {
            return pagerMeasureResult;
        }
        x.j("layoutInfo");
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceEnd() {
        if (getLayoutInfo().getVisiblePagesInfo().isEmpty()) {
            return 0;
        }
        return Math.abs(((((MeasuredPage) i.T(getLayoutInfo().getVisiblePagesInfo())).getOffset() + getLayoutInfo().getPageSize()) + getLayoutInfo().getPageSpacing()) - getLayoutInfo().getViewportEndOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceStart() {
        if (getLayoutInfo().getVisiblePagesInfo().isEmpty()) {
            return 0;
        }
        return Math.abs(n.i(((MeasuredPage) i.P(getLayoutInfo().getVisiblePagesInfo())).getOffset() + getLayoutInfo().getBeforeContentPadding(), 0));
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisViewportSize() {
        return PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo());
    }

    public final LazyLayoutPrefetchState getState() {
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.state;
        if (lazyLayoutPrefetchState != null) {
            return lazyLayoutPrefetchState;
        }
        x.j("state");
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getTotalItemsCount() {
        return this.itemCount.invoke().intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemLine(int i2) {
        int size = getLayoutInfo().getExtraPagesBefore().size();
        int size2 = getLayoutInfo().getVisiblePagesInfo().size();
        if (i2 < size) {
            return getLayoutInfo().getExtraPagesBefore().get(i2).getIndex();
        }
        if (i2 >= size && i2 < size + size2) {
            return getLayoutInfo().getVisiblePagesInfo().get(i2 - size).getIndex();
        }
        if (i2 >= size + size2) {
            return getLayoutInfo().getExtraPagesAfter().get((i2 - size) - size2).getIndex();
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemSize(int i2) {
        return getLayoutInfo().getPageSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleLineCount() {
        return getLayoutInfo().getExtraPagesBefore().size() + getLayoutInfo().getVisiblePagesInfo().size() + getLayoutInfo().getExtraPagesAfter().size();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Object getVisibleLineKey(int i2) {
        int size = getLayoutInfo().getExtraPagesBefore().size();
        int size2 = getLayoutInfo().getVisiblePagesInfo().size();
        return i2 < size ? getLayoutInfo().getExtraPagesBefore().get(i2).getKey() : (i2 < size || i2 >= size + size2) ? i2 >= size + size2 ? getLayoutInfo().getExtraPagesAfter().get((i2 - size) - size2).getKey() : CachedItem.NoKey : getLayoutInfo().getVisiblePagesInfo().get(i2 - size).getKey();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int i2, final p<? super Integer, ? super Integer, ab> pVar) {
        return i.d(getState().m2959schedulePrecompositionAndPremeasure_EkL_Y$foundation(i2, getLayoutInfo().m3040getChildConstraintsmsEJaDk(), true, new l() { // from class: androidx.compose.foundation.pager.PagerCacheWindowScope$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PagerCacheWindowScope.schedulePrefetch$lambda$0(pVar, this, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
            }
        }));
    }

    public final void setLayoutInfo(PagerMeasureResult pagerMeasureResult) {
        this.layoutInfo = pagerMeasureResult;
    }

    public final void setState(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.state = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastIndexInLine(int i2) {
        return i2;
    }
}
