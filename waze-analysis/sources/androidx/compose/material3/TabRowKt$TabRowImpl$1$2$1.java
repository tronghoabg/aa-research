package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.b.a;
import h.g.a.l;
import h.g.b.ao;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TabRowKt$TabRowImpl$1$2$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ TabRowKt$TabRowImpl$1$scope$1$1 $scope;

    TabRowKt$TabRowImpl$1$2$1(TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1) {
        this.$scope = tabRowKt$TabRowImpl$1$scope$1$1;
    }

    static final ab measure_3p2s80s$lambda$5(List list, List list2, List list3, ao aoVar, int i2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i3), i3 * aoVar.f48103a, 0, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable = (Placeable) list2.get(i4);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i2 - placeable.getHeight(), 0.0f, 4, null);
        }
        int size3 = list3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Placeable placeable2 = (Placeable) list3.get(i5);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i2 - placeable2.getHeight(), 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo2625measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        int size = list2.size();
        final ao aoVar = new ao();
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        if (size > 0) {
            aoVar.f48103a = iM11107getMaxWidthimpl / size;
        }
        int iValueOf = 0;
        List<? extends Measurable> list5 = list2;
        int size2 = list5.size();
        for (int i2 = 0; i2 < size2; i2++) {
            iValueOf = Integer.valueOf(Math.max(list2.get(i2).maxIntrinsicHeight(aoVar.f48103a), iValueOf.intValue()));
        }
        final int iIntValue = iValueOf.intValue();
        TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = this.$scope;
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        while (i3 < size) {
            float f2 = measureScope2.mo2124toDpu2uoSUM(Math.min(list2.get(i3).maxIntrinsicWidth(iIntValue), aoVar.f48103a));
            float horizontalTextPadding = TabKt.getHorizontalTextPadding();
            arrayList.add(new TabPosition(measureScope2.mo2124toDpu2uoSUM(aoVar.f48103a) * i3, measureScope2.mo2124toDpu2uoSUM(aoVar.f48103a), ((Dp) a.h(Dp.m11162boximpl(f2 - (horizontalTextPadding + horizontalTextPadding)), Dp.m11162boximpl(24.0f))).m11178unboximpl(), null));
            i3++;
            measureScope2 = measureScope;
        }
        tabRowKt$TabRowImpl$1$scope$1$1.setTabPositions(arrayList);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size3 = list5.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Measurable measurable = list2.get(i4);
            int i5 = aoVar.f48103a;
            arrayList2.add(measurable.mo9741measureBRTryo0(Constraints.m11096copyZbe2FdA(j2, i5, i5, iIntValue, iIntValue)));
        }
        final ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(list3.size());
        int size4 = list3.size();
        for (int i6 = 0; i6 < size4; i6++) {
            arrayList4.add(list3.get(i6).mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null)));
        }
        final ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(list4.size());
        int size5 = list4.size();
        int i7 = 0;
        while (i7 < size5) {
            Measurable measurable2 = list4.get(i7);
            int i8 = aoVar.f48103a;
            arrayList6.add(measurable2.mo9741measureBRTryo0(Constraints.m11096copyZbe2FdA(j2, i8, i8, 0, iIntValue)));
            i7++;
            arrayList6 = arrayList6;
            list4 = list4;
        }
        final ArrayList arrayList7 = arrayList6;
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iIntValue, null, new l() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TabRowKt$TabRowImpl$1$2$1.measure_3p2s80s$lambda$5(arrayList3, arrayList5, arrayList7, aoVar, iIntValue, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
