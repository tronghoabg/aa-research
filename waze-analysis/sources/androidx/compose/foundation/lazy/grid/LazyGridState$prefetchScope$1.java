package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.ao;
import h.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridState$prefetchScope$1 implements LazyGridPrefetchScope {
    final /* synthetic */ LazyGridState this$0;

    LazyGridState$prefetchScope$1(LazyGridState lazyGridState) {
        this.this$0 = lazyGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab scheduleLinePrefetch$lambda$0$0$0$0(List list, ao aoVar, List list2, l lVar, int i2, LazyGridMeasureResult lazyGridMeasureResult, LazyLayoutPrefetchState.PrefetchResultScope prefetchResultScope) {
        int placeablesCount = prefetchResultScope.getPlaceablesCount();
        int iMo2962getSizeYEO4UFw = 0;
        for (int i3 = 0; i3 < placeablesCount; i3++) {
            iMo2962getSizeYEO4UFw += (int) (lazyGridMeasureResult.getOrientation() == Orientation.Vertical ? prefetchResultScope.mo2962getSizeYEO4UFw(i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE : prefetchResultScope.mo2962getSizeYEO4UFw(i3) >> 32);
        }
        if (list != null) {
            list.add(Integer.valueOf(iMo2962getSizeYEO4UFw));
        }
        if (aoVar.f48103a != list2.size()) {
            aoVar.f48103a++;
        } else if (lVar != null && list != null) {
            lVar.invoke(new LazyGridPrefetchResultScopeImpl(i2, list));
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(final int i2, final l<? super LazyGridPrefetchResultScope, ab> lVar) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = lVar == null ? null : new ArrayList();
        LazyGridState lazyGridState = this.this$0;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            final LazyGridMeasureResult approachLayoutInfo$foundation = lazyGridState.getHasLookaheadOccurred$foundation() ? lazyGridState.getApproachLayoutInfo$foundation() : (LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue();
            if (approachLayoutInfo$foundation != null) {
                final ao aoVar = new ao();
                aoVar.f48103a = 1;
                final List<k<Integer, Constraints>> listInvoke = approachLayoutInfo$foundation.getPrefetchInfoRetriever().invoke(Integer.valueOf(i2));
                int size = listInvoke.size();
                for (int i3 = 0; i3 < size; i3++) {
                    k<Integer, Constraints> kVar = listInvoke.get(i3);
                    arrayList.add(lazyGridState.getPrefetchState$foundation().m2959schedulePrecompositionAndPremeasure_EkL_Y$foundation(((Number) kVar.c()).intValue(), ((Constraints) kVar.d()).m11113unboximpl(), lazyGridState.executeRequestsInHighPriorityMode, new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return LazyGridState$prefetchScope$1.scheduleLinePrefetch$lambda$0$0$0$0(arrayList2, aoVar, listInvoke, lVar, i2, approachLayoutInfo$foundation, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
                        }
                    }));
                }
            }
            return arrayList;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
    public List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i2) {
        return scheduleLinePrefetch(i2, null);
    }
}
