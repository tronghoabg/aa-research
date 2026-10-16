package androidx.compose.foundation.lazy;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListPrefetchStrategyKt {
    private static final int UnsetItemCount = -1;

    public static final LazyListPrefetchStrategy LazyListPrefetchStrategy(int i2) {
        return new DefaultLazyListPrefetchStrategy(i2);
    }

    public static /* synthetic */ LazyListPrefetchStrategy LazyListPrefetchStrategy$default(int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 2;
        }
        return LazyListPrefetchStrategy(i2);
    }
}
