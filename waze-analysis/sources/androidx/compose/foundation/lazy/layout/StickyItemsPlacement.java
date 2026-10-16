package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import h.k.j;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface StickyItemsPlacement {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final StickyItemsPlacement StickToTopPlacement = new StickyItemsPlacement() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                int size = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        lazyLayoutMeasuredItem = null;
                        break;
                    }
                    lazyLayoutMeasuredItem = list.get(i9);
                    if (lazyLayoutMeasuredItem.getIndex() != i2) {
                        break;
                    }
                    i9++;
                }
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
                int iMainAxisOffset = lazyLayoutMeasuredItem2 != null ? LazyLayoutStickyItemsKt.mainAxisOffset(lazyLayoutMeasuredItem2, z) : Integer.MIN_VALUE;
                int iMax = -i5;
                if (i4 != Integer.MIN_VALUE) {
                    iMax = Math.max(iMax, i4);
                }
                return iMainAxisOffset != Integer.MIN_VALUE ? Math.min(iMax, iMainAxisOffset - i3) : iMax;
            }

            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public IntList getStickingIndices(int i2, int i3, IntList intList) {
                int i4;
                int i5;
                if (i3 - i2 < 0 || (i4 = intList._size) == 0) {
                    return IntListKt.emptyIntList();
                }
                j jVarU = n.u(0, i4);
                int iA = jVarU.a();
                int iB = jVarU.b();
                if (iA <= iB) {
                    i5 = -1;
                    while (intList.get(iA) <= i2) {
                        i5 = intList.get(iA);
                        if (iA == iB) {
                            break;
                        }
                        iA++;
                    }
                } else {
                    i5 = -1;
                }
                return i5 == -1 ? IntListKt.emptyIntList() : IntListKt.intListOf(i5);
            }
        };

        private Companion() {
        }

        public final StickyItemsPlacement getStickToTopPlacement() {
            return StickToTopPlacement;
        }
    }

    int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    IntList getStickingIndices(int i2, int i3, IntList intList);
}
