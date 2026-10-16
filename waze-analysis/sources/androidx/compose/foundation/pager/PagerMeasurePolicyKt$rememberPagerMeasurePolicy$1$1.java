package androidx.compose.foundation.pager;

import androidx.collection.IntObjectMapKt;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.media3.muxer.MuxerUtil;
import h.a.r;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 implements LazyLayoutMeasurePolicy {
    final /* synthetic */ int $beyondViewportPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ af $coroutineScope;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ a<PagerLazyLayoutItemProvider> $itemProviderLambda;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ a<Integer> $pageCount;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ SnapPosition $snapPosition;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(PagerState pagerState, Orientation orientation, PaddingValues paddingValues, boolean z, float f2, PageSize pageSize, a<PagerLazyLayoutItemProvider> aVar, a<Integer> aVar2, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i2, SnapPosition snapPosition, af afVar) {
        this.$state = pagerState;
        this.$orientation = orientation;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$pageSpacing = f2;
        this.$pageSize = pageSize;
        this.$itemProviderLambda = aVar;
        this.$pageCount = aVar2;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$beyondViewportPageCount = i2;
        this.$snapPosition = snapPosition;
        this.$coroutineScope = afVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy
    /* renamed from: measure-0kLqBqw */
    public final MeasureResult mo2877measure0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
        LazyLayoutMeasureScope lazyLayoutMeasureScope2;
        long j3;
        ObservableScopeInvalidator.m2964attachToScopeimpl(this.$state.m3041getMeasurementScopeInvalidatorzYiylxw$foundation());
        Orientation orientation = this.$orientation;
        Orientation orientation2 = Orientation.Vertical;
        boolean z = orientation == orientation2;
        if (!z) {
            orientation2 = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m1999checkScrollableContainerConstraintsK40F9xA(j2, orientation2);
        PaddingValues paddingValues = this.$contentPadding;
        int i2 = z ? lazyLayoutMeasureScope.mo2121roundToPx0680j_4(paddingValues.mo2705calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo2121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
        PaddingValues paddingValues2 = this.$contentPadding;
        int i3 = z ? lazyLayoutMeasureScope.mo2121roundToPx0680j_4(paddingValues2.mo2706calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection())) : lazyLayoutMeasureScope.mo2121roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues2, lazyLayoutMeasureScope.getLayoutDirection()));
        int i4 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(this.$contentPadding.mo2707calculateTopPaddingD9Ej5fM());
        int i5 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(this.$contentPadding.mo2704calculateBottomPaddingD9Ej5fM());
        final int i6 = i4 + i5;
        final int i7 = i2 + i3;
        int i8 = true != z ? i7 : i6;
        int i9 = (!z || this.$reverseLayout) ? (z && this.$reverseLayout) ? i5 : (z || this.$reverseLayout) ? i3 : i2 : i4;
        int i10 = i8 - i9;
        long jM11126offsetNN6EwU = ConstraintsKt.m11126offsetNN6EwU(j2, -i7, -i6);
        LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope;
        this.$state.setDensity$foundation(lazyLayoutMeasureScope3);
        int i11 = lazyLayoutMeasureScope.mo2121roundToPx0680j_4(this.$pageSpacing);
        int iM11106getMaxHeightimpl = z ? Constraints.m11106getMaxHeightimpl(j2) - i6 : Constraints.m11107getMaxWidthimpl(j2) - i7;
        if (!this.$reverseLayout || iM11106getMaxHeightimpl > 0) {
            lazyLayoutMeasureScope2 = lazyLayoutMeasureScope3;
            j3 = (i2 << 32) | (i4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        } else {
            if (!z) {
                i2 += iM11106getMaxHeightimpl;
            }
            if (z) {
                i4 += iM11106getMaxHeightimpl;
            }
            lazyLayoutMeasureScope2 = lazyLayoutMeasureScope3;
            j3 = (i4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
        }
        LazyLayoutMeasureScope lazyLayoutMeasureScope4 = lazyLayoutMeasureScope2;
        int iCalculateMainAxisPageSize = this.$pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope4, iM11106getMaxHeightimpl, i11);
        int i12 = iCalculateMainAxisPageSize < 0 ? 0 : iCalculateMainAxisPageSize;
        PagerState pagerState = this.$state;
        Orientation orientation3 = this.$orientation;
        Orientation orientation4 = Orientation.Vertical;
        pagerState.m3045setPremeasureConstraintsBRTryo0$foundation(ConstraintsKt.Constraints$default(0, orientation3 == orientation4 ? Constraints.m11107getMaxWidthimpl(jM11126offsetNN6EwU) : i12, 0, orientation3 != orientation4 ? Constraints.m11106getMaxHeightimpl(jM11126offsetNN6EwU) : i12, 5, null));
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProviderInvoke = this.$itemProviderLambda.invoke();
        int i13 = iM11106getMaxHeightimpl + i9 + i10;
        PagerState pagerState2 = this.$state;
        SnapPosition snapPosition = this.$snapPosition;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        long j4 = j3;
        try {
            int iMatchScrollPositionWithKey$foundation = pagerState2.matchScrollPositionWithKey$foundation(pagerLazyLayoutItemProviderInvoke, pagerState2.getCurrentPage());
            int iCurrentPageOffset = PagerKt.currentPageOffset(snapPosition, i13, i12, i11, i9, i10, pagerState2.getCurrentPage(), pagerState2.getCurrentPageOffsetFraction(), pagerState2.getPageCount());
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            PagerState pagerState3 = this.$state;
            int i14 = i9;
            int i15 = iM11106getMaxHeightimpl;
            PagerMeasureResult pagerMeasureResultM3038measurePager7L1iB3k = PagerMeasureKt.m3038measurePager7L1iB3k(lazyLayoutMeasureScope, this.$pageCount.invoke().intValue(), pagerLazyLayoutItemProviderInvoke, i15, i14, i10, i11, iMatchScrollPositionWithKey$foundation, iCurrentPageOffset, jM11126offsetNN6EwU, this.$orientation, this.$verticalAlignment, this.$horizontalAlignment, this.$reverseLayout, j4, i12, this.$beyondViewportPageCount, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProviderInvoke, pagerState3.getPinnedPages$foundation(), pagerState3.getBeyondBoundsInfo$foundation()), this.$snapPosition, this.$state.m3042getPlacementScopeInvalidatorzYiylxw$foundation(), this.$coroutineScope, lazyLayoutMeasureScope4, new q() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$$ExternalSyntheticLambda0
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyLayoutMeasureScope lazyLayoutMeasureScope5 = lazyLayoutMeasureScope;
                    long j5 = j2;
                    return lazyLayoutMeasureScope5.layout(ConstraintsKt.m11124constrainWidthK40F9xA(j5, ((Integer) obj).intValue() + i7), ConstraintsKt.m11123constrainHeightK40F9xA(j5, ((Integer) obj2).intValue() + i6), r.j(), (l) obj3);
                }
            }, IntObjectMapKt.mutableIntObjectMapOf());
            PagerState.applyMeasureResult$foundation$default(this.$state, pagerMeasureResultM3038measurePager7L1iB3k, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
            PagerMeasurePolicyKt.keepAroundItems(lazyLayoutMeasureScope, this.$state.getCacheWindowLogic$foundation(), pagerMeasureResultM3038measurePager7L1iB3k.getVisiblePagesInfo());
            return pagerMeasureResultM3038measurePager7L1iB3k;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
