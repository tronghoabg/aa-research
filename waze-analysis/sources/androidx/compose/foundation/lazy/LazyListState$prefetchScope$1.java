package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListState$prefetchScope$1 implements LazyListPrefetchScope {
    final /* synthetic */ LazyListState this$0;

    LazyListState$prefetchScope$1(LazyListState lazyListState) {
        this.this$0 = lazyListState;
    }

    static final ab schedulePrefetch$lambda$1(l lVar, int i2, LazyListMeasureResult lazyListMeasureResult, LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        if (lVar != null) {
            int placeablesCount = prefetchResultScope.getPlaceablesCount();
            int iMo2962getSizeYEO4UFw = 0;
            for (int i3 = 0; i3 < placeablesCount; i3++) {
                iMo2962getSizeYEO4UFw += (int) (lazyListMeasureResult.getOrientation() == Orientation.Vertical ? prefetchResultScope.mo2962getSizeYEO4UFw(i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE : prefetchResultScope.mo2962getSizeYEO4UFw(i3) >> 32);
            }
            lVar.invoke(new LazyListPrefetchResultScopeImpl(i2, iMo2962getSizeYEO4UFw));
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchScope
    public LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(final int i2, final l<? super LazyListPrefetchResultScope, ab> lVar) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        LazyListState lazyListState = this.this$0;
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            final LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) lazyListState.layoutInfoState.getValue();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            return this.this$0.getPrefetchState$foundation().m2959schedulePrecompositionAndPremeasure_EkL_Y$foundation(i2, lazyListMeasureResult.m2884getChildConstraintsmsEJaDk(), this.this$0.executeRequestsInHighPriorityMode, new l() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchScope$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return LazyListState$prefetchScope$1.schedulePrefetch$lambda$1(lVar, i2, lazyListMeasureResult, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
                }
            });
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
