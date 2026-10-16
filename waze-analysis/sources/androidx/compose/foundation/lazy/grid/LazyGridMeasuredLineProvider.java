package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 8;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyGridMeasuredItemProvider measuredItemProvider;
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridMeasuredLineProvider(boolean z, LazyGridSlots lazyGridSlots, int i2, int i3, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i2;
        this.spaceBetweenLines = i3;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation, reason: not valid java name */
    public final long m2919childConstraintsJhjzzOo$foundation(int i2, int i3) {
        int i4;
        LazyGridSlots lazyGridSlots = this.slots;
        if (i3 == 1) {
            i4 = lazyGridSlots.getSizes()[i2];
        } else {
            int i5 = (i3 + i2) - 1;
            i4 = (lazyGridSlots.getPositions()[i5] + this.slots.getSizes()[i5]) - this.slots.getPositions()[i2];
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return this.isVertical ? Constraints.Companion.m11119fixedWidthOenEA2s(i4) : Constraints.Companion.m11118fixedHeightOenEA2s(i4);
    }

    public abstract LazyGridMeasuredLine createLine(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i3);

    public final LazyGridMeasuredLine getAndMeasure(int i2) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i2);
        int size = lineConfiguration.getSpans().size();
        int i3 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int iM2899getCurrentLineSpanimpl = GridItemSpan.m2899getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i5).m2902unboximpl());
            LazyGridMeasuredItem lazyGridMeasuredItemM2918getAndMeasurem8Kt_7k = this.measuredItemProvider.m2918getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + i5, m2919childConstraintsJhjzzOo$foundation(i4, iM2899getCurrentLineSpanimpl), i4, iM2899getCurrentLineSpanimpl, i3);
            i4 += iM2899getCurrentLineSpanimpl;
            lazyGridMeasuredItemArr[i5] = lazyGridMeasuredItemM2918getAndMeasurem8Kt_7k;
        }
        return createLine(i2, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i3);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }

    public final LazyGridMeasuredLine keepAround(int i2) {
        return getAndMeasure(i2);
    }

    public final int spanOf(int i2) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return lazyGridSpanLayoutProvider.spanOf(i2, lazyGridSpanLayoutProvider.getSlotsPerLine());
    }
}
