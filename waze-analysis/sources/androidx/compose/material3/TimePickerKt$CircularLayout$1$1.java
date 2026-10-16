package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.l;
import h.h.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TimePickerKt$CircularLayout$1$1 implements MeasurePolicy {
    final /* synthetic */ float $radiusToSizeRatio;

    TimePickerKt$CircularLayout$1$1(float f2) {
        this.$radiusToSizeRatio = f2;
    }

    static final ab measure_3p2s80s$lambda$4(Placeable placeable, List list, Placeable placeable2, long j2, float f2, float f3, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable3 = (Placeable) list.get(i2);
            int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
            int width = placeable3.getWidth() / 2;
            int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
            int height = placeable3.getHeight() / 2;
            double d2 = f2;
            double d3 = (i2 * f3) - 1.5707963267948966d;
            Placeable.PlacementScope.place$default(placementScope, placeable3, a.a((Math.cos(d3) * d2) + ((iM11107getMaxWidthimpl >> 1) - width)), a.a((d2 * Math.sin(d3)) + ((iM11106getMaxHeightimpl >> 1) - height)), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, (Constraints.m11109getMinWidthimpl(j2) - placeable2.getWidth()) / 2, (Constraints.m11108getMinHeightimpl(j2) - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        return ab.f48028a;
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
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, final long j2) {
        Measurable measurable;
        Measurable measurable2;
        int i2 = 0;
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        ArrayList arrayList = new ArrayList(list.size());
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Measurable measurable3 = list.get(i3);
            Measurable measurable4 = measurable3;
            if (LayoutIdKt.getLayoutId(measurable4) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable4) != LayoutId.InnerCircle) {
                arrayList.add(measurable3);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList3.add(((Measurable) arrayList2.get(i4)).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList4 = arrayList3;
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                measurable = null;
                break;
            }
            measurable = list.get(i5);
            if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                break;
            }
            i5++;
        }
        Measurable measurable5 = measurable;
        int size4 = list2.size();
        while (true) {
            if (i2 >= size4) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i2);
            if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                break;
            }
            i2++;
        }
        Measurable measurable6 = measurable2;
        float size5 = arrayList4.size();
        final Placeable placeableMo9741measureBRTryo0 = measurable5 != null ? measurable5.mo9741measureBRTryo0(jM11097copyZbe2FdA$default) : null;
        final Placeable placeableMo9741measureBRTryo02 = measurable6 != null ? measurable6.mo9741measureBRTryo0(jM11097copyZbe2FdA$default) : null;
        final float f2 = 6.2831855f / size5;
        final float fM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2) * this.$radiusToSizeRatio;
        return MeasureScope.CC.layout$default(measureScope, Constraints.m11109getMinWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2), null, new l() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TimePickerKt$CircularLayout$1$1.measure_3p2s80s$lambda$4(placeableMo9741measureBRTryo0, arrayList4, placeableMo9741measureBRTryo02, j2, fM11106getMaxHeightimpl, f2, (Placeable.PlacementScope) obj);
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
