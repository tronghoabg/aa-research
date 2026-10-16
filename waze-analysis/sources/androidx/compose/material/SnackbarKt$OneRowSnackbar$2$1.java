package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $textTag;

    SnackbarKt$OneRowSnackbar$2$1(String str, String str2) {
        this.$actionTag = str;
        this.$textTag = str2;
    }

    static final ab measure_3p2s80s$lambda$3(Placeable placeable, int i2, Placeable placeable2, int i3, int i4, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
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
        int iMax;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int height2 = 0;
        int i2 = 0;
        while (i2 < size) {
            String str = this.$actionTag;
            Measurable measurable = list.get(i2);
            if (x.n(LayoutIdKt.getLayoutId(measurable), str)) {
                long j3 = j2;
                final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j3);
                int iM11107getMaxWidthimpl = (Constraints.m11107getMaxWidthimpl(j3) - placeableMo9741measureBRTryo0.getWidth()) - measureScope2.mo2121roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing);
                int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j3);
                String str2 = this.$textTag;
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (x.n(LayoutIdKt.getLayoutId(measurable2), str2)) {
                        final Placeable placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j3, 0, n.h(iM11107getMaxWidthimpl, iM11109getMinWidthimpl), 0, 0, 9, null));
                        int i4 = placeableMo9741measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                        int i5 = placeableMo9741measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                        boolean z = true;
                        boolean z2 = (i4 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE) ? false : true;
                        if (i4 != i5 && z2) {
                            z = false;
                        }
                        final int iM11107getMaxWidthimpl2 = Constraints.m11107getMaxWidthimpl(j2) - placeableMo9741measureBRTryo0.getWidth();
                        if (z) {
                            iMax = Math.max(measureScope2.mo2121roundToPx0680j_4(SnackbarKt.SnackbarMinHeightOneLine), placeableMo9741measureBRTryo0.getHeight());
                            height = (iMax - placeableMo9741measureBRTryo02.getHeight()) / 2;
                            int i6 = placeableMo9741measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                            if (i6 != Integer.MIN_VALUE) {
                                height2 = (i4 + height) - i6;
                            }
                        } else {
                            height = measureScope2.mo2121roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i4;
                            iMax = Math.max(measureScope2.mo2121roundToPx0680j_4(SnackbarKt.SnackbarMinHeightTwoLines), placeableMo9741measureBRTryo02.getHeight() + height);
                            height2 = (iMax - placeableMo9741measureBRTryo0.getHeight()) / 2;
                        }
                        final int i7 = height2;
                        final int i8 = height;
                        return MeasureScope.CC.layout$default(measureScope, Constraints.m11107getMaxWidthimpl(j2), iMax, null, new l() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return SnackbarKt$OneRowSnackbar$2$1.measure_3p2s80s$lambda$3(placeableMo9741measureBRTryo02, i8, placeableMo9741measureBRTryo0, iM11107getMaxWidthimpl2, i7, (Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
                    }
                    i3++;
                    measureScope2 = measureScope;
                    j3 = j2;
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
