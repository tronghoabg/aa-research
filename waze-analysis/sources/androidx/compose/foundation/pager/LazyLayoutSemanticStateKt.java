package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.a;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final PagerState pagerState, final boolean z) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt.LazyLayoutSemanticState.1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                boolean z2 = z;
                PagerState pagerState2 = pagerState;
                return z2 ? new CollectionInfo(pagerState2.getPageCount(), 1) : new CollectionInfo(1, pagerState2.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                return pagerState.getLayoutInfo().getBeforeContentPadding() + pagerState.getLayoutInfo().getAfterContentPadding();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                PagerState pagerState2 = pagerState;
                return PagerStateKt.calculateNewMaxScrollOffset(pagerState2.getLayoutInfo(), pagerState2.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return PagerScrollPositionKt.currentAbsoluteScrollOffset(pagerState);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                Orientation orientation = pagerState.getLayoutInfo().getOrientation();
                Orientation orientation2 = Orientation.Vertical;
                PagerState pagerState2 = pagerState;
                return (int) (orientation == orientation2 ? pagerState2.getLayoutInfo().mo3036getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : pagerState2.getLayoutInfo().mo3036getViewportSizeYbymL2g() >> 32);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i2, e<? super ab> eVar) {
                Object objScrollToPage$default = PagerState.scrollToPage$default(pagerState, i2, 0.0f, eVar, 2, null);
                return objScrollToPage$default == a.f48038a ? objScrollToPage$default : ab.f48028a;
            }
        };
    }
}
