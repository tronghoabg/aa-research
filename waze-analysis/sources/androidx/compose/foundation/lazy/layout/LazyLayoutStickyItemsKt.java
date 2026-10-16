package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.ui.unit.IntOffset;
import h.a.ac;
import h.g.a.a;
import h.g.a.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(StickyItemsPlacement stickyItemsPlacement, int i2, int i3, List<T> list, IntList intList, int i4, int i5, int i6, int i7, boolean z, l<? super Integer, ? extends T> lVar) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        boolean z2 = z;
        if (stickyItemsPlacement2 != null) {
            List<T> list2 = list;
            if (!list2.isEmpty() && intList._size != 0) {
                IntList stickingIndices = stickyItemsPlacement2.getStickingIndices(i2, i3, intList);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    T t = list.get(i8);
                    if (intList.contains(t.getIndex())) {
                        arrayList2.add(t);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                int[] iArr = stickingIndices.content;
                int i9 = stickingIndices._size;
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = iArr[i10];
                    Iterator<T> it = list.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        if (it.next().getIndex() == i11) {
                            break;
                        }
                        i12++;
                    }
                    T tInvoke = i12 == -1 ? lVar.invoke(Integer.valueOf(i11)) : list.remove(i12);
                    T t2 = tInvoke;
                    int iCalculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i11, LazyLayoutMeasuredItemKt.mainAxisSizeWithSpacings(tInvoke, z2), i12 == -1 ? Integer.MIN_VALUE : mainAxisOffset(tInvoke, z2), i4, i5, i6, i7, z2);
                    t2.makeNonScrollable();
                    t2.position(iCalculateStickingItemOffset, 0, i6, i7);
                    arrayList.add(t2);
                    i10++;
                    stickyItemsPlacement2 = stickyItemsPlacement;
                    z2 = z;
                }
                return arrayList;
            }
        }
        return ac.f47967a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        long jMo2888getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo2888getOffsetBjo55l4(0);
        return z ? IntOffset.m11297getYimpl(jMo2888getOffsetBjo55l4) : IntOffset.m11296getXimpl(jMo2888getOffsetBjo55l4);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
