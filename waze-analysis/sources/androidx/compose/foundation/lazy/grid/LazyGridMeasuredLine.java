package androidx.compose.foundation.lazy.grid;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final LazyGridSlots slots;
    private final List<GridItemSpan> spans;

    public LazyGridMeasuredLine(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List<GridItemSpan> list, boolean z, int i3) {
        this.index = i2;
        this.items = lazyGridMeasuredItemArr;
        this.slots = lazyGridSlots;
        this.spans = list;
        this.isVertical = z;
        this.mainAxisSpacing = i3;
        int iMax = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            iMax = Math.max(iMax, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        int i4 = iMax + this.mainAxisSpacing;
        this.mainAxisSizeWithSpacings = i4 >= 0 ? i4 : 0;
    }

    public final int getIndex() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    public final LazyGridMeasuredItem[] position(int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i9];
            int i12 = i10 + 1;
            int iM2899getCurrentLineSpanimpl = GridItemSpan.m2899getCurrentLineSpanimpl(this.spans.get(i10).m2902unboximpl());
            int i13 = this.slots.getPositions()[i11];
            boolean z = this.isVertical;
            int i14 = z ? this.index : i11;
            if (z) {
                i5 = i11;
                i8 = i2;
                i6 = i3;
                i7 = i4;
            } else {
                i5 = this.index;
                i6 = i3;
                i7 = i4;
                i8 = i2;
            }
            lazyGridMeasuredItem.position(i8, i13, i6, i7, i14, i5);
            i11 += iM2899getCurrentLineSpanimpl;
            i9++;
            i10 = i12;
        }
        return this.items;
    }
}
