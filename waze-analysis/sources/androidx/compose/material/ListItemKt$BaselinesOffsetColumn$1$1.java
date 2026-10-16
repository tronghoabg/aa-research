package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ListItemKt$BaselinesOffsetColumn$1$1 implements MeasurePolicy {
    final /* synthetic */ List<Dp> $offsets;

    ListItemKt$BaselinesOffsetColumn$1$1(List<Dp> list) {
        this.$offsets = list;
    }

    static final ab measure_3p2s80s$lambda$3(List list, int[] iArr, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i2), 0, iArr[i2], 0.0f, 4, null);
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
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        int height;
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, Integer.MAX_VALUE, 3, null);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list.get(i2).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        int iValueOf = 0;
        ArrayList arrayList3 = arrayList2;
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), ((Placeable) arrayList2.get(i3)).getWidth()));
        }
        int iIntValue = iValueOf.intValue();
        final int[] iArr = new int[arrayList2.size()];
        List<Dp> list2 = this.$offsets;
        int size3 = arrayList3.size();
        int height2 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            Placeable placeable = (Placeable) arrayList2.get(i4);
            if (i4 > 0) {
                int i5 = i4 - 1;
                height = ((Placeable) arrayList2.get(i5)).getHeight() - ((Placeable) arrayList2.get(i5)).get(AlignmentLineKt.getLastBaseline());
            } else {
                height = 0;
            }
            int iMax = Math.max(0, (measureScope.mo2121roundToPx0680j_4(list2.get(i4).m11178unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - height);
            iArr[i4] = iMax + height2;
            height2 += iMax + placeable.getHeight();
        }
        return MeasureScope.CC.layout$default(measureScope, iIntValue, height2, null, new l() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ListItemKt$BaselinesOffsetColumn$1$1.measure_3p2s80s$lambda$3(arrayList2, iArr, (Placeable.PlacementScope) obj);
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
