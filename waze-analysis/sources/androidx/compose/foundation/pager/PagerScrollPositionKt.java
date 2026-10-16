package androidx.compose.foundation.pager;

import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerScrollPositionKt {
    public static final int NearestItemsExtraItemCount = 100;
    public static final int NearestItemsSlidingWindowSize = 30;

    public static final long currentAbsoluteScrollOffset(PagerState pagerState) {
        return (pagerState.getCurrentPage() * pagerState.getPageSizeWithSpacing$foundation()) + a.d(pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation());
    }

    private static final void debugLog(h.g.a.a<String> aVar) {
    }
}
