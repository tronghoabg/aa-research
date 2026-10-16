package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.ao;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AlertDialogKt$AlertDialogFlowRow$1$1 implements MeasurePolicy {
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ float $mainAxisSpacing;

    AlertDialogKt$AlertDialogFlowRow$1$1(float f2, float f3) {
        this.$mainAxisSpacing = f2;
        this.$crossAxisSpacing = f3;
    }

    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, ao aoVar, MeasureScope measureScope, float f2, long j2, Placeable placeable) {
        return list.isEmpty() || (aoVar.f48103a + measureScope.mo2121roundToPx0680j_4(f2)) + placeable.getWidth() <= Constraints.m11107getMaxWidthimpl(j2);
    }

    static final ab measure_3p2s80s$lambda$1(List list, MeasureScope measureScope, float f2, int i2, List list2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list3 = (List) list.get(i3);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i4 = 0;
            while (i4 < size2) {
                iArr[i4] = ((Placeable) list3.get(i4)).getWidth() + (i4 < i.e(list3) ? measureScope.mo2121roundToPx0680j_4(f2) : 0);
                i4++;
            }
            int[] iArr2 = new int[size2];
            Arrangement.INSTANCE.getBottom().arrange(measureScope, i2, iArr, iArr2);
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Placeable.PlacementScope.place$default(placementScope, (Placeable) list3.get(i5), iArr2[i5], ((Number) list2.get(i3)).intValue(), 0.0f, 4, null);
            }
        }
        return ab.f48028a;
    }

    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, ao aoVar, MeasureScope measureScope, float f2, List<Placeable> list2, List<Integer> list3, ao aoVar2, List<Integer> list4, ao aoVar3, ao aoVar4) {
        if (!list.isEmpty()) {
            aoVar.f48103a += measureScope.mo2121roundToPx0680j_4(f2);
        }
        list.add(0, i.ao(list2));
        list3.add(Integer.valueOf(aoVar2.f48103a));
        list4.add(Integer.valueOf(aoVar.f48103a));
        aoVar.f48103a += aoVar2.f48103a;
        aoVar3.f48103a = Math.max(aoVar3.f48103a, aoVar4.f48103a);
        list2.clear();
        aoVar4.f48103a = 0;
        aoVar2.f48103a = 0;
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
    public final MeasureResult mo1704measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ao aoVar = new ao();
        ao aoVar2 = new ao();
        ArrayList arrayList4 = new ArrayList();
        ao aoVar3 = new ao();
        ao aoVar4 = new ao();
        int i2 = 0;
        long jConstraints$default = ConstraintsKt.Constraints$default(0, Constraints.m11107getMaxWidthimpl(j2), 0, 0, 13, null);
        int size = list.size();
        while (i2 < size) {
            float f2 = this.$mainAxisSpacing;
            Placeable placeableMo9741measureBRTryo0 = list.get(i2).mo9741measureBRTryo0(jConstraints$default);
            int i3 = i2;
            ao aoVar5 = aoVar3;
            ArrayList arrayList5 = arrayList4;
            long j3 = jConstraints$default;
            if (!measure_3p2s80s$canAddToCurrentSequence(arrayList5, aoVar5, measureScope, f2, j2, placeableMo9741measureBRTryo0)) {
                measure_3p2s80s$startNewSequence(arrayList, aoVar2, measureScope, this.$crossAxisSpacing, arrayList5, arrayList2, aoVar4, arrayList3, aoVar, aoVar5);
                arrayList5 = arrayList5;
            }
            if (!arrayList5.isEmpty()) {
                aoVar5.f48103a += measureScope.mo2121roundToPx0680j_4(f2);
            }
            arrayList5.add(placeableMo9741measureBRTryo0);
            aoVar5.f48103a += placeableMo9741measureBRTryo0.getWidth();
            aoVar4.f48103a = Math.max(aoVar4.f48103a, placeableMo9741measureBRTryo0.getHeight());
            arrayList4 = arrayList5;
            aoVar3 = aoVar5;
            i2 = i3 + 1;
            jConstraints$default = j3;
        }
        ao aoVar6 = aoVar3;
        ArrayList arrayList6 = arrayList4;
        if (!arrayList6.isEmpty()) {
            measure_3p2s80s$startNewSequence(arrayList, aoVar2, measureScope, this.$crossAxisSpacing, arrayList6, arrayList2, aoVar4, arrayList3, aoVar, aoVar6);
        }
        final int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2) != Integer.MAX_VALUE ? Constraints.m11107getMaxWidthimpl(j2) : Math.max(aoVar.f48103a, Constraints.m11109getMinWidthimpl(j2));
        int iMax = Math.max(aoVar2.f48103a, Constraints.m11108getMinHeightimpl(j2));
        final float f3 = this.$mainAxisSpacing;
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iMax, null, new l() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AlertDialogKt$AlertDialogFlowRow$1$1.measure_3p2s80s$lambda$1(arrayList, measureScope, f3, iM11107getMaxWidthimpl, arrayList3, (Placeable.PlacementScope) obj);
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
