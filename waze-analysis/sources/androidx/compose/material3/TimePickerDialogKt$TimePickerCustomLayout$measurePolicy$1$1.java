package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import com.waze.gas.GasNativeManager;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 implements MeasurePolicy {
    public static final TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1 INSTANCE = new TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1();

    TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1() {
    }

    static final ab measure_3p2s80s$lambda$3(boolean z, int i2, Placeable placeable, int i3, Placeable placeable2, int i4, int i5, int i6, Placeable placeable3, int i7, int i8, int i9, int i10, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int iMo2121roundToPx0680j_4;
        if (z) {
            int height = i5 - ((((placeable.getHeight() + i2) + i3) + placeable2.getHeight()) + i4);
            if (i5 >= i6) {
                placementScope2 = placementScope;
                iMo2121roundToPx0680j_4 = placementScope2.mo2121roundToPx0680j_4(16.0f);
            } else {
                placementScope2 = placementScope;
                iMo2121roundToPx0680j_4 = 0;
            }
            Placeable.PlacementScope.place$default(placementScope2, placeable3, i7, i7, 0.0f, 4, null);
            int i11 = height / 2;
            int i12 = i2 + i11;
            Placeable.PlacementScope.place$default(placementScope, placeable, i8, i12, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(placementScope, placeable2, i8, (((i12 + placeable.getHeight()) + i3) - iMo2121roundToPx0680j_4) + i11, 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(placementScope, placeable3, i7, i9, 0.0f, 4, null);
            int width = (i10 - placeable.getWidth()) / 2;
            int height2 = i9 + placeable3.getHeight();
            Placeable.PlacementScope.place$default(placementScope, placeable, width, height2, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(placementScope, placeable2, (i10 - placeable2.getWidth()) / 2, height2 + placeable.getHeight(), 0.0f, 4, null);
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
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        boolean z = false;
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE)) {
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "timePickerContent")) {
                        int size3 = list2.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Measurable measurable3 = list.get(i4);
                            if (x.n(LayoutIdKt.getLayoutId(measurable3), "actions")) {
                                final int i5 = measureScope2.mo2121roundToPx0680j_4(24.0f);
                                int i6 = i5 + i5;
                                final int i7 = measureScope2.mo2121roundToPx0680j_4(384.0f);
                                final int i8 = measureScope2.mo2121roundToPx0680j_4(24.0f);
                                final int i9 = measureScope2.mo2121roundToPx0680j_4(16.0f);
                                final int i10 = measureScope2.mo2121roundToPx0680j_4(4.0f);
                                final int i11 = measureScope2.mo2121roundToPx0680j_4(8.0f);
                                final int i12 = measureScope2.mo2121roundToPx0680j_4(24.0f);
                                int i13 = measureScope2.mo2121roundToPx0680j_4(24.0f);
                                final Placeable placeableMo9741measureBRTryo0 = measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                                if (placeableMo9741measureBRTryo0.getWidth() > placeableMo9741measureBRTryo0.getHeight()) {
                                    float height2 = placeableMo9741measureBRTryo0.getHeight();
                                    float fFloor = measureScope2.mo2127toPx0680j_4(TimePickerKt.getClockDialMinContainerSize());
                                    if (!Float.isNaN(fFloor) && !Float.isInfinite(fFloor)) {
                                        double d2 = fFloor;
                                        fFloor = (float) (fFloor > 0.0f ? Math.floor(d2) : Math.ceil(d2));
                                    }
                                    if (height2 >= fFloor) {
                                        z = true;
                                    }
                                }
                                final boolean z2 = z;
                                final int width = (z2 ? placeableMo9741measureBRTryo0.getWidth() : placeableMo9741measureBRTryo0.getWidth()) + i6;
                                final Placeable placeableMo9741measureBRTryo02 = measurable3.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, placeableMo9741measureBRTryo0.getWidth(), 0, 0, 8, null));
                                final Placeable placeableMo9741measureBRTryo03 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, placeableMo9741measureBRTryo0.getWidth(), 0, 0, 8, null));
                                if (z2) {
                                    height = placeableMo9741measureBRTryo0.getHeight() + placeableMo9741measureBRTryo02.getHeight() + i11 + i9 + i10;
                                    if (Constraints.m11102getHasBoundedHeightimpl(j2)) {
                                        height = Constraints.m11106getMaxHeightimpl(j2);
                                    }
                                } else {
                                    height = i13 + i12 + placeableMo9741measureBRTryo03.getHeight() + placeableMo9741measureBRTryo0.getHeight() + placeableMo9741measureBRTryo02.getHeight();
                                }
                                final int i14 = height;
                                return MeasureScope.CC.layout$default(measureScope2, width, i14, null, new l() { // from class: androidx.compose.material3.TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1$$ExternalSyntheticLambda0
                                    @Override // h.g.a.l
                                    public final Object invoke(Object obj) {
                                        return TimePickerDialogKt$TimePickerCustomLayout$measurePolicy$1$1.measure_3p2s80s$lambda$3(z2, i9, placeableMo9741measureBRTryo0, i10, placeableMo9741measureBRTryo02, i11, i14, i7, placeableMo9741measureBRTryo03, i8, i5, i12, width, (Placeable.PlacementScope) obj);
                                    }
                                }, 4, null);
                            }
                            i4++;
                            measureScope2 = measureScope;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new e();
                    }
                    i3++;
                    measureScope2 = measureScope;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
            i2++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
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
