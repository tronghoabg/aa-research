package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.o.a;
import h.o.e;
import h.o.f;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PrefetchHandleProvider {
    public static final int $stable = 8;
    private final PrefetchScheduler executor;
    private boolean isStateActive = true;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private boolean shouldPauseBetweenPrecompositionAndPremeasure;
    private final SubcomposeLayoutState subcomposeLayoutState;

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = prefetchScheduler;
    }

    public final PrefetchRequest createNestedPrefetchRequest(int i2, PrefetchMetrics prefetchMetrics) {
        PrefetchScheduler prefetchScheduler = this.executor;
        return new HandleAndRequestImpl(i2, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, null);
    }

    /* renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final PrefetchRequest m2974createNestedPrefetchRequestVKLhPVY(int i2, long j2, PrefetchMetrics prefetchMetrics) {
        PrefetchScheduler prefetchScheduler = this.executor;
        return new HandleAndRequestImpl(this, i2, j2, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, null, null);
    }

    public final void executeWithPriority(PrefetchScheduler prefetchScheduler, PrefetchRequest prefetchRequest, boolean z) {
        if (!(prefetchScheduler instanceof PriorityPrefetchScheduler)) {
            prefetchScheduler.schedulePrefetch(prefetchRequest);
        } else if (z) {
            ((PriorityPrefetchScheduler) prefetchScheduler).scheduleHighPriorityPrefetch(prefetchRequest);
        } else {
            ((PriorityPrefetchScheduler) prefetchScheduler).scheduleLowPriorityPrefetch(prefetchRequest);
        }
    }

    public final boolean getShouldPauseBetweenPrecompositionAndPremeasure$foundation() {
        return this.shouldPauseBetweenPrecompositionAndPremeasure;
    }

    public final void onDisposed() {
        this.isStateActive = false;
    }

    public final LazyLayoutPrefetchState.PrefetchHandle schedulePrecomposition(int i2, boolean z, PrefetchMetrics prefetchMetrics) {
        PrefetchScheduler prefetchScheduler = this.executor;
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(i2, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, null);
        executeWithPriority(this.executor, handleAndRequestImpl, z);
        AndroidTrace_androidKt.traceValue("compose:lazy:schedule_prefetch:index", i2);
        return handleAndRequestImpl;
    }

    /* renamed from: schedulePremeasure-m8Kt_7k, reason: not valid java name */
    public final LazyLayoutPrefetchState.PrefetchHandle m2975schedulePremeasurem8Kt_7k(int i2, long j2, PrefetchMetrics prefetchMetrics, boolean z, l<? super LazyLayoutPrefetchState.PrefetchResultScope, ab> lVar) {
        PrefetchScheduler prefetchScheduler = this.executor;
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, i2, j2, prefetchMetrics, prefetchScheduler instanceof PriorityPrefetchScheduler ? (PriorityPrefetchScheduler) prefetchScheduler : null, lVar, null);
        executeWithPriority(this.executor, handleAndRequestImpl, z);
        AndroidTrace_androidKt.traceValue("compose:lazy:schedule_prefetch:index", i2);
        return handleAndRequestImpl;
    }

    public final void setShouldPauseBetweenPrecompositionAndPremeasure$foundation(boolean z) {
        this.shouldPauseBetweenPrecompositionAndPremeasure = z;
    }

    public static /* synthetic */ void getShouldPauseBetweenPrecompositionAndPremeasure$foundation$annotations() {
    }

    /* compiled from: WazeSource */
    final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest, LazyLayoutPrefetchState.PrefetchResultScope {
        private long availableTimeNanos;
        private long elapsedTimeNanos;
        private boolean hasResolvedNestedPrefetches;
        private final int index;
        private boolean isApplied;
        private boolean isCanceled;
        private boolean isMeasured;
        private boolean isUrgent;
        private Object keyUsedForComposition;
        private NestedPrefetchController nestedPrefetchController;
        private final l<LazyLayoutPrefetchState.PrefetchResultScope, ab> onItemPremeasured;
        private boolean pauseRequested;
        private SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;
        private final PrefetchMetrics prefetchMetrics;
        private Constraints premeasureConstraints;
        private final PriorityPrefetchScheduler priorityPrefetchScheduler;
        private long startTime;

        /* compiled from: WazeSource */
        final class NestedPrefetchController {
            private boolean executedNestedPrefetch;
            private int requestIndex;
            private final List<PrefetchRequest>[] requestsByState;
            private int stateIndex;
            private final List<LazyLayoutPrefetchState> states;

            public NestedPrefetchController(List<LazyLayoutPrefetchState> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    InlineClassHelperKt.throwIllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final int collectIdealNestedPrefetchCount() {
                List<LazyLayoutPrefetchState> list = this.states;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    iMin = Math.min(iMin, list.get(i2).getIdealNestedPrefetchCount$foundation());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            public final int collectNestedPrefetchedItemsCount() {
                List<LazyLayoutPrefetchState> list = this.states;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < size; i2++) {
                    iMin = Math.min(iMin, list.get(i2).getLastNumberOfNestedPrefetchItems$foundation());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:14:0x003e, B:16:0x0048, B:18:0x0051, B:21:0x005d, B:22:0x006f, B:26:0x007b, B:28:0x0083, B:30:0x008d, B:32:0x0091, B:35:0x0098, B:36:0x009b, B:39:0x00a4, B:40:0x00aa, B:25:0x0078), top: B:50:0x003e }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:14:0x003e, B:16:0x0048, B:18:0x0051, B:21:0x005d, B:22:0x006f, B:26:0x007b, B:28:0x0083, B:30:0x008d, B:32:0x0091, B:35:0x0098, B:36:0x009b, B:39:0x00a4, B:40:0x00aa, B:25:0x0078), top: B:50:0x003e }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean executeNestedPrefetches(androidx.compose.foundation.lazy.layout.PrefetchRequestScope r8, int r9, boolean r10) {
                /*
                    r7 = this;
                    int r0 = r7.stateIndex
                    java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> r1 = r7.states
                    int r1 = r1.size()
                    r2 = 0
                    if (r0 < r1) goto Lc
                    return r2
                Lc:
                    androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl r0 = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.this
                    boolean r0 = androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.access$isCanceled$p(r0)
                    if (r0 == 0) goto L19
                    java.lang.String r0 = "Should not execute nested prefetch on canceled request"
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(r0)
                L19:
                    java.lang.String r0 = "compose:lazy:prefetch:update_nested_prefetch_count"
                    android.os.Trace.beginSection(r0)
                    java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> r0 = r7.states     // Catch: java.lang.Throwable -> Lbb
                    r1 = r0
                    java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> Lbb
                    int r1 = r1.size()     // Catch: java.lang.Throwable -> Lbb
                    r3 = r2
                L28:
                    if (r3 >= r1) goto L36
                    java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> Lbb
                    androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r4 = (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState) r4     // Catch: java.lang.Throwable -> Lbb
                    r4.setRealizedNestedPrefetchCount$foundation(r9)     // Catch: java.lang.Throwable -> Lbb
                    int r3 = r3 + 1
                    goto L28
                L36:
                    android.os.Trace.endSection()
                    java.lang.String r9 = "compose:lazy:prefetch:nested"
                    android.os.Trace.beginSection(r9)
                L3e:
                    int r9 = r7.stateIndex     // Catch: java.lang.Throwable -> Lb6
                    java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> r0 = r7.states     // Catch: java.lang.Throwable -> Lb6
                    int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb6
                    if (r9 >= r0) goto Lb2
                    java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest>[] r9 = r7.requestsByState     // Catch: java.lang.Throwable -> Lb6
                    int r0 = r7.stateIndex     // Catch: java.lang.Throwable -> Lb6
                    r9 = r9[r0]     // Catch: java.lang.Throwable -> Lb6
                    r0 = 1
                    if (r9 != 0) goto L6f
                    long r3 = r8.availableTimeNanos()     // Catch: java.lang.Throwable -> Lb6
                    r5 = 0
                    int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r9 > 0) goto L5d
                L5b:
                    r2 = r0
                    goto Lb2
                L5d:
                    java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest>[] r9 = r7.requestsByState     // Catch: java.lang.Throwable -> Lb6
                    int r1 = r7.stateIndex     // Catch: java.lang.Throwable -> Lb6
                    java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState> r3 = r7.states     // Catch: java.lang.Throwable -> Lb6
                    java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> Lb6
                    androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState) r3     // Catch: java.lang.Throwable -> Lb6
                    java.util.List r3 = r3.collectNestedPrefetchRequests$foundation()     // Catch: java.lang.Throwable -> Lb6
                    r9[r1] = r3     // Catch: java.lang.Throwable -> Lb6
                L6f:
                    java.util.List<androidx.compose.foundation.lazy.layout.PrefetchRequest>[] r9 = r7.requestsByState     // Catch: java.lang.Throwable -> Lb6
                    int r1 = r7.stateIndex     // Catch: java.lang.Throwable -> Lb6
                    r9 = r9[r1]     // Catch: java.lang.Throwable -> Lb6
                    if (r9 == 0) goto L78
                    goto L7b
                L78:
                    h.g.b.x.g()     // Catch: java.lang.Throwable -> Lb6
                L7b:
                    int r1 = r7.requestIndex     // Catch: java.lang.Throwable -> Lb6
                    int r3 = r9.size()     // Catch: java.lang.Throwable -> Lb6
                    if (r1 >= r3) goto Laa
                    int r1 = r7.requestIndex     // Catch: java.lang.Throwable -> Lb6
                    java.lang.Object r1 = r9.get(r1)     // Catch: java.lang.Throwable -> Lb6
                    androidx.compose.foundation.lazy.layout.PrefetchRequest r1 = (androidx.compose.foundation.lazy.layout.PrefetchRequest) r1     // Catch: java.lang.Throwable -> Lb6
                    if (r10 == 0) goto L9b
                    boolean r3 = r1 instanceof androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl     // Catch: java.lang.Throwable -> Lb6
                    if (r3 == 0) goto L95
                    r3 = r1
                    androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl r3 = (androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl) r3     // Catch: java.lang.Throwable -> Lb6
                    goto L96
                L95:
                    r3 = 0
                L96:
                    if (r3 == 0) goto L9b
                    r3.markAsUrgent()     // Catch: java.lang.Throwable -> Lb6
                L9b:
                    r7.executedNestedPrefetch = r0     // Catch: java.lang.Throwable -> Lb6
                    boolean r1 = r1.execute(r8)     // Catch: java.lang.Throwable -> Lb6
                    if (r1 == 0) goto La4
                    goto L5b
                La4:
                    int r1 = r7.requestIndex     // Catch: java.lang.Throwable -> Lb6
                    int r1 = r1 + r0
                    r7.requestIndex = r1     // Catch: java.lang.Throwable -> Lb6
                    goto L7b
                Laa:
                    r7.requestIndex = r2     // Catch: java.lang.Throwable -> Lb6
                    int r9 = r7.stateIndex     // Catch: java.lang.Throwable -> Lb6
                    int r9 = r9 + r0
                    r7.stateIndex = r9     // Catch: java.lang.Throwable -> Lb6
                    goto L3e
                Lb2:
                    android.os.Trace.endSection()
                    return r2
                Lb6:
                    r7 = move-exception
                    android.os.Trace.endSection()
                    throw r7
                Lbb:
                    r7 = move-exception
                    android.os.Trace.endSection()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl.NestedPrefetchController.executeNestedPrefetches(androidx.compose.foundation.lazy.layout.PrefetchRequestScope, int, boolean):boolean");
            }

            public final boolean getExecutedNestedPrefetch() {
                return this.executedNestedPrefetch;
            }

            public final void setExecutedNestedPrefetch(boolean z) {
                this.executedNestedPrefetch = z;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HandleAndRequestImpl(int i2, PrefetchMetrics prefetchMetrics, PriorityPrefetchScheduler priorityPrefetchScheduler, l<? super LazyLayoutPrefetchState.PrefetchResultScope, ab> lVar) {
            this.index = i2;
            this.prefetchMetrics = prefetchMetrics;
            this.priorityPrefetchScheduler = priorityPrefetchScheduler;
            this.onItemPremeasured = lVar;
            int i3 = e.f48279a;
            this.startTime = e.c();
        }

        private final void cleanUp() {
            SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
            if (pausedPrecomposition != null) {
                pausedPrecomposition.cancel();
            }
            this.pausedPrecomposition = null;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.precomposeHandle = null;
            this.nestedPrefetchController = null;
        }

        private final boolean executeRequest(PrefetchRequestScope prefetchRequestScope) {
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", getIndex());
            LazyLayoutItemProvider lazyLayoutItemProviderInvoke = PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke();
            if (!this.isCanceled) {
                int itemCount = lazyLayoutItemProviderInvoke.getItemCount();
                int index = getIndex();
                if (index >= 0 && index < itemCount) {
                    Object key = lazyLayoutItemProviderInvoke.getKey(getIndex());
                    Object obj = this.keyUsedForComposition;
                    if (obj != null && !x.n(key, obj)) {
                        cleanUp();
                        return false;
                    }
                    Object contentType = lazyLayoutItemProviderInvoke.getContentType(getIndex());
                    Averages average = this.prefetchMetrics.getAverage(contentType);
                    boolean zIsComposed = isComposed();
                    resetAvailableTimeTo(prefetchRequestScope.availableTimeNanos());
                    if (!isComposed()) {
                        boolean z = ComposeFoundationFlags.isPausableCompositionInPrefetchEnabled;
                        long j2 = this.availableTimeNanos;
                        if (z) {
                            if (shouldExecute(j2, average.getResumeTimeNanos() + average.getPauseTimeNanos())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    performPausableComposition(prefetchRequestScope, key, contentType, average);
                                } finally {
                                }
                            }
                        } else if (shouldExecute(j2, average.getCompositionTimeNanos())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                performFullComposition(key, contentType);
                                Trace.endSection();
                                updateElapsedAndAvailableTime();
                                average.saveCompositionTimeNanos(this.elapsedTimeNanos);
                            } finally {
                            }
                        }
                        if (!isComposed()) {
                            return true;
                        }
                    }
                    if (this.pausedPrecomposition != null) {
                        if (!shouldExecute(this.availableTimeNanos, average.getApplyTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            performApply();
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            average.saveApplyTimeNanos(this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                    if (!this.hasResolvedNestedPrefetches) {
                        if (this.availableTimeNanos <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.nestedPrefetchController = resolveNestedPrefetchStates();
                            this.hasResolvedNestedPrefetches = true;
                        } finally {
                        }
                    }
                    NestedPrefetchController nestedPrefetchController = this.nestedPrefetchController;
                    if (nestedPrefetchController != null && nestedPrefetchController.executeNestedPrefetches(prefetchRequestScope, average.getNestedPrefetchCount(), this.isUrgent)) {
                        return true;
                    }
                    NestedPrefetchController nestedPrefetchController2 = this.nestedPrefetchController;
                    if (nestedPrefetchController2 != null && nestedPrefetchController2.getExecutedNestedPrefetch()) {
                        updateElapsedAndAvailableTime();
                        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", getIndex());
                        NestedPrefetchController nestedPrefetchController3 = this.nestedPrefetchController;
                        if (nestedPrefetchController3 != null) {
                            nestedPrefetchController3.setExecutedNestedPrefetch(false);
                        }
                    }
                    Constraints constraints = this.premeasureConstraints;
                    if (!this.isMeasured && constraints != null) {
                        if ((PrefetchHandleProvider.this.getShouldPauseBetweenPrecompositionAndPremeasure$foundation() && !zIsComposed) || !shouldExecute(this.availableTimeNanos, average.getMeasureTimeNanos())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m2976performMeasureBRTryo0(constraints.m11113unboximpl());
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            average.saveMeasureTimeNanos(this.elapsedTimeNanos);
                            l<LazyLayoutPrefetchState.PrefetchResultScope, ab> lVar = this.onItemPremeasured;
                            if (lVar != null) {
                                lVar.invoke(this);
                            }
                        } finally {
                        }
                    }
                    NestedPrefetchController nestedPrefetchController4 = this.nestedPrefetchController;
                    if (this.isMeasured && this.hasResolvedNestedPrefetches && nestedPrefetchController4 != null) {
                        int iCollectIdealNestedPrefetchCount = nestedPrefetchController4.collectIdealNestedPrefetchCount();
                        average.saveNestedPrefetchCount(iCollectIdealNestedPrefetchCount);
                        if (nestedPrefetchController4.collectNestedPrefetchedItemsCount() < iCollectIdealNestedPrefetchCount) {
                            average.clearMeasureTime();
                        }
                    }
                    return false;
                }
            }
            cleanUp();
            return false;
        }

        private final boolean isComposed() {
            if (this.isApplied) {
                return true;
            }
            SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
            return pausedPrecomposition != null && pausedPrecomposition.isComplete();
        }

        private final void performApply() {
            SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
            if (pausedPrecomposition == null) {
                throw new IllegalArgumentException("Nothing to apply!");
            }
            this.precomposeHandle = pausedPrecomposition.apply();
            this.pausedPrecomposition = null;
            this.isApplied = true;
        }

        private final void performFullComposition(Object obj, Object obj2) {
            if (this.precomposeHandle != null) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already composed!");
            }
            p<Composer, Integer, ab> content = PrefetchHandleProvider.this.itemContentFactory.getContent(getIndex(), obj, obj2);
            this.keyUsedForComposition = obj;
            this.precomposeHandle = PrefetchHandleProvider.this.subcomposeLayoutState.precompose(obj, content);
            this.isApplied = true;
        }

        /* renamed from: performMeasure-BRTryo0, reason: not valid java name */
        private final void m2976performMeasureBRTryo0(long j2) {
            if (this.isCanceled) {
                InlineClassHelperKt.throwIllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already measured!");
            }
            this.isMeasured = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("performComposition() must be called before performMeasure()");
                throw new h.e();
            }
            int placeablesCount = precomposedSlotHandle.getPlaceablesCount();
            for (int i2 = 0; i2 < placeablesCount; i2++) {
                precomposedSlotHandle.mo9774premeasure0kLqBqw(i2, j2);
            }
        }

        private final void performPausableComposition(PrefetchRequestScope prefetchRequestScope, Object obj, Object obj2, final Averages averages) {
            SubcomposeLayoutState.PausedPrecomposition pausedPrecompositionCreatePausedPrecomposition = this.pausedPrecomposition;
            if (pausedPrecompositionCreatePausedPrecomposition == null) {
                PrefetchHandleProvider prefetchHandleProvider = PrefetchHandleProvider.this;
                pausedPrecompositionCreatePausedPrecomposition = prefetchHandleProvider.subcomposeLayoutState.createPausedPrecomposition(obj, prefetchHandleProvider.itemContentFactory.getContent(getIndex(), obj, obj2));
                this.pausedPrecomposition = pausedPrecompositionCreatePausedPrecomposition;
                this.keyUsedForComposition = obj;
            }
            this.pauseRequested = false;
            while (!pausedPrecompositionCreatePausedPrecomposition.isComplete() && !this.pauseRequested) {
                pausedPrecompositionCreatePausedPrecomposition.resume(new ShouldPauseCallback() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$$ExternalSyntheticLambda1
                    @Override // androidx.compose.runtime.ShouldPauseCallback
                    public final boolean shouldPause() {
                        return PrefetchHandleProvider.HandleAndRequestImpl.performPausableComposition$lambda$1(this.f$0, averages);
                    }
                });
            }
            updateElapsedAndAvailableTime();
            boolean z = this.pauseRequested;
            long j2 = this.elapsedTimeNanos;
            if (z) {
                averages.savePauseTimeNanos(j2);
            } else {
                averages.saveResumeTimeNanos(j2);
            }
        }

        static final boolean performPausableComposition$lambda$1(HandleAndRequestImpl handleAndRequestImpl, Averages averages) {
            if (handleAndRequestImpl.pauseRequested) {
                return true;
            }
            handleAndRequestImpl.updateElapsedAndAvailableTime();
            averages.saveResumeTimeNanos(handleAndRequestImpl.elapsedTimeNanos);
            boolean z = !handleAndRequestImpl.shouldExecute(handleAndRequestImpl.availableTimeNanos, averages.getResumeTimeNanos() + averages.getPauseTimeNanos());
            handleAndRequestImpl.pauseRequested = z;
            return z;
        }

        private final void resetAvailableTimeTo(long j2) {
            this.availableTimeNanos = j2;
            int i2 = e.f48279a;
            this.startTime = e.c();
            this.elapsedTimeNanos = 0L;
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", j2);
        }

        private final NestedPrefetchController resolveNestedPrefetchStates() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Should precompose before resolving nested prefetch states");
                throw new h.e();
            }
            final aq aqVar = new aq();
            precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new l() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return PrefetchHandleProvider.HandleAndRequestImpl.resolveNestedPrefetchStates$lambda$1(aqVar, (TraversableNode) obj);
                }
            });
            List list = (List) aqVar.f48105a;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        static final TraversableNode.Companion.TraverseDescendantsAction resolveNestedPrefetchStates$lambda$1(aq aqVar, TraversableNode traversableNode) {
            x.d(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
            LazyLayoutPrefetchState prefetchState = ((TraversablePrefetchStateNode) traversableNode).getPrefetchState();
            List listL = (List) aqVar.f48105a;
            if (listL != null) {
                listL.add(prefetchState);
            } else {
                listL = i.l(prefetchState);
            }
            aqVar.f48105a = listL;
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }

        private final boolean shouldExecute(long j2, long j3) {
            if (true == this.isUrgent) {
                j3 = 0;
            }
            return j2 > j3;
        }

        private final void updateElapsedAndAvailableTime() {
            int i2 = e.f48279a;
            long jC = e.c();
            long jO = a.o(f.b(jC, this.startTime));
            this.elapsedTimeNanos = jO;
            long j2 = this.availableTimeNanos - jO;
            this.availableTimeNanos = j2;
            this.startTime = jC;
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", j2);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            cleanUp();
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public boolean execute(PrefetchRequestScope prefetchRequestScope) {
            boolean zExecuteRequest;
            if (!PrefetchHandleProvider.this.isStateActive) {
                return false;
            }
            if (this.isUrgent) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zExecuteRequest = executeRequest(prefetchRequestScope);
                } finally {
                    Trace.endSection();
                }
            } else {
                zExecuteRequest = executeRequest(prefetchRequestScope);
            }
            AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", -1L);
            return zExecuteRequest;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        public int getIndex() {
            return this.index;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        public int getPlaceablesCount() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                return precomposedSlotHandle.getPlaceablesCount();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchResultScope
        /* renamed from: getSize-YEO4UFw */
        public long mo2962getSizeYEO4UFw(int i2) {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            return precomposedSlotHandle != null ? precomposedSlotHandle.mo9773getSizeYEO4UFw(i2) : IntSize.Companion.m11344getZeroYbymL2g();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void markAsUrgent() {
            this.isUrgent = true;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + getIndex() + ", constraints = " + this.premeasureConstraints + ", isComposed = " + isComposed() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        private HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i2, long j2, PrefetchMetrics prefetchMetrics, PriorityPrefetchScheduler priorityPrefetchScheduler, l<? super LazyLayoutPrefetchState.PrefetchResultScope, ab> lVar) {
            this(i2, prefetchMetrics, priorityPrefetchScheduler, lVar);
            this.premeasureConstraints = Constraints.m11094boximpl(j2);
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i2, long j2, PrefetchMetrics prefetchMetrics, PriorityPrefetchScheduler priorityPrefetchScheduler, l lVar, o oVar) {
            this(prefetchHandleProvider, i2, j2, prefetchMetrics, priorityPrefetchScheduler, lVar);
        }
    }
}
