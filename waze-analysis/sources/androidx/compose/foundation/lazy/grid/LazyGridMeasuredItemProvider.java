package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredItemProvider extends LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {
    public static final int $stable = 8;
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2) {
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i2;
    }

    /* renamed from: createItem-O3s9Psw */
    public abstract LazyGridMeasuredItem mo2912createItemO3s9Psw(int i2, Object obj, Object obj2, int i3, int i4, List<? extends Placeable> list, long j2, int i5, int i6);

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc */
    public LazyGridMeasuredItem mo2890getAndMeasurehBUhpc(int i2, int i3, int i4, long j2) {
        return m2918getAndMeasurem8Kt_7k(i2, j2, i3, i4, this.defaultMainAxisSpacing);
    }

    /* renamed from: getAndMeasure-m8Kt_7k, reason: not valid java name */
    public final LazyGridMeasuredItem m2918getAndMeasurem8Kt_7k(int i2, long j2, int i3, int i4, int i5) {
        int iM11108getMinHeightimpl;
        boolean zM11105getHasFixedWidthimpl = Constraints.m11105getHasFixedWidthimpl(j2);
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.measureScope;
        LazyGridItemProvider lazyGridItemProvider = this.itemProvider;
        Object key = lazyGridItemProvider.getKey(i2);
        Object contentType = lazyGridItemProvider.getContentType(i2);
        List<Placeable> listM2953getPlaceables3p2s80s = m2953getPlaceables3p2s80s(lazyLayoutMeasureScope, i2, j2);
        if (zM11105getHasFixedWidthimpl) {
            iM11108getMinHeightimpl = Constraints.m11109getMinWidthimpl(j2);
        } else {
            if (!Constraints.m11104getHasFixedHeightimpl(j2)) {
                InlineClassHelperKt.throwIllegalArgumentException("does not have fixed height");
            }
            iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        }
        return mo2912createItemO3s9Psw(i2, key, contentType, iM11108getMinHeightimpl, i5, listM2953getPlaceables3p2s80s, j2, i3, i4);
    }

    public final IntList getHeaderIndices() {
        return this.itemProvider.getHeaderIndexes();
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }
}
