package androidx.compose.material3;

import androidx.compose.runtime.Composer;
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
import h.g.a.p;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TabKt$TabBaselineLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ p<Composer, Integer, ab> $icon;
    final /* synthetic */ p<Composer, Integer, ab> $text;

    /* JADX WARN: Multi-variable type inference failed */
    TabKt$TabBaselineLayout$2$1(p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2) {
        this.$text = pVar;
        this.$icon = pVar2;
    }

    static final ab measure_3p2s80s$lambda$2(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i2, int i3, Integer num, Integer num2, Placeable.PlacementScope placementScope) {
        if (placeable != null && placeable2 != null) {
            x.c(num);
            int iIntValue = num.intValue();
            x.c(num2);
            TabKt.placeTextAndIcon(placementScope, measureScope, placeable, placeable2, i2, i3, iIntValue, num2.intValue());
        } else if (placeable != null) {
            TabKt.placeTextOrIcon(placementScope, placeable, i3);
        } else if (placeable2 != null) {
            TabKt.placeTextOrIcon(placementScope, placeable2, i3);
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
    public final MeasureResult mo1704measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        Placeable placeableMo9741measureBRTryo0;
        Placeable placeableMo9741measureBRTryo02;
        if (this.$text != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Measurable measurable = list.get(i2);
                if (x.n(LayoutIdKt.getLayoutId(measurable), "text")) {
                    placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                }
            }
            ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
            throw new e();
        }
        placeableMo9741measureBRTryo0 = null;
        if (this.$icon != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Measurable measurable2 = list.get(i3);
                if (x.n(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                    placeableMo9741measureBRTryo02 = measurable2.mo9741measureBRTryo0(j2);
                }
            }
            ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
            throw new e();
        }
        placeableMo9741measureBRTryo02 = null;
        final int iMax = Math.max(placeableMo9741measureBRTryo0 != null ? placeableMo9741measureBRTryo0.getWidth() : 0, placeableMo9741measureBRTryo02 != null ? placeableMo9741measureBRTryo02.getWidth() : 0);
        final int iMax2 = Math.max(measureScope.mo2121roundToPx0680j_4((placeableMo9741measureBRTryo0 == null || placeableMo9741measureBRTryo02 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight), (placeableMo9741measureBRTryo02 != null ? placeableMo9741measureBRTryo02.getHeight() : 0) + (placeableMo9741measureBRTryo0 != null ? placeableMo9741measureBRTryo0.getHeight() : 0) + measureScope.mo2120roundToPxR2X_6o(TabKt.IconDistanceFromBaseline));
        final Integer numValueOf = placeableMo9741measureBRTryo0 != null ? Integer.valueOf(placeableMo9741measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())) : null;
        final Integer numValueOf2 = placeableMo9741measureBRTryo0 != null ? Integer.valueOf(placeableMo9741measureBRTryo0.get(AlignmentLineKt.getLastBaseline())) : null;
        final Placeable placeable = placeableMo9741measureBRTryo0;
        final Placeable placeable2 = placeableMo9741measureBRTryo02;
        return MeasureScope.CC.layout$default(measureScope, iMax, iMax2, null, new l() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TabKt$TabBaselineLayout$2$1.measure_3p2s80s$lambda$2(placeable, placeable2, measureScope, iMax, iMax2, numValueOf, numValueOf2, (Placeable.PlacementScope) obj);
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
