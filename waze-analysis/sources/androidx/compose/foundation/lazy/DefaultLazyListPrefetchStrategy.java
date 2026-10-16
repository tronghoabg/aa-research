package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.LazyListPrefetchScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import h.a.i;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private int indexToPrefetch;
    private final int initialNestedPrefetchItemCount;
    private float previousPassDelta;
    private int previousPassItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyListPrefetchStrategy(int i2) {
        this.initialNestedPrefetchItemCount = i2;
        this.indexToPrefetch = -1;
        this.previousPassItemCount = -1;
    }

    private final int calculateIndexToPrefetch(LazyListLayoutInfo lazyListLayoutInfo, boolean z) {
        return z ? ((LazyListItemInfo) i.T(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) i.P(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
    }

    private final void evaluatePrefetchForCancellation(LazyListLayoutInfo lazyListLayoutInfo, int i2, boolean z) {
        if (i2 == -1 || lazyListLayoutInfo.getVisibleItemsInfo().isEmpty() || i2 == calculateIndexToPrefetch(lazyListLayoutInfo, z)) {
            return;
        }
        resetPrefetchState();
    }

    private final void resetPrefetchState() {
        this.indexToPrefetch = -1;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
        if (prefetchHandle != null) {
            prefetchHandle.cancel();
        }
        this.currentPrefetchHandle = null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public /* synthetic */ PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i2) {
        int nestedPrefetchItemCount = nestedPrefetchScope.getNestedPrefetchItemCount() == -1 ? this.initialNestedPrefetchItemCount : nestedPrefetchScope.getNestedPrefetchItemCount();
        for (int i3 = 0; i3 < nestedPrefetchItemCount; i3++) {
            nestedPrefetchScope.schedulePrecomposition(i2 + i3);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f2, LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        if (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            boolean z = f2 < 0.0f;
            int iCalculateIndexToPrefetch = calculateIndexToPrefetch(lazyListLayoutInfo, z);
            if (iCalculateIndexToPrefetch >= 0 && iCalculateIndexToPrefetch < lazyListLayoutInfo.getTotalItemsCount()) {
                if (iCalculateIndexToPrefetch != this.indexToPrefetch) {
                    if (this.wasScrollingForward != z) {
                        resetPrefetchState();
                    }
                    this.wasScrollingForward = z;
                    this.indexToPrefetch = iCalculateIndexToPrefetch;
                    this.currentPrefetchHandle = LazyListPrefetchScope.CC.schedulePrefetch$default(lazyListPrefetchScope, iCalculateIndexToPrefetch, null, 2, null);
                }
                if (z) {
                    LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) i.T(lazyListLayoutInfo.getVisibleItemsInfo());
                    if (((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + lazyListLayoutInfo.getMainAxisItemSpacing()) - lazyListLayoutInfo.getViewportEndOffset() < (-f2) && (prefetchHandle2 = this.currentPrefetchHandle) != null) {
                        prefetchHandle2.markAsUrgent();
                    }
                } else if (lazyListLayoutInfo.getViewportStartOffset() - ((LazyListItemInfo) i.P(lazyListLayoutInfo.getVisibleItemsInfo())).getOffset() < f2 && (prefetchHandle = this.currentPrefetchHandle) != null) {
                    prefetchHandle.markAsUrgent();
                }
            }
        }
        this.previousPassDelta = f2;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        evaluatePrefetchForCancellation(lazyListLayoutInfo, this.indexToPrefetch, this.wasScrollingForward);
        int totalItemsCount = lazyListLayoutInfo.getTotalItemsCount();
        int i2 = this.previousPassItemCount;
        if (i2 != -1 && this.previousPassDelta != 0.0f && i2 != totalItemsCount && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            int iCalculateIndexToPrefetch = calculateIndexToPrefetch(lazyListLayoutInfo, this.previousPassDelta < 0.0f);
            if (iCalculateIndexToPrefetch >= 0 && iCalculateIndexToPrefetch < totalItemsCount) {
                this.indexToPrefetch = iCalculateIndexToPrefetch;
                this.currentPrefetchHandle = LazyListPrefetchScope.CC.schedulePrefetch$default(lazyListPrefetchScope, iCalculateIndexToPrefetch, null, 2, null);
            }
        }
        this.previousPassItemCount = totalItemsCount;
    }

    public DefaultLazyListPrefetchStrategy() {
        this(0, 1, null);
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 2 : i2);
    }
}
