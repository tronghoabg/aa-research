package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import h.a.i;
import h.ab;
import h.b.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LazyGridCacheWindowScope implements CacheWindowScope {
    public LazyGridLayoutInfo layoutInfo;
    public LazyGridPrefetchScope prefetchScope;

    static final ab schedulePrefetch$lambda$0(p pVar, int i2, LazyGridPrefetchResultScope lazyGridPrefetchResultScope) {
        int lineItemCount = lazyGridPrefetchResultScope.getLineItemCount();
        int iG = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < lineItemCount; i3++) {
            iG = a.g(lazyGridPrefetchResultScope.getMainAxisSize(i3), new int[0]);
        }
        if (iG != Integer.MIN_VALUE) {
            pVar.invoke(Integer.valueOf(i2), Integer.valueOf(iG));
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Density getDensity() {
        LazyGridLayoutInfo layoutInfo = getLayoutInfo();
        LazyGridMeasureResult lazyGridMeasureResult = layoutInfo instanceof LazyGridMeasureResult ? (LazyGridMeasureResult) layoutInfo : null;
        if (lazyGridMeasureResult != null) {
            return lazyGridMeasureResult.getDensity();
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getFirstVisibleLineIndex() {
        return getLineIndex((LazyGridItemInfo) i.P(getLayoutInfo().getVisibleItemsInfo()));
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public boolean getHasVisibleItems() {
        return !getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastIndexInLine(int i2) {
        LazyGridLayoutInfo layoutInfo = getLayoutInfo();
        LazyGridMeasureResult lazyGridMeasureResult = layoutInfo instanceof LazyGridMeasureResult ? (LazyGridMeasureResult) layoutInfo : null;
        if (lazyGridMeasureResult != null) {
            if (!lazyGridMeasureResult.getPrefetchInfoRetriever().invoke(Integer.valueOf(i2)).isEmpty()) {
                return (((Number) ((k) i.P(r1)).c()).intValue() + r1.size()) - 1;
            }
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastLineIndex() {
        LazyGridLayoutInfo layoutInfo = getLayoutInfo();
        LazyGridMeasureResult lazyGridMeasureResult = layoutInfo instanceof LazyGridMeasureResult ? (LazyGridMeasureResult) layoutInfo : null;
        if (lazyGridMeasureResult == null || getTotalItemsCount() == 0) {
            return -1;
        }
        return lazyGridMeasureResult.getLineIndexProvider().invoke(Integer.valueOf(getTotalItemsCount() - 1)).intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getLastVisibleLineIndex() {
        return getLineIndex((LazyGridItemInfo) i.T(getLayoutInfo().getVisibleItemsInfo()));
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        LazyGridLayoutInfo lazyGridLayoutInfo = this.layoutInfo;
        if (lazyGridLayoutInfo != null) {
            return lazyGridLayoutInfo;
        }
        x.j("layoutInfo");
        return null;
    }

    public final int getLineIndex(LazyGridItemInfo lazyGridItemInfo) {
        return LazyGridItemInfoKt.lineIndex(lazyGridItemInfo, getLayoutInfo().getOrientation());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceEnd() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) i.T(getLayoutInfo().getVisibleItemsInfo());
        return Math.abs(((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()) + LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation())) + getLayoutInfo().getMainAxisItemSpacing()) - getLayoutInfo().getViewportEndOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisExtraSpaceStart() {
        int iOffsetOnMainAxis = LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis((LazyGridItemInfo) i.P(getLayoutInfo().getVisibleItemsInfo()), getLayoutInfo().getOrientation()) + getLayoutInfo().getBeforeContentPadding();
        if (iOffsetOnMainAxis > 0) {
            iOffsetOnMainAxis = 0;
        }
        return Math.abs(iOffsetOnMainAxis);
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getMainAxisViewportSize() {
        return LazyGridLayoutInfoKt.getSingleAxisViewportSize(getLayoutInfo());
    }

    public final LazyGridPrefetchScope getPrefetchScope() {
        LazyGridPrefetchScope lazyGridPrefetchScope = this.prefetchScope;
        if (lazyGridPrefetchScope != null) {
            return lazyGridPrefetchScope;
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
        return getFirstVisibleLineIndex() + i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleItemSize(int i2) {
        int firstVisibleLineIndex = i2 + getFirstVisibleLineIndex();
        List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
        int size = visibleItemsInfo.size();
        for (int i3 = 0; i3 < size; i3++) {
            LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i3);
            if (getLineIndex(lazyGridItemInfo) == firstVisibleLineIndex) {
                arrayList.add(lazyGridItemInfo);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size2 = arrayList2.size();
        int iMax = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            iMax = Math.max(LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis((LazyGridItemInfo) arrayList2.get(i4), getLayoutInfo().getOrientation()), iMax);
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public int getVisibleLineCount() {
        return (getLastVisibleLineIndex() - getFirstVisibleLineIndex()) + 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public Object getVisibleLineKey(int i2) {
        Object key;
        int firstVisibleLineIndex = i2 + getFirstVisibleLineIndex();
        List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
        int size = visibleItemsInfo.size();
        for (int i3 = 0; i3 < size; i3++) {
            LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i3);
            if (getLineIndex(lazyGridItemInfo) == firstVisibleLineIndex) {
                arrayList.add(lazyGridItemInfo);
            }
        }
        LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) i.R(arrayList);
        return (lazyGridItemInfo2 == null || (key = lazyGridItemInfo2.getKey()) == null) ? CachedItem.NoKey : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.CacheWindowScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(final int i2, final p<? super Integer, ? super Integer, ab> pVar) {
        return getPrefetchScope().scheduleLinePrefetch(i2, new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridCacheWindowScope$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LazyGridCacheWindowScope.schedulePrefetch$lambda$0(pVar, i2, (LazyGridPrefetchResultScope) obj);
            }
        });
    }

    public final void setLayoutInfo(LazyGridLayoutInfo lazyGridLayoutInfo) {
        this.layoutInfo = lazyGridLayoutInfo;
    }

    public final void setPrefetchScope(LazyGridPrefetchScope lazyGridPrefetchScope) {
        this.prefetchScope = lazyGridPrefetchScope;
    }
}
