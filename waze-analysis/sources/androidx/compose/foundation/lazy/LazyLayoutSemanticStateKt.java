package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.e;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1, reason: invalid class name */
    public final class AnonymousClass1 implements LazyLayoutSemanticState {
        final /* synthetic */ boolean $isVertical;
        final /* synthetic */ LazyListState $state;
        private final State totalItemsCount$delegate;

        AnonymousClass1(final LazyListState lazyListState, boolean z) {
            this.$state = lazyListState;
            this.$isVertical = z;
            this.totalItemsCount$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Integer.valueOf(lazyListState.getLayoutInfo().getTotalItemsCount());
                }
            });
        }

        private final int getTotalItemsCount() {
            return ((Number) this.totalItemsCount$delegate.getValue()).intValue();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
        public CollectionInfo collectionInfo() {
            return this.$isVertical ? new CollectionInfo(getTotalItemsCount(), 1) : new CollectionInfo(1, getTotalItemsCount());
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
        public int getContentPadding() {
            return this.$state.getLayoutInfo().getBeforeContentPadding() + this.$state.getLayoutInfo().getAfterContentPadding();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
        public float getMaxScrollOffset() {
            LazyListState lazyListState = this.$state;
            return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(lazyListState.getFirstVisibleItemIndex(), lazyListState.getFirstVisibleItemScrollOffset(), lazyListState.getCanScrollForward());
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
        public float getScrollOffset() {
            LazyListState lazyListState = this.$state;
            return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(lazyListState.getFirstVisibleItemIndex(), lazyListState.getFirstVisibleItemScrollOffset());
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
        public int getViewport() {
            Orientation orientation = this.$state.getLayoutInfo().getOrientation();
            Orientation orientation2 = Orientation.Vertical;
            LazyListState lazyListState = this.$state;
            return (int) (orientation == orientation2 ? lazyListState.getLayoutInfo().mo2879getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : lazyListState.getLayoutInfo().mo2879getViewportSizeYbymL2g() >> 32);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
        public Object scrollToItem(int i2, e<? super ab> eVar) {
            Object objScrollToItem$default = LazyListState.scrollToItem$default(this.$state, i2, 0, eVar, 2, null);
            return objScrollToItem$default == h.c.a.a.f48038a ? objScrollToItem$default : ab.f48028a;
        }
    }

    public static final LazyLayoutSemanticState LazyLayoutSemanticState(LazyListState lazyListState, boolean z) {
        return new AnonymousClass1(lazyListState, z);
    }
}
