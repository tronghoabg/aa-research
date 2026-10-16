package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LazyStaggeredGridMeasureProvider extends LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {
    public static final int $stable = 8;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridSlots resolvedSlots;

    public LazyStaggeredGridMeasureProvider(boolean z, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.isVertical = z;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.resolvedSlots = lazyStaggeredGridSlots;
    }

    /* renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m3005childConstraintsJhjzzOo(int i2, int i3) {
        int i4;
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.resolvedSlots;
        if (i3 == 1) {
            i4 = lazyStaggeredGridSlots.getSizes()[i2];
        } else {
            int i5 = lazyStaggeredGridSlots.getPositions()[i2];
            int i6 = (i2 + i3) - 1;
            i4 = (this.resolvedSlots.getPositions()[i6] + this.resolvedSlots.getSizes()[i6]) - i5;
        }
        return this.isVertical ? Constraints.Companion.m11119fixedWidthOenEA2s(i4) : Constraints.Companion.m11118fixedHeightOenEA2s(i4);
    }

    /* renamed from: createItem-pitSLOA */
    public abstract LazyStaggeredGridMeasuredItem mo2999createItempitSLOA(int i2, int i3, int i4, Object obj, Object obj2, List<? extends Placeable> list, long j2);

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc */
    public LazyStaggeredGridMeasuredItem mo2890getAndMeasurehBUhpc(int i2, int i3, int i4, long j2) {
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.measureScope;
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = this.itemProvider;
        return mo2999createItempitSLOA(i2, i3, i4, lazyStaggeredGridItemProvider.getKey(i2), lazyStaggeredGridItemProvider.getContentType(i2), m2953getPlaceables3p2s80s(lazyLayoutMeasureScope, i2, j2), j2);
    }

    /* renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m3006getAndMeasurejy6DScQ(int i2, long j2) {
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = this.itemProvider;
        Object key = lazyStaggeredGridItemProvider.getKey(i2);
        Object contentType = lazyStaggeredGridItemProvider.getContentType(i2);
        int length = this.resolvedSlots.getSizes().length;
        int i3 = length - 1;
        int i4 = (int) (j2 >> 32);
        int i5 = i4 <= i3 ? i4 : i3;
        int i6 = length - i5;
        int i7 = ((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - i4;
        int i8 = i7 <= i6 ? i7 : i6;
        long jM3005childConstraintsJhjzzOo = m3005childConstraintsJhjzzOo(i5, i8);
        return mo2999createItempitSLOA(i2, i5, i8, key, contentType, m2953getPlaceables3p2s80s(this.measureScope, i2, jM3005childConstraintsJhjzzOo), jM3005childConstraintsJhjzzOo);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
