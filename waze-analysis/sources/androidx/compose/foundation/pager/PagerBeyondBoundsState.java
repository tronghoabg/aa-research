package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import h.a.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final int beyondViewportPageCount;
    private final PagerState state;

    public PagerBeyondBoundsState(PagerState pagerState, int i2) {
        this.state = pagerState;
        this.beyondViewportPageCount = i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.state.getFirstVisiblePage$foundation() - this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((PageInfo) i.T(this.state.getLayoutInfo().getVisiblePagesInfo())).getIndex() + this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        int i2;
        if (this.state.getLayoutInfo().getVisiblePagesInfo().size() == 0) {
            return 0;
        }
        int mainAxisViewportSize = PagerLayoutInfoKt.getMainAxisViewportSize(this.state.getLayoutInfo());
        int pageSize = this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing();
        if (pageSize != 0 && (i2 = mainAxisViewportSize / pageSize) > 0) {
            return i2;
        }
        return 1;
    }
}
