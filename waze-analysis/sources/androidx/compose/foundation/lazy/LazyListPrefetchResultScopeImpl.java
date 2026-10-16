package androidx.compose.foundation.lazy;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListPrefetchResultScopeImpl implements LazyListPrefetchResultScope {
    public static final int $stable = 0;
    private final int index;
    private final int mainAxisSize;

    public LazyListPrefetchResultScopeImpl(int i2, int i3) {
        this.index = i2;
        this.mainAxisSize = i3;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public int getMainAxisSize() {
        return this.mainAxisSize;
    }
}
