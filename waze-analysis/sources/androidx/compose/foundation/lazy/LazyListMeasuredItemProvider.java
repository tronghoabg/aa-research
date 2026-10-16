package androidx.compose.foundation.lazy;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class LazyListMeasuredItemProvider extends LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {
    public static final int $stable = 8;
    private final long childConstraints;
    private final LazyListItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;

    private LazyListMeasuredItemProvider(long j2, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.itemProvider = lazyListItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z ? Constraints.m11107getMaxWidthimpl(j2) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : Constraints.m11106getMaxHeightimpl(j2), 5, null);
    }

    /* renamed from: getAndMeasure-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ LazyListMeasuredItem m2889getAndMeasure0kLqBqw$default(LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, long j2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i3 & 2) != 0) {
            j2 = lazyListMeasuredItemProvider.childConstraints;
        }
        return lazyListMeasuredItemProvider.m2891getAndMeasure0kLqBqw(i2, j2);
    }

    /* renamed from: createItem-X9ElhV4 */
    public abstract LazyListMeasuredItem mo2878createItemX9ElhV4(int i2, Object obj, Object obj2, List<? extends Placeable> list, long j2);

    /* renamed from: getAndMeasure-0kLqBqw, reason: not valid java name */
    public final LazyListMeasuredItem m2891getAndMeasure0kLqBqw(int i2, long j2) {
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.measureScope;
        LazyListItemProvider lazyListItemProvider = this.itemProvider;
        return mo2878createItemX9ElhV4(i2, lazyListItemProvider.getKey(i2), lazyListItemProvider.getContentType(i2), m2953getPlaceables3p2s80s(lazyLayoutMeasureScope, i2, j2), j2);
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m2892getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    public final IntList getHeaderIndexes() {
        return this.itemProvider.getHeaderIndexes();
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    public final void keepAround(int i2) {
        if (i2 < 0 || i2 >= this.itemProvider.getItemCount()) {
            return;
        }
        this.measureScope.compose(i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc, reason: not valid java name */
    public LazyListMeasuredItem mo2890getAndMeasurehBUhpc(int i2, int i3, int i4, long j2) {
        return m2891getAndMeasure0kLqBqw(i2, j2);
    }

    public /* synthetic */ LazyListMeasuredItemProvider(long j2, boolean z, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, o oVar) {
        this(j2, z, lazyListItemProvider, lazyLayoutMeasureScope);
    }
}
