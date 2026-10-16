package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;
import h.g.a.q;
import h.k;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final q<? super Float, ? super Float, ? super Float, Float> qVar) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            private final k<Float, Float> searchForSnappingBounds(SnapPosition snapPosition, float f2) {
                float f3;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                int i2 = 0;
                float f4 = Float.POSITIVE_INFINITY;
                float f5 = Float.NEGATIVE_INFINITY;
                while (true) {
                    f3 = 0.0f;
                    if (i2 >= size) {
                        break;
                    }
                    PagerState pagerState2 = pagerState;
                    PageInfo pageInfo = visiblePagesInfo.get(i2);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f5) {
                        f5 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f4) {
                        f4 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    i2++;
                }
                if (f5 == Float.NEGATIVE_INFINITY) {
                    f5 = f4;
                }
                if (f4 == Float.POSITIVE_INFINITY) {
                    f4 = f5;
                }
                if (!pagerState.getCanScrollForward()) {
                    if (PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState, f2)) {
                        f5 = 0.0f;
                        f4 = 0.0f;
                    } else {
                        f4 = 0.0f;
                    }
                }
                if (pagerState.getCanScrollBackward()) {
                    f3 = f5;
                } else if (!PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState, f2)) {
                    f4 = 0.0f;
                }
                return new k<>(Float.valueOf(f3), Float.valueOf(f4));
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f2, float f3) {
                PagerState pagerState2 = pagerState;
                int pageSize$foundation = pagerState2.getPageSize$foundation() + pagerState2.getPageSpacing$foundation();
                if (pageSize$foundation != 0) {
                    PagerState pagerState3 = pagerState;
                    int firstVisiblePage$foundation = f2 < 0.0f ? pagerState3.getFirstVisiblePage$foundation() + 1 : pagerState3.getFirstVisiblePage$foundation();
                    int iJ = n.j(((int) (f3 / pageSize$foundation)) + firstVisiblePage$foundation, 0, pagerState.getPageCount());
                    PagerSnapDistance pagerSnapDistance2 = pagerSnapDistance;
                    PagerState pagerState4 = pagerState;
                    int iAbs = Math.abs((n.j(pagerSnapDistance2.calculateTargetPage(firstVisiblePage$foundation, iJ, f2, pagerState4.getPageSize$foundation(), pagerState4.getPageSpacing$foundation()), 0, pagerState.getPageCount()) - firstVisiblePage$foundation) * pageSize$foundation) - pageSize$foundation;
                    int i2 = iAbs >= 0 ? iAbs : 0;
                    if (i2 != 0) {
                        return i2 * Math.signum(f2);
                    }
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f2) {
                k<Float, Float> kVarSearchForSnappingBounds = searchForSnappingBounds(pagerState.getLayoutInfo().getSnapPosition(), f2);
                float fFloatValue = ((Number) kVarSearchForSnappingBounds.a()).floatValue();
                float fFloatValue2 = ((Number) kVarSearchForSnappingBounds.b()).floatValue();
                float fFloatValue3 = qVar.invoke(Float.valueOf(f2), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
                if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
                    InlineClassHelperKt.throwIllegalStateException("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (isValidDistance(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo();
            }

            public final boolean isValidDistance(float f2) {
                return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState r3, androidx.compose.ui.unit.LayoutDirection r4, float r5, float r6, float r7, float r8) {
        /*
            boolean r0 = isScrollingForward(r3, r6)
            androidx.compose.foundation.pager.PagerLayoutInfo r1 = r3.getLayoutInfo()
            androidx.compose.foundation.gestures.Orientation r1 = r1.getOrientation()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r1 != r2) goto L11
            goto L1b
        L11:
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r4 != r1) goto L16
            goto L1b
        L16:
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            androidx.compose.foundation.pager.PagerLayoutInfo r4 = r3.getLayoutInfo()
            int r4 = r4.getPageSize()
            r1 = 0
            if (r4 != 0) goto L28
            r2 = r1
            goto L2e
        L28:
            float r2 = dragGestureDelta(r3)
            float r4 = (float) r4
            float r2 = r2 / r4
        L2e:
            androidx.compose.ui.unit.Density r4 = r3.getDensity$foundation()
            int r4 = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(r4, r6)
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r6 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r6 = r6.m2377getClosestItembbeMdSM()
            boolean r6 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m2373equalsimpl0(r4, r6)
            if (r6 == 0) goto L71
            int r4 = (int) r2
            float r4 = (float) r4
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L51
            if (r0 != 0) goto L8b
            goto L8a
        L51:
            float r4 = java.lang.Math.abs(r2)
            float r3 = r3.getPositionThresholdFraction$foundation()
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L64
            if (r0 == 0) goto L8b
            goto L8a
        L64:
            float r3 = java.lang.Math.abs(r7)
            float r4 = java.lang.Math.abs(r8)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L8b
            goto L8a
        L71:
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r3 = r3.m2378getNextItembbeMdSM()
            boolean r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m2373equalsimpl0(r4, r3)
            if (r3 != 0) goto L8b
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r3 = r3.m2379getPreviousItembbeMdSM()
            boolean r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m2373equalsimpl0(r4, r3)
            if (r3 != 0) goto L8a
            return r1
        L8a:
            return r7
        L8b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.unit.LayoutDirection, float, float, float, float):float");
    }

    private static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.m3044getUpDownDifferenceF1C5BW0$foundation() >> 32)) : Float.intBitsToFloat((int) (pagerState.m3044getUpDownDifferenceF1C5BW0$foundation() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState, float f2) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        boolean z = (pagerState.isNotGestureAction$foundation() ? -f2 : dragGestureDelta(pagerState)) > 0.0f;
        if (z) {
            if (reverseLayout) {
                return true;
            }
            reverseLayout = false;
        }
        return (z || reverseLayout) ? false : true;
    }

    private static final void debugLog(a<String> aVar) {
    }
}
