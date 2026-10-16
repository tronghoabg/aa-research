package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import h.a.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListScrollScopeKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyListScrollScopeKt$LazyLayoutScrollScope$1, reason: invalid class name */
    public final class AnonymousClass1 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyListState $state;

        AnonymousClass1(ScrollScope scrollScope, LazyListState lazyListState) {
            this.$state = lazyListState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int i2, int i3) {
            LazyListItemInfo lazyListItemInfo;
            LazyListLayoutInfo layoutInfo = this.$state.getLayoutInfo();
            int iVisibleItemsAverageSize = 0;
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int firstVisibleItemIndex = getFirstVisibleItemIndex();
            if (i2 > getLastVisibleItemIndex() || firstVisibleItemIndex > i2) {
                iVisibleItemsAverageSize = (LazyListLayoutInfoKt.visibleItemsAverageSize(layoutInfo) * (i2 - getFirstVisibleItemIndex())) - getFirstVisibleItemScrollOffset();
            } else {
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        lazyListItemInfo = null;
                        break;
                    }
                    lazyListItemInfo = visibleItemsInfo.get(i4);
                    if (lazyListItemInfo.getIndex() == i2) {
                        break;
                    }
                    i4++;
                }
                LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
                if (lazyListItemInfo2 != null) {
                    iVisibleItemsAverageSize = lazyListItemInfo2.getOffset();
                }
            }
            return iVisibleItemsAverageSize + i3;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemIndex() {
            return this.$state.getFirstVisibleItemIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return this.$state.getFirstVisibleItemScrollOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getItemCount() {
            return this.$state.getLayoutInfo().getTotalItemsCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getLastVisibleItemIndex() {
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) i.U(this.$state.getLayoutInfo().getVisibleItemsInfo());
            if (lazyListItemInfo != null) {
                return lazyListItemInfo.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f2) {
            return this.$$delegate_0.scrollBy(f2);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int i2, int i3) {
            this.$state.snapToItemIndexInternal$foundation(i2, i3, true);
        }
    }

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(LazyListState lazyListState, ScrollScope scrollScope) {
        return new AnonymousClass1(scrollScope, lazyListState);
    }
}
