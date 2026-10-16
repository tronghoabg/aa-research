package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SnackbarKt$TextOnlySnackbar$2$1 implements MeasurePolicy {
    public static final SnackbarKt$TextOnlySnackbar$2$1 INSTANCE = new SnackbarKt$TextOnlySnackbar$2$1();

    SnackbarKt$TextOnlySnackbar$2$1() {
    }

    static final ab measure_3p2s80s$lambda$1(ArrayList arrayList, int i2, Placeable.PlacementScope placementScope) {
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) arrayList2.get(i3);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
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
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int i2 = Integer.MIN_VALUE;
        int iMax = 0;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeableMo9741measureBRTryo0 = list.get(i5).mo9741measureBRTryo0(j2);
            arrayList.add(placeableMo9741measureBRTryo0);
            if (placeableMo9741measureBRTryo0.get(AlignmentLineKt.getFirstBaseline()) != Integer.MIN_VALUE && (i3 == Integer.MIN_VALUE || placeableMo9741measureBRTryo0.get(AlignmentLineKt.getFirstBaseline()) < i3)) {
                i3 = placeableMo9741measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
            }
            if (placeableMo9741measureBRTryo0.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE && (i4 == Integer.MIN_VALUE || placeableMo9741measureBRTryo0.get(AlignmentLineKt.getLastBaseline()) > i4)) {
                i4 = placeableMo9741measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
            }
            iMax = Math.max(iMax, placeableMo9741measureBRTryo0.getHeight());
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i4 != Integer.MIN_VALUE) {
                z = true;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            i2 = i3;
        }
        final int iMax2 = Math.max(measureScope.mo2121roundToPx0680j_4((i2 == i4 || !z) ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), iMax);
        return MeasureScope.CC.layout$default(measureScope, Constraints.m11107getMaxWidthimpl(j2), iMax2, null, new l() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnackbarKt$TextOnlySnackbar$2$1.measure_3p2s80s$lambda$1(arrayList, iMax2, (Placeable.PlacementScope) obj);
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
