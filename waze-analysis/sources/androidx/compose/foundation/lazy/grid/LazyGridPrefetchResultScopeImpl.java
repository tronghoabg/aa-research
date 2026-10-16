package androidx.compose.foundation.lazy.grid;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridPrefetchResultScopeImpl implements LazyGridPrefetchResultScope {
    public static final int $stable = 8;
    private final int lineIndex;
    private final List<Integer> mainAxisSizes;

    public LazyGridPrefetchResultScopeImpl(int i2, List<Integer> list) {
        this.lineIndex = i2;
        this.mainAxisSizes = list;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getLineItemCount() {
        return this.mainAxisSizes.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchResultScope
    public int getMainAxisSize(int i2) {
        return this.mainAxisSizes.get(i2).intValue();
    }
}
