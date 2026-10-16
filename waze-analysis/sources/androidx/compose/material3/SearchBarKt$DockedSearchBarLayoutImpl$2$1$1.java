package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.MathHelpersKt;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$DockedSearchBarLayoutImpl$2$1$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ SearchBarState $state;

    SearchBarKt$DockedSearchBarLayoutImpl$2$1$1(SearchBarState searchBarState, float f2, float f3) {
        this.$state = searchBarState;
        this.$maxHeight = f2;
        this.$minHeight = f3;
    }

    static final ab measure_3p2s80s$lambda$6(List list, List list2, int i2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(i3), 0, 0, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list2.get(i4), 0, i2, 0.0f, 4, null);
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
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        int iLerp = MathHelpersKt.lerp(SearchBarKt.getCollapsedBounds(this.$state).getHeight(), measureScope.mo2121roundToPx0680j_4(this.$maxHeight), n.e(this.$state.getAnimatable$material3().getValue().floatValue(), 0.0f));
        LayoutCoordinates collapsedCoords = this.$state.getCollapsedCoords();
        long jM11122constrainN9IONVI = ConstraintsKt.m11122constrainN9IONVI(j2, ConstraintsKt.Constraints$default(0, collapsedCoords != null ? (int) (collapsedCoords.mo9743getSizeYbymL2g() >> 32) : Constraints.m11107getMaxWidthimpl(j2), n.i(measureScope.mo2121roundToPx0680j_4(this.$minHeight), iLerp), iLerp, 1, null));
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(jM11122constrainN9IONVI, 0, 0, 0, 0, 10, null);
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list2.get(i2).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        Integer numValueOf4 = null;
        if (arrayList2.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
            int iE = i.e(arrayList2);
            if (iE > 0) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf5 = Integer.valueOf(((Placeable) arrayList2.get(i3)).getWidth());
                    if (numValueOf5.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf5;
                    }
                    if (i3 == iE) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Integer num = numValueOf;
        int iIntValue = num != null ? num.intValue() : 0;
        if (arrayList2.isEmpty()) {
            numValueOf2 = null;
        } else {
            numValueOf2 = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
            int iE2 = i.e(arrayList2);
            if (iE2 > 0) {
                int i4 = 1;
                while (true) {
                    Integer numValueOf6 = Integer.valueOf(((Placeable) arrayList2.get(i4)).getHeight());
                    if (numValueOf6.compareTo(numValueOf2) > 0) {
                        numValueOf2 = numValueOf6;
                    }
                    if (i4 == iE2) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Integer num2 = numValueOf2;
        final int iIntValue2 = num2 != null ? num2.intValue() : 0;
        long jM11097copyZbe2FdA$default2 = Constraints.m11097copyZbe2FdA$default(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, 0, -iIntValue2, 1, null), 0, iIntValue, 0, 0, 13, null);
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList3.add(list3.get(i5).mo9741measureBRTryo0(jM11097copyZbe2FdA$default2));
        }
        final ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            numValueOf3 = null;
        } else {
            numValueOf3 = Integer.valueOf(((Placeable) arrayList4.get(0)).getHeight());
            int iE3 = i.e(arrayList4);
            if (iE3 > 0) {
                int i6 = 1;
                while (true) {
                    Integer numValueOf7 = Integer.valueOf(((Placeable) arrayList4.get(i6)).getHeight());
                    if (numValueOf7.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf7;
                    }
                    if (i6 == iE3) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Integer num3 = numValueOf3;
        int iIntValue3 = (num3 != null ? num3.intValue() : 0) + iIntValue2;
        if (!arrayList4.isEmpty()) {
            numValueOf4 = Integer.valueOf(((Placeable) arrayList4.get(0)).getWidth());
            int iE4 = i.e(arrayList4);
            if (iE4 > 0) {
                int i7 = 1;
                while (true) {
                    Integer numValueOf8 = Integer.valueOf(((Placeable) arrayList4.get(i7)).getWidth());
                    if (numValueOf8.compareTo(numValueOf4) > 0) {
                        numValueOf4 = numValueOf8;
                    }
                    if (i7 == iE4) {
                        break;
                    }
                    i7++;
                }
            }
        }
        Integer num4 = numValueOf4;
        return MeasureScope.CC.layout$default(measureScope, ConstraintsKt.m11124constrainWidthK40F9xA(jM11122constrainN9IONVI, Math.max(iIntValue, num4 != null ? num4.intValue() : 0)), ConstraintsKt.m11123constrainHeightK40F9xA(jM11122constrainN9IONVI, iIntValue3), null, new l() { // from class: androidx.compose.material3.SearchBarKt$DockedSearchBarLayoutImpl$2$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SearchBarKt$DockedSearchBarLayoutImpl$2$1$1.measure_3p2s80s$lambda$6(arrayList2, arrayList4, iIntValue2, (Placeable.PlacementScope) obj);
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
