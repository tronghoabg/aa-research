package androidx.compose.foundation.lazy.layout;

import h.a.ac;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutMeasuredItemKt {
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return x.a(((LazyLayoutMeasuredItem) obj).getIndex(), ((LazyLayoutMeasuredItem) obj2).getIndex());
        }
    };

    public static final Object getParentData(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2) {
        return lazyLayoutMeasuredItem.getPlaceables().get(i2).getParentData();
    }

    public static final int getPlaceablesCount(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        return lazyLayoutMeasuredItem.getPlaceables().size();
    }

    public static final int mainAxisSizeWithSpacings(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z) {
        int horizontalAxisSize;
        int horizontalAxisSpacing;
        if (z) {
            horizontalAxisSize = lazyLayoutMeasuredItem.getVerticalAxisSize();
            horizontalAxisSpacing = lazyLayoutMeasuredItem.getVerticalAxisSpacing();
        } else {
            horizontalAxisSize = lazyLayoutMeasuredItem.getHorizontalAxisSize();
            horizontalAxisSpacing = lazyLayoutMeasuredItem.getHorizontalAxisSpacing();
        }
        return horizontalAxisSize + horizontalAxisSpacing;
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i2, int i3, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return ac.f47967a;
        }
        List<? extends T> list3 = list2;
        x.f(list3, "<this>");
        ArrayList arrayList = new ArrayList(list3);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t = list.get(i4);
            int index = t.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList.add(t);
            }
        }
        i.t(arrayList, LazyLayoutMeasuredItemIndexComparator);
        return arrayList;
    }
}
