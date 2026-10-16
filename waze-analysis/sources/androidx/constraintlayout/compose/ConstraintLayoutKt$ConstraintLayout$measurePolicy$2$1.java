package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.l;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1 implements MeasurePolicy {
    final /* synthetic */ ConstraintSet $constraintSet;
    final /* synthetic */ MutableState<ab> $contentTracker;
    final /* synthetic */ Measurer2 $measurer;
    final /* synthetic */ int $optimizationLevel;

    public ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(MutableState<ab> mutableState, Measurer2 measurer2, ConstraintSet constraintSet, int i2) {
        this.$contentTracker = mutableState;
        this.$measurer = measurer2;
        this.$constraintSet = constraintSet;
        this.$optimizationLevel = i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j2) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.$contentTracker.getValue();
        int i2 = this.$optimizationLevel;
        long jM11569performMeasureDjhGOtQ = this.$measurer.m11569performMeasureDjhGOtQ(j2, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap, i2);
        int iM11339getWidthimpl = IntSize.m11339getWidthimpl(jM11569performMeasureDjhGOtQ);
        int iM11338getHeightimpl = IntSize.m11338getHeightimpl(jM11569performMeasureDjhGOtQ);
        final Measurer2 measurer2 = this.$measurer;
        return MeasureScope.CC.layout$default(measureScope, iM11339getWidthimpl, iM11338getHeightimpl, null, new l<Placeable.PlacementScope, ab>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                measurer2.performLayout(placementScope, list, linkedHashMap);
            }

            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return ab.f48028a;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
