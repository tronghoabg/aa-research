package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.a;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazySemanticsKt {
    public static final LazyLayoutSemanticState rememberLazyGridSemanticState(final LazyGridState lazyGridState, boolean z, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1247008005, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(z)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getContentPadding() {
                    return lazyGridState.getLayoutInfo().getBeforeContentPadding() + lazyGridState.getLayoutInfo().getAfterContentPadding();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getMaxScrollOffset() {
                    LazyGridState lazyGridState2 = lazyGridState;
                    return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(lazyGridState2.getFirstVisibleItemIndex(), lazyGridState2.getFirstVisibleItemScrollOffset(), lazyGridState2.getCanScrollForward());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getScrollOffset() {
                    LazyGridState lazyGridState2 = lazyGridState;
                    return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(lazyGridState2.getFirstVisibleItemIndex(), lazyGridState2.getFirstVisibleItemScrollOffset());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getViewport() {
                    Orientation orientation = lazyGridState.getLayoutInfo().getOrientation();
                    Orientation orientation2 = Orientation.Vertical;
                    LazyGridState lazyGridState2 = lazyGridState;
                    return (int) (orientation == orientation2 ? lazyGridState2.getLayoutInfo().mo2913getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : lazyGridState2.getLayoutInfo().mo2913getViewportSizeYbymL2g() >> 32);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object scrollToItem(int i3, e<? super ab> eVar) {
                    Object objScrollToItem$default = LazyGridState.scrollToItem$default(lazyGridState, i3, 0, eVar, 2, null);
                    return objScrollToItem$default == a.f48038a ? objScrollToItem$default : ab.f48028a;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
