package androidx.compose.foundation.lazy.layout;

import h.a.ac;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;
    private int idealNestedPrefetchCount;
    private int lastNumberOfNestedPrefetchItems;
    private l<? super NestedPrefetchScope, ab> onNestedPrefetch;
    private PrefetchHandleProvider prefetchHandleProvider;
    private final PrefetchMetrics prefetchMetrics;
    private PrefetchScheduler prefetchScheduler;
    private int realizedNestedPrefetchCount;

    /* compiled from: WazeSource */
    final class NestedPrefetchScopeImpl implements NestedPrefetchScope {
        private final List<PrefetchRequest> _requests = new ArrayList();
        private final int nestedPrefetchItemCount;

        public NestedPrefetchScopeImpl(int i2) {
            this.nestedPrefetchItemCount = i2;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public int getNestedPrefetchItemCount() {
            return this.nestedPrefetchItemCount;
        }

        public final List<PrefetchRequest> getRequests() {
            return this._requests;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public void schedulePrecomposition(int i2) {
            PrefetchHandleProvider prefetchHandleProvider$foundation = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation();
            if (prefetchHandleProvider$foundation == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation.createNestedPrefetchRequest(i2, LazyLayoutPrefetchState.this.prefetchMetrics));
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw, reason: not valid java name */
        public void mo2960schedulePrecompositionAndPremeasure0kLqBqw(int i2, long j2) {
            PrefetchHandleProvider prefetchHandleProvider$foundation = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation();
            if (prefetchHandleProvider$foundation == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation.m2974createNestedPrefetchRequestVKLhPVY(i2, j2, LazyLayoutPrefetchState.this.prefetchMetrics));
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public /* synthetic */ void schedulePrefetch(int i2) {
            schedulePrecomposition(i2);
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
        public /* synthetic */ void mo2961schedulePrefetch0kLqBqw(int i2, long j2) {
            mo2960schedulePrecompositionAndPremeasure0kLqBqw(i2, j2);
        }
    }

    /* compiled from: WazeSource */
    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    /* compiled from: WazeSource */
    public interface PrefetchResultScope {
        int getIndex();

        int getPlaceablesCount();

        /* renamed from: getSize-YEO4UFw, reason: not valid java name */
        long mo2962getSizeYEO4UFw(int i2);
    }

    public LazyLayoutPrefetchState() {
        this.prefetchMetrics = new PrefetchMetrics();
        this.realizedNestedPrefetchCount = -1;
        this.idealNestedPrefetchCount = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY$default, reason: not valid java name */
    public static /* synthetic */ PrefetchHandle m2956schedulePrecompositionAndPremeasureVKLhPVY$default(LazyLayoutPrefetchState lazyLayoutPrefetchState, int i2, long j2, l lVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        return lazyLayoutPrefetchState.m2958schedulePrecompositionAndPremeasureVKLhPVY(i2, j2, lVar);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation$default, reason: not valid java name */
    public static /* synthetic */ PrefetchHandle m2957schedulePrecompositionAndPremeasure_EkL_Y$foundation$default(LazyLayoutPrefetchState lazyLayoutPrefetchState, int i2, long j2, boolean z, l lVar, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        return lazyLayoutPrefetchState.m2959schedulePrecompositionAndPremeasure_EkL_Y$foundation(i2, j2, z, lVar);
    }

    public final List<PrefetchRequest> collectNestedPrefetchRequests$foundation() {
        l<? super NestedPrefetchScope, ab> lVar = this.onNestedPrefetch;
        if (lVar == null) {
            return ac.f47967a;
        }
        NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new NestedPrefetchScopeImpl(this.realizedNestedPrefetchCount);
        lVar.invoke(nestedPrefetchScopeImpl);
        List<PrefetchRequest> requests = nestedPrefetchScopeImpl.getRequests();
        this.lastNumberOfNestedPrefetchItems = requests.size();
        return requests;
    }

    public final int getIdealNestedPrefetchCount$foundation() {
        return this.idealNestedPrefetchCount;
    }

    public final int getLastNumberOfNestedPrefetchItems$foundation() {
        return this.lastNumberOfNestedPrefetchItems;
    }

    public final PrefetchHandleProvider getPrefetchHandleProvider$foundation() {
        return this.prefetchHandleProvider;
    }

    public final PrefetchScheduler getPrefetchScheduler$foundation() {
        return this.prefetchScheduler;
    }

    public final int getRealizedNestedPrefetchCount$foundation() {
        return this.realizedNestedPrefetchCount;
    }

    public final PrefetchHandle schedulePrecomposition(int i2) {
        return schedulePrecomposition$foundation(i2, true);
    }

    public final PrefetchHandle schedulePrecomposition$foundation(int i2, boolean z) {
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return prefetchHandleProvider != null ? prefetchHandleProvider.schedulePrecomposition(i2, z, this.prefetchMetrics) : DummyHandle.INSTANCE;
    }

    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY, reason: not valid java name */
    public final PrefetchHandle m2958schedulePrecompositionAndPremeasureVKLhPVY(int i2, long j2, l<? super PrefetchResultScope, ab> lVar) {
        return m2959schedulePrecompositionAndPremeasure_EkL_Y$foundation(i2, j2, true, lVar);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation, reason: not valid java name */
    public final PrefetchHandle m2959schedulePrecompositionAndPremeasure_EkL_Y$foundation(int i2, long j2, boolean z, l<? super PrefetchResultScope, ab> lVar) {
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return prefetchHandleProvider != null ? prefetchHandleProvider.m2975schedulePremeasurem8Kt_7k(i2, j2, this.prefetchMetrics, z, lVar) : DummyHandle.INSTANCE;
    }

    public final void setIdealNestedPrefetchCount$foundation(int i2) {
        this.idealNestedPrefetchCount = i2;
    }

    public final void setLastNumberOfNestedPrefetchItems$foundation(int i2) {
        this.lastNumberOfNestedPrefetchItems = i2;
    }

    public final void setPrefetchHandleProvider$foundation(PrefetchHandleProvider prefetchHandleProvider) {
        this.prefetchHandleProvider = prefetchHandleProvider;
    }

    public final void setPrefetchScheduler$foundation(PrefetchScheduler prefetchScheduler) {
        this.prefetchScheduler = prefetchScheduler;
    }

    public final void setRealizedNestedPrefetchCount$foundation(int i2) {
        this.realizedNestedPrefetchCount = i2;
    }

    private static /* synthetic */ void getOnNestedPrefetch$annotations() {
    }

    public static /* synthetic */ void getPrefetchHandleProvider$foundation$annotations() {
    }

    public static /* synthetic */ void getPrefetchScheduler$foundation$annotations() {
    }

    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, l<? super NestedPrefetchScope, ab> lVar) {
        this();
        this.prefetchScheduler = prefetchScheduler;
        this.onNestedPrefetch = lVar;
    }

    public /* synthetic */ LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, l lVar, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : prefetchScheduler, (i2 & 2) != 0 ? null : lVar);
    }

    public LazyLayoutPrefetchState(l<? super NestedPrefetchScope, ab> lVar) {
        this();
        this.onNestedPrefetch = lVar;
    }

    public /* synthetic */ LazyLayoutPrefetchState(l lVar, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : lVar);
    }
}
