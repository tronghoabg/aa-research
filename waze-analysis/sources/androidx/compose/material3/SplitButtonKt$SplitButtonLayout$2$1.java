package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import h.a.i;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SplitButtonKt$SplitButtonLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ float $spacing;

    SplitButtonKt$SplitButtonLayout$2$1(float f2) {
        this.$spacing = f2;
    }

    static final ab measure_3p2s80s$lambda$4(Placeable placeable, Placeable placeable2, float f2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeable.getWidth() + placementScope.mo2121roundToPx0680j_4(f2), 0, 0.0f, 4, null);
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
        Integer num;
        MeasureScope measureScope2 = measureScope;
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "LeadingButton")) {
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(jM11097copyZbe2FdA$default);
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), "TrailingButton")) {
                        final Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, -(placeableMo9741measureBRTryo0.getWidth() + measureScope2.mo2121roundToPx0680j_4(this.$spacing)), 0, 2, null), 0, 0, placeableMo9741measureBRTryo0.getHeight(), placeableMo9741measureBRTryo0.getHeight(), 3, null));
                        int i4 = 1;
                        List listI = i.i(placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo02);
                        int size3 = listI.size();
                        int width = 0;
                        for (int i5 = 0; i5 < size3; i5++) {
                            width += ((Placeable) listI.get(i5)).getWidth();
                        }
                        int i6 = width + measureScope2.mo2121roundToPx0680j_4(this.$spacing);
                        if (listI.isEmpty()) {
                            num = null;
                        } else {
                            Integer numValueOf = Integer.valueOf(((Placeable) listI.get(0)).getHeight());
                            int iE = i.e(listI);
                            if (iE > 0) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) listI.get(i4)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i4 == iE) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                            num = numValueOf;
                        }
                        Integer num2 = num;
                        int iIntValue = num2 != null ? num2.intValue() : 0;
                        int iM11124constrainWidthK40F9xA = ConstraintsKt.m11124constrainWidthK40F9xA(j2, i6);
                        int iM11123constrainHeightK40F9xA = ConstraintsKt.m11123constrainHeightK40F9xA(j2, iIntValue);
                        final float f2 = this.$spacing;
                        return MeasureScope.CC.layout$default(measureScope, iM11124constrainWidthK40F9xA, iM11123constrainHeightK40F9xA, null, new l() { // from class: androidx.compose.material3.SplitButtonKt$SplitButtonLayout$2$1$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return SplitButtonKt$SplitButtonLayout$2$1.measure_3p2s80s$lambda$4(placeableMo9741measureBRTryo0, placeableMo9741measureBRTryo02, f2, (Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
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
