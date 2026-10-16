package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import h.a.c;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    public LazyGridScrollPosition(int i2, int i3) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i3);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i2, 90, 200);
    }

    private final void setIndex(int i2) {
        this.index$delegate.setIntValue(i2);
    }

    private final void setScrollOffset(int i2) {
        this.scrollOffset$delegate.setIntValue(i2);
    }

    private final void update(int i2, int i3) {
        if (i2 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
        }
        setIndex(i2);
        this.nearestRangeState.update(i2);
        setScrollOffset(i3);
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int i2, int i3) {
        update(i2, i3);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyGridMeasureResult lazyGridMeasureResult) {
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        LazyGridMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        Object key = null;
        if (firstVisibleLine != null && (items2 = firstVisibleLine.getItems()) != null && (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) c.N(items2)) != null) {
            key = lazyGridMeasuredItem2.getKey();
        }
        this.lastKnownFirstItemKey = key;
        if (this.hadFirstNotEmptyLayout || lazyGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = lazyGridMeasureResult.getFirstVisibleLineScrollOffset();
            if (firstVisibleLineScrollOffset < 0.0f) {
                InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')');
            }
            LazyGridMeasuredLine firstVisibleLine2 = lazyGridMeasureResult.getFirstVisibleLine();
            int index = 0;
            if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) c.N(items)) != null) {
                index = lazyGridMeasuredItem.getIndex();
            }
            update(index, firstVisibleLineScrollOffset);
        }
    }

    public final void updateScrollOffset(int i2) {
        if (i2 < 0.0f) {
            InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(i2);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider lazyGridItemProvider, int i2) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, i2);
        if (i2 != iFindIndexByKey) {
            setIndex(iFindIndexByKey);
            this.nearestRangeState.update(i2);
        }
        return iFindIndexByKey;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridScrollPosition() {
        int i2 = 0;
        this(i2, i2, 3, null);
    }

    public /* synthetic */ LazyGridScrollPosition(int i2, int i3, int i4, o oVar) {
        this(1 == (i4 & 1) ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
