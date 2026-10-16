package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ a<Float> $sheetOffset;
    final /* synthetic */ SheetState $sheetState;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(SheetState sheetState, a<Float> aVar) {
        this.$sheetState = sheetState;
        this.$sheetOffset = aVar;
    }

    static final ab measure_3p2s80s$lambda$5(List list, int i2, List list2, SheetState sheetState, a aVar, int i3, List list3, List list4, int i4, Placeable.PlacementScope placementScope) {
        Integer numValueOf;
        Integer numValueOf2;
        int iB;
        Integer numValueOf3 = null;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((Placeable) list.get(0)).getWidth());
            int iE = i.e(list);
            if (iE > 0) {
                int i5 = 1;
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((Placeable) list.get(i5)).getWidth());
                    if (numValueOf4.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf4;
                    }
                    if (i5 == iE) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Integer num = numValueOf;
        int iMax = Math.max(0, (i2 - (num != null ? num.intValue() : 0)) / 2);
        if (list2.isEmpty()) {
            numValueOf2 = null;
        } else {
            numValueOf2 = Integer.valueOf(((Placeable) list2.get(0)).getWidth());
            int iE2 = i.e(list2);
            if (iE2 > 0) {
                int i6 = 1;
                while (true) {
                    Integer numValueOf5 = Integer.valueOf(((Placeable) list2.get(i6)).getWidth());
                    if (numValueOf5.compareTo(numValueOf2) > 0) {
                        numValueOf2 = numValueOf5;
                    }
                    if (i6 == iE2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Integer num2 = numValueOf2;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        if (!list2.isEmpty()) {
            numValueOf3 = Integer.valueOf(((Placeable) list2.get(0)).getHeight());
            int iE3 = i.e(list2);
            if (iE3 > 0) {
                int i7 = 1;
                while (true) {
                    Integer numValueOf6 = Integer.valueOf(((Placeable) list2.get(i7)).getHeight());
                    if (numValueOf6.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf6;
                    }
                    if (i7 == iE3) {
                        break;
                    }
                    i7++;
                }
            }
        }
        Integer num3 = numValueOf3;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        int i8 = (i2 - iIntValue) / 2;
        SheetValue currentValue = sheetState.getCurrentValue();
        SheetValue sheetValue = SheetValue.Hidden;
        int iOrdinal = currentValue.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            iB = i3 - iIntValue2;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            iB = h.h.a.b(((Number) aVar.invoke()).floatValue()) - iIntValue2;
        }
        int size = list3.size();
        for (int i9 = 0; i9 < size; i9++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list3.get(i9), 0, i4, 0.0f, 4, null);
        }
        int size2 = list4.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list4.get(i10), 0, 0, 0.0f, 4, null);
        }
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i11), iMax, 0, 0.0f, 4, null);
        }
        int size4 = list2.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list2.get(i12), i8, iB, 0.0f, 4, null);
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
        List<? extends Measurable> list2 = list.get(0);
        int i2 = 1;
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        ArrayList arrayList = new ArrayList(list4.size());
        int size = list4.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(list4.get(i3).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList3.add(list2.get(i4).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((Placeable) arrayList4.get(0)).getHeight());
            int iE = i.e(arrayList4);
            if (iE > 0) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList4.get(i2)).getHeight());
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iE) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Integer num = numValueOf;
        int iIntValue = num != null ? num.intValue() : 0;
        final int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        long jM11097copyZbe2FdA$default2 = Constraints.m11097copyZbe2FdA$default(jM11097copyZbe2FdA$default, 0, 0, 0, iM11106getMaxHeightimpl - iIntValue, 7, null);
        ArrayList arrayList5 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            arrayList5.add(list3.get(i5).mo9741measureBRTryo0(jM11097copyZbe2FdA$default2));
        }
        final ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(list5.size());
        int size4 = list5.size();
        for (int i6 = 0; i6 < size4; i6++) {
            arrayList7.add(list5.get(i6).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        final ArrayList arrayList8 = arrayList7;
        final SheetState sheetState = this.$sheetState;
        final a<Float> aVar = this.$sheetOffset;
        final int i7 = iIntValue;
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, null, new l() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.measure_3p2s80s$lambda$5(arrayList2, iM11107getMaxWidthimpl, arrayList8, sheetState, aVar, iM11106getMaxHeightimpl, arrayList6, arrayList4, i7, (Placeable.PlacementScope) obj);
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
