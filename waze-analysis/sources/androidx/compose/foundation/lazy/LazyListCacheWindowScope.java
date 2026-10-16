package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListCacheWindowScope implements CacheWindowScope {
    public static final int $stable = 8;
    public LazyListLayoutInfo layoutInfo;
    public LazyListPrefetchScope prefetchScope;

    static final ab schedulePrefetch$lambda$0(p pVar, LazyListPrefetchResultScope lazyListPrefetchResultScope) {
        pVar.invoke(Integer.valueOf(lazyListPrefetchResultScope.getIndex()), Integer.valueOf(lazyListPrefetchResultScope.getMainAxisSize()));
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Density getDensity() {
        LazyListLayoutInfo layoutInfo = getLayoutInfo();
        LazyListMeasureResult lazyListMeasureResult = layoutInfo instanceof LazyListMeasureResult ? (LazyListMeasureResult) layoutInfo : null;
        if (lazyListMeasureResult != null) {
            return lazyListMeasureResult.getDensity();
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getFirstVisibleLineIndex() {
        return ((LazyListItemInfo) i.P(getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public boolean getHasVisibleItems() {
        return !getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastLineIndex() {
        if (getTotalItemsCount() == 0) {
            return -1;
        }
        return getTotalItemsCount() - 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastVisibleLineIndex() {
        return ((LazyListItemInfo) i.T(getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        LazyListLayoutInfo lazyListLayoutInfo = this.layoutInfo;
        if (lazyListLayoutInfo != null) {
            return lazyListLayoutInfo;
        }
        x.j("layoutInfo");
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceEnd() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) i.T(getLayoutInfo().getVisibleItemsInfo());
        return Math.abs(((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + getLayoutInfo().getMainAxisItemSpacing()) - getLayoutInfo().getViewportEndOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceStart() {
        int offset = ((LazyListItemInfo) i.P(getLayoutInfo().getVisibleItemsInfo())).getOffset() + getLayoutInfo().getBeforeContentPadding();
        if (offset > 0) {
            offset = 0;
        }
        return Math.abs(offset);
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisViewportSize() {
        return LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo());
    }

    public final LazyListPrefetchScope getPrefetchScope() {
        LazyListPrefetchScope lazyListPrefetchScope = this.prefetchScope;
        if (lazyListPrefetchScope != null) {
            return lazyListPrefetchScope;
        }
        x.j("prefetchScope");
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getTotalItemsCount() {
        return getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemLine(int i2) {
        return getLayoutInfo().getVisibleItemsInfo().get(i2).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemSize(int i2) {
        return getLayoutInfo().getVisibleItemsInfo().get(i2).getSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleLineCount() {
        return getLayoutInfo().getVisibleItemsInfo().size();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Object getVisibleLineKey(int i2) {
        return getLayoutInfo().getVisibleItemsInfo().get(i2).getKey();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int i2, final p<? super Integer, ? super Integer, ab> pVar) {
        List<LazyLayoutPrefetchState.PrefetchHandle> listSingletonList = Collections.singletonList(getPrefetchScope().schedulePrefetch(i2, new l() { // from class: androidx.compose.foundation.lazy.LazyListCacheWindowScope$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LazyListCacheWindowScope.schedulePrefetch$lambda$0(pVar, (LazyListPrefetchResultScope) obj);
            }
        }));
        x.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public final void setLayoutInfo(LazyListLayoutInfo lazyListLayoutInfo) {
        this.layoutInfo = lazyListLayoutInfo;
    }

    public final void setPrefetchScope(LazyListPrefetchScope lazyListPrefetchScope) {
        this.prefetchScope = lazyListPrefetchScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastIndexInLine(int i2) {
        return i2;
    }
}
