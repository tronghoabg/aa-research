package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GridSlotCache implements LazyGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;
    private LazyGridSlots cachedSizes;
    private final p<Density, Constraints, LazyGridSlots> calculation;

    /* JADX WARN: Multi-variable type inference failed */
    public GridSlotCache(p<? super Density, ? super Constraints, LazyGridSlots> pVar) {
        this.calculation = pVar;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public LazyGridSlots mo2903invoke0kLqBqw(Density density, long j2) {
        if (this.cachedSizes != null && Constraints.m11100equalsimpl0(this.cachedConstraints, j2) && this.cachedDensity == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.cachedSizes;
            if (lazyGridSlots == null) {
                x.g();
            }
            return lazyGridSlots;
        }
        this.cachedConstraints = j2;
        this.cachedDensity = density.getDensity();
        LazyGridSlots lazyGridSlotsInvoke = this.calculation.invoke(density, Constraints.m11094boximpl(j2));
        this.cachedSizes = lazyGridSlotsInvoke;
        return lazyGridSlotsInvoke;
    }
}
