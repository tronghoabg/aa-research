package androidx.compose.foundation.lazy.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface NestedPrefetchScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.layout.NestedPrefetchScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getNestedPrefetchItemCount(NestedPrefetchScope nestedPrefetchScope) {
            return -1;
        }
    }

    int getNestedPrefetchItemCount();

    void schedulePrecomposition(int i2);

    /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw */
    void mo2960schedulePrecompositionAndPremeasure0kLqBqw(int i2, long j2);

    void schedulePrefetch(int i2);

    /* renamed from: schedulePrefetch-0kLqBqw */
    void mo2961schedulePrefetch0kLqBqw(int i2, long j2);
}
