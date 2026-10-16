package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import h.a.i;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerScrollScopeKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1, reason: invalid class name */
    public final class AnonymousClass1 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ PagerState $state;

        AnonymousClass1(ScrollScope scrollScope, PagerState pagerState) {
            this.$state = pagerState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int i2, int i3) {
            int currentPage = (i2 - this.$state.getCurrentPage()) * this.$state.getPageSizeWithSpacing$foundation();
            PagerState pagerState = this.$state;
            long jCurrentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state) + a.b((currentPage - (pagerState.getCurrentPageOffsetFraction() * pagerState.getPageSizeWithSpacing$foundation())) + i3);
            PagerState pagerState2 = this.$state;
            return (int) (n.n(jCurrentAbsoluteScrollOffset, pagerState2.getMinScrollOffset$foundation(), pagerState2.getMaxScrollOffset$foundation()) - PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state));
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemIndex() {
            return this.$state.getFirstVisiblePage$foundation();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return this.$state.getFirstVisiblePageOffset$foundation();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getItemCount() {
            return this.$state.getPageCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getLastVisibleItemIndex() {
            return ((PageInfo) i.T(this.$state.getLayoutInfo().getVisiblePagesInfo())).getIndex();
        }

        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f2) {
            return this.$$delegate_0.scrollBy(f2);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int i2, int i3) {
            float pageSizeWithSpacing$foundation = this.$state.getPageSizeWithSpacing$foundation();
            this.$state.snapToItem$foundation(i2, pageSizeWithSpacing$foundation != 0.0f ? i3 / pageSizeWithSpacing$foundation : 0.0f, true);
        }
    }

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(PagerState pagerState, ScrollScope scrollScope) {
        return new AnonymousClass1(scrollScope, pagerState);
    }
}
