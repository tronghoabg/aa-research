package androidx.compose.foundation.lazy.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PriorityPrefetchScheduler extends PrefetchScheduler {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void scheduleHighPriorityPrefetch(PrefetchRequest prefetchRequest);

    void scheduleLowPriorityPrefetch(PrefetchRequest prefetchRequest);

    void schedulePrefetch(PrefetchRequest prefetchRequest);
}
