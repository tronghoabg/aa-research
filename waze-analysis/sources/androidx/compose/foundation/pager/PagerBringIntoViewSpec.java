package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PagerBringIntoViewSpec implements BringIntoViewSpec {
    private final BringIntoViewSpec defaultBringIntoViewSpec;
    private final LayoutDirection layoutDirection;
    private final PagerState pagerState;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec, LayoutDirection layoutDirection) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = bringIntoViewSpec;
        this.layoutDirection = layoutDirection;
    }

    private final boolean getShouldChangeScrollDirection(PagerState pagerState) {
        return this.layoutDirection == LayoutDirection.Rtl && pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal;
    }

    private final float overrideProposedOffsetMove(float f2) {
        float pageSizeWithSpacing$foundation = -getLayoutAwareFirstOffset(this.pagerState);
        while (f2 > 0.0f && pageSizeWithSpacing$foundation < f2) {
            pageSizeWithSpacing$foundation += this.pagerState.getPageSizeWithSpacing$foundation();
        }
        while (f2 < 0.0f && pageSizeWithSpacing$foundation > f2) {
            pageSizeWithSpacing$foundation -= this.pagerState.getPageSizeWithSpacing$foundation();
        }
        return pageSizeWithSpacing$foundation;
    }

    private final float settlingScrollDistance(float f2) {
        int pageSizeWithSpacing$foundation;
        float f3 = -getLayoutAwareFirstOffset(this.pagerState);
        boolean shouldChangeScrollDirection = getShouldChangeScrollDirection(this.pagerState);
        PagerState pagerState = this.pagerState;
        if (shouldChangeScrollDirection) {
            if (!pagerState.getLastScrolledForward()) {
                pageSizeWithSpacing$foundation = this.pagerState.getPageSizeWithSpacing$foundation();
                f3 += pageSizeWithSpacing$foundation;
            }
        } else if (pagerState.getLastScrolledForward()) {
            pageSizeWithSpacing$foundation = this.pagerState.getPageSizeWithSpacing$foundation();
            f3 += pageSizeWithSpacing$foundation;
        }
        return n.g(f3, -f2, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float calculateScrollDistance(float r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            float r2 = r5 + r6
            androidx.compose.foundation.gestures.BringIntoViewSpec r3 = r4.defaultBringIntoViewSpec
            float r5 = r3.calculateScrollDistance(r5, r6, r7)
            r6 = 1
            r3 = 0
            if (r1 <= 0) goto L14
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 <= 0) goto L1d
            goto L1e
        L14:
            int r1 = androidx.compose.animation.core.VisibilityThresholdsKt.f1650a
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto L1d
            goto L1e
        L1d:
            r6 = r3
        L1e:
            float r1 = java.lang.Math.abs(r5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L27
            goto L2e
        L27:
            if (r6 == 0) goto L2e
            float r4 = r4.overrideProposedOffsetMove(r5)
            return r4
        L2e:
            androidx.compose.foundation.pager.PagerState r5 = r4.pagerState
            int r5 = r5.getFirstVisiblePageOffset$foundation()
            int r5 = java.lang.Math.abs(r5)
            double r5 = (double) r5
            r1 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L43
            return r0
        L43:
            float r4 = r4.settlingScrollDistance(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerBringIntoViewSpec.calculateScrollDistance(float, float, float):float");
    }

    public final BringIntoViewSpec getDefaultBringIntoViewSpec() {
        return this.defaultBringIntoViewSpec;
    }

    public final int getLayoutAwareFirstOffset(PagerState pagerState) {
        return getShouldChangeScrollDirection(pagerState) ? (-pagerState.getFirstVisiblePageOffset$foundation()) + pagerState.getPageSizeWithSpacing$foundation() : pagerState.getFirstVisiblePageOffset$foundation();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public /* synthetic */ AnimationSpec getScrollAnimationSpec() {
        return BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec$foundation();
    }
}
