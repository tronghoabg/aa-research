package androidx.compose.foundation.lazy.grid;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridPrefetchStrategyKt {
    private static final int UnsetItemCount = -1;

    public static final LazyGridPrefetchStrategy LazyGridPrefetchStrategy(int i2) {
        return new DefaultLazyGridPrefetchStrategy(i2);
    }

    public static /* synthetic */ LazyGridPrefetchStrategy LazyGridPrefetchStrategy$default(int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 2;
        }
        return LazyGridPrefetchStrategy(i2);
    }
}
