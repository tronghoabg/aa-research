package androidx.compose.material;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomSheetValue.values().length];
            try {
                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(a<Float> aVar, int i2, float f2, BottomSheetState bottomSheetState) {
        this.$sheetOffset = aVar;
        this.$floatingActionButtonPosition = i2;
        this.$sheetPeekHeight = f2;
        this.$sheetState = bottomSheetState;
    }

    static final ab measure_3p2s80s$lambda$10(a aVar, int i2, MeasureScope measureScope, int i3, int i4, float f2, int i5, int i6, BottomSheetState bottomSheetState, int i7, int i8, List list, List list2, List list3, List list4, List list5, int i9, Placeable.PlacementScope placementScope) {
        int i10;
        int i11;
        int iB = h.h.a.b(((Number) aVar.invoke()).floatValue());
        if (FabPosition.m4091equalsimpl0(i2, FabPosition.Companion.m4097getStart5ygKITE())) {
            i10 = measureScope.mo2121roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
        } else {
            int i12 = i3 - i4;
            i10 = FabPosition.m4091equalsimpl0(i2, FabPosition.Companion.m4095getCenter5ygKITE()) ? i12 / 2 : i12 - measureScope.mo2121roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
        }
        int i13 = i5 / 2;
        int i14 = measureScope.mo2127toPx0680j_4(f2) < ((float) i13) ? (iB - i5) - measureScope.mo2121roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing) : iB - i13;
        int i15 = (i3 - i6) / 2;
        BottomSheetValue currentValue = bottomSheetState.getCurrentValue();
        BottomSheetValue bottomSheetValue = BottomSheetValue.Collapsed;
        int iOrdinal = currentValue.ordinal();
        if (iOrdinal == 0) {
            i11 = i14 - i7;
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            i11 = i8 - i7;
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i16), 0, i9, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list2.get(i17), 0, 0, 0.0f, 4, null);
        }
        int size3 = list3.size();
        for (int i18 = 0; i18 < size3; i18++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list3.get(i18), 0, 0, 0.0f, 4, null);
        }
        int size4 = list4.size();
        for (int i19 = 0; i19 < size4; i19++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list4.get(i19), i10, i14, 0.0f, 4, null);
        }
        int size5 = list5.size();
        for (int i20 = 0; i20 < size5; i20++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list5.get(i20), i15, i11, 0.0f, 4, null);
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
    public final MeasureResult mo2625measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        List<? extends Measurable> list6 = list.get(4);
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        ArrayList arrayList = new ArrayList(list4.size());
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(list4.get(i2).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList3.add(list2.get(i3).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList4.get(0);
            int height = ((Placeable) obj).getHeight();
            int iE = h.a.i.e(arrayList4);
            if (iE > 0) {
                int i4 = 1;
                while (true) {
                    Object obj6 = arrayList4.get(i4);
                    int height2 = ((Placeable) obj6).getHeight();
                    int i5 = height < height2 ? height2 : height;
                    if (height < height2) {
                        obj = obj6;
                    }
                    if (i4 == iE) {
                        break;
                    }
                    i4++;
                    height = i5;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        final int height3 = placeable != null ? placeable.getHeight() : 0;
        final int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        long jM11097copyZbe2FdA$default2 = Constraints.m11097copyZbe2FdA$default(jM11097copyZbe2FdA$default, 0, 0, 0, iM11106getMaxHeightimpl - height3, 7, null);
        ArrayList arrayList5 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            arrayList5.add(list3.get(i6).mo9741measureBRTryo0(jM11097copyZbe2FdA$default2));
        }
        final ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(list5.size());
        int size4 = list5.size();
        for (int i7 = 0; i7 < size4; i7++) {
            arrayList7.add(list5.get(i7).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList8 = arrayList7;
        if (arrayList8.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList8.get(0);
            int width = ((Placeable) obj2).getWidth();
            int iE2 = h.a.i.e(arrayList8);
            if (iE2 > 0) {
                int i8 = 1;
                while (true) {
                    Object obj7 = arrayList8.get(i8);
                    int width2 = ((Placeable) obj7).getWidth();
                    int i9 = width < width2 ? width2 : width;
                    if (width < width2) {
                        obj2 = obj7;
                    }
                    if (i8 == iE2) {
                        break;
                    }
                    i8++;
                    width = i9;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        final int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if (arrayList8.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList8.get(0);
            int height4 = ((Placeable) obj3).getHeight();
            int iE3 = h.a.i.e(arrayList8);
            if (iE3 > 0) {
                int i10 = 1;
                while (true) {
                    Object obj8 = arrayList8.get(i10);
                    int height5 = ((Placeable) obj8).getHeight();
                    int i11 = height4 < height5 ? height5 : height4;
                    if (height4 < height5) {
                        obj3 = obj8;
                    }
                    if (i10 == iE3) {
                        break;
                    }
                    i10++;
                    height4 = i11;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        final int height6 = placeable3 != null ? placeable3.getHeight() : 0;
        ArrayList arrayList9 = new ArrayList(list6.size());
        int size5 = list6.size();
        for (int i12 = 0; i12 < size5; i12++) {
            arrayList9.add(list6.get(i12).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList10 = arrayList9;
        if (arrayList10.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList10.get(0);
            int width4 = ((Placeable) obj4).getWidth();
            int iE4 = h.a.i.e(arrayList10);
            if (iE4 > 0) {
                int i13 = 1;
                while (true) {
                    Object obj9 = arrayList10.get(i13);
                    int width5 = ((Placeable) obj9).getWidth();
                    int i14 = width4 < width5 ? width5 : width4;
                    if (width4 < width5) {
                        obj4 = obj9;
                    }
                    if (i13 == iE4) {
                        break;
                    }
                    i13++;
                    width4 = i14;
                }
            }
        }
        Placeable placeable4 = (Placeable) obj4;
        final int width6 = placeable4 != null ? placeable4.getWidth() : 0;
        if (arrayList10.isEmpty()) {
            obj5 = null;
        } else {
            obj5 = arrayList10.get(0);
            int height7 = ((Placeable) obj5).getHeight();
            int iE5 = h.a.i.e(arrayList10);
            if (iE5 > 0) {
                int i15 = 1;
                while (true) {
                    Object obj10 = arrayList10.get(i15);
                    int height8 = ((Placeable) obj10).getHeight();
                    int i16 = height7 < height8 ? height8 : height7;
                    if (height7 < height8) {
                        obj5 = obj10;
                    }
                    if (i15 == iE5) {
                        break;
                    }
                    i15++;
                    height7 = i16;
                }
            }
        }
        Placeable placeable5 = (Placeable) obj5;
        final int height9 = placeable5 != null ? placeable5.getHeight() : 0;
        final int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        final a<Float> aVar = this.$sheetOffset;
        final int i17 = this.$floatingActionButtonPosition;
        final float f2 = this.$sheetPeekHeight;
        final BottomSheetState bottomSheetState = this.$sheetState;
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, null, new l() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj11) {
                return BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.measure_3p2s80s$lambda$10(aVar, i17, measureScope, iM11107getMaxWidthimpl, width3, f2, height6, width6, bottomSheetState, height9, iM11106getMaxHeightimpl, arrayList6, arrayList4, arrayList2, arrayList8, arrayList10, height3, (Placeable.PlacementScope) obj11);
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
