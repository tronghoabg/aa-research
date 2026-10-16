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
import h.g.b.ao;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    static final ab measure_3p2s80s$lambda$4(ao aoVar, List list, Placeable.PlacementScope placementScope) {
        int i2 = aoVar.f48103a;
        int size = list.size();
        int width = i2;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
            width += placeable.getWidth();
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
        int i2;
        int size = list.size();
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        if (size <= 0) {
            return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, null, new l() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        final ao aoVar = new ao();
        int i3 = 0;
        if (Constraints.m11103getHasBoundedWidthimpl(j2)) {
            int i4 = iM11107getMaxWidthimpl / size;
            int iCalculateCenteredContentHorizontalPadding = ShortNavigationBarKt.calculateCenteredContentHorizontalPadding(size, iM11107getMaxWidthimpl);
            aoVar.f48103a = iCalculateCenteredContentHorizontalPadding;
            int i5 = (iM11107getMaxWidthimpl - (iCalculateCenteredContentHorizontalPadding + iCalculateCenteredContentHorizontalPadding)) / size;
            List<? extends Measurable> list2 = list;
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                int iMaxIntrinsicHeight = list.get(i6).maxIntrinsicHeight(i5);
                if (iM11108getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM11108getMinHeightimpl = n.i(iMaxIntrinsicHeight, Constraints.m11106getMaxHeightimpl(j2));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list2.size();
            while (i3 < size3) {
                ArrayList arrayList3 = arrayList2;
                Measurable measurable = list.get(i3);
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m11108getMinHeightimpl(j2));
                if (i5 < iMaxIntrinsicWidth) {
                    i2 = n.i(iMaxIntrinsicWidth, i4);
                    aoVar.f48103a -= (i2 - i5) / 2;
                } else {
                    i2 = i5;
                }
                arrayList3.add(measurable.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(j2, Constraints.Companion.m11117fixedJhjzzOo(i2, iM11108getMinHeightimpl))));
                i3++;
            }
            arrayList = arrayList2;
        } else {
            ArrayList arrayList4 = new ArrayList(list.size());
            int size4 = list.size();
            while (i3 < size4) {
                arrayList4.add(list.get(i3).mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(j2, Constraints.Companion.m11118fixedHeightOenEA2s(iM11108getMinHeightimpl))));
                i3++;
            }
            arrayList = arrayList4;
        }
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, null, new l() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return CenteredContentMeasurePolicy.measure_3p2s80s$lambda$4(aoVar, arrayList, (Placeable.PlacementScope) obj);
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
