package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.ab;
import h.g.a.l;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    static final ab measure_3p2s80s$lambda$4(List list, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i2 = 0;
        int width = 0;
        while (i2 < size) {
            Placeable placeable = (Placeable) list.get(i2);
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, 0, 0.0f, 4, null);
            width += placeable.getWidth();
            i2++;
            placementScope = placementScope2;
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
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        final ArrayList arrayList;
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        int size = list.size();
        if (size <= 0) {
            return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, null, new l() { // from class: androidx.compose.material3.EqualWeightContentMeasurePolicy$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        int i2 = 0;
        if (Constraints.m11103getHasBoundedWidthimpl(j2)) {
            int i3 = iM11107getMaxWidthimpl / size;
            List<? extends Measurable> list2 = list;
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                int iMaxIntrinsicHeight = list.get(i4).maxIntrinsicHeight(i3);
                if (iM11108getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM11108getMinHeightimpl = n.i(iMaxIntrinsicHeight, Constraints.m11106getMaxHeightimpl(j2));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list2.size();
            while (i2 < size3) {
                arrayList2.add(list.get(i2).mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(j2, Constraints.Companion.m11117fixedJhjzzOo(i3, iM11108getMinHeightimpl))));
                i2++;
            }
            arrayList = arrayList2;
        } else {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                arrayList3.add(list.get(i2).mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(j2, Constraints.Companion.m11118fixedHeightOenEA2s(iM11108getMinHeightimpl))));
                i2++;
            }
            arrayList = arrayList3;
        }
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, null, new l() { // from class: androidx.compose.material3.EqualWeightContentMeasurePolicy$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return EqualWeightContentMeasurePolicy.measure_3p2s80s$lambda$4(arrayList, (Placeable.PlacementScope) obj);
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
